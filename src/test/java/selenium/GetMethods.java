package selenium;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class GetMethods {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();

		// get(url)--> opens the url on the browser
		driver.get("https://rahulshettyacademy.com/AutomationPractice/#/");

		// getTitle--> returns the title of the page
		String title = driver.getTitle();
		System.out.println(title);

		// returns the url of the page
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
 
		// returns the source code of the page
		String pageSource = driver.getPageSource();
		System.out.println(pageSource);

		// returns the Id of the single browser window
		String windowID = driver.getWindowHandle();
		System.out.println("Window ID:" + windowID);

		// returns the Ids of multiple browser windows
		driver.findElement(By.id("openwindow")).click();
		Set<String> windowIds = driver.getWindowHandles();
		System.out.println("windowIds:" + windowIds);
		
		//isDisplayeed()
		WebElement logo=driver.findElement(By.xpath("/html/body/header/a[1]/img"));
		System.out.println(logo.isDisplayed());
		
		//isEnabled
		WebElement logo1=driver.findElement(By.xpath("/html/body/header/a[1]/img"));
		System.out.println(logo1.isEnabled());

	}
}
