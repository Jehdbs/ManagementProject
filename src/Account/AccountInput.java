package Account;

import java.util.Scanner;

import exceptions.AmountFormatException;

public interface AccountInput {
	
	public int getNumber();
	
	public String getAmount();
	
	public String getContent();
	
	public String getDate();
	
	public void setAmount(String amount) throws AmountFormatException;
	
	public void setContent(String content);
	
	public void setDate(String date);

	public void getUserInput(Scanner input); 
	
	public void printInfo();
	
	public void setNumber(Scanner input);
	
	public void setAmount(Scanner input);
	
	public void setContent(Scanner input);
	
	public void setDetailContent(Scanner input);
	
	public void setDate(Scanner input);
	
	public String getKindString();
	
}
