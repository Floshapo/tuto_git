package tuto_git;

import java.util.Observable;

public class Modele extends Observable {

	int compte;
	
	public Modele() {
		this.compte = 0;
	}

	public void incrémente() {
		this.compte += 1;
		this.setChanged();
		this.notifyObservers(String.valueOf(this.compte));
	}
	
}
