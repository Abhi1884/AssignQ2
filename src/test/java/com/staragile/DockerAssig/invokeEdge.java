package com.staragile.DockerAssig;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class invokeEdge {
	
	@Test
	public void edgeTest() throws MalformedURLException, InterruptedException {
		EdgeOptions options = new EdgeOptions();
		URL url = new URL("http://35.154.37.176:4444/grid/console");
		RemoteWebDriver driver = new RemoteWebDriver(url,options);
		System.out.println("connected to edge browser");
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		Thread.sleep(5);
		driver.get("https://www.amazon.in");
		System.out.println("the title of the page is: "+driver.getTitle());
		
		
	}

}
