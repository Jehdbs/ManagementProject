package Account;

import java.util.Scanner;

public class Wear extends Necesseties {
	public Wear(AccountType kind) {
		super(kind);
	}
	public void getUserInput(Scanner input) {
		setNumber(input);
		setAccountAmountwithYN(input);
		setDate(input);
	}
}
