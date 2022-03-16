package com.studenrol.testbase;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestBase {
	
	public static WebDriver driver=null;
	public static Properties prop;
	public static String driverPath=System.getProperty("user.dir")+"\\driver99\\chromedriver.exe";
    public void TestBase()
{
	
prop=new Properties();
try
{
	  FileInputStream ip = new FileInputStream(System.getProperty("user.dir") + "/src/test/resources"
              + "/config.properties");
      //Below line of code will load the property file
      prop.load(ip);
     } 
  catch (FileNotFoundException e) 
    {
      e.printStackTrace();
    } catch (IOException e)
    {
      e.printStackTrace();
    }
 }
	
    
 @BeforeTest
  public void onSetup() throws InterruptedException
	 {
      TestBase(); // for loading the configurations
     String browserName = prop.getProperty("browser");

      if (browserName.equals("chrome"))
      {
      	System.setProperty("webdriver.chrome.driver", driverPath);
          driver = new ChromeDriver();

      }
else if (browserName.equals("firefox"))
      {
      	//geckodriver
      	System.setProperty("webdriver.gecko.driver", driverPath);
          driver = new FirefoxDriver();
      }
      driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);// asking the driver to wait maximum 30 sec before throwing an exception
      driver.get(prop.getProperty("url"));
      driver.manage().window().maximize(); 
      Thread.sleep(3000);
     /* WebElement userName=driver.findElement(By.xpath("//input[@type='email']"));
      userName.click();
      userName.sendKeys("admin");
      WebElement password=driver.findElement(By.name("password"));
      password.click();
 	  password.sendKeys("Admin123");
 	  Select dropDown=new Select(driver.findElement(By.name("role")));
 	  dropDown.selectByValue("admin");
 	  WebElement submitBtn=driver.findElement(By.name("sign-in"));
 	  submitBtn.click();
 	  Thread.sleep(5000);
 	  Alert simpleAlert=driver.switchTo().alert();
 	  simpleAlert.accept();*/
		
	}
 	  
     
	
	
	 
	/*@AfterMethod
    public void tearDown(ITestResult TestResStatus) throws IOException {
        if (TestResStatus.getStatus()==TestResStatus.FAILURE) {
        	System.out.println(TestResStatus.getName());
        	takeScreenshot(TestResStatus.getName());
        }
     \
	}
	
	
	
	//1) Create a method for Screenshot + arg as filename (filename.jpg)
			public String takeScreenshot(String fileName) throws IOException
			{
				//2) To take Screenshot & store it as image file format
					//2a. Convert driver-->TakeScreenshot interface (TypeCasting)
					File sourceLoc=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
					
					
					//2b. Setting the Image: "Location/Filename+Date.png
					String dateName = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
					String destination= System.getProperty("user.dir") + "\\target\\" + fileName + dateName+ ".png";
					File destinationLoc = new File(destination);
					
					//Copy the Screenshot to desired Location using "copyFile()"
					FileUtils.copyFile(sourceLoc, destinationLoc); //import org.apache.commons.io.FileUtils;
			        return destination; 
			}
			


	
	@AfterTest
		public void quitBrowser() throws IOException {
			driver.quit();
		
	}*/
}



