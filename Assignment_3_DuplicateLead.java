package selenium.week2.day1;

import org.openqa.selenium.By;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.support.ui.Select;

	import io.github.bonigarcia.wdm.WebDriverManager;

	public class Assignment_3_DuplicateLead {

	public static void main(String[] args) throws InterruptedException {
			
			WebDriverManager.chromedriver().setup();
			ChromeDriver driver = new ChromeDriver();
			
			driver.get("http://leaftaps.com/opentaps/control/login");
			driver.manage().window().maximize();
			driver.findElement(By.id("username")).sendKeys("democsr");
			driver.findElement(By.id("password")).sendKeys("crmsfa");
			driver.findElement(By.className("decorativeSubmit")).click();
			driver.findElement(By.linkText("CRM/SFA")).click();
			driver.findElement(By.linkText("Leads")).click();
			driver.findElement(By.linkText("Create Lead")).click();
			driver.findElement(By.id("createLeadForm_companyName")).sendKeys("HCL");
			driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Bheemrao");
			driver.findElement(By.id("createLeadForm_lastName")).sendKeys("marimuthu");
			driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Bheem");
			driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Testing");
			driver.findElement(By.id("createLeadForm_description")).sendKeys("Testing Automation");
			driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("bheem.marimuthu@gmail.com");
			WebElement dropdown = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
			Select dd = new Select(dropdown);
			dd.selectByVisibleText("New York");
			driver.findElement(By.name("submitButton")).click();
			String title = driver.getTitle();
			System.out.println(title);
			driver.findElement(By.className("subMenuButton")).click();
			WebElement comname= driver.findElement(By.id("createLeadForm_companyName"));
			comname.clear();
			comname.sendKeys("CTS");
			WebElement firstname = driver.findElement(By.id("createLeadForm_firstName"));
			firstname.clear();
			firstname.sendKeys("Venket");
			driver.findElement(By.name("submitButton")).click();
				
}
}