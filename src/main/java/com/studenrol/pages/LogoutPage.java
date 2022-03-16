package com.studenrol.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.studenrol.testbase.TestBase;

public class LogoutPage extends TestBase
{
	@FindBy(xpath="//*[text()='Logout']")
	WebElement logoutBtn;
	
	
	public LogoutPage()
	{

	        
	        //This initElements method will create all WebElements
	        PageFactory.initElements(driver, this);
	    }	
		
	public boolean logoutBtnVisibile()
	{
		
		return logoutBtn.isDisplayed();
		
	}
	
   public void logoutbtnclick()
   {
	   
	   logoutBtn.click();
	   
   }
}
