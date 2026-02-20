package Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

public class woodenstreeet {

	public static void main(String[] args) throws InterruptedException {
		
		EdgeDriver driver=new EdgeDriver();
		
		driver.manage().window().maximize();
		
		//open wooden tsreet 
		driver.get("https://www.woodenstreet.com/");
		Thread.sleep(1000);
		
		//click on sofas
		driver.findElement(By.linkText("Sofas")).click();
		Thread.sleep(3000);
		
		driver.quit();
	}

}
