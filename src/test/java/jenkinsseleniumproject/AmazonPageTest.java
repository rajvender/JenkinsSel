package jenkinsseleniumproject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
public class AmazonPageTest {
	
@Test
public void loginTest(){
	System.setProperty("webdriver.chrome.driver","H:\\Chromedriver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.amazon.com/");
	driver.close();
	
}

	
/*public static void main (String args[]) {

}*/
}