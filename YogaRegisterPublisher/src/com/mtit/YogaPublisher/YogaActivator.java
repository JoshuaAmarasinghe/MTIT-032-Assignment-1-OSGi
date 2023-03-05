package com.mtit.YogaPublisher;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceRegistration;

public class YogaActivator implements BundleActivator {

	ServiceRegistration yogaServiceRegistration;
	
	public void start(BundleContext context) throws Exception {
		   System.out.println("Yoga Publisher Started");
            YogaPublisher YogaPublisher = new YogaPublishImpl();
          yogaServiceRegistration = context.registerService(YogaPublisher.class.getName(), YogaPublisher, null);		
	}

	public void stop(BundleContext Context) throws Exception {
		   System.out.println("Yoga Publisher Stopped");
		
	}

}
