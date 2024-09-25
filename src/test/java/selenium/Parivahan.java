package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Parivahan {
	public static void main(String[] args) throws Exception {
		WebDriver driver = new ChromeDriver();
		driver.get("https://parivahan.gov.in/parivahan/");
		driver.manage().window().maximize();
		Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(By.linkText("On  line Services"))).perform();
		Thread.sleep(3000);
		List<WebElement> ele = driver.findElements(By.xpath("(//div[@class='mega-dropdown-inner'])[1]"));
		for (WebElement text : ele) {
		System.out.println(text.getText());

		}
	}
}
