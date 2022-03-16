package com.studenrol.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.studenrol.testbase.TestBase;

public class EmployeeUpdatePage extends TestBase

  {
   
	@FindBy(xpath="//input[@name='name']")
	WebElement nameText;
	@FindBy(xpath="//input[@name='email']")
    WebElement emailText;
	@FindBy(xpath="//input[@name='role']")
    WebElement roleText;
	@FindBy(xpath="//button[@type='submit']")
	WebElement updateBtn;
	
	public EmployeeUpdatePage()
	{
		PageFactory.initElements(driver, this);
		
		
	}
	public void setEmpName(String strEmpName)
	{
		
		nameText.clear();
		nameText.click();
		
		nameText.sendKeys(strEmpName);
	}
	//set password in password textbox
	
	public void setEmpEmail(String strEmail)
	{
		emailText.clear();
		emailText.click();
		
		emailText.sendKeys(strEmail);
		
	
	}
	public void setEmpRole(String strEmpRole)
	{
		
		
		roleText.clear();
		roleText.click();
		roleText.sendKeys(strEmpRole);
	}
	public void setEmpRoleNull()
	{
		//roleText.click();
		roleText.clear();
		
	}
	public void setEmpNameNull()
	{
		//roleText.click();
		nameText.clear();
		
	}
	public void setEmpemailNull()
	{
		//roleText.click();
		emailText.clear();
		
	}
	
	public void clickUpdate()
	{
		
     updateBtn.click();		
		
	} 

	
	
  }
