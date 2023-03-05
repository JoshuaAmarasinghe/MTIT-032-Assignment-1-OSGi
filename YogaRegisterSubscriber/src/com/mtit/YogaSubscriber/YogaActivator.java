package com.mtit.YogaSubscriber;

import java.util.Scanner;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceReference;

import com.mtit.YogaPublisher.YogaPublisher;


public class YogaActivator implements BundleActivator {

      ServiceReference serviceReference;
      Scanner sc = new Scanner(System.in);

	public void start(BundleContext context) throws Exception {
			System.out.println("Started Yoga Subscriber");
	          serviceReference = context.getServiceReference(YogaPublisher.class.getName());
			
			YogaPublisher yogaPublisher = (YogaPublisher)context.getService(serviceReference);
		     YogaSubscriber yogaSubscriber = new YogaSubscriberImpl();
		     yogaSubscriber.getService(yogaPublisher);     
	}

	public void stop(BundleContext context) throws Exception {
		System.out.println("Stoped Yoga Subscriber");
	
	}

}
