package Assignments;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class tocaptureMyntraelement {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new EdgeDriver();
		
		driver.manage().window().maximize();
		
		//open myntra
		driver.get("https://www.myntra.com/shop/men");
		Thread.sleep(3000);
		
		//to capture multielement
		List<WebElement> allele = driver.findElements(By.xpath("//div[@data-reactid='18']/div"));
	
		for(WebElement ele : allele) {
			System.out.println(ele.getText());
			
		}
		driver.quit();
	}

}
