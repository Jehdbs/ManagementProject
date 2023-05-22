package Account;

import java.util.Scanner;

import exceptions.AmountFormatException;

public abstract class Account implements AccountInput{
	protected String amount;
	protected int number;
	protected String content;
	protected String date;
	
	public Account() {
	}
	
	public Account(AccountType kind) {
		this.kind = kind;
	}
	
	public Account(String amount, String content) {
		this.amount = amount;
		this.content = content;
	}
	
	public Account(int number, String amount, String content, String date) {
		this.number = number;
		this.amount = amount;
		this.content = content;
		this.date = date;
	}
	
	public Account(AccountType kind, int number, String amount, String content, String date) {
		this.kind  = kind;
		this.number = number;
		this.amount = amount;
		this.content = content;
		this.date = date;
	}
	protected AccountType kind = AccountType.DAILY;
	public AccountType getKind() {
		return kind;
	}

	public void setKind(AccountType kind) {
		this.kind = kind;
	}

	public String getAmount() {
		return amount;
	}

	public void setAmount(String amount) throws AmountFormatException{
		if(!amount.contains("원") && !amount.equals("")) {
			throw new AmountFormatException();
		}
		
		this.amount = amount;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}
	
	public abstract void printInfo();
	
	public void setNumber(Scanner input) {
		System.out.print("번호 : ");
		int number = input.nextInt();
		this.setNumber(number);
	}
	
	public void setAmount(Scanner input) {
		String amount = "";
		while(!amount.contains("원")) {
			System.out.print("수익 : ");
			amount = input.next();
			try {
				this.setAmount(amount);
			} catch (AmountFormatException e) {
				System.out.println("Incorrect Amount Format. "
						+ "put amount adress that contains 원");
			}
		}
	}
	
	public void setContent(Scanner input) {
		System.out.print("수익 내용 : ");
		String content = input.next();
		this.setContent(content);
	}
	
	public void setDetailContent(Scanner input) {
		System.out.print("세부 수익 내용 : ");
		String content = input.next();
		this.setContent(content);
	}
	
	public void setDate(Scanner input) {
		System.out.print("날짜 : ");
		String date = input.next();
		this.setDate(date);
	}
	
	public String getKindString() {
		String akind = "none";
		switch(this.kind) {
		case DAILY:
			akind = "Daily"; 
			break;
		case FOOD:
			akind = "Food";
			break;
		case STUDY:
			akind = "Study";
			break;
		default :	
		}
		return akind;
	}
	
}
