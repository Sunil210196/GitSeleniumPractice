package Practice1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstProg {
	
	
	public void Pom1() throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		
		
		
		List<WebElement> products = driver.findElements(By.xpath("//div[@class='product']/h4[@class='product-name']"));
		
		for(int i=0;i<products.size();i++) 
		{
			
			String text=driver.findElements(By.xpath("//div[@class='product']")).get(i).getText();
			
			if(text.contains("Cucumber"))
			{
				System.out.println(text);
				driver.findElements(By.xpath("//button[text()='ADD TO CART']")).get(i).click();
				break;
			}
			
			
		}
		
		Thread.sleep(5000);
		driver.quit();
			

	}
	
	
//	public static void main(String[] args) throws InterruptedException {
//		
//		WebDriver driver = new ChromeDriver();
//		
//		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
//		
//		
//		
//		List<WebElement> products = driver.findElements(By.xpath("//div[@class='product']/h4[@class='product-name']"));
//		
//		for(int i=0;i<products.size();i++) 
//		{
//			
//			String text=driver.findElements(By.xpath("//div[@class='product']")).get(i).getText();
//			
//			if(text.contains("Cucumber"))
//			{
//				System.out.println(text);
//				driver.findElements(By.xpath("//button[text()='ADD TO CART']")).get(i).click();
//				break;
//			}
//			
//			
//		}
//		
//		Thread.sleep(5000);
//		driver.quit();
//			
//
//	}


}
