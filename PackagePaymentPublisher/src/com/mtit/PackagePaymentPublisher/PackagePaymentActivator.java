package com.mtit.PackagePaymentPublisher;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceReference;
import org.osgi.framework.ServiceRegistration;

import com.mtit.PackagePaymentPublisher.PackagePaymentPublisher;


public class PackagePaymentActivator implements BundleActivator {
	ServiceRegistration publishServiceRegistrion;

	public void start(BundleContext context) throws Exception {
		PackagePaymentPublisher packagePaymentPublisher = new PackagePaymentImpl();
		publishServiceRegistrion = context.registerService(PackagePaymentPublisher.class.getName(), packagePaymentPublisher, null);
		System.out.println("Start Buy Service");
	}

	public void stop(BundleContext context) throws Exception {
		System.out.println("Stop Subscriber Service, Good Bye!");
		publishServiceRegistrion.unregister();
		System.out.println("Stop Buy Service");
	}

}
