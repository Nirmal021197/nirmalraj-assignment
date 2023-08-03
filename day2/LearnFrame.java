package week3.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnFrame {

	public static void main(String[] args) {
		// TODO Auto-generated method stubEdgeDriver driver=new EdgeDriver();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_confirm ");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
		WebDriver frame = driver.switchTo().frame(0);
		driver.findElement(By.xpath("(//button[text()='Click Me'])[1]")).click();
		WebElement insideframe = driver.findElement(By.xpath("//button[text()='Hurray! You Clicked Me.']"));
		String text = insideframe.getText();
		System.out.println(text);
		driver.switchTo().defaultContent();
		
		
		List<WebElement> iframecount = driver.findElements(By.tagName("iframe"));
		System.out.println("Total frames : " +iframecount.size());
		
		
		driver.switchTo().frame(2);
		driver.switchTo().frame("frame2");
		driver.findElement(By.xpath("(//button[text()='Click Me'])")).click();
		WebElement nestFrame = driver.findElement(By.xpath("//button[text()='Hurray! You Clicked Me.']"));
		String text1 = nestFrame.getText();
		System.out.println(text1);
		
		
	}

}
