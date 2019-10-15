import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.*;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.*;

public class AutoTest {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\driver\\chromedriver.exe");
//		System.setProperty("webdriver.firefox.marionette","C:\\Program Files (x86)\\Mozilla Firefox\\geckodriver.exe");
		WebDriver driver = new ChromeDriver();
        driver.get("https://www.baidu.com/");
        driver.findElement(By.id("kw")).sendKeys("selenium java");
        driver.findElement(By.id("su")).click();
        driver.quit();
//        System.out.println("een");

//		WebDriver driver1 = new ChromeDriver();    //Chrome浏览器
		 
//		WebDriver driver2 = new FirefoxDriver();   //Firefox浏览器
		 
//		WebDriver driver3 = new EdgeDriver();      //Edge浏览器
		 
//		WebDriver driver4 = new InternetExplorerDriver();  // Internet Explorer浏览器
		 
		 
//		WebDriver driver6 = new PhantomJSDriver();   //PhantomJS

	}

}
   
