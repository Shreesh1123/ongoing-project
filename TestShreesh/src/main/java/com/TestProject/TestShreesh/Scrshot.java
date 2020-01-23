
package com.TestProject.TestShreesh;

import java.io.File;
import java.io.IOException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


import org.apache.commons.io.FileUtils;

public class Scrshot {

		 @Test
		 public void amazonTest() throws IOException{ 
			 System.setProperty("webdriver.chrome.driver","D:\\screenshot\\chromedriver.exe");
		 
		  WebDriver driver = new ChromeDriver();
		  driver.get("https://www.amazon.com/");
		  
		  
		  // ScreenShot of full page code
		   
		 // EventFiringWebDriver edriver = new EventFiringWebDriver(driver);
		  //File src=edriver.getScreenshotAs(OutputType.FILE);
		 // File dest=new File ("D:\\screenshot.png");
		 // Files
		  
		  TakesScreenshot sc=((TakesScreenshot)driver);
		  File src= sc.getScreenshotAs(OutputType.FILE);
		  File dest= new File("D:\\screenshot.jpg");
		  FileUtils.copyFile(src, dest);
		 }
}