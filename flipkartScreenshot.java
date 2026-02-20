package Assignments;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Set;


import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.io.FileHandler;

public class flipkartScreenshot {

	public static void main(String[] args) throws IOException {
		
		WebDriver driver=new EdgeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		//open flipkart
		driver.get("https://www.flipkart.com/");
		
		//search proudct
		driver.findElement(By.name("q")).sendKeys("watch");
		
		//click search
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		driver.findElement(By.xpath("(//div[@class='jn1d30'])[1]")).click();
		
		String parentId = driver.getWindowHandle();
		
		Set<String> allId = driver.getWindowHandles();
		
		allId.remove(parentId);
		
		for(String id: allId) {
		
		driver.switchTo().window(id);
		
		}
		
		TakesScreenshot ts=(TakesScreenshot) driver ;
			
	
		File tem = ts.getScreenshotAs(OutputType.FILE);
		
		File src=new File("./errorShotes/flipkartprod.png");
		
		FileHandler.copy(tem, src);
		

	}

}
