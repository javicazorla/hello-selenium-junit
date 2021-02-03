package com.example.hello_selenium_junit;
// Generated by Selenium IDE

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.core.IsNot.not;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import java.util.*;
import java.net.MalformedURLException;
import java.net.URL;
public class RobobarTest {
  private WebDriver driver;
  private Map<String, Object> vars;
  JavascriptExecutor js;
  @BeforeEach
  public void setUp() {
    driver = new FirefoxDriver();
    js = (JavascriptExecutor) driver;
    vars = new HashMap<String, Object>();
  }
  @AfterEach
  public void tearDown() {
    driver.quit();
  }
  @Test
  public void robobar() {
    // Test name: robobar
    // Step # | name | target | value
    // 1 | open | / | 
    driver.get("http://localhost:3000/#!/");
    // 2 | setWindowSize | 835x693 | 
    driver.manage().window().setSize(new Dimension(835, 693));
    // 3 | click | css=.ng-scope:nth-child(1) > td .input-group-append > .btn | 
    driver.findElement(By.cssSelector(".ng-scope:nth-child(1) > td .input-group-append > .btn")).click();
    // 4 | click | css=.ng-scope:nth-child(2) > td .input-group-append > .btn | 
    driver.findElement(By.cssSelector(".ng-scope:nth-child(2) > td .input-group-append > .btn")).click();
    // 5 | click | css=.ng-scope:nth-child(3) .input-group-append > .btn | 
    driver.findElement(By.cssSelector(".ng-scope:nth-child(3) .input-group-append > .btn")).click();
    // 6 | click | css=.btn-success | 
    driver.findElement(By.cssSelector(".btn-success")).click();
    // 7 | runScript | window.scrollTo(0,0) | 
    js.executeScript("window.scrollTo(0,0)");
    // 8 | click | id=ageInput | 
    driver.findElement(By.id("ageInput")).click();
    // 9 | type | id=ageInput | 21
    driver.findElement(By.id("ageInput")).sendKeys("21");
    // 10 | click | css=.btn-success | 
    driver.findElement(By.cssSelector(".btn-success")).click();
    // 11 | runScript | window.scrollTo(0,0) | 
    js.executeScript("window.scrollTo(0,0)");
  }
}
