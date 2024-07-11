
import java.util.Scanner;

public class SavingsAccountRunner {

	public static void main(String[] args) {
		SavingsAccount defaultAccount = new SavingsAccount();
		Scanner input = new Scanner(System.in);
		
		System.out.println("Welcome to your Savings Account App!\n");
		System.out.println("Enter your account nickname: ");
		defaultAccount.setNickName(input.nextLine());
		System.out.println("Enter your initial balance: ");
		defaultAccount.setBalance(input.nextDouble());
		System.out.println("Enter your annual interest rate: ");
		defaultAccount.setAnnualIntRate(input.nextDouble());
		System.out.println("Enter your deposit amount: ");
		defaultAccount.setNewBalance(input.nextDouble());
		
		// Get balance, annual interest rate, and nickname from SavingsAccount
		double balance = defaultAccount.getBalance();
		double annualIntRate = defaultAccount.annualIntRate();
		double newBalance = defaultAccount.getNewBalance();
		String nickname = defaultAccount.getNickName();
		String dateEstablished = defaultAccount.accountCreationTime(nickname);
		
		int userSelection = 0;
		
		// Loop used to gather menu selection from user
		// Menu is printed to user until user enters '4' to exit program
		// Validations will throw if a number other than 1-4 is entered
		do {
			System.out.print(menuOptions());
			userSelection = input.nextInt();
			if (userSelection == 1 || userSelection == 2 || userSelection == 3 || userSelection == 4) {
				switch(userSelection) {
				case 1:
					// Output the new balance
					System.out.printf("%13s%.2f", "New Balance: ", defaultAccount.deposit(balance, newBalance));
					System.out.println();
					break;
				case 2:
					// Output the monthly interest rate
					System.out.printf("%33s%.2f", "Your Monthly Interest Amount is $", defaultAccount.getMonthlyIntRate(balance, annualIntRate));
					System.out.println();
					break;
				case 3:
					// Output the account nickname, creation date & time, balance, and monthly interest rate
					System.out.println("Account Nickname: " + nickname);
					System.out.println("Account Creation Date/Time: " + dateEstablished);
					System.out.printf("%9s%.2f", "Balance: ", defaultAccount.deposit(balance, newBalance));
					System.out.println();
					System.out.printf("%26s%.2f", "Monthly Interest Amount: $", defaultAccount.getMonthlyIntRate(balance, annualIntRate));
					System.out.println();
					break;
				case 4:
					// Output closing message
					System.out.println("Thank you - Goodbye!");
					System.exit(0);
					}
			}
			else {
				System.out.println("INVALID SELECTION - TRY AGAIN!");
			}
		} while(true);
		
	}
	
	public static String menuOptions() {
		return "============================\n" + "\n" +
				"=      OPTIONS BELOW      =\n" + "============================\n" +
				"1. Deposit\n" + "2. View Monthly Interest Rate\n" + 
				"3. View Account Details\n" + "4. Exit\n" + "Enter your selection ";
	}

		
}