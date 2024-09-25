package selenium;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Windowhandles {
	public static void main(String[] args) throws Exception {

		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/#/");
		driver.manage().window().maximize();
		String mainWindowHandle = driver.getWindowHandle();
		Thread.sleep(3000);
		driver.findElement(By.cssSelector(".blinkingText")).click(); // Change this locator if needed
		Thread.sleep(3000);
		Set<String> allWindowHandles = driver.getWindowHandles();
		Thread.sleep(3000);

		for (String handle : allWindowHandles) {
			if (!handle.equals(mainWindowHandle)) {
				driver.switchTo().window(handle);
				break;
			}
		}

		System.out.println("New Window Title: " + driver.getTitle());
		Thread.sleep(3000);
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0,200)");
		WebElement ele = driver.findElement(By.cssSelector(".im-para.red"));
		ele.getText();
		System.out.println(ele);
		driver.close();
//		Thread.sleep(3000);
//		driver.switchTo().window(mainWindowHandle);
//		System.out.println("Main Window Title: " + driver.getTitle());
//		driver.quit();
	}
}
