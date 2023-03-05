package com.mtit.YogaPublisher;
import java.util.List;

public interface YogaPublisher {
	
	public String addYoga(String yoga_ID, String yoga_name, String yoga_duration, String yoga_level, String yoga_description, String yoga_price);
//	public List <Yoga> getAllyoga_IDs();
	public void deleteYoga(String yoga_ID);
	public List<Yoga> getAllYogas();
}
