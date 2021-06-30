package steps;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class TestBase {

	protected static WebDriver driver = null;

	
	public static WebDriver getDriver() {
		setDriver();
		return driver;
	}
	
	private static void setDriver() {
		System.setProperty("webdriver.chrome.driver", "C:/codebase/drivers/chromedriver.exe");
		ChromeOptions chromeOptions = new ChromeOptions();
		driver = new ChromeDriver(chromeOptions);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(1600, TimeUnit.SECONDS);
	}

	public static void tearDown() {
		System.out.println("tearDown: User closes browser");
		driver.close();
		driver.quit();
		driver = null;
	}
}
