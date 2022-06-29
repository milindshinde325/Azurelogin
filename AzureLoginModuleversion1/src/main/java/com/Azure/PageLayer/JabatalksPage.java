package com.Azure.PageLayer;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.Azure.TestBase.AzureTestBase;

public class JabatalksPage extends AzureTestBase{


	@FindBy(xpath="//div[@class='ui-select-match ng-scope' and @placeholder='Choose Language']") private WebElement dropdown;
	@FindBy(xpath="//li[@class='ui-select-choices-group']") private WebElement DDlist;
	@FindBy(xpath="//input[@id='name']") private WebElement fullname;
	@FindBy(xpath="//input[@id='orgName']") private WebElement orgname;
	@FindBy(xpath="//input[@id='singUpEmail']") private WebElement email;
	@FindBy(xpath="//span[@class='black-color ng-binding']") private WebElement tickbox;
	@FindBy(xpath="//div[@class='form-group custom-form-group']") private WebElement signup;
	@FindBy(xpath="//div[@class='alert alert-danger alert-custom']") private WebElement validateaccount;
	
	public JabatalksPage()
	
	{
		PageFactory.initElements(driver, this);//PageFactory.initElements(driver,this);
	}
	
	public void DropDown() 
	{
		dropdown.click();	 
		List<WebElement> DD=driver.findElements(By.xpath("//li[@class='ui-select-choices-group']")); 
	}
	
	public void EnterFullName()
	{
		fullname.sendKeys("milind navnath shinde");
	}
	public void EnterOrgName()
	{
		orgname.sendKeys("milind navnath shinde");
	}
	public void EnterEmail()
	{
		email.sendKeys("milindshinde325@gmail.com");
	}
	public void ClickOnTickBox()
	{
		tickbox.click();
	}
	public void ClickOnSignUp()
	{
		signup.click();
	}
	public void ValidateAccount()
	{
		boolean AccountCreated= validateaccount.isDisplayed();
		System.out.println(AccountCreated);	
		Assert.assertTrue(true);
	}
}
