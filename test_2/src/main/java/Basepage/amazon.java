package Basepage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class amazon {
	WebDriver driver;
	
	public amazon (WebDriver driver)
	{
		this.driver=driver;
	}
     
	public void open()
	{
		driver.get("https://www.amazon.in/");
	}
	
	public void searchForProduct(String productName)
	{
		WebElement searchBox=driver.findElement(By.id("twotabsearchtextbox"));
		searchBox.sendKeys(productName);
		driver.findElement(By.id("nav-search-submit-button")).click();
		System.out.println("amazon Executed Succsessfully");
		
	}
}
