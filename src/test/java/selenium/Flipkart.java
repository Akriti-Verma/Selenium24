package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.flipkart.com/");
	driver.manage().window().maximize();
	driver.findElement(By.xpath("//img[@alt='Mobiles']")).click();
	List<WebElement> ele=driver.findElements(By.xpath("//input[@type='checkbox']"));
	System.out.println(ele.size());
	for(WebElement checkbox:ele) {
		System.out.println(checkbox.getText());
	}
}
}
