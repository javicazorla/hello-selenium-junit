package com.example.hello_selenium_junit;

import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.WebDriverRunner.getWebDriver;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;

import org.openqa.selenium.Keys;
import java.util.*;

public class GoogleSearch {
  private WebDriver driver;
  private Map<String, Object> vars;
  JavascriptExecutor js;
  @BeforeEach
  public void setUp() {

    /*
    FirefoxOptions options = new FirefoxOptions();
    options.setHeadless(true);
    driver = new FirefoxDriver(options);
     */
    Configuration.startMaximized = true;
    open("about:blank");
    driver = getWebDriver();

    js = (JavascriptExecutor) driver;
    vars = new HashMap<String, Object>();
  }
  @AfterEach
  public void tearDown() {
    driver.quit();
  }
  @Test
  public void googledevops() {
    // Test name: google-devops
    // Step # | name | target | value
    // 1 | open | / | 
    driver.get("https://www.google.com/");
    // 3 | selectFrame | index=0 | 
    driver.switchTo().frame(0);
    // 4 | waitForElementVisible | xpath=//form/div/span/span | 30000
    {
      WebDriverWait wait = new WebDriverWait(driver, 30);
      wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//form/div/span/span")));
    }
    // 5 | click | xpath=//form/div/span/span | 
    driver.findElement(By.xpath("//form/div/span/span")).click();
    // 6 | selectFrame | relative=parent | 
    driver.switchTo().defaultContent();
    // 7 | click | name=q | 
    driver.findElement(By.name("q")).click();
    // 8 | type | name=q | devops
    driver.findElement(By.name("q")).sendKeys("devops");
    // 9 | sendKeys | name=q | ${KEY_ENTER}
    driver.findElement(By.name("q")).sendKeys(Keys.ENTER);

    {
      WebDriverWait wait = new WebDriverWait(driver, 30);
      wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[2]/div/div/div[3]/div/div/a/h3/span")));
    }

    // 10 | click | css=.hlcw0c:nth-child(4) > .g:nth-child(1) .LC20lb > span | 
    driver.findElement(By.xpath("//div[2]/div/div/div[3]/div/div/a/h3/span")).click();
  }
}
