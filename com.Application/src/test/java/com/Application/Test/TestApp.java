package com.Application.Test;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class TestApp {
	WebDriver driver;
  @Test
  public void Execution() {
	  driver.findElement(By.id("//input[@id='form_first_name_id']))")).sendKeys("uma");
	  driver.findElement(By.xpath("//input[@id='form_last_name_id']")).sendKeys("sai");
  }
  @BeforeMethod
  public void setUp() {
	  System.setProperty("webdriver.chrome.driver", "D:\\All Testing\\Browser files\\ChromeDriver\\chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.get("http://recruiter.monsterindia.com/v2/recruiter-sign-up.html");
  }

  @AfterMethod
  public void quit() {
	  driver.close();
  }

}
