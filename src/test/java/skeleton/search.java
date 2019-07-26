package skeleton;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class search {
	WebDriver driver;
	int sz;
	/*@Given("click search bar")
	public void click_search_bar() {
	  driver.findElement(By.name("products")).click();
	}*/
	@When("browser")
	public void browser()
	{
		System.setProperty("webdriver.chrome.driver","C:\\Selium 3.0\\Selium 3.0\\chromedriver.exe");
	    driver=new ChromeDriver();
	    driver.get("http://10.232.237.143:443/TestMeApp/login.htm");
	    
	    driver.findElement(By.name("userName")).sendKeys("lalitha");
	    driver.findElement(By.name("password")).sendKeys("password123");
	    driver.findElement(By.name("Login")).click();
	}

	@Given("type{string}")
	public void type(String searche) {
	  driver.findElement(By.name("products")).click();
	  driver.findElement(By.name("products")).sendKeys(searche);
	}

	@When("click")
	public void click_finddetails() {
	   driver.findElement(By.xpath("/html/body/div[1]/form/input")).click();
	}
	@When("proceed payment")
	public void proceed_payment() {
	    sz=driver.findElements(By.linkText("Cart")).size();
	    if(sz==0)
	    {
	    	System.out.println("please add item to the cart");
	    }
	    /*else{
	    	driver.findElement(By.linkText("Cart")).click();*/
	    	}
	}

