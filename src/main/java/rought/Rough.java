package rought;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Rough {
	static WebDriver driver;
	//static Rough rough = new Rough();

	public static void main(String[] args) {
		System.out.println(System.getProperty("user.dir") + "\\src\\main\\java\\config\\config.properties");
		setUp();
	}

	public static void setUp() {
		System.setProperty("webdriver.chrome.driver", "E:\\browserdriver\\chrome76\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");

		WebElement month = driver.findElement(By.id("month"));

		dropdownvalues(month, "Jan");
		WebElement day = driver.findElement(By.id("day"));
		dropdownvalues(day, "28");

	}

	public static void dropdownvalues(WebElement ele, String value) {

		Select select = new Select(ele);
		select.selectByVisibleText(value);
	}

}
