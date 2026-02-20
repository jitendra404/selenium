package Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

public class toyoutube {

	public static void main(String[] args) throws InterruptedException {
		EdgeDriver driver = new EdgeDriver();

		driver.manage().window().maximize();

		// open youtube
		driver.get("https://www.youtube.com/");
		Thread.sleep(3000);

		// search on searchfiled
		driver.findElement(By.name("search_query")).sendKeys("Master The Blaster");
	
		
		// click on serch
		driver.findElement(By.xpath("//button[contains(@class,'ytSearchboxComponentSearchButton')]")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.partialLinkText("Master - Master The Blaste")).click();

	}

}