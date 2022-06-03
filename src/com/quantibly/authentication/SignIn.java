package com.quantibly.authentication;

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

public class SignIn {
	
	public static void clickSignIn(WebDriver driver) {
		// TODO Auto-generated method stub
		try {
			Thread.sleep(2000);
			driver.findElement(By.cssSelector("#app > div > div > div > div > div > div.col-md-5.auth-card-right > div > div > form > section > div:nth-child(1) > div > input")).click();
			Thread.sleep(2000);
			driver.findElement(By.cssSelector("#app > div > div > div > div > div > div.col-md-5.auth-card-right > div > div > form > section > div:nth-child(1) > div > input")).sendKeys("Your Email");
			Thread.sleep(2000);
			driver.findElement(By.cssSelector("#app > div > div > div > div > div > div.col-md-5.auth-card-right > div > div > form > section > div.right-inner-addon.form-group > input")).click();
			Thread.sleep(2000);
			driver.findElement(By.cssSelector("#app > div > div > div > div > div > div.col-md-5.auth-card-right > div > div > form > section > div.right-inner-addon.form-group > input")).sendKeys("Password");
			Thread.sleep(2000);
			
			//driver.findElement(By.className("bigger-110")).click();
			//Thread.sleep(2000);
			//driver.findElement(By.className("user-info")).click();
			//Thread.sleep(2000);
			
			driver.findElement(By.cssSelector("#app > div > div > div > div > div > div.col-md-5.auth-card-right > div > div > form > section > button")).click(); // Sign-In
			Thread.sleep(4000);
			
			driver.findElement(By.cssSelector("#app > div > div.main-header > div.header-part-right > div > div")).click();
			Thread.sleep(4000);
			
			driver.findElement(By.cssSelector("#app > div > div.main-header > div.header-part-right > div > div > div > a.dropdown-item")).click(); // Logout
			Thread.sleep(2000);
			
		    }
		    catch(Exception e) {
			e.printStackTrace();
			driver.quit();
				
			}

	}



}