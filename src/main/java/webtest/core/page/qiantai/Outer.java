package webtest.core.page.qiantai;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import webtest.core.Page;
import webtest.core.TestCase;

public class Outer extends Page {

	//首页 链接
	@FindBy(linkText = "首页")
	public WebElement home;
	//我要投资 链接
	@FindBy(linkText = "我要投资")
	public WebElement invest;
	//我的账户 链接
	@FindBy(linkText = "我的账户")
	public WebElement account ;
	//债券转让 链接
	@FindBy(linkText = "债券转让")
	public WebElement bond;
	//集团介绍 链接
	@FindBy(linkText = "集团介绍")
	public WebElement group;
	//论坛 链接
	@FindBy(linkText = "论坛")
	public WebElement forum;
	
	//资讯服务
	@FindBy(linkText = "资讯服务")
	public WebElement zxfw;
	//安全中心
	@FindBy(linkText = "安全中心")
	public WebElement aqzx;
	//新手上路
	@FindBy(linkText = "新手上路")
	public WebElement xssl;
	//关于我们
	@FindBy(linkText = "关于我们")
	public WebElement gywm;
	
}
