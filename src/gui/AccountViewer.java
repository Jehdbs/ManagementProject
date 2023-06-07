package gui;

import java.util.Vector;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import Account.AccountInput;
import manager.AccountManager;

public class AccountViewer extends JPanel{
	
	WindowFrame frame;
	
	AccountManager accountManager;

	
	public AccountViewer(WindowFrame frame, AccountManager accountManager) {
		this.frame = frame;
		this.accountManager = accountManager;
		
		System.out.println("***"+ accountManager.size()+"***");
		
		DefaultTableModel model = new DefaultTableModel();
		model.addColumn("NUMBER");
		model.addColumn("AMOUNT");
		model.addColumn("CONTENT");
		model.addColumn("DATE");
		
		for(int i=0; i<accountManager.size(); i++) {
			Vector row = new Vector();
			AccountInput ai = accountManager.get(i);
			row.add(ai.getNumber());
			row.add(ai.getAmount());
			row.add(ai.getContent());
			row.add(ai.getDate());
			model.addRow(row);
		}
		
		JTable table = new JTable(model);
		JScrollPane sp = new JScrollPane(table);
		
		this.add(sp);		
	}
}
