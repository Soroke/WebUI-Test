package webtest.core.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import webtest.core.Page;
import webtest.core.TestCase.DriverManager;


/**
 * 例子页面1
 * 百度搜索页面
 *
 */
public class RequestPage extends Page {
	
	public static final String URL = "https://www.baidu.com/";
	
	@Override
	protected void init() {
		DriverManager.getDriver().get(URL);
		super.init();
	}

	/**
	 * 页面内元素定位及初始化方式改为用注解标注的方式
	 */
	//百度一下按钮
	@FindBy(id = "su")
	public WebElement button;
	
	//搜索输入框
	@FindBy(id = "kw")
	public WebElement input;
	
	
}
