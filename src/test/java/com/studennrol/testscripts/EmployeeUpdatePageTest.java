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
		String nameText = ExcelUtility.getCellData(4, 0);
	    String emailText = ExcelUtility.getCellData(4, 1);
	    Thread.sleep(3000);
	    objEmpUpdate.setEmpName(nameText);
	    objEmpUpdate.setEmpEmail(emailText);
	    Thread.sleep(3000);
	    objEmpUpdate.setEmpRoleNull();
	    Thread.sleep(3000);
	    objEmpUpdate.clickUpdate();
		
		
    }
	
	@Test(priority=3)
    public void updateBtnVerifyemailnull() throws Exception
    {
		
		objEmpUpdate=new EmployeeUpdatePage();
		String nameText = ExcelUtility.getCellData(5, 0);
	    String roleText = ExcelUtility.getCellData(5, 1);
	    Thread.sleep(3000);
	    objEmpUpdate.setEmpName(nameText);
	    objEmpUpdate.setEmpEmail(roleText);
	    Thread.sleep(3000);
	    objEmpUpdate.setEmpemailNull();
	    Thread.sleep(3000);
	    objEmpUpdate.clickUpdate();
		
		
    }
	@Test(priority=4)
    public void updateBtnVerifyNamenull() throws Exception
    {
		
		objEmpUpdate=new EmployeeUpdatePage();
		String emailText = ExcelUtility.getCellData(6, 0);
	    String roleText = ExcelUtility.getCellData(6, 1);
	    Thread.sleep(3000);
	    objEmpUpdate.setEmpName(emailText);
	    objEmpUpdate.setEmpEmail(roleText);
	    Thread.sleep(3000);
	    objEmpUpdate.setEmpNameNull();
	    Thread.sleep(3000);
	    objEmpUpdate.clickUpdate();
		
		
    }
	@Test(priority=5)
    public void updateBtnVerifyallfieldnull() throws Exception
    {
		
		objEmpUpdate=new EmployeeUpdatePage();
		Thread.sleep(3000);
	    objEmpUpdate.setEmpNameNull();
	    Thread.sleep(3000);
	    objEmpUpdate.setEmpemailNull();
	    Thread.sleep(3000);
	    objEmpUpdate.setEmpRoleNull();
	    objEmpUpdate.clickUpdate();
		
		
    }
  
@Test(priority=6)
public void updateBtnVerifvalid() throws Exception
{
	
	objEmpUpdate=new EmployeeUpdatePage();
	Thread.sleep(3000);
	String nameText = ExcelUtility.getCellData(7, 0);
    String emailText = ExcelUtility.getCellData(7, 1);
    String roleText = ExcelUtility.getCellData(7, 2);
    objEmpUpdate.setEmpName(nameText);
    Thread.sleep(3000);
    objEmpUpdate.setEmpEmail(emailText);
    Thread.sleep(3000);
    objEmpUpdate.setEmpRole(roleText);
    objEmpUpdate.clickUpdate();
	
	
}
  }
