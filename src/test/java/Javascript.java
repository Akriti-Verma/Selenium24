import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Javascript {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.amazon.in/");
	driver.manage().window().maximize();
	
	List<WebElement> count=driver.findElements(By.xpath("//*[contains(text(),'No cost EMI up to 24 months | Starting ₹4,433 INR/month*')]/ancestor::*"));
	int bestSellerCount=count.size();
	System.out.println(bestSellerCount);
	
	
	
	
	
	
}
}
