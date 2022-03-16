package com.studennrol.testscripts;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.studenrol.pages.EmployeeUpdatePage;
import com.studenrol.testbase.TestBase;
import com.studenrol.utilities.ExcelUtility;

public class EmployeeUpdatePageTest extends TestBase

  {
	EmployeeUpdatePage objEmpUpdate;

	
	
	@Test(priority=1)
	
	public void verrifyPageUrl() throws Exception
	{
		
		objEmpUpdate=new EmployeeUpdatePage();
		Thread.sleep(3000);
		String actualUrl=driver.getCurrentUrl();
		String expectdUrl="http://64.227.182.128/update-employee";
		Assert.assertEquals(expectdUrl,actualUrl);
		}
	
	@Test(priority=2)
    public void updateBtnVerifyRollnull1() throws Exception
    {
		
		objEmpUpdate=new EmployeeUpdatePage();
		String nameText = ExcelUtility.getCellData(5, 0);
	    String emailText = ExcelUtility.getCellData(5, 1);
	    String roleText;
	    Thread.sleep(3000);
	    objEmpUpdate.setEmpName(nameText);
	    objEmpUpdate.setEmpEmail(emailText);
	    Thread.sleep(3000);
	    //objEmpUpdate.setEmpRole(roleText);
	    objEmpUpdate.setEmpRoleNull();
	    Thread.sleep(3000);
	    objEmpUpdate.clickUpdate();
		
		
    }
	
	@Test(priority=3)
    public void updateBtnVerifyNamenull() throws Exception
    {
		
		objEmpUpdate=new EmployeeUpdatePage();
		String nameText = ExcelUtility.getCellData(1, 0);
	    String emailText = ExcelUtility.getCellData(1, 1);
	    //String roleText="";
	    Thread.sleep(3000);
	    objEmpUpdate.setEmpName(nameText);
	    objEmpUpdate.setEmpEmail(emailText);
	   
	    Thread.sleep(3000);
	    objEmpUpdate.setEmpRoleNull();
	    //objEmpUpdate.setEmpRoleNull();
	  
	    Thread.sleep(3000);
	    objEmpUpdate.clickUpdate();
		
		
    }
  }
