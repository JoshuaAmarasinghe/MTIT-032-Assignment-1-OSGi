package com.mtit.WorkoutSubscriber;

import java.util.List;
import java.util.Scanner;

import com.mtit.WorkoutPublisher.Workout;
import com.mtit.WorkoutPublisher.WorkoutPublisher;

public class WorkoutSubscriberImpl implements WorkoutSubscriber {
	
	String input;
	String workout_ID;
	String workout_name;
	String workout_weight;
	String workout_reps;
	String workout_type;
	String workout_duration;
	Scanner sc = new Scanner(System.in);

	public static final String ADD ="add";
	public static final String All ="all";
	public static final String DELETE ="delete";
	
	@Override
	public void getService(WorkoutPublisher workoutpublisher) {
	      System.out.println("=========== Workout Schedule ============");
	      System.out.println("            Gym Fitness 032              ");
	      System.out.println();
	      System.out.println("Please select the service you would like to make a referral. ");
	      System.out.println();
	      
	      while(true) {
	    	  input = getInput();
	    	  
	    	  if(input.equalsIgnoreCase(ADD)) {
	    		  addRecord(workoutpublisher);
	    	  }
	    	  else if (input.equalsIgnoreCase(All)) {
	    		  getAllRecords(workoutpublisher);
	    	  }
	    	  else if (input.equalsIgnoreCase(DELETE)) {
	    		  deleteRecord(workoutpublisher);
	    	  }
	    	  else {
	    		  System.out.println("Invalid");
	    	  }
	      }
		
	}

public String getInput() {
	   System.out.println("Add Workout Schedule:               'Add'");
	   System.out.println("View All Workout Schedule:          'All'");
	   System.out.println("Delete Workout Schedule:            'Delete'");
	   System.out.println();
	   String input =sc.nextLine();
	   return input;
	   
   }
   
   public void addRecord(WorkoutPublisher workoutpublisher) {
	   
	   System.out.println("=========== Workout Schedule ============");
	   System.out.println("            Gym Fitness 032              ");
	   System.out.println();
	   
	   System.out.println("Enter workout ID:");
	   workout_ID = sc.nextLine();
	   
	   System.out.println("Enter workout's Name:");
	   workout_name = sc.nextLine();
	   
	   System.out.println("Enter workout weight:");
	   workout_weight = sc.nextLine();
	   
	   System.out.println("Enter workout Sets & reps:");
	   workout_reps = sc.nextLine();
	   
	   System.out.println("Enter workout Type:");
	   workout_type = sc.nextLine();
	   
	   System.out.println("Enter workout duration: ");
	   workout_duration = sc.nextLine();
	   
	   String temp = workoutpublisher.addWorkout(workout_ID, workout_name, workout_weight, workout_reps, workout_type, workout_duration);
	   System.out.println(temp);
	   System.out.println();
   }
   
   public void getAllRecords(WorkoutPublisher workoutpublisher) {
	   List<Workout> workouts = workoutpublisher.getAllWorkouts();
	   
	   System.out.println("=========== Workout Schedule ============");
	   System.out.println("            Gym Fitness 032              ");
	   System.out.println();
	   System.out.println("Displaying all Registered Workouts ");
	   System.out.println();
	   
	   System.out.println("ID \t Workout List");
	   for(Workout workout : workouts ) {
		   System.out.println();
		   System.out.println(workout.getworkout_ID()+"\t"+" "+ workout.getworkout_name());
		   
		   
		   System.out.println();
	   }
	   
	   System.out.println();
   }
   

   private void deleteRecord(WorkoutPublisher workoutpublisher) {
		String workout_id;
		
		System.out.println("Enter Workout ID to be deleted: ");
		workout_id = sc.nextLine();
		workoutpublisher.deleteWorkout(workout_id);
		System.out.println();
	}
   
	

}
