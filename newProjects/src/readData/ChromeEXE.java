package readData;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeEXE 
{
	public static void main(String[] args) {
		ChromeEXE ob = new ChromeEXE();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		//driver.get("Amazon.in");
	}
}
