import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

import Account.Account;
import Account.AccountInput;
import Account.AccountType;
import Account.Daily;
import Account.Food;
import Account.Study;
import Account.Wear;

public class AccountManager {
		ArrayList<AccountInput> accounts = new ArrayList<AccountInput>();
		Scanner input;
		AccountManager(Scanner input){
		this.input = input;
		}
			
	public void earning() {
		int kind = 0;
		AccountInput accountInput;
		while (kind !=1 && kind !=2 && kind !=3 && kind !=4) {
			try {
				System.out.println("1. For Daily ");
				System.out.println("2. For Food ");
				System.out.println("3. For Study ");
				System.out.println("4. For Wear ");			
				System.out.print("Select Account Type num between 1, 2, 3, 4 : ");
				kind = input.nextInt();
				if (kind == 1) {
					accountInput = new Daily(AccountType.DAILY);
					accountInput.getUserInput(input);
					accounts.add(accountInput);
					break;
				
				}
				else if (kind == 2) {
					accountInput = new Food(AccountType.FOOD);
					accountInput.getUserInput(input);
					accounts.add(accountInput);
					break;
				}
				else if (kind == 3) {
					accountInput = new Study(AccountType.STUDY);
					accountInput.getUserInput(input);
					accounts.add(accountInput);
					break;
				}
				else if (kind == 4) {
					accountInput = new Wear(AccountType.WEAR);
					accountInput.getUserInput(input);
					accounts.add(accountInput);
					break;
				}
				else {
					System.out.print("Account Type num(1 or 2 or 3 or 4) : ");
				}
			}
			catch(InputMismatchException e) {
				System.out.println("Please put an integer between 1 and 4!");
				if(input.hasNext()) {
					input.next();
				}
				kind = -1;
			}
		}
	}
	
	public void delete() {
		System.out.print("번호 : ");
		int number = input.nextInt();
		int index = findIndex(number);
		removeFromAccount(index, number);
	}
	
	public int findIndex(int number) {
		int index = -1;
		for(int i=0; i<accounts.size(); i++) {
			if(accounts.get(i).getNumber() == number) {
				index = i;
				break;
			}
		}
		return index;
	}
	
	public int removeFromAccount(int index, int number) {
		if(index>=0) {
			accounts.remove(index);
			System.out.println(number+"'s ammount is deleted");
			return 1;
		}
		else {
			System.out.println("No money have been come");
			return -1;
		}
	}
	
	public void editAccountbook() {
		System.out.print("번호 : ");
		int number = input.nextInt();
		for(int i=0; i<accounts.size(); i++) {
			AccountInput account = accounts.get(i);
			if(account.getNumber()==number) {
				int num = -1;
				while(num !=4) {
					showEditMenu();
					num = input.nextInt();
					switch(num) {
					case 1:
						account.setAmount(input);
						break;
					case 2:
						account.setContent(input);
						break;
					case 3:
						account.setDate(input);
						break;
					default:
						continue;
					}
				}
					break;
			}
		}
	}		

	public void viewAccountbook() {
		for(int i=0; i<accounts.size(); i++){
			accounts.get(i).printInfo();}
	}	
	
	public void showEditMenu() {
		System.out.println("** Accountbook Indo Edit Menu **");
		System.out.println("1. Edit amount");
		System.out.println("2. Edit content");
		System.out.println("3. Edit date");
		System.out.println("4. Exit");
		System.out.println("Select one number between 1~4 : ");
	}
}

