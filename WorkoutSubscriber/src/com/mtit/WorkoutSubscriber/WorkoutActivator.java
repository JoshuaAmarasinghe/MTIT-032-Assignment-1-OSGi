package com.mtit.WorkoutSubscriber;

import java.util.Scanner;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceReference;

import com.mtit.WorkoutPublisher.WorkoutPublisher;

public class WorkoutActivator implements BundleActivator {

      ServiceReference serviceReference;
      Scanner sc = new Scanner(System.in);

	public void start(BundleContext context) throws Exception {
			System.out.println("Started Workout Subscriber");
			serviceReference = context.getServiceReference(WorkoutPublisher.class.getName());
			
			WorkoutPublisher workoutPublisher = (WorkoutPublisher)context.getService(serviceReference);
		    WorkoutSubscriber workoutSubscriber = new WorkoutSubscriberImpl();
		    workoutSubscriber.getService(workoutPublisher);      
	}

	public void stop(BundleContext context) throws Exception {
		System.out.println("Stoped Workout Subscriber");
	
	}

}
