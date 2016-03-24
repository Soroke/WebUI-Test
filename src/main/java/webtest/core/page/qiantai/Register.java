package webtest.core.page.qiantai;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * 前台注册页面
 */
public class Register extends Outer {
	//用户名
	@FindBy(id = "userName")
	public WebElement userName;
	//密码
	@FindBy(id = "user_pwd")
	public WebElement pwd;
	//重复密码
	@FindBy(id = "re_user_pwd")
	public WebElement rePwd;
	//手机
	@FindBy(id = "mobile")
	public WebElement mobile;
	//手机验证码
	@FindBy(id = "code")
	public WebElement code;
	//获取验证码
	@FindBy(id = "getPhoneCodemsg")
	public WebElement getPhoneCodemsg;
	//推荐人
	@FindBy(id = "unionCode")
	public WebElement unionCode;
	//注册协议复选框
	@FindBy(className = "xy_check")
	public WebElement xy_check;
	//注册按钮
	@FindBy(className = "a_but")
	public WebElement submit;

	//注册成功后页面上的注册成功文本
	public String cgText_class = "sc_p";


}
