package com.crossbrowsertestng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;

public class crossbrowserdemo {
	WebDriver driver;
	@Parameters("browser")
@Test
public void launchapp(String browser) {
	if( browser.equalsIgnoreCase("chrome")) {
		System.setProperty("webdriver.chrome.driver", "‪D:\\seleniumdrivers\\chromedriver.exe‪");
		  driver = new ChromeDriver(); 
			
	}
	else if(browser.equalsIgnoreCase("microsoftedge")){
	
	System.setProperty("webdriver.edge.verboseLogging", "‪D:\\seleniumdrivers\\edgedriver_win64\\msedgedriver.exe");
	  driver = new EdgeDriver(); 
	
	
	}
	driver.manage().window().maximize();
	driver.get("http://orangehrm.qedgetech.com/symfony/web/index.php/auth/login");
		
	}
}

