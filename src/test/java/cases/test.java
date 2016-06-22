package cases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import webtest.core.util.getDate;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class test {
	@Test
	public  void te() {

		List a = new ArrayList();
		a.add("soroke");
		a.add("song");
		a.add("ren");
		a.add("kun");
		System.out.println(a.size());


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
