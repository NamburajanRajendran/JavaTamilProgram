package atmSimulation;

import java.util.Scanner;

public class ATMMainDriver {

	public static void main(String[] args) {
		
		ATMoperate op = new ATMOperatorClass();
		
		int atmpin = 123;
		
		Scanner in = new Scanner(System.in);
		System.out.println("Welocme to our XYZ Bank !!!");
		
		while(true)
		{
			System.out.println("\n1.View Available Balance\n2.Withdraw Amount\n3.Deposit Amount\n4.View MiniStatement\n.Exit\n");
			System.out.println("Please enter your choice :");
			int ch= in.nextInt();
			
			if(ch==1)
			{
				System.out.println("Enter ATM Pin No:");
				int pin = in.nextInt();
				if(atmpin==pin)
				{
					System.out.println("Account Authorized:\n");
					op.viewBalance();
				}
				else
				{
					System.out.println("Incorrect ATM Pin");
					System.exit(0);
				}
			}
			else if(ch==2)
			{
				System.out.println("Enter ATM Pin No:");
				int pin = in.nextInt();
				if(atmpin==pin)
				{
					System.out.println("Account Authorized:\n");
					System.out.println("Enter the amount to be withdrawan ");
					double withdrawAmount = in.nextDouble();
					op.withdrawAmount(withdrawAmount);				
				}
				else
				{
					System.out.println("Incorrect ATM Pin");
					System.exit(0);
				}
			}
			else if(ch==3)
			{
				System.out.println("Enter ATM Pin No:");
				int pin = in.nextInt();
				if(atmpin==pin)
				{
					System.out.println("Account Authorized:\n");
					System.out.println("Enter the amount to be deposited ");
					double depositAmount = in.nextDouble();
					op.depositAmount(depositAmount);
				}else
				{
					System.out.println("Incorrect ATM Pin");
					System.exit(0);
				}
			}
			else if(ch==4)
			{
				System.out.println("Enter ATM Pin No:");
				int pin = in.nextInt();
				if(atmpin==pin)
				{
					System.out.println("Account Authorized: \n");
					System.out.println("Mini Statement");
					System.out.println("***************************");
					op.viewMiniStatement();
				}
			}
			else if(ch==5)
			{
				System.out.println("Collect yout ATM Card\n Thank you for using ATM Machine!!");
				System.exit(0);
			}
			else
			{
				System.out.println("Please enter a Valid choice");
			}
			
		}

	}

}
