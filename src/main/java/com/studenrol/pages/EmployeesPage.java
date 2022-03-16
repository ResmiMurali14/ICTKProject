package com.studenrol.pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.studenrol.testbase.TestBase;

public class EmployeesPage extends TestBase
{
	
	
	
	@FindBy(xpath="//a[@routerlink='employees']")
	WebElement employeeLink;
	@FindBy(xpath="//div[@class='page']/ul[1]//descendant::button[1]")
	WebElement editBtn;
	@FindBy(xpath="//div[@class='page']/ul[7]//descendant::button[2]")
	WebElement deleteBtn;
	JavascriptExecutor je=(JavascriptExecutor)driver;
	
	
	public EmployeesPage()
	{
		
		PageFactory.initElements(driver, this);
	}
     
	public void employeeClick()
	{
		
		employeeLink.click();

		
	}
	
	
	public void editBtnCheck() throws Exception
	{
		try {
			je.executeScript("arguments[0].click();", editBtn);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
		Thread.sleep(3000);
		
	}
	public void deleteBtnCheck()
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
		alert.dismiss();
	}
	
}
