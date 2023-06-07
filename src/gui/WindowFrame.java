package gui;

import javax.swing.JFrame;
import javax.swing.JPanel;

import manager.AccountManager;

public class WindowFrame extends JFrame{

	AccountManager accountManager;	
	MenuSelection menuselection;
	Earning earning;
	AccountViewer accountViewer;

		
	public WindowFrame(AccountManager accountmanager) {
		
		this.setSize(500, 300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("My Frame");
		
		this.accountManager = accountmanager;
		this.menuselection = new MenuSelection(this);
		this.earning = new Earning(this);
		this.accountViewer = new AccountViewer(this, this.accountManager);
		
		this.setupPanel(menuselection);
		this.setVisible(true);
	}

	
	public void setupPanel(JPanel panel) {
		this.getContentPane().removeAll();
		this.add(panel);
		this.revalidate();
		this.repaint();
	}
	
	public MenuSelection getMenuselection() {
		return menuselection;
	}


	public void setMenuselection(MenuSelection menuselection) {
		this.menuselection = menuselection;
	}


	public Earning getEarning() {
		return earning;
	}


	public void setEarning(Earning earning) {
		this.earning = earning;
	}


	public AccountViewer getAccountViewer() {
		return accountViewer;
	}


	public void setAccountViewer(AccountViewer accountViewer) {
		this.accountViewer = accountViewer;
	}
}
