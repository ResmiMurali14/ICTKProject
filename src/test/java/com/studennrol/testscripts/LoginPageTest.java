package com.studennrol.testscripts;

import org.testng.Assert;
import org.testng.annotations.Test;


import com.studenrol.pages.LoginPage;
import com.studenrol.testbase.TestBase;
import com.studenrol.utilities.ExcelUtility;

public class LoginPageTest extends TestBase
{
	LoginPage objLogin= new LoginPage();
	@Test(priority=1)
	public void verifyValidLogin() throws Exception 
	{
		
	//Create Login Page object
	objLogin = new LoginPage();
	//login to application
	objLogin.login();
	
		Thread.sleep(3000);
	

	String expectedurl="http://64.227.182.128/login/studentlogin";
	String actualurl =driver.getCurrentUrl();
	Assert.assertEquals(expectedurl,actualurl);
	Thread.sleep(2000);
	String username = ExcelUtility.getCellData(1, 0);
	String password = ExcelUtility.getCellData(1, 1);
	objLogin.setUserName(username);
	objLogin.setPassword(password);
	objLogin.dropdown();
	objLogin.Signin();
	Thread.sleep(2000); 
	}
}
