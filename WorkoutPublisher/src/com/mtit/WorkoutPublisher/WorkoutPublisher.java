package com.mtit.WorkoutPublisher;
import java.util.List;

public interface WorkoutPublisher {
	
	public String addWorkout(String workout_ID, String workout_name, String workout_weight, String workout_reps, String workout_type, String workout_duration);
	
	public List <Workout> getAllWorkouts();
	
	public void deleteWorkout(String workout_ID);


}
