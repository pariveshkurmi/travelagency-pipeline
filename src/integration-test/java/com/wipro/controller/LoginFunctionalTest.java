
package com.wipro.controller;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.ChromeDriverManager;

import org.junit.*;
import static org.junit.Assert.*;

import org.junit.experimental.categories.Category;

//@Category(IntegrationTest.class)
public class LoginFunctionalTest {

	/*static WebDriver driver;

	@BeforeClass
	public static void setup() {
		//System.setProperty("webdriver.chrome.driver", "D:\\Drivers\\chromedriver_win32\\chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", "D:\\Drivers\\chromedriver_win32\\chromedriver.exe");
		ChromeDriverManager.getInstance().setup();
		ChromeOptions chromeOptions = new ChromeOptions();
		chromeOptions.addArguments("--headless");
		chromeOptions.setBinary("/var/jenkins_home/driver/chrome.exe");
		
		driver = new ChromeDriver();

	}

	@AfterClass
	public static void cleanUp() {
		driver.quit();
	}
	
	@Test
	public void oneTest() {
		driver.get("http://www.xcelnetwork.in");
		WebElement email = driver.findElement(By.className("uname"));
		WebElement pass = driver.findElement(By.className("youpasswd"));
		WebElement button = driver.findElement(By.xpath("//input[@value='Log In']"));
		Actions actions = new Actions(driver);
		actions.moveToElement(email);
		actions.click();
		actions.sendKeys("SFC26052018599");
		actions.build().perform();
		actions.moveToElement(pass);
		actions.click();
		actions.sendKeys("YfeZe");
		actions.build().perform();
		button.click();
	}

	//@Test
	public void loginSuccess() {
		driver.get("http://192.168.99.100:6080/integratedlearningproject/index.jsp");
		WebElement email = driver.findElement(By.name("email"));
		WebElement pass = driver.findElement(By.name("password"));
		WebElement button = driver.findElement(By.xpath("/html/body/form/div/button"));
		email.sendKeys("parivesh.kurmi@gmail.com");
		pass.sendKeys("1234");
		button.click();
		assertTrue(driver.getPageSource().contains("Book Ticket"));
	}

	// @Test
	public void loginFail() {
		driver.get("http://localhost:8080/integratedlearningproject");
		WebElement email = driver.findElement(By.name("email"));
		WebElement pass = driver.findElement(By.name("password"));
		WebElement button = driver.findElement(By.xpath("/html/body/form/div/button"));
		email.sendKeys("parivesh.kumar@wipro.com");
		pass.sendKeys("1234");
		button.click();
		assertTrue(driver.getPageSource().contains("Invalid username or password, Please try again with valid"));
	}*/

	/*
	 * @Test public void registrationSuccess() {
	 * driver.get("http://localhost:6080/integratedlearningproject/register.jsp"
	 * ); WebElement firstname = driver.findElement(By.name("firstname"));
	 * WebElement lastname = driver.findElement(By.name("lastname")); WebElement
	 * confirmpass = driver.findElement(By.name("confirmpass")); WebElement
	 * email = driver.findElement(By.name("email")); WebElement pass =
	 * driver.findElement(By.name("pass")); WebElement button =
	 * driver.findElement(By.xpath("/html/body/form/div/button"));
	 * firstname.sendKeys("fname"); lastname.sendKeys("lname");
	 * pass.sendKeys("1234"); confirmpass.sendKeys("1234");
	 * email.sendKeys("aa@gmail.com"); button.click();
	 * assertTrue(driver.getPageSource().contains("Book Store")); }
	 * 
	 * @Test public void forgotPasswordSuccess() {
	 * driver.get("http://localhost:6080/Bookstore/forgotpassword.jsp");
	 * WebElement confirmpass = driver.findElement(By.name("confirmpassword"));
	 * WebElement email = driver.findElement(By.name("email")); WebElement pass
	 * = driver.findElement(By.name("newpassword")); WebElement button =
	 * driver.findElement(By.xpath("/html/body/form/div/button"));
	 * pass.sendKeys("1234"); confirmpass.sendKeys("1234");
	 * email.sendKeys("avinash.patel@wipro.com"); button.click();
	 * assertTrue(driver.getPageSource().contains("Book Store")); }
	 */
}