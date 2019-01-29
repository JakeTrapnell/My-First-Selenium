package com.qa.SeleniumProject;




import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SeleniumDemo {
	
	WebDriver driver;
//	BingLandingPage landingPage;
//	BingSearchPage searchPage;
	
	
//	@Ignore
//	@Before
//	public void setUp() {
//		
//		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Desktop/chromedriver.exe");
//		driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.get(Constants.URL);
//	    landingPage = PageFactory.initElements(driver, BingLandingPage.class);
//	    searchPage = PageFactory.initElements(driver, BingSearchPage.class);
//	    
//	}
	
	@Before
	public void paintSetUp() {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Desktop/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(Constants.PAINTURL);		
	}
	
	@After
	public void tearDown() {
		
		driver.close();
	}
	
//	@Ignore
//	@Test
//	public void testOne() throws InterruptedException {
//		
//		landingPage.searchBing("Selenium");
//		Thread.sleep(10000);
//		assertEquals("Selenium Text Not Found", "Selenium", searchPage.foundText());		
//	}
//	
//	@Ignore
//	@Test
//	public void testTwo() throws InterruptedException {
//		
//		WebElement textBox = driver.findElement(By.name("q"));
//		textBox.sendKeys("selenium");
//		textBox.submit();
//		WebElement link = driver.findElement(By.xpath("//*[@id=\"b_results\"]/li[4]/h2/a"));
//		link.click();
//		WebElement tableTitle = driver.findElement(By.xpath("//*[@id=\"center_content\"]/table[2]/thead/tr/th[1]"));
//		Thread.sleep(10000);
//		assertEquals("table not found", "Food", tableTitle.getText());
//	}
	
	@Test
	public void drawName() throws InterruptedException {
		Actions action = new Actions(driver);
		WebElement canvas = driver.findElement(By.id("painter"));
		//J
		action.moveToElement(canvas).moveByOffset(-300, -200).clickAndHold().moveByOffset(150, 0).moveByOffset(-75, 0).moveByOffset(0, 200).moveByOffset(-75, 0).moveByOffset(0, -75).release()
		//A
		.moveByOffset(150, 75).clickAndHold().moveByOffset(75, -200).moveByOffset(75, 200).release()
		//k
		.moveByOffset(75, 0).clickAndHold().moveByOffset(0, -200).moveByOffset(0, 100).moveByOffset(75, -100).moveByOffset(-75, 100).moveByOffset(75, 100)
		.release().perform();
		Thread.sleep(20000);
	}
	

}
