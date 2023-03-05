package com.mtit.YogaSubscriber;

import java.util.List;
import java.util.Scanner;

import com.mtit.YogaPublisher.Yoga;
import com.mtit.YogaPublisher.YogaPublisher;

public class YogaSubscriberImpl implements YogaSubscriber {
	
	String input;
	String yoga_ID;
    String yoga_name;
    String yoga_duration;
    String yoga_level;
    String yoga_description;
	String yoga_price;
	Scanner sc = new Scanner(System.in);

	public static final String ADD ="add";
	public static final String All ="all";
	public static final String DELETE ="delete";
	
	@Override
	public void getService(YogaPublisher yogapublisher) {
		  System.out.println();
	      System.out.println("=========== Yoga Services ============");
	      System.out.println("            Gym Fitness 032             ");
	      System.out.println();
	      System.out.println("Select the service from below . ");
	      System.out.println();
	      
	      while(true) {
	    	  input = getInput();
	    	  
	    	  if(input.equalsIgnoreCase(ADD)) {
	    		  addRecord( yogapublisher);
	    	  }
	    	  else if (input.equalsIgnoreCase(All)) {
	    		  getAllRecords( yogapublisher);
	    	  }
	    	  else if (input.equalsIgnoreCase(DELETE)) {
	    		  deleteRecord( yogapublisher);
	    	  }
	    	  else {
	    		  System.out.println("Invalid");
	    	  }
	      }
		
	}

public String getInput() {
	   System.out.println("Add Yoga:                     'Add'");
	   System.out.println("View  All the Yogas:          'All'");
	   System.out.println("Delete a Yoga:                'Delete'");
	   System.out.println();
	   String input =sc.nextLine();
	   return input;
	   
   }
   
   public void addRecord(YogaPublisher yogapublisher) {
	   
	   System.out.println();
	   System.out.println("=========== Yoga Services ============");
	   System.out.println("            Gym Fitness 032             ");
	   
	   System.out.println();
	   System.out.println("Enter Yoga ID:");
	   yoga_ID = sc.nextLine();
	   
	   System.out.println("Enter Yoga Name:");
	   yoga_name = sc.nextLine();
	   
	   System.out.println("Enter Yoga Duration");
	   yoga_duration = sc.nextLine();
	   
	   System.out.println("Enter Yoga Level:");
	   yoga_level = sc.nextLine();
	   
	   System.out.println("Enter yoga Description :");
	   yoga_description = sc.nextLine();
	   
	   System.out.println("Enter yoga Price: ");
	   yoga_price = sc.nextLine();
	   
	   String temp = yogapublisher.addYoga(yoga_ID,yoga_name, yoga_duration, yoga_level, yoga_description, yoga_price);
	   System.out.println(temp);
	   System.out.println();
   }
   
   public void getAllRecords(YogaPublisher yogapublisher) {
	   List<Yoga> Yogas = yogapublisher.getAllYogas();
	   System.out.println();
	   
	   System.out.println("=========== Yoga Services ============");
	   System.out.println("            Gym Fitness 032             ");
	   System.out.println();
	   System.out.println("=====Displaying all Yogas==== ");
	   System.out.println();
	   
	   System.out.println("ID  \t  Yoga Name");
	   for(Yoga yoga : Yogas ) {
		   System.out.println();
		   System.out.println(yoga.getyoga_ID() +"\t " +" "+ yoga.getyoga_name());
		   
		   
		   System.out.println();
	   }
	   
	   System.out.println();
   }
   

   private void deleteRecord(YogaPublisher yogapublisher) {
		String yog_id;
		

		System.out.println("=========== Yoga Services ============");
		System.out.println("            Gym Fitness 032             ");
		System.out.println();
		System.out.println("Enter Yoga ID to be deleted: ");
		yog_id = sc.nextLine();
		yogapublisher.deleteYoga(yog_id);
		System.out.println();
	}
   
	

}
