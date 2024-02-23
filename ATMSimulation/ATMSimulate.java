package atmSimulation;

public class ATMSimulate {
	
	private double balance = 15000;
	private double depositAmount ;
	private double withdrawalAmount;
	
	//lest create a getters and setters functions
	
	public double getBalance()
	{
		return balance;
	}
	
	public void setBalance(double balance)
	{
		
		this.balance=balance;
		
	}
	
	public double getDepositAmount()
	{
		return depositAmount;
	}
	
	public void setDepositAmount(double depositAmount)
	{
		this.depositAmount=depositAmount;
	}
	
	public double getWithdrawalAmount()
	{
		return withdrawalAmount;
	}
	
	public void setWithdrawAmount(double withdrawalAmount)
	{
		this.withdrawalAmount=withdrawalAmount;
	}

}
