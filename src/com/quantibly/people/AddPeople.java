package com.quantibly.people;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
//import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.quantibly.authentication.SignIn;
import com.quantibly.authentication.SignUp;

import org.openqa.selenium.chrome.ChromeOptions;
import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.remote.ProtocolHandshake;

public class AddPeople {
	
	public static void createPeople(WebDriver driver) {
		// TODO Auto-generated method stub
		try {
			Thread.sleep(2000);
			driver.findElement(By.cssSelector("#app > div > div > div > div > div > div.col-md-5.auth-card-right > div > div > form > section > div:nth-child(1) > div > input")).click();
			Thread.sleep(2000);
			driver.findElement(By.cssSelector("#app > div > div > div > div > div > div.col-md-5.auth-card-right > div > div > form > section > div:nth-child(1) > div > input")).sendKeys("Your Email"); //Input Your Email
			Thread.sleep(2000);
			driver.findElement(By.cssSelector("#app > div > div > div > div > div > div.col-md-5.auth-card-right > div > div > form > section > div.right-inner-addon.form-group > input")).click();
			Thread.sleep(2000);
			driver.findElement(By.cssSelector("#app > div > div > div > div > div > div.col-md-5.auth-card-right > div > div > form > section > div.right-inner-addon.form-group > input")).sendKeys("Password"); // Input Your Password
			Thread.sleep(2000);
			
			//driver.findElement(By.className("bigger-110")).click();
			//Thread.sleep(2000);
			//driver.findElement(By.className("user-info")).click();
			//Thread.sleep(2000);
			
			driver.findElement(By.cssSelector("#app > div > div > div > div > div > div.col-md-5.auth-card-right > div > div > form > section > button")).click(); // Sign-In
			Thread.sleep(2000);
			
			
			driver.findElement(By.cssSelector("#app > div > div.main-content-wrap.main-content-wrap--onboarding > div.onbording-card > div > div > div > div.onbording__row > div.onbording-col.onbording-col--left > div > div:nth-child(2)")).click(); 
			Thread.sleep(2000);
			driver.findElement(By.cssSelector("#app > div > div.main-content-wrap.main-content-wrap--onboarding > div.onbording-card > div > div > div > div.onbording__footer > button > span")).click();
			Thread.sleep(2000);
			
			
			driver.findElement(By.cssSelector("#app > div > div.main-content-wrap.d-flex.flex-column.sidenav-open > div.main-content > div.main-content-render > div > div > div.d-flex.flex-wrap.mb-3 > div.ml-md-auto > a > span")).click();
			Thread.sleep(2000);
			
			driver.findElement(By.cssSelector("#step-1 > div.card > div > div > div.cols-12.col-sm-6.col-md-6.col-lg-3.col-xl-3.form-group > div > div > input")).click();
			Thread.sleep(2000);
			
			driver.findElement(By.cssSelector("#step-1 > div.card > div > div > div.cols-12.col-sm-6.col-md-6.col-lg-3.col-xl-3.form-group > div > div > input")).sendKeys("First Name");
			Thread.sleep(2000);
			
			
			driver.findElement(By.cssSelector("#step-1 > div.card > div > div > div:nth-child(4) > div > div > input")).click();
			Thread.sleep(2000);
			
			driver.findElement(By.cssSelector("#step-1 > div.card > div > div > div:nth-child(4) > div > div > input")).sendKeys("Last Name");
			Thread.sleep(2000);
			
			
			driver.findElement(By.cssSelector("#smartwizard > div.text-right > button > span")).click();
			Thread.sleep(2000);
			
			driver.findElement(By.cssSelector("#step-2 > div.card > div > div:nth-child(1) > div:nth-child(2) > div > div > input")).click();
			Thread.sleep(2000);
			driver.findElement(By.cssSelector("#step-2 > div.card > div > div:nth-child(1) > div:nth-child(2) > div > div > input")).sendKeys("Regular working hours per week"); // Input Your Regular working hours per week
			Thread.sleep(2000);
			
			//driver.findElement(By.cssSelector("#step-2 > div.card > div > div:nth-child(1) > div:nth-child(1) > div > div")).click();
			//Thread.sleep(2000);
		    //driver.findElement(By.cssSelector("#step-2 > div.card > div > div:nth-child(1) > div:nth-child(1) > div > div > div.multiselect-dropdown.is-hidden > ul > li:nth-child(2)")).sendKeys("Internship");
		    //Thread.sleep(2000);
		    
		    driver.findElement(By.cssSelector("#smartwizard > div.text-right > button:nth-child(4) > span")).click();
			Thread.sleep(2000);
			
			driver.findElement(By.cssSelector("#step-3 > div.card > div > div > div:nth-child(4) > div > div > input")).click();
			Thread.sleep(2000);
			
			driver.findElement(By.cssSelector("#step-3 > div.card > div > div > div:nth-child(4) > div > div > input")).sendKeys("Amount"); // Inpur Your Amount
			Thread.sleep(2000);
			
			driver.findElement(By.cssSelector("#smartwizard > div.text-right > button:nth-child(4) > span")).click();
			Thread.sleep(2000);
			
			driver.findElement(By.cssSelector("#step-4 > div.card > div > div:nth-child(2) > div:nth-child(1) > div > div > input")).click();
			Thread.sleep(2000);
			 
			driver.findElement(By.cssSelector("#step-4 > div.card > div > div:nth-child(2) > div:nth-child(1) > div > div > input")).sendKeys("Your Name"); // Input Your Name
			Thread.sleep(2000);
			
			driver.findElement(By.cssSelector("#step-4 > div.card > div > div:nth-child(2) > div:nth-child(8) > div > div > input")).click();
			Thread.sleep(2000);
			
			driver.findElement(By.cssSelector("#step-4 > div.card > div > div:nth-child(2) > div:nth-child(8) > div > div > input")).sendKeys("Your Email"); // Input Your E-Mail
			Thread.sleep(2000);
			
			driver.findElement(By.cssSelector("#step-4 > div.card > div > div:nth-child(2) > div:nth-child(2) > div > div > input")).click();
			Thread.sleep(2000);
			
			driver.findElement(By.cssSelector("#step-4 > div.card > div > div:nth-child(2) > div:nth-child(2) > div > div > input")).sendKeys("Your Address Line 1 "); // Input Your Address Line 1 
			Thread.sleep(2000);
			
			driver.findElement(By.cssSelector("#step-4 > div.card > div > div:nth-child(2) > div:nth-child(9) > div > div > input")).click();
			Thread.sleep(2000);
			
			driver.findElement(By.cssSelector("#step-4 > div.card > div > div:nth-child(2) > div:nth-child(9) > div > div > input")).sendKeys("Phone Number"); // Input Your Phone Number
			Thread.sleep(2000);
			
			driver.findElement(By.cssSelector("#smartwizard > div.text-right > button:nth-child(4) > span.ladda-label")).click(); //Confirm Data Save
			Thread.sleep(2000);
			
				
		    }
		    catch(Exception e) {
			e.printStackTrace();
			driver.quit();
				
			}

	}



}


