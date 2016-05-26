package cases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import webtest.core.util.getDate;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Date;
import java.util.List;

public class test {
	@Test
	public  void te() {
		NumberFormat f=new DecimalFormat("00000");
		System.out.println(f.format(1));
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
