package Assign;

import java.util.Scanner;
public class Assignment2 {
		public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Salary");
			double salary=sc.nextInt();
			double da=12.0/100.0;
			double hra=13.0/100.0;
			double pf=15.0/100.0;
			
			double DA= da*salary;
			double HRA=hra*salary;
			double PF=pf*hra;
			
			System.out.println("DA: "+DA+" PF: "+PF+" HRA: "+HRA);

			System.out.println("Gross Salary: "+(salary+DA+HRA-PF));

	}

}
