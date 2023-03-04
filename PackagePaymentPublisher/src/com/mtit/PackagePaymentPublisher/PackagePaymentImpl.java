package com.mtit.PackagePaymentPublisher;

import java.util.Scanner;

public class PackagePaymentImpl implements PackagePaymentPublisher {

	@Override
	public boolean displayMenuBuy() {

		System.out.print("Enter your 6 digit Card Number to proceed with the Package purchase : ");

		boolean isvalid = false;
		Scanner num = new Scanner(System.in);
		int cCard = num.nextInt();

		while (!isvalid) {
			
			System.out.print("Enter payment : ");
			String ScardNum = String.valueOf(cCard);
			
			if (ScardNum.length() == 6) {
				isvalid = true;
			} else {
				System.out.println("Invalid Card Number!");
				cCard = num.nextInt();
				isvalid = false;
				
			}

		}
		
		return isvalid;

	}

}
