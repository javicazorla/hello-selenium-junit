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
        import org.openqa.selenium.opera.OperaOptions;
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

public class imdbTestOpera {
    private WebDriver driver;
    private Map<String, Object> vars;
    JavascriptExecutor js;
    @BeforeEach
    public void setUp() throws MalformedURLException {
        /*
        FirefoxOptions options = new FirefoxOptions();
        options.setHeadless(true);
        driver = new FirefoxDriver(options);
        Configuration.startMaximized = true;
        open("about:blank");
        driver = getWebDriver();
        */

        OperaOptions operaOptions = new OperaOptions();
        driver = new RemoteWebDriver(new URL("http://172.28.0.1:4444/wd/hub/"), operaOptions);

        js = (JavascriptExecutor) driver;
        vars = new HashMap<String, Object>();
    }
    @AfterEach
    public void tearDown() {
        driver.quit();
    }
    @Test
    public void imdbwandavision() throws MalformedURLException {

        // Test name: imdb-wandavision
        // Step # | name | target | value
        // 1 | open | / |
        driver.get("https://www.imdb.com/");
        // 2 | setWindowSize | 835x691 |
        driver.manage().window().setSize(new Dimension(835, 691));
        // 3 | type | id=suggestion-search | wandavision
        driver.findElement(By.id("suggestion-search")).sendKeys("WandaVision");

        WebElement wandaresult = new WebDriverWait(driver,10).
                until(ExpectedConditions.elementToBeClickable(By.xpath("//a[contains(text(),\'WandaVision\')]")));
/*
        // 4 | click | css=.\_2mXTyZmtWnrwCBj9tuEhuK .\_2NPnhnjxKTlB8HDsb7RtwX |
        driver.findElement(By.xpath("//a[contains(text(),\'WandaVision\')]")).click();
        // 5 | click | css=.bp_content |
        driver.findElement(By.xpath("//a[contains(text(),\'WandaVision\')]")).click();

        WebElement trivialink = new WebDriverWait(driver,10).
                until(ExpectedConditions.elementToBeClickable(By.xpath("//a[contains(text(),\'WandaVision\')]")));
        driver.findElement(By.xpath("//a[contains(text(),\'TRIVIA\')]")).click();
*/
    }
}
