package Listener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;

import Account.Account;
import Account.AccountInput;
import Account.AccountType;
import Account.Daily;
import exceptions.AmountFormatException;
import gui.WindowFrame;
import manager.AccountManager;

public class AccountAdderListener implements ActionListener {
	JTextField fieldNumber;
	JTextField fieldAmount;
	JTextField fieldContent;
	JTextField fieldDate;
	
	AccountManager accountManager;

	public AccountAdderListener(
			JTextField fieldNumber, 
			JTextField fieldAmount, 
			JTextField fieldContent,
			JTextField fieldDate, 
			AccountManager accountManager) {
		this.fieldNumber = fieldNumber;
		this.fieldAmount = fieldAmount;
		this.fieldContent = fieldContent;
		this.fieldDate = fieldDate;
		this.accountManager = accountManager;
	}

	public AccountAdderListener(WindowFrame frame) {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println(fieldNumber.getText());
		System.out.println(fieldAmount.getText());
		System.out.println(fieldContent.getText());
		System.out.println(fieldDate.getText());
		
		AccountInput account = new Daily(AccountType.DAILY);
		account.setNumber(Integer.parseInt(fieldNumber.getText()));
		try {
			account.setAmount(fieldAmount.getName());
		} catch (AmountFormatException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		account.setContent(fieldContent.getText());
		account.setDate(fieldDate.getText());
		
	}

}
