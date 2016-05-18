package cases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import webtest.core.util.getDate;

import java.util.Date;
import java.util.List;

public class test {
	@Test
	public  void te() {
		int date[] = getDate.getTureDate();
		String s = getDate.getDateSceond();
		Date d = new Date();

		date[2] = date[2]-1;
		System.err.println(date[0] + "-" +date[1] + "-" +date[2] +" " + s);
		System.err.println(d.getTime());
		String date1 = new java.text.SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(d.getTime());
		System.err.println(date1);

		System.setProperty("webdriver.chrome.driver", "C:/Program Files (x86)/Google/Chrome/Application/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.baidu.com");
		List<WebElement> elemetns = driver.findElements(By.xpath("//a[@class = 'mnav']"));
		this.selectElement(elemetns,"糯米").click();
	}

	/**
	 *
	 * @param elements 元素List集合
	 * @param text  检索内容
	 * @return
	 */
	public WebElement selectElement(List<WebElement> elements,String text) {
		for(WebElement element:elements) {
			if(element.getText().equals(text)) {
				return element;
			}
		}
		return null;
	}

	/**
	 *
	 * @param elements 元素List集合
	 * @param attribute web标签名
	 * @param text  检索内容
	 * @return
	 */
	public WebElement selectElementAttribute(List<WebElement> elements,String attribute,String text) {
		for(WebElement element:elements) {
			if(element.getAttribute(attribute).equals(text)) {
				return element;
			}
		}
		return null;
	}
}
