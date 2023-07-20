package wwek1.day4;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Create {

	public static void main(String[] args) {
	
		ChromeDriver driver = new ChromeDriver(); 		
		driver.get("http://leaftaps.com/opentaps/control/login");		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement username = driver.findElement(By.id("username"));
		username.sendKeys("demoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Dentsu");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("P.Nirmal");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Raj");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("nirmalpalanimudali@gmail.com");
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("6380443614");
		driver.findElement(By.name("submitButton")).click();
		driver.close();
	
		

	}

}
