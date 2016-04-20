package webtest.core.util;

import java.util.Date;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import webtest.core.TestCase.DriverManager;

public class Wait {
	
	/**
	 * 等待页面刷新完成
	 * 原理是在上一个页面识别的元素到了新页面会失效
	 * @param s 最大等待时长
	 * @param element 刷新前识别的元素
	 * @return 刷新消耗时间
	 */
	public int reFresh(int s, WebElement element) {
		for (int i = 0; i < s * 10; i++) {
			try {
				Thread.sleep(100);
				element.getText();
				break;
			} catch (InvalidSelectorException e) {
				return i;
			}catch (Exception e) {
				e.printStackTrace();
			}
		}
		return -1;
	}

	
	/**
	 * 
	 * 
	 * @param s 等待时长
	 * @param element 待识别元素特性
	 * @param Type 带识别元素特性，的识别方式。
	 * @return 等待消耗时常，单位ms
	 * 支持识别类型： id	name css text xpath  (可继续扩展)
	 * 例： element(10, "user", "id") 在10s内表示等待一个id为user的元素出现
	 */
	public int element(int s, String element, String Type) {
		long beginTime, endTime, sj = 0;
		beginTime = new Date().getTime();
		WebDriverWait wdw = new WebDriverWait(DriverManager.getDriver(), s);
		switch (Type) {
		case "id":
			wdw.until(ExpectedConditions.presenceOfElementLocated(By
					.id(element)));
			break;
		case "name":
			wdw.until(ExpectedConditions.presenceOfElementLocated(By
					.className(element)));
			break;
		case "css":
			wdw.until(ExpectedConditions.presenceOfElementLocated(By
					.cssSelector(element)));
			break;
		case "text":
			wdw.until(ExpectedConditions.presenceOfElementLocated(By
					.linkText(element)));
			break;
		case "xpath":
			wdw.until(ExpectedConditions.presenceOfElementLocated(By
					.xpath(element)));
			break;
		default:
			sj = 1;
			break;
		}
		if (sj == 1) {
			return -1;
		} else {
			endTime = new Date().getTime();
			sj = endTime - beginTime;
			int time = (int) sj;
			return time;
		}
	}

	/**
	 * 休眠时间
	 * @param s 单位 秒
	 */
	public void time(int s){
		try {
			Thread.sleep(s*1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
