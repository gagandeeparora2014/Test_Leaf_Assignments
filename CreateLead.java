package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class CreateLead {

	public static void main(String[] args) {

		// Initialize the WebDriver (ChromeDriver).
		ChromeOptions options = new ChromeOptions();

		options.addArguments("guest");

		ChromeDriver driver = new ChromeDriver(options);

		// Load the URL http://leaftaps.com/opentaps/.
		driver.get("http://leaftaps.com/opentaps/");

		// Maximize the browser window.
		driver.manage().window().maximize();

		// Enter a username and password.

		driver.findElement(By.id("username")).sendKeys("DemoCSR");

		driver.findElement(By.id("password")).sendKeys("crmsfa");

		// Click the "Login" button.
		driver.findElement(By.className("decorativeSubmit")).click();

		// Click on the "CRM/SFA" link.

		driver.findElement(By.linkText("CRM/SFA")).click();

		// Click on the "Leads" tab.

		driver.findElement(By.linkText("Leads")).click();

		// Click on the "Create Lead" button.
		driver.findElement(By.linkText("Create Lead")).click();

		// Enter a FirstName.
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Gagan");

		// Enter a LastName.

		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Kaur");

		// Enter a CompanyName.
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Testleaf");

		// Enter a Title
		driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("Test Leaf Engineer");

		// Click the "Create Lead" button.
		driver.findElement(By.name("submitButton")).click();

		// Verify that the Title is displayed correctly.
		WebElement actualTitle = driver.findElement(By.id("viewLead_generalProfTitle_sp"));
	String expectedTitle="Test Leaf Engineer";
		
		if (actualTitle.getText().equals(expectedTitle)) {
			System.out.println("Passed");
		}

		else
			System.out.println("Failed");

		// Close the browser window.
		// driver.close();
	}

	// Close the browser window.

}
