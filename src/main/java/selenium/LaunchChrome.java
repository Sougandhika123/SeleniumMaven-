package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchChrome {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "\\Users\\SNMT720\\Downloads\\selenium webdriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.google.com");
		System.out.println(driver.getTitle());

	}

}
