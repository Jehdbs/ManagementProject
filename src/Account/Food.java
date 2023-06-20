package Account;

import java.util.Scanner;

public class Food extends Necesseties {
	public Food(AccountType kind){
		super(kind);
	}
	
	public void getUserInput(Scanner input) {
		setAccountNumber(input);
		setAmountwithYN(input);	
		setAccountDate(input);
	}	

	public void printInfo() {
		String skind = getKindString();
		System.out.println("kind: " + skind + " number : "+number +" amount : "+amount +" "+ " content : "+content+" " + " date : "+date);
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