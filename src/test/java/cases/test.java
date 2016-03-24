package cases;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import webtest.core.TestCase;

public class test {
	
	public static void main(String[] args){

		WebDriver driver = TestCase.DriverManager.getDriver();

		driver.get("http://www.baidu.com");
		driver.findElement(By.id("kw")).click();
		final String s = "123";
		System.err.println("123");
//		System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
//		WebDriver driver = new ChromeDriver();
//		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
//		driver.get("http://192.168.0.21/lists.html");
//		WebElement li = driver.findElement(By.className("b_c_c"));
//		List<WebElement> a = li.findElements(By.tagName("li"));
//		System.out.println(a.get(5).getText());
//		driver.quit();
	}
	//
	private void qq(){
		System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		driver.get("http://192.168.0.21/admin/guanli_cbt");
	    driver.findElement(By.id("userName")).sendKeys("admin");
	    driver.findElement(By.xpath("//*[@id='theForm']/table/tbody/tr[2]/td[2]/input")).sendKeys("123456");
	    driver.findElement(By.xpath("//*[@id='theForm']/table/tbody/tr[5]/td/input[1]")).click();
	    driver.switchTo().defaultContent();
	    WebElement element = driver.findElement(By.id("header-frame"));
	    driver.switchTo().frame(element);
	}
	
}
