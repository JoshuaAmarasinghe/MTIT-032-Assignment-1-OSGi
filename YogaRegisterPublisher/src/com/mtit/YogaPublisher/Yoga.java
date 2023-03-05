package com.mtit.YogaPublisher;

public class Yoga {

	private String yoga_ID;
	private String yoga_name;
	private String yoga_duration;
	private String yoga_level;
	private String yoga_description;
	private String yoga_price;
	
	public Yoga(String yoga_ID, String yoga_name, String yoga_duration, String yoga_level, String yoga_description, String yoga_price) {
		super();
		this.yoga_ID = yoga_ID;
		this.yoga_name = yoga_name;
		this.yoga_duration =yoga_duration;
		this.yoga_level = yoga_level;
		this.yoga_description = yoga_description;
		this.yoga_price = yoga_price;
	}
	
	//Getters 
	
	public String getyoga_ID() {
		return yoga_ID;
	}
	public String getyoga_name() {
		return yoga_name;
	}
	public String getyoga_duration() {
		return yoga_duration;
	}
	public String getyoga_level() {
		return yoga_level;
	}
	public String getyoga_description() {
		return yoga_description;
	}
	public String getyoga_price() {
		return yoga_price;
	}
	
	//Setters
	
	public void setyoga_ID(String yoga_ID) {
		this.yoga_ID = yoga_ID;
	}
	public void setyoga_name(String yoga_name) {
		this.yoga_name = yoga_name;
	}
	public void setyoga_duration(String yoga_duration) {
		this.yoga_duration = yoga_duration;
	}
	public void setyoga_level(String yoga_level) {
		this.yoga_level = yoga_level;
	}
	public void setyoga_description(String yoga_description) {
		this.yoga_description = yoga_description;
	}
	public void setyoga_price(String yoga_price) {
		this.yoga_price =yoga_price;
	
	}
	
	


	


}
