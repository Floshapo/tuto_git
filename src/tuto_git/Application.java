package tuto_git;

import java.awt.Frame;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class Application extends Frame implements WindowListener {
	private static final long serialVersionUID = 1L;

	public static void main(String[] args) {
		new Application();
	}

	public Application() {
		super();
		
		Modele modl = new Modele();
		Controleur ctrl = new Controleur(modl);
		Vue vue = new Vue();
		modl.addObserver(vue);
		vue.addActionListener(ctrl);
		this.setTitle("tutoriel git");
		this.add(vue);
		this.pack();
		this.setLocationRelativeTo(null);
		this.setVisible(true);
		addWindowListener(this);
	}

	@Override
	public void windowActivated(WindowEvent e) {

	}

	@Override
	public void windowClosed(WindowEvent e) {

	}

	@Override
	public void windowClosing(WindowEvent e) {
		System.exit(0);
	}

	@Override
	public void windowDeactivated(WindowEvent e) {

	}

	@Override
	public void windowDeiconified(WindowEvent e) {

	}

	@Override
	public void windowIconified(WindowEvent e) {

	}

	@Override
	public void windowOpened(WindowEvent e) {

	}

}
