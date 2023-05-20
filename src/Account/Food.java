package Account;

import java.util.Scanner;

public class Food extends Necesseties {
	public Food(AccountType kind) {
		super(kind);
	}
	
	public void getUserInput(Scanner input) {
		setNumber(input);
		setAccountAmountwithYN(input);	
		setDate(input);
	}	
}
