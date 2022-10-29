package jenkinsseleniumproject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
public class AmazonPage {
	
	
public static void main () {
System.setProperty("webdriver.chrome.driver","H:\\Chromedriver\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("https://www.amazon.com/");


}
}