package osgi.enroute.iot.domotica.application;

import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;

import osgi.enroute.capabilities.AngularWebResource;
import osgi.enroute.capabilities.BootstrapWebResource;
import osgi.enroute.capabilities.ConfigurerExtender;
import osgi.enroute.capabilities.EventAdminSSEEndpoint;
import osgi.enroute.capabilities.WebServerExtender;
import osgi.enroute.rest.api.REST;
import osgi.enroute.rest.api.RESTRequest;

@AngularWebResource(resource={"angular.js","angular-resource.js", "angular-route.js"}, priority=1000)
@BootstrapWebResource(resource="css/bootstrap.css")
@WebServerExtender
@ConfigurerExtender
@Component(name="osgi.enroute.iot.domotica")
@EventAdminSSEEndpoint
public class DomoticaApplication implements REST {

	public String getUpper(RESTRequest rq, String string) {
		return string.toUpperCase();
	}

	@Activate
	void activate() {
		System.out.println("Hello world");
	}
	
	
}
