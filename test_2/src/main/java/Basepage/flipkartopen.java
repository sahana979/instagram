package Basepage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class flipkartopen {
	public WebDriver driver;
	
	public flipkartopen (WebDriver driver)
	
	{
		this.driver=driver;
	}

	public void open()
	{
		driver.get("https://www.flipkart.com/");
	}
	
	public void searchForProduct(String productName)
	{
		WebElement searchBox=driver.findElement(By.name("q"));
		searchBox.sendKeys(productName);
		driver.findElement(By.xpath("//button[@type='submit']//*name()='q']"));
		System.out.println("Flipkart Executed Successfully");
	}
}
