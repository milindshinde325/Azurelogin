package com.Azure.TestLayer;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.Azure.PageLayer.JabatalksPage;
import com.Azure.TestBase.AzureTestBase;

public class ValidLogin extends AzureTestBase {
          
@Test
	public void testValidLgin() throws InterruptedException {
	    
	    jp.DropDown(); 
	    Thread.sleep(2000);  
	    
        List<WebElement> DDlist=driver.findElements(By.xpath("//li[@class='ui-select-choices-group']")); 
        
        for(int a=0; a<DDlist.size();a++) 
    
        {
        	System.out.println(DDlist.get(a).getText());
        	
        	if(DDlist.get(a).getText().equalsIgnoreCase("English Dutch"))
        	{
        		DDlist.get(a).click();
        	}
        	    
       }
	    
		jp.EnterFullName();
		jp.EnterOrgName();
		jp.EnterEmail();
		jp.ClickOnTickBox();
		jp.ClickOnSignUp();
		jp.ValidateAccount();
		
		
	}}
	
	
	

