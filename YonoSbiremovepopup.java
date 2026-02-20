package Assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class YonoSbiremovepopup {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		//open yono sbi
		driver.get("https://yonobusiness.sbi.bank.in/yonobusinesslogin");
		
		//close popup
		driver.findElement(By.xpath("//span[contains(@class,'ng-tns-c2785778308-3 icon-cancel')]")).click();

		//fil the id
		driver.findElement(By.id("main_body")).sendKeys("Jitendra@123");
		
		driver.findElement(By.id("password")).sendKeys("123456");
	}

}
