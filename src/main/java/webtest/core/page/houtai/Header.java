package webtest.core.page.houtai;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import webtest.core.Page;
import webtest.core.TestCase.DriverManager;

/**
 * 头部页面模块
 * 他本身也可以看做是一个页面
 * 注意不要滥用继承
 * @author han
 *
 */
public class Header extends Page {
	
	//frame的id  此常量必须为 static，需要在构造方法执行之前初始化
	protected static final String frame_id = "header-frame";
	
	/**
	 * 重写父类init方法，在父类的init结束后进入头部的frame
	 */
	@Override
	protected void init() {
		super.init();
		WebElement leftFrame = DriverManager.getDriver().findElement(By.id(frame_id));
		DriverManager.getDriver().switchTo().frame(leftFrame);
	}
	
	/**
	 * 页面内元素定位及初始化方式改为用注解标注的方式
	 */
	//系统设置
	@FindBy(id = "navtab-1")
	public WebElement xtsz;
	
	//业务设置
	@FindBy(id = "navtab-6")
	public WebElement ywsz;
	
	//高级设置
	@FindBy(id = "navtab-9")
	public WebElement gjsz;
	
	//会员管理
	@FindBy(id = "navtab-2")
	public WebElement hygl;
	
	//借款设置
	@FindBy(id = "navtab-3")
	public WebElement jkgl;
	
	//还款管理
	@FindBy(id = "navtab-8")
	public WebElement hkgl;
	
	//投资管理
	@FindBy(id = "navtab-10")
	public WebElement tzgl;
	
	//财务管理
	@FindBy(id = "navtab-4")
	public WebElement cwgl;
	
	//文章管理
	@FindBy(id = "navtab-5")
	public WebElement wzgl;
	
	//统计报表
	@FindBy(id = "navtab-7")
	public WebElement tjbb;

	//退出
	@FindBy(className = "menu_btn2")
	public WebElement signOut;
	
}
