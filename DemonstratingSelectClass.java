package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class DemonstratingSelectClass {

	public static void main(String[] args) {
		// Initialize the WebDriver (ChromeDriver).

		ChromeOptions option = new ChromeOptions();
		option.addArguments("guest");
		ChromeDriver driver = new ChromeDriver(option);

		// Load the URL https://en-gb.facebook.com/

		driver.get("https://en-gb.facebook.com/");

		// Maximize the browser window

		driver.manage().window().maximize();

		// Click on the Create new account button.
		driver.findElement(By.partialLinkText("Create new account")).click();

		// Enter the First name.
		driver.findElement(By.name("firstname")).sendKeys("Gagan");

		// Enter the Surname.
		driver.findElement(By.name("lastname")).sendKeys("Kaur");

		// Enter the Mobile number or email address.
		driver.findElement(By.name("reg_email__")).sendKeys("123456897");

		// Enter the New password.
		driver.findElement(By.id("password_step_input")).sendKeys("123456897");

		// Handle all three dropdowns in Date of birth
		// select day
		WebElement element = driver.findElement(By.id("day"));
		// System.out.println(element);

		Select day = new Select(element);

		day.selectByIndex(1);

		// select month
		WebElement element1 = driver.findElement(By.id("month"));
		Select mon = new Select(element1);

		mon.selectByValue("4");

		// select year
		WebElement element2 = driver.findElement(By.id("year"));
		Select yr = new Select(element2);

		yr.selectByVisibleText("1990");

		// Select the radio button in Gender.
		driver.findElement(By.xpath("//Label[text()='Male']")).click();
		
	// Implicit wait
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		// close the browser

		driver.close();

	}

}
