package webtest.core.page.houtai;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import webtest.core.Page;
import webtest.core.TestCase.DriverManager;

/**
 * 后台登录页面
 * @author han
 *
 */
public class GuanLi_Cbt extends Page {
	
	//账号
	@FindBy(id = "userName")
	public WebElement user;
	
	//密码
	@FindBy(xpath = "//*[@id='theForm']/table/tbody/tr[2]/td[2]/input")
	public WebElement pass;

	//登录按钮
	@FindBy(xpath = "//*[@id='theForm']/table/tbody/tr[5]/td/input[1]")
	public WebElement login;
	
}
