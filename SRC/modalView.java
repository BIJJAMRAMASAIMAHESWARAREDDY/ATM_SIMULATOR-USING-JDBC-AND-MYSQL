package atmModal;

public class modalView {
	private int accountNo;
	private String accountHolderName;
	private int password;
	private int balance;
	private String accountDetails;
	
	public int getAccountNo() {
		return accountNo;}
	
	public String getAccountHolderName() {
		return accountHolderName;}
	
	public void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;

	}
	
	public void setPassword(int password) 
	{
		this.password = password;
	}
	
	public int getPassword() {
		return password;}
	
	public void setBalance(int balance) {
		this.balance  = balance;
	}
	public int getBalance() {
		return balance;}
	
	public String getAccountDetails() {
		return accountDetails;
	}
	public void setAccountDetails(String accountDetails) {
		this.accountDetails = accountDetails;
	}
	

}
