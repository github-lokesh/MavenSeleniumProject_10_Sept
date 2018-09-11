package com.seldemo.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SeleDemo {
	//just a random comment : 1 
	//just a random comment : 2
	//Maven Build life cycle
	/*Clean - preclean, clean, postclean
	 *Default - validate, compile, test, package, verify, install, deploy
	 *Site -
	 *
	 *
	 * On cmd prompt
	 * -------------
	 * mvn clean test
	 * mvn clean install
	 * mvn clean install site
	 * mvn surefire:test - only executes the tests on previously complied code and no build phases.
	 * 
	 */
	@Test
	public void f()
	{
		System.setProperty("webdriver.chrome.driver","C://Data_Program//Selenium_Dependencies//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.google.com");
	}
}
