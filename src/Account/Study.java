package Account;

import java.util.Scanner;

import exceptions.AmountFormatException;

public class Study extends Account {
	public Study(AccountType kind) {
		super(kind);
	}
	
	public void getUserInput(Scanner input) { 
		setAccountNumber(input);
		setAmountwithYN(input);
		setAccountDate(input);
	}
	
	public void setAmountwithYN(Scanner input) {
		char answer = 'X';
		while (answer != 'y'&&answer != 'Y'&&answer != 'n'&&answer != 'N') {
			System.out.print("수익이 있습니까? (Y/N)");
			answer = input.next().charAt(0);
			try {
				if(answer == 'Y' || answer == 'y') {
					setAccountAmount(input);
					setAccountContent(input);
					break;
				}
				else if (answer == 'N' || answer == 'n') {
					this.setAmount("");
					this.setContent("");
					break;
				}
				else {
				}
			}
			catch(AmountFormatException e) {
				System.out.println("Incorrect Amount Format. put the amount that contains '원'");

			}
		}
	}
	
	public void printInfo() {
		String akind = getKindString();
		System.out.println("kind : "+akind +", "+ "number : "+number+", "+ "amount : "+amount +", "+ "content : "+content+", "
		+ "date : "+date);
	}

	@Override
	public void setAccountNumber(Scanner input) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setAccountAmount(Scanner input) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setAccountContent(Scanner input) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setAccountDate(Scanner input) {
		// TODO Auto-generated method stub
		
	}
}
