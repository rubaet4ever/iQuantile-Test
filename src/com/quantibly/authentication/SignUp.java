package com.quantibly.authentication;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.safari.SafariDriver.WindowType;

public class SignUp {
	
	public static void createSignUp(WebDriver driver) {
		// TODO Auto-generated method stub
		try {
			Thread.sleep(2000);
			driver.findElement(By.cssSelector("#app > div > div > div > div > div > div.col-md-5.auth-card-right > div > p > a")).click();
			Thread.sleep(2000);
			driver.findElement(By.cssSelector("#app > div > div > div > div > div > div.col-md-5.auth-card-right > div > div > form > section > div:nth-child(1) > div > input")).click();
			Thread.sleep(2000);
			driver.findElement(By.cssSelector("#app > div > div > div > div > div > div.col-md-5.auth-card-right > div > div > form > section > div:nth-child(1) > div > input")).sendKeys("Organization Name"); //  Input Your Organization Name
			Thread.sleep(2000);
			driver.findElement(By.cssSelector("#app > div > div > div > div > div > div.col-md-5.auth-card-right > div > div > form > section > div:nth-child(2) > div > input")).click();
			Thread.sleep(2000);
			driver.findElement(By.cssSelector("#app > div > div > div > div > div > div.col-md-5.auth-card-right > div > div > form > section > div:nth-child(2) > div > input")).sendKeys("Your Email"); // Input Your Email
			Thread.sleep(2000);
			
			//driver.findElement(By.className("bigger-110")).click();
			//Thread.sleep(2000);
			//driver.findElement(By.className("user-info")).click();
			//Thread.sleep(2000);
			
			driver.findElement(By.cssSelector("#app > div > div > div > div > div > div.col-md-5.auth-card-right > div > div > form > button")).click();
			Thread.sleep(2000);
			
			//driver.findElement(By.cssSelector("#gb > div.gb_Kd.gb_1d.gb_Qd.gb_Pd > div.gb_Ud.gb_Wa.gb_Jd > div:nth-child(1) > div > div:nth-child(1) > a")).click();
			//Thread.sleep(2000);
			
			((JavascriptExecutor)driver).executeScript ("window.openNewTab");
			ArrayList<String> tabs=new ArrayList<>(driver.getWindowHandles());
			driver.switchTo().window(tabs.get(1));
			driver.get("https://www.gmail.com");
			
			driver.findElement(By.id("identifierId")).sendKeys("Your Email");
			driver.findElement(By.xpath("//*[@id='identifierNext']")).click();
			driver.findElement(By.name("password")).sendKeys("Password");
			driver.findElement(By.xpath("//*[@id='passwordNext']")).click();
			
			// click on the profile icon
			driver.findElement(By.xpath("//*[@id='gb']/div[2]/div[3]/div/div[2]/div/a")).click();
			// click on the sign out
			
			
			driver.findElement(By.cssSelector("/html/body/div[7]/div[3]/div/div[2]/div[1]/div[2]/div/div/div/div/div[2]/div/div[1]/div/div/div[8]/div/div[1]/div[3]/div/table/tbody/tr[1]")).click();
			Thread.sleep(2000);
			driver.switchTo().window(tabs.get(0));
			Thread.sleep(2000);
			driver.findElement(By.cssSelector("#app > div > div > div > div > div > div.col-md-5.auth-card-right > div > div > form > button")).click(); // Copy & Input Your Verify Token
			Thread.sleep(2000);
		    }
		    catch(Exception e) {
			e.printStackTrace();
			driver.quit();
				
			}

	}

}