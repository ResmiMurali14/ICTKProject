package com.studennrol.testscripts;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.studenrol.pages.LogoutPage;
import com.studenrol.testbase.TestBase;

public class LogoutPageTest extends TestBase
{

	LogoutPage objLogoutPage;
	
	@Test(priority=1)
	public void verifyBtnVisibility() throws Exception
	{
		objLogoutPage=new LogoutPage();
		Thread.sleep(3000);
		
		Assert.assertTrue(objLogoutPage.logoutBtnVisibile(), "button is visible");
		objLogoutPage.logoutbtnclick();
	}
	
}
