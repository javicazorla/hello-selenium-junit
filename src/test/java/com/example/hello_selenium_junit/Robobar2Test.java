package com.example.hello_selenium_junit;
// Generated by Selenium IDE

import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.WebDriverRunner.getWebDriver;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.core.IsNot.not;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
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
public class Robobar2Test {
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
  public void robobar2() {
    // Test name: robobar2
    // Step # | name | target | value
    // 1 | open | / | 
    driver.get("http://localhost:3000/#!/");

    {
      WebDriverWait wait = new WebDriverWait(driver, 30);
      wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".ng-scope:nth-child(1) > td .input-group-append > .btn")));
    }

    // 2 | click | css=.ng-scope:nth-child(1) > td .input-group-append > .btn |
    driver.findElement(By.cssSelector(".ng-scope:nth-child(1) > td .input-group-append > .btn")).click();
    // 3 | storeText | css=tr:nth-child(4) > .ng-binding | total
    vars.put("total", driver.findElement(By.cssSelector("tr:nth-child(4) > .ng-binding")).getText());
    // 4 | echo | total=${total} | 
    System.out.println("total=vars.get('total').toString()");
    // 5 | assert | total | €1.25
    assertEquals(vars.get("total").toString(), "€1.25");
    // 6 | click | css=.ng-scope:nth-child(2) > td .input-group-append > .btn | 
    driver.findElement(By.cssSelector(".ng-scope:nth-child(2) > td .input-group-append > .btn")).click();
    // 7 | storeText | css=tr:nth-child(4) > .ng-binding | total
    vars.put("total", driver.findElement(By.cssSelector("tr:nth-child(4) > .ng-binding")).getText());
    // 8 | echo | total=${total} | 
    System.out.println("total=vars.get('total').toString()");
    // 9 | assert | total | €3.25
    assertEquals(vars.get("total").toString(), "€3.25");
    // 10 | click | css=.ng-scope:nth-child(3) .input-group-append > .btn | 
    driver.findElement(By.cssSelector(".ng-scope:nth-child(3) .input-group-append > .btn")).click();
    // 11 | storeText | css=tr:nth-child(4) > .ng-binding | total
    vars.put("total", driver.findElement(By.cssSelector("tr:nth-child(4) > .ng-binding")).getText());
    // 12 | echo | total=${total} | 
    System.out.println("total=vars.get('total').toString()");
    // 13 | assert | total | €6.25
    assertEquals(vars.get("total").toString(), "€6.25");
    // 14 | click | css=.btn-success | 
    driver.findElement(By.cssSelector(".btn-success")).click();
    // 15 | storeText | css=.display-4 > .text-muted | drinks
    WebElement totalBebidas = new WebDriverWait(driver,10).
            until(ExpectedConditions.elementToBeClickable(By.cssSelector(".display-4 > .text-muted")));

    vars.put("drinks", driver.findElement(By.cssSelector(".display-4 > .text-muted")).getText());
    // 16 | echo | drinks=${drinks} | 
    System.out.println("drinks=vars.get('drinks').toString()");
    // 17 | assert | drinks | - 3 drinks
    assertEquals(vars.get("drinks").toString(), "- 3 drinks");
  }
}
