package Account;

import java.util.Scanner;

public class Daily extends Account {	
	public Daily(AccountType kind){
		super(kind);		
	}
	
	public void getUserInput(Scanner input) { 
		setAccountNumber(input);
		setAccountAmount(input);
		setDetailContentwithYN(input);		
		setAccountDate(input);
	}
	
	public void setDetailContentwithYN(Scanner input) {
		char answer = 'X';
		while (answer != 'y'&&answer != 'Y'&&answer != 'n'&&answer != 'N') {
			System.out.print("수익이 있습니까? (Y/N)");
			answer = input.next().charAt(0);
			if(answer == 'Y' || answer == 'y') {
				setAccountContent(input);
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
		System.out.println("kind : "+akind +", "+"number : "+number+", "+ "amount : "+amount +", "
		+"content : "+content+", "+ "date : "+date);
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

