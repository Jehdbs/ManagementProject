package Account;

import java.util.Scanner;

public class Wear extends Necesseties {
	public Wear(AccountType kind){
		super(kind);
	}
	
	public void getUserInput(Scanner input) {
		setAccountNumber(input);
		setAmountwithYN(input);
		setAccountDate(input);
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
