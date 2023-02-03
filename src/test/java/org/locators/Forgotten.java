package org.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Help.BaseClass;

public class Forgotten extends BaseClass{
	
	public Forgotten() {
		PageFactory.initElements(d, this);
	}
	
	@FindAll({
		@FindBy (xpath="//p[text()='Forgot Password?']"),
		@FindBy(xpath="//button[@class='forget-password-btn']")
		
	})private WebElement forgot;
	
	@FindAll({
		@FindBy (id="email1"),
		@FindBy(xpath="(//input[@type='text'])[1]")
		
	})private WebElement eamil;
	
	@FindAll({
		@FindBy(xpath="//button[@class='reset-pwd signIn-btn']"),
		@FindBy (xpath="//p[text()='Reset Password']"),
		@FindBy(xpath="//button[@onclick='forgotPassword()']")
		
		
	})private WebElement resetpassword;

	public WebElement getForgot() {
		return forgot;
	}

	public WebElement getEamil() {
		return eamil;
	}

	public WebElement getResetpassword() {
		return resetpassword;
	}

	
	
	

}
