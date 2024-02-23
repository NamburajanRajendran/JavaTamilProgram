package atmSimulation;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ATMOperatorClass implements ATMoperate {
	ATMSimulate atm  = new  ATMSimulate();
	//lets create a map to store for mini statement
	
	Map<Double,String> ministsmt = new HashMap<Double,String>();
	

	@Override
	public void viewBalance() {
		System.out.println("\nLoading Account Balance....");
		System.out.println("Your Current Balance is : "+atm.getBalance());
		System.out.println();
	}

	@Override
	public void withdrawAmount(double withDrawalAmount) {
		Scanner sc = new Scanner(System.in);
		
		if(withDrawalAmount%100==0)
		{
			if(withDrawalAmount<=atm.getBalance())
			{
				System.out.println("Confirm ?Y/N");
				String userConfirm = sc.next();
				if(userConfirm.equals("Y"))
				{
					ministsmt.put(withDrawalAmount, "Amount Withdrawn");
					System.out.println("Collect the cash " +withDrawalAmount);
					atm.setBalance(atm.getBalance()-withDrawalAmount);
					viewBalance();
				}
			}else {
				System.out.println("Insufficient Balance");
			}
		}else
		{
			System.out.println("Please enter the mount in Multiples of 100");
		}
		
		
	}

	@Override
	public void depositAmount(double depositAmount) {
		System.out.println("Confirm? Y/N");
		Scanner sc = new Scanner(System.in);
		String userConfirm = sc.next();
		if(userConfirm.equals("Y"))
		{
			ministsmt.put(depositAmount, "Amount Deposited");
			System.out.println(depositAmount+" Deposited succesfully");
			atm.setBalance(atm.getBalance()+depositAmount);
			viewBalance();
		}
		
		
	}

	@Override
	public void viewMiniStatement() {
		for(Map.Entry<Double, String> m:ministsmt.entrySet())
		{
			System.out.println(m.getKey()+ " "+m.getValue());
		}
	}

}
