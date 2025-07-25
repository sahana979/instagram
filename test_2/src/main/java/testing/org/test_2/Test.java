package testing.org.test_2;

import org.openqa.selenium.chrome.ChromeDriver;

import Basepage.flipkartopen;

public class Test {
	public static void main(String[] args) {
		
		ChromeDriver driver=new ChromeDriver();
		
		Object amazonHomePage;
		//amazon amazonHomePage=new amazon(driver);
		//amazonHomePage.open();
		// amazonHomePage).searchForProduct("shoes");
		
		
		flipkartopen flipkartHomePage=new flipkartopen(driver);
		flipkartHomePage.open();
		flipkartHomePage.searchForProduct("shoes");
		
		//flipkartHomePage.searchForProduct("watch");
	}

}
