package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateAccount {

	public static void main(String[] args) {
		ChromeOptions options = new ChromeOptions();

		options.addArguments("guest");

		// Initialize Web Driver
		ChromeDriver driver = new ChromeDriver(options);
		// geDriver driver=new EdgeDriver();
		// Load URL
		driver.get("http://leaftaps.com/opentaps/");

		// Maximize Window

		driver.manage().window().maximize();

		// Enter Username

		driver.findElement(By.id("username")).sendKeys("DemoCSR");

		// Enter Password

		driver.findElement(By.id("password")).sendKeys("crmsfa");

		// Click Login Button

		driver.findElement((By.className("decorativeSubmit"))).click();

		// click on the CRM/SFA link
		driver.findElement(By.linkText("CRM/SFA")).click();

		// Click on Create Account tab
		driver.findElement(By.linkText("Create Account")).click();

		// Enter an accountName
		driver.findElement(By.id("accountName")).sendKeys("Selenium Automation Tester");

		// Select "ComputerSoftware" as the industry.
		// Step1: Find dropdown Element

		WebElement sourcelement = driver.findElement(By.name("industryEnumId"));

		// Step 2 create Select object

		Select dropdown = new Select(sourcelement);

		// Use method to select option from dropdown

		dropdown.selectByIndex(3);

		WebElement sourcelement1 = driver.findElement(By.name("ownershipEnumId"));

		// Step 2 create Select object

		Select dropdown1 = new Select(sourcelement1);

		// Use method to select option from dropdown

		dropdown1.selectByVisibleText("S-Corporation");

		// Select "Employee" as the source using SelectByValue.
		// Step1: Find dropdown Element

		WebElement sourcelement2 = driver.findElement(By.name("dataSourceId"));

		// Step 2 create Select object

		Select dropdown2 = new Select(sourcelement2);

		// Use method to select option from dropdown

		dropdown2.selectByValue("LEAD_EMPLOYEE");

		// Select "eCommerce Site Internal Campaign" as the marketing campaign using
		// Step1: Find dropdown Element

		WebElement sourcelement3 = driver.findElement(By.id("marketingCampaignId"));

		// Step 2 create Select object

		Select dropdown3 = new Select(sourcelement3);

		// Use method to select option from dropdown

		dropdown3.selectByIndex(6);

		// Select "Texas" as the state/province using SelectByValue.

		WebElement element = driver.findElement(By.name("generalStateProvinceGeoId"));

		Select dropdown4 = new Select(element);

		dropdown4.selectByValue("TX");

		// Click the "Create Account" button.

		driver.findElement(By.className("smallSubmit")).click();

		// close window

		driver.close();

	}

}
