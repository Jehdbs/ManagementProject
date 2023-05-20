package Account;

import java.util.Scanner;

public class Study extends Account {
	public Study(AccountType kind) {
		super(kind);
	}
	
	public void getUserInput(Scanner input) { 
		setNumber(input);
		setAccountAmountwithYN(input);
		setDate(input);
	}
	
	public void setAccountAmountwithYN(Scanner input) {
		char answer = 'X';
		while (answer != 'y'&&answer != 'Y'&&answer != 'n'&&answer != 'N') {
			System.out.print("수익이 있습니까? (Y/N)");
			answer = input.next().charAt(0);
			if(answer == 'Y' || answer == 'y') {
				setAmount(input);
				setDetailContent(input);
				break;
			}
			else if (answer == 'N' || answer == 'n') {
				this.setContent("");
				break;
			}
			else {			
			}
		}
	}	
	
	public void printInfo() {
		String akind = getKindString();
		System.out.println("kind : "+akind +", "+ "number : "+number+", "+ "amount : "+amount +", "+ "content : "+content+", "
		+ "date : "+date);
	}
}
