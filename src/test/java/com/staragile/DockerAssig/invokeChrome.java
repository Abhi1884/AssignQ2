package com.staragile.DockerAssig;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class invokeChrome {
	
	@Test
	public void chromeTest() throws MalformedURLException {
		ChromeOptions options = new ChromeOptions();
		URL url = new URL("http://35.154.37.176:4444/grid/console");
		RemoteWebDriver driver = new RemoteWebDriver(url,options);
		System.out.println("connected to chrome driver");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.amazon.in");
		System.out.println("title of the page is: "+driver.getTitle());
		
	}

}
