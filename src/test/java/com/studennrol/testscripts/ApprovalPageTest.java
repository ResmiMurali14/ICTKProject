package com.studennrol.testscripts;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.studenrol.pages.ApprovalPage;
import com.studenrol.testbase.TestBase;

public class ApprovalPageTest extends TestBase

{
  ApprovalPage objApprovePage;
  

   //Method to verify Page URL
    @Test(priority=1)

    public void verifyPageUrl() throws Exception
      {
	     objApprovePage=new ApprovalPage();
	     Thread.sleep(3000);
	     objApprovePage.employeesRequestPageVerify();
	     String expectedurl="http://64.227.182.128/employee-approval";
	     String actualurl =driver.getCurrentUrl();
	     Assert.assertEquals(expectedurl, actualurl);
	     Thread.sleep(2000);
	  }
    
    // To Accept Employee request

    @Test(priority=2)
    public void approveBtnverify() throws Exception
      {
	     objApprovePage=new ApprovalPage();
         Thread.sleep(3000);
         objApprovePage.approveBtnClick();
      }
    
    //To Reject employee Request
    @Test(priority=3)
    public void deleteBtnVerify() throws Exception
      {
    	 objApprovePage=new ApprovalPage();
         Thread.sleep(3000);
         objApprovePage.deleteBtnClick();
    	
    	
       }
      
}





