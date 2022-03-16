package com.studennrol.testscripts;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.studenrol.pages.SearchPage;
import com.studenrol.testbase.TestBase;
import com.studenrol.utilities.ExcelUtility;

public class SearchPageTest extends TestBase
{
   
   SearchPage objSearchPage;
   
   
   
   @Test(priority=1)
   
   public void verifysearchUrl() throws Exception
   {
	   objSearchPage=new SearchPage();
	   Thread.sleep(3000);
	   objSearchPage.searchPageUrl();
	   String actualUrl=driver.getCurrentUrl();
	   String exptdUrl="http://64.227.182.128/search";
	   Assert.assertEquals(exptdUrl, actualUrl);
   }
  /* 
   @Test(priority=2)
   public void verifyByName() throws Exception
   {
	 
	   objSearchPage=new SearchPage();
	   Thread.sleep(3000); 
	   
	   String empName="Saranya";
	   objSearchPage.filterByName(empName);
	   
	   
   }
   @Test(priority=3)
   public void verifyByQualification() throws Exception
   {
	 
	   objSearchPage=new SearchPage();
	   Thread.sleep(3000); 
	   
	   String qualification="B.Tech";
	   objSearchPage.filterByName(qualification);
	   Thread.sleep(3000);
	   
	   
   }
   
   @Test(priority=4)
   public void verifyByDistrict() throws Exception
   {
	 
	   objSearchPage=new SearchPage();
	   Thread.sleep(3000); 
	   
	   String district="trivandrum";
	   objSearchPage.filterByDistrict(district);
	   Thread.sleep(3000);
	   
	   
   }
	

   @Test(priority=5)
   public void verifyByState() throws Exception
   {
	 
	   objSearchPage=new SearchPage();
	   Thread.sleep(3000); 
	   
	   String state="kerala";
	   objSearchPage.filterByState(state);
	   Thread.sleep(3000);
	   
	   
   }
   @Test(priority=6)
   public void verifyByPassoutYear() throws Exception
   {
	 
	   objSearchPage=new SearchPage();
	   Thread.sleep(3000); 
	   
	   String passout="2020";
	   objSearchPage.filterByPassoutYear(passout);
	   Thread.sleep(3000);
	   
	   
   }
   @Test(priority=7)
   public void verifyByEMploymentStatus() throws Exception
   {
	 
	   objSearchPage=new SearchPage();
	   Thread.sleep(3000); 
	   
	   String status="student";
	   objSearchPage.filterByEmployementStatus(status);
	   Thread.sleep(3000);
	   
	   
   }
   @Test(priority=8)
   public void verifyByCourse() throws Exception
   {
	 
	   objSearchPage=new SearchPage();
	   Thread.sleep(3000); 
	   
	   String course="flutter";
	   objSearchPage.filterByCourseName(course);
	   Thread.sleep(3000);
	   
	   
   }
   @Test(priority=9)
   public void verifyByMark() throws Exception
   {
	 
	   objSearchPage=new SearchPage();
	   Thread.sleep(3000); 
	  
	   String mark="50";
	   objSearchPage.filterByMark(mark);
	   Thread.sleep(3000);
	  
	   
	   
	   
	   
   }*/
}
