package com.mtit.YogaPublisher;
import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;

import com.mtit.YogaPublisher.Yoga;
import com.mtit.YogaPublisher.YogaPublisher;

public class YogaPublishImpl  implements YogaPublisher {
	
	public List<Yoga> Yogas = new ArrayList<Yoga>();

	//adding a new record 
	@Override
	public String addYoga(String yoga_ID, String yoga_name, String yoga_duration, String yoga_level, String yoga_description, String yoga_price) {
          Yoga Yoga = new Yoga (yoga_ID, yoga_name,yoga_duration,yoga_level,yoga_description,yoga_price);
          Yogas.add(Yoga);
          return "New : " + Yoga.getyoga_name() + " with " + Yoga.getyoga_duration() +" " + "duration" + "  " + "entered successfully!";
     
	}

	//Get all records 
	@Override
	public List <Yoga> getAllYogas() {
		return Yogas;
			
	}

	//Delete Record
	@Override
	public void deleteYoga(String yoga_ID) {
	    for(Yoga Yoga : Yogas) {
	    	if(Yoga.getyoga_ID().equalsIgnoreCase(yoga_ID)) {
	    		int id =Yogas.indexOf(Yoga);
	    		Yogas.remove(id);
	    		System.out.println(" Yoga Record deleted Successfully!");
	    		return ;
	    	}
	    }
		
	}
}
