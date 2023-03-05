package com.mtit.WorkoutPublisher;

public class Workout {

	private String workout_ID;
	private String workout_name;
	private String workout_weight;
	private String workout_reps;
	private String workout_type;
	private String workout_duration;
	
	public Workout(String workout_ID, String workout_name, String workout_weight, String workout_reps, String workout_type, String workout_duration) {
		super();
		this.workout_ID = workout_ID;
		this.workout_name = workout_name;
		this.workout_weight = workout_weight;
		this.workout_reps = workout_reps;
		this.workout_type = workout_type;
		this.workout_duration = workout_duration;
	}
	
	//Getters 
	
	public String getworkout_ID() {
		return workout_ID;
	}
	public String getworkout_name() {
		return workout_name;
	}
	public String getworkout_weight() {
		return workout_weight;
	}
	public String getworkout_reps() {
		return workout_reps;
	}
	public String getworkout_type() {
		return workout_type;
	}
	public String getworkout_duration() {
		return workout_duration;
	}
	
	//Setters
	
	public void setworkout_ID(String workout_ID) {
		this.workout_ID = workout_ID;
	}
	public void setworkout_name(String workout_name) {
		this.workout_name = workout_name;
	}
	public void setworkout_weight(String workout_weight) {
		this.workout_weight = workout_weight;
	}
	public void setworkout_reps(String workout_reps) {
		this.workout_reps = workout_reps;
	}
	public void setworkout_type(String workout_type) {
		this.workout_type = workout_type;
	}
	public void setworkout_duration(String workout_duration) {
		this.workout_duration = workout_duration;
	}
	
	


	


}
