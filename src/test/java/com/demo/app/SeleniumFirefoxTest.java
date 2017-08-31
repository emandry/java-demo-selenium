package com.demo.app;

import java.util.concurrent.TimeUnit;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Timeouts;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


public class SeleniumFirefoxTest
{
  private static WebDriver wd;
  
  @Before
  public void setUp()
    throws Exception
  {
    System.setProperty("webdriver.gecko.driver", "/Users/username/Desktop/selenium/geckodriver");
    wd = new FirefoxDriver();
    wd.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
  }
  
  @Test
  public void SeleniumFirefoxTest()
  {
    wd.get("http://localhost:8080/");
    wd.findElement(By.linkText("Enter Data")).click();
    wd.findElement(By.name("width")).click();
    wd.findElement(By.name("width")).clear();
    wd.findElement(By.name("width")).sendKeys(new CharSequence[] { "10" });
    wd.findElement(By.name("length")).click();
    wd.findElement(By.name("length")).clear();
    wd.findElement(By.name("length")).sendKeys(new CharSequence[] { "20" });
    wd.findElement(By.cssSelector("input.btn")).click();
    wd.findElement(By.cssSelector("input.btn")).click();
    wd.findElement(By.name("width")).click();
    wd.findElement(By.name("width")).clear();
    wd.findElement(By.name("width")).sendKeys(new CharSequence[] { "12" });
    wd.findElement(By.name("length")).click();
    wd.findElement(By.name("length")).clear();
    wd.findElement(By.name("length")).sendKeys(new CharSequence[] { "33" });
    wd.findElement(By.cssSelector("input.btn")).click();
  }
  
  @After
  public void tearDown()
  {
    wd.quit();
  }
}
