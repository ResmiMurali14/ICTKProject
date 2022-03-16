package com.studenrol.pages;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.studenrol.testbase.TestBase;

public class SearchPage extends TestBase 
{

	
	
	@FindBy(xpath="//a[@routerlink='search']")
	WebElement searchLink;
	@FindBy(xpath="//input[@type='text']")
	WebElement searchText;

	@FindBy(xpath="//*[@class='table']/tbody/tr[1]/td[1]")
	WebElement nameData;
	@FindBy(xpath="//*[@class='table']/tbody/tr[1]/td[2]")
	WebElement qualiData;
	@FindBy(xpath="//*[@class='table']/tbody/tr[1]/td[3]")
	WebElement districtData;
	@FindBy(xpath="//*[@class='table']/tbody/tr[1]/td[4]")
	WebElement stateData;
	@FindBy(xpath="//*[@class='table']/tbody/tr[1]/td[5]")
	WebElement passoutData;
	@FindBy(xpath="//*[@class='table']/tbody/tr[1]/td[6]")
	WebElement empStatusData;
	@FindBy(xpath="//*[@class='table']/tbody/tr[1]/td[7]")
	WebElement courseData;
	@FindBy(xpath="//*[@class='table']/tbody/tr[1]/td[8]")
	WebElement markData;
	
	public SearchPage()
	{
		
		PageFactory.initElements(driver, this);
	}
	
	public void searchPageUrl()
	{
		
		searchLink.click();
	}
	public void filterByName(String name) throws Exception
	{
		
	searchText.clear();	
	Thread.sleep(3000);
	searchText.sendKeys(name);
	String dataname=nameData.getText();
    if(dataname.equals(name))
    		{
    	
    	System.out.println("Element found");
    	
    	
    		}
    else {
    	System.out.println("Element not found");
    }
		
	}
	public void filterByQualification(String empQualification) throws Exception
	{
		
	searchText.clear();	
	Thread.sleep(3000);
	searchText.sendKeys(empQualification);
	String dataquali=qualiData.getText();
    if(dataquali.equals(empQualification))
    		{
    	
    	System.out.println("Element found");
    	
    	
    		}
    else {
    	System.out.println("Element not found");
    }
		
	}
	
	public void filterByDistrict(String empDistrict) throws Exception
	{
		
	searchText.clear();	
	Thread.sleep(3000);
	searchText.sendKeys(empDistrict);
	String datadistrict=districtData.getText();
    if(datadistrict.equals(empDistrict))
    		{
    	
    	System.out.println("Element found");
    	
    	
    		}
    else {
    	System.out.println("Element not found");
    }
		
	}
	public void filterByState(String empState) throws Exception
	{
		
	searchText.clear();	
	Thread.sleep(3000);
	searchText.sendKeys(empState);
	String datastate=stateData.getText();
    if(datastate.equals(empState))
    		{
    	
    	System.out.println("Element found");
    	
    	
    		}
    else {
    	System.out.println("Element not found");
    }
		
	}
	public void filterByPassoutYear(String empPassout) throws Exception
	{
		
	searchText.clear();	
	Thread.sleep(3000);
	searchText.sendKeys(empPassout);
	String datapassout=passoutData.getText();
    if(datapassout.equals(empPassout))
    		{
    	
    	System.out.println("Element found");
    	
    	
    		}
    else {
    	System.out.println("Element not found");
    }
		
	}
	
	public void filterByEmployementStatus(String empStatus) throws Exception
	{
		
	searchText.clear();	
	Thread.sleep(3000);
	searchText.sendKeys(empStatus);
	String datastatus=empStatusData.getText();
    if(datastatus.equals(empStatus))
    		{
    	
    	System.out.println("Element found");
    	
    	
    		}
    else {
    	System.out.println("Element not found");
    }
		
	}
	public void filterByCourseName(String empCourse) throws Exception
	{
		
	searchText.clear();	
	Thread.sleep(3000);
	searchText.sendKeys(empCourse);
	String datacourse=courseData.getText();
    if(empCourse.equalsIgnoreCase(datacourse))
    		{
    	
    	System.out.println("Result matched;Test Case Passed");
    	
    	
    		}
    else {
    	System.out.println("Result Notmatched;Test Case Failed");
    }
		
	}
	public String filterByMark(String empMark) throws Exception
	{
		
	searchText.clear();	
	Thread.sleep(3000);
	searchText.sendKeys(empMark);
	String st=markData.getText();
    return st;
}

	
}