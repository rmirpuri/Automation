package org.loblaw.brooklyn.automation;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.junit.*;
import org.openqa.selenium.support.ui.ExpectedConditions;

import static org.junit.Assert.*;

public class BrooklynRegistration {

  private WebDriver driver;

  @Before
  public void setUp() {
	  //System.setProperty("webdriver.gecko.driver", "//Users//rmirpur//Documents//Tools//geckodriver");
	  
	  // Launch a new Firefox instance
    driver = new ChromeDriver();

    
    driver.get("http://master.brooklyn.lblw.ca");
  }

  @Test
  public void loginWithCorrectCredentials() {
	  
	  WebDriverWait wait = new WebDriverWait(driver, 10);
	  wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//a[@class='link link--theme-button-transparent menu-desktop__login']")));
    // Find the text input element by its name
    WebElement signin = driver.findElement(By.xpath("//a[@class='link link--theme-button-transparent menu-desktop__login']"));
    // Clear the existing text value
    //signin.clear();
    signin.click();
    
    wait.until(ExpectedConditions.presenceOfElementLocated(By.id("email")));

    WebElement email = driver.findElement(By.id("email"));
    
    // Enter something to search for
    email.sendKeys("test@test.com");
    
    WebElement password = driver.findElement(By.id("password"));
    password.clear();
    password.sendKeys("123Password");
    
    WebElement submitButton = driver.findElement(By.cssSelector(".button.button--block.button--theme-base"));
    
    // Now submit the form	
    submitButton.click();

   
  }

  @After
  public void tearDown() throws Exception {
    // Close the browser
    driver.quit();
  }
}