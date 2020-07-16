package test;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

@Path("/hello")
public class hello {

	@GET
	@Produces(MediaType.TEXT_XML)
	public String sayHello()
	{
		String resource="<? version='1.0' ?>" +"<hello> Hi, this is Hello from XML</hello>";
		return resource;
	}
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public String sayHelloJASON()
	{
		String resource=null;
		return resource;
	}
	
	@GET
	@Produces(MediaType.TEXT_HTML)
	public String sayHelloHTML()
	{
		String resource="<h1>Hi, I'm Hello from HTML</h1>";
		return resource;
	}
}
