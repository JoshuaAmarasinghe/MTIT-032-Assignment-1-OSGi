package com.mtit.PackageCartPublisher;
import java.util.Scanner;

import com.mtit.PackagePublisher.PackageDetail;

public class PackageCartImpl implements PackageCartPublisher {

	@Override
	public String cartMenue(int tot) {
		
		System.out.println("Your total package cost is : Rs." +tot);
		
		System.out.print("Do you want to purchase the package? (Y/N): ");
		Scanner buyRes = new Scanner(System.in);
		String buyResponse = buyRes.next();
		return buyResponse;
		
	}

}
