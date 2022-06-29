package com.Azure.TestBase;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import com.Azure.PageLayer.JabatalksPage;

public class AzureTestBase {

    public static WebDriver driver;
	public JabatalksPage jp;
  
	@BeforeClass
	
	public void setup()
	{

	  System.setProperty("webdriver.chrome.driver", "D:\\java\\selenium software files\\extractedchromedriver\\chromedriver.exe");
      driver= new ChromeDriver();
      driver.manage().window().maximize();
      driver.get("https://jt-dev.azurewebsites.net/#/SignUp");
      driver.manage().deleteAllCookies();
      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
      String title=driver.getTitle();
      System.out.println(title);  
				
      jp=new JabatalksPage();
      
   	}
	@AfterClass

	public void tearDown()
	{
		driver.close();
	}
	}

