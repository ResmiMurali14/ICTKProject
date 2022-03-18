package com.studennrol.testscripts;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.studenrol.pages.EmployeesPage;
import com.studenrol.testbase.TestBase;

public class EmployeesPageTest  extends TestBase
  {
     EmployeesPage objEmployees;

    @Test(priority=1)
      public void verifyEmployeesPage() throws Exception
        {
	       objEmployees =new EmployeesPage();
	       Thread.sleep(3000);
	       objEmployees.employeeClick();
	       Thread.sleep(3000);
	       String urlActul=driver.getCurrentUrl();
	       String expctdUrl="http://64.227.182.128/employees";
	       Assert.assertEquals(expctdUrl, urlActul);
	
         }
    @Test(priority=2)
    public void deleteBtnVerify() throws Exception
       {
       
  	   objEmployees =new EmployeesPage();
       Thread.sleep(3000);
       objEmployees.deleteBtnCheck();
       }
      

   @Test(priority=2)
      public void editBtnVerify() throws Exception
         {
    	   objEmployees =new EmployeesPage();
    	   Thread.sleep(3000);
           objEmployees.editBtnCheck();
              
         }
   
    
   }
