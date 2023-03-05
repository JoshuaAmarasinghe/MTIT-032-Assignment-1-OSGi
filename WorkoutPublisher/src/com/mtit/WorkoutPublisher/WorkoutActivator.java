package com.mtit.WorkoutPublisher;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceRegistration;

public class WorkoutActivator implements BundleActivator {

	ServiceRegistration workoutServiceRegistration;
	
	public void start(BundleContext context) throws Exception {
		    System.out.println("Workout Publisher Started");
            WorkoutPublisher WorkoutPublisher = new WorkoutPublishImpl();
            workoutServiceRegistration = context.registerService(WorkoutPublisher.class.getName(), WorkoutPublisher, null);		
	}

	public void stop(BundleContext Context) throws Exception {
		   System.out.println("Workout Publisher Stopped");
		
	}

}
