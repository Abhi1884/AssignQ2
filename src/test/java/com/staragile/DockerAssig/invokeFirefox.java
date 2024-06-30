package com.staragile.DockerAssig;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class invokeFirefox {
	
	@Test
	public void firefoxTest() throws MalformedURLException {
		FirefoxOptions options = new FirefoxOptions();
		URL url = new URL("http://15.206.28.101:4444/wd/hub");
		RemoteWebDriver driver = new RemoteWebDriver(url,options);
		System.out.println("connected to firefox browser");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.amazon.in");
		System.out.println("the title of the page is: "+driver.getTitle());
		
	}

}
