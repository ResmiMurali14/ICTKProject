package com.studenrol.pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.studenrol.testbase.TestBase;

public class LoginPage extends TestBase
{
	
	@FindBy(xpath="//a[@routerlink='/login/studentlogin']")
	WebElement loginBtn;
	
    
	@FindBy(xpath="//input[@name='email']")
     WebElement username;
    @FindBy(xpath="//input[@name='password']")
    WebElement password;
    @FindBy(xpath="//select[@name='role']")
    WebElement dropdown;
    @FindBy(xpath="//input[@name='sign-in']")
    WebElement Signin;

    
  
	public LoginPage()
	{
        
        //This initElements method will create all WebElements
        PageFactory.initElements(driver, this);
    }
   public void login() 
   {
      loginBtn.click();

}
    //set username in textbox
	public void setUserName(String strUserName)
	{
		// TODO Auto-generated method stub
		username.sendKeys( strUserName);     
    }

	//Set password in password textbox
    
	public void setPassword(String strPassword) 
	{
		// TODO Auto-generated method stub
		password.sendKeys(strPassword);
		
	}
	
	//Selecting Login as Admin
	public void dropdown() 
	{
	
    //dropdown1 created as instance variable and pass the element value(dropdown) to the dropdown1		
    Select dropdown1 = new Select(dropdown);
    dropdown1.selectByValue("admin");
	}
	
	
	public void Signin() {
		
		// TODO Auto-generated method stub
		
			Signin.click();
			try {
				Thread.sleep(2000);
				} 
			catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			
			}
			
			Alert alert=driver.switchTo().alert();
			alert.accept();
			
	}
	    
	}




