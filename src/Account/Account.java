package Account;

import java.util.Scanner;

public class Account {
	protected int amount;
	protected int number;
	protected String content;
	protected String date;
	
	public Account() {
	}
	
	public Account(AccountType kind) {
		this.kind = kind;
	}
	
	public Account(int amount, String content) {
		this.amount = amount;
		this.content = content;
	}
	
	public Account(int number, int amount, String content, String date) {
		this.number = number;
		this.amount = amount;
		this.content = content;
		this.date = date;
	}
	public Account(AccountType kind, int number, int amount, String content, String date) {
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

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
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
	
	public void printInfo() {
		String akind = "none";
		switch(this.kind) {
		case DAILY:
			akind = "Daily"; // 디테일 컨텐트
			break;
		case FOOD:
			akind = "Food";
			break;
		case STUDY:
			akind = "Study";
			break;
		default :	
		}
		System.out.println("kind : "+akind +", "+ "number : "+number+", "+ "amount : "+amount +", "+ "content : "+content+", "
		+ "date : "+date);
	}
	
	public void getUserInput(Scanner input) {
		System.out.print("번호 : ");
		int number = input.nextInt();
		this.setNumber(number);
		
		System.out.print("수익 : ");
		int amount = input.nextInt();
		this.setAmount(amount);
		
		System.out.print("수익 내용 : ");
		String content = input.next();
		this.setContent(content);
		
		System.out.print("날짜 : ");
		String date = input.next();
		this.setDate(date);
	}
}
