
public class SavingsAccount {

	private String nickname;
	private double balance;
	private double annualIntRate;
	private double newBalance;
	
	// Create a no-argument constructor
	public SavingsAccount() {
	}
	
	// Set up getters to get data for nickname, balance, and annual interest rate
	public String getNickName() {
		return nickname;
	}
	
	public double getBalance() {
		return balance;
	}
	
	public double annualIntRate() {
		return annualIntRate;
	}
	
	public double getNewBalance() {
		return newBalance;
	}
	
	// Create setters to display data for nickname, balance, and annual interest rate
	public void setNickName(String nickname) {
		this.nickname = nickname;
	}
	
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	public void setAnnualIntRate(double annualIntRate) {
		this.annualIntRate = annualIntRate;
	}
	
	public void setNewBalance(double newBalance) {
		this.newBalance = newBalance;
	}
		
	// Method to determine the monthly interest rate based on the annual interest rate and account balance
	public final double getMonthlyIntRate(double balance, double annualIntRate) {
		double monthlyInterestRate = (annualIntRate / 100.0) / 12;
		double monthlyInterest = balance * monthlyInterestRate;
		return monthlyInterest;
		}
	
	// Method to find the new balance based on the current balance and the amount deposited by the user
	public final double deposit(double balance, double amountDeposit) {
		double newBalance = balance + amountDeposit;
		return newBalance;
	}
	
	// Method with information for the date and time the account was created
	public final String accountCreationTime(String nickname) {
		String dateCreated = "Sun Aug 07 14:18:39 CDT 2022";
		return dateCreated;
	}

	@Override
	public String toString() {
		return "SavingsAccount [nickname=" + nickname + ", balance=" + deposit(balance, newBalance) + ", annualIntRate=" + annualIntRate
				+ "]";
	}

}
