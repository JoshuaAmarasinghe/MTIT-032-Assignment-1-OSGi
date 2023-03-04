package com.mtit.PackagePublisher;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceRegistration;

public class PackageActivator implements BundleActivator {

	ServiceRegistration publishServiceRegistrion;

	public void start(BundleContext context) throws Exception {		
		PackagePublisher publisherService = new PackageImpl();
		publishServiceRegistrion = context.registerService(PackagePublisher.class.getName(), publisherService, null);
		System.out.println("Start Car Service");
		
	}

	public void stop(BundleContext bundleContext) throws Exception {
		
		System.out.println("Publisher Stop");
		publishServiceRegistrion.unregister();
		System.out.println("Stop Car Service");
	}

}
