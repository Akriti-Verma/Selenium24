package selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ClearTrip {

	public static void main(String[] args) {
WebDriver driver = new ChromeDriver();
        
        // Maximize the browser window
        driver.manage().window().maximize();

        // Set an implicit wait time
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        // Navigate to Cleartrip's website
        driver.get("https://www.cleartrip.com");
        driver.navigate().refresh();

        // Locate the "From" input field
        WebElement fromField = driver.findElement(By.xpath("//input[@placeholder='Where from?']"));
        
        // Click on the "From" input field to activate it
        fromField.click();

        // Enter the city or state you want to select
        fromField.sendKeys("New York");
         
        // Wait for the suggestions to load and select the first suggestion
        WebElement firstSuggestion = driver.findElement(By.xpath("//p[contains(text(),'New York, US')]"));
        firstSuggestion.click();


        // Close the browser
        driver.quit();
		    }
		}

	