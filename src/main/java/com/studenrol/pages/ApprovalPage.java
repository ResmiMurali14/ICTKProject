package com.studenrol.pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.studenrol.testbase.TestBase;

public class ApprovalPage extends TestBase

  {
	
	@FindBy(xpath="//a[@routerlink='employee-approval']")
    WebElement empApprovalLink;
	@FindBy(xpath="//div[@class='page']/ul[7]//descendant::button[1]")
	WebElement approveBtn;
	@FindBy(xpath="//div[@class='page']/ul[7]//descendant::button[2]")
	WebElement deleteBtn;
	JavascriptExecutor je=(JavascriptExecutor)driver;
	public ApprovalPage()
	{
		
		PageFactory.initElements(driver, this);
	}
	public void employeesRequestPageVerify()
	{
		
	empApprovalLink.click();	
	}
	
	
	public void approveBtnClick() throws Exception
	{
		
		je.executeScript("arguments[0].click();", approveBtn);
		try {
			Thread.sleep(3000);
			} 
		catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		
		}
		//clicking "OK" on AlertBox
		Alert alert=driver.switchTo().alert();
		alert.accept();
	}
	
	public void deleteBtnClick() throws Exception
	{
		
		je.executeScript("arguments[0].click();", deleteBtn);
		try {
			Thread.sleep(3000);
			} 
		catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		
		}
		Alert alert=driver.switchTo().alert();
		alert.accept();
	}
	
	
  }
	