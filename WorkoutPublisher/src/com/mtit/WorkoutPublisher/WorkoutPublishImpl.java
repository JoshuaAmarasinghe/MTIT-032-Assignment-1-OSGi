package com.mtit.WorkoutPublisher;
import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;

import com.mtit.WorkoutPublisher.WorkoutPublisher;

public class WorkoutPublishImpl implements WorkoutPublisher {
	
	public List<Workout> workouts = new ArrayList<Workout>();

	//adding a new record 
	public String addWorkout(String workout_ID, String workout_name, String workout_weight, String workout_reps, String workout_type, String workout_duration) {
          Workout workout = new Workout (workout_ID, workout_name,workout_weight,workout_reps,workout_type,workout_duration);
          workouts.add(workout);
          return "New: " + workout.getworkout_name() + " " + "registered successfully!";
     
	}

	//Get all records 
	@Override
	public List <Workout> getAllWorkouts() {
		return workouts;
			
	}

	//Delete Record
	@Override
	public void deleteWorkout(String workout_ID) {
	    for(Workout workout : workouts) {
	    	if(workout.getworkout_ID().equalsIgnoreCase(workout_ID)) {
	    		int id =workouts.indexOf(workout);
	    		workouts.remove(id);
	    		System.out.println("Workout Schedule Deleted Successfully");
	    		return ;
	    	}
	    }
		
	}
	
}