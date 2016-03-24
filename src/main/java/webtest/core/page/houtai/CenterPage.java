package webtest.core.page.houtai;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import webtest.core.Page;
import webtest.core.TestCase.DriverManager;

/**
 * 中部frame页面都继承自此类
 * @author han
 *
 */
public class CenterPage extends Page {

	//frame的id  此常量必须为 static，需要在构造方法执行之前初始化
	protected static final String frame_id = "main-frame";
	
	/**
	 * 重写父类init方法，在父类的init结束后进入中部的frame
	 */
	@Override
	protected void init() {
		super.init();
		WebElement mainFrame = DriverManager.getDriver().findElement(By.id(frame_id));
		DriverManager.getDriver().switchTo().frame(mainFrame);
	}
	
}
