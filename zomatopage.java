package Assignments;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.io.FileHandler;

public class zomatopage {

	public static void main(String[] args) throws InterruptedException, IOException {

		WebDriver driver=new EdgeDriver();
		
		driver.manage().window().maximize();
		
		//open udemy
		driver.get("https://www.zomato.com/");
		Thread.sleep(3000);

		//TakesScreenshot tc=(TakesScreenshot) driver;
		
		File temp = driver.findElement(By.xpath("(//img[@loading='eager'])[5]")).getScreenshotAs(OutputType.FILE);
		
		File src=new File("./errorShotes/Zomatologo.png");
		
		FileHandler.copy(temp, src);
		
		
		driver.quit();
	}

}
