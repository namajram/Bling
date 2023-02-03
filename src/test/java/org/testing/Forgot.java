package org.testing;

import static org.testng.Assert.assertEquals;

import org.locators.Forgotten;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.Help.BaseClass;

public class Forgot extends BaseClass {
	
	@Test(priority=2)
	private void user_enters__forgotpassword_valid_email() throws InterruptedException {
		
		chromeBrowser();
		urlLaunch("https://dash.bling-center.com/platform/signIn.html");
		Forgotten f= new Forgotten();
		click(f.getForgot());
		passValues(f.getEamil(), "namajram19@gmail.com");
		click(f.getResetpassword());
		
		WebElement t = d.findElement(By.xpath("//p[contains(text(),'Password Reset Instructions')]"));
		String text = t.getText();
		SoftAssert s = new SoftAssert();
		Thread.sleep(2000);
		s.assertTrue(text.contains("Password Reset Instructions"));
		System.out.println(text);
		d.quit();
	}

	@Test(priority=1)
	private void user_enters__forgotpassword_empty_email() throws InterruptedException {
		
		chromeBrowser();
		urlLaunch("https://dash.bling-center.com/platform/signIn.html");
		Forgotten f= new Forgotten();
		click(f.getForgot());
		click(f.getResetpassword());
		
		WebElement t = d.findElement(By.xpath("//p[@id='resetinitial']"));
		String text = t.getText();
		SoftAssert sa = new SoftAssert();
		Thread.sleep(2000);
		sa.assertTrue(text.contains("send you reset instructions"));
		System.out.println(text);
		d.close();
	}
	
}
