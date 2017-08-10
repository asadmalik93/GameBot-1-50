import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Controller {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "lib"+File.separator+"chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("http://zzzscore.com/1to50/en/");
		
		//System.out.println(driver.getPageSource());
		
		WebElement[] element = new WebElement[51];
		
		List<WebElement> divE = driver.findElement(By.id("grid")).findElements(By.cssSelector("div"));
		
		for (int i = 0; i < divE.size(); i++) {
			element[Integer.parseInt(divE.get(i).getText())] = divE.get(i);
		}
		   
		for (int i = 1; i < element.length; i++) {
			if (element[i] != null) {
				element[i].click();
			} else {
				divE = driver.findElement(By.id("grid")).findElements(By.cssSelector("div"));
				for (int y = 0; y < divE.size(); y++) {
					element[Integer.parseInt(divE.get(y).getText())] = divE.get(y);
				}
				element[i].click();
			}
		}
	}
}
