package com.mtit.PackageCartPublisher;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceReference;
import org.osgi.framework.ServiceRegistration;

public class PackageCartActivator implements BundleActivator {

	ServiceRegistration publishServiceRegistrion;

	public void start(BundleContext context) throws Exception {
		PackageCartPublisher packageCartPublisher = new PackageCartImpl();
		publishServiceRegistrion = context.registerService(PackageCartPublisher.class.getName(), packageCartPublisher, null);
		System.out.println("Start Cart Service");
	}

	public void stop(BundleContext context) throws Exception {
		publishServiceRegistrion.unregister();
		System.out.println("Stop Cart Service");
	}

}
