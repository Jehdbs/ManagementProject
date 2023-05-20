package Account;

import java.util.Scanner;

public abstract class Necesseties extends Account {
	
	public Necesseties(AccountType kind) {
		super(kind);
	}
	
	@Override
	public abstract void getUserInput(Scanner input);

	@Override
	public void printInfo() {
		String akind = getKindString();
		System.out.println("kind : "+akind +", "+"number : "+number+", "+ "amount : "+amount +", "
		+"detail content : "+content+", "+ "date : "+date);
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

}
