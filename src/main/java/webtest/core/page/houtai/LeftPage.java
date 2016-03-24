package webtest.core.page.houtai;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import webtest.core.Page;
import webtest.core.TestCase.DriverManager;

/**
 * 左侧frame页面都继承自此类
 * @author han
 *
 */
public class LeftPage extends Page {

	//frame的id  此常量必须为 static，需要在构造方法执行之前初始化
	protected static final String frame_id = "menu-frame";
	
	/**
	 * 重写父类init方法，在父类的init结束后进入左侧的frame
	 */
	@Override
	protected void init() {
		super.init();
		WebElement leftFrame = DriverManager.getDriver().findElement(By.id(frame_id));
		DriverManager.getDriver().switchTo().frame(leftFrame);
	}

}
