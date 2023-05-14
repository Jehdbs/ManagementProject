package Account;

import java.util.Scanner;

public class Study extends Account implements AccountInput {
	public Study(AccountType kind) {
		super(kind);
	}
	public void getUserInput(Scanner input) { // 오버라이딩
		System.out.print("번호 : ");
		int number = input.nextInt();
		this.setNumber(number);
		
		char answer = 'X';
		while (answer != 'y'&&answer != 'Y'&&answer != 'n'&&answer != 'N') {
			System.out.print("수익이 있습니까? (Y/N)");
			answer = input.next().charAt(0);
			if(answer == 'Y' || answer == 'y') {
				System.out.print("수익 : ");
				int amount = input.nextInt();
				this.setAmount(amount);
				System.out.print("수익 내용 : ");
				String content = input.next();
				this.setContent(content);
				break;
			}
			else if (answer == 'N' || answer == 'n') {
				this.setContent("");
				break;
			}
			else {			
			}
		}
		
		System.out.print("날짜 : ");
		String date = input.next();
		this.setDate(date);
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
}
