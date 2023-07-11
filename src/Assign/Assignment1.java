package Assign;

public class Assignment1 {
				public static void main(String s[]) {
				Amar obj=new Amar();
				System.out.println("Current Balance is "+obj.CurrBal);
				obj.interestValue();}}
			
			
	class Amar{
			double InitialBal=25000;
			double Deposite=15000;
			double transfered=11000;

			double CurrBal=InitialBal+Deposite-transfered;
			
			public void interestValue() {
				double IR=2;
				double P=12;
				System.out.println("Interest Value is "+ CurrBal*IR*P) ;
				
			}
			
			}


