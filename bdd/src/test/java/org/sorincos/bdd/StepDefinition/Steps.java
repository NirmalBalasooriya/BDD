package org.sorincos.bdd.StepDefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;		
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


import cucumber.api.java.en.Given;		
import cucumber.api.java.en.Then;		
import cucumber.api.java.en.When;
import sun.security.util.PendingException;		

public class Steps{				

    WebDriver driver;			
    		
    @Given("^Open the Firefox and launch the application$")					
    public void open_the_Firefox_and_launch_the_application() throws Throwable							
    {		
       System.setProperty("webdriver.chrome.driver", "C:\\driver\\chromedriver_win32\\chromedriver.exe");					
       driver= new ChromeDriver();				
       
       //Set implicit time out
       driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
       
       driver.manage().window().maximize();			
       driver.get("http://demo.guru99.com/v4");					
    }		
    
    @When("^click on item with selector \\\"([^\\\"]*)\\\"")					
    public void  click_on_item_with_selector(String selector) throws Throwable 							
    {		
       driver.findElement(By.cssSelector(selector)).click();;													
    }

    @When("^click on item with xpath \\\"([^\\\"]*)\\\"")					
    public void  click_on_item_with_xpath(String xpathExpression) throws Throwable 							
    {		
       driver.findElement(By.xpath(xpathExpression)).click();
       
    }
    
    @Then("^go back to previous URL")
    public void go_back_to_previous_URL() throws Throwable {
    	driver.navigate().back();
    }


    @When("^div vivible and clickable with xpath \\\"([^\\\"]*)\\\"")					
    public void  div_vivible_and_clickable(String xpathExpression) throws Throwable 							
    {		
       driver.findElement(By.xpath(xpathExpression)).isDisplayed();		
       driver.findElement(By.xpath(xpathExpression)).isEnabled();		
    }

    
    @When("^Enter the Username and Password$")					
    public void enter_the_Username_and_Password() throws Throwable 							
    {		
       driver.findElement(By.name("uid")).sendKeys("username12");							
       driver.findElement(By.name("password")).sendKeys("password12");							
    }		

    @Then("^Reset the credential$")					
    public void Reset_the_credential() throws Throwable 							
    {		
       driver.findElement(By.name("btnReset")).click();					
    }		
}