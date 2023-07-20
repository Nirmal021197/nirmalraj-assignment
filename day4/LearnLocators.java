package wwek1.day4;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnLocators {
	public static void main(String[] args)
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://login.Salesforce.com");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("hari.radhakrishnan@qeagle.com");
		driver.findElement(By.id("password")).sendKeys("Leaf@1234");
		driver.findElement(By.id("login")).click();
		String title=driver.getTitle();
		System.out.println(title);
		if(title.contains("Home"))
		{
			System.out.println("we are successfully logged in");
			
		}
		else {
			System.out.println("We are not successfully logged in");
		}
		
			
		
	}

}
