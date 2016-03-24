package webtest.core.page.houtai.left;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import webtest.core.page.houtai.LeftPage;

/**
 * 会员管理左侧列表页面
 * 
 * @author han
 * 
 */
public class HuiYuanGuanLi extends LeftPage {

	// 会员信息
	@FindBy(linkText = "会员信息")
	public WebElement hyxx;

	// 用户信息修改
	@FindBy(linkText = "用户信息修改")
	public WebElement yhxxxg;

	// 会员信息导出
	@FindBy(linkText = "会员信息导出")
	public WebElement hyxxdc;

	// 会员一键认证
	@FindBy(linkText = "会员一键认证")
	public WebElement hyyjrz;

	// 会员服务列表
	@FindBy(linkText = "会员服务列表")
	public WebElement hyfwlb;

	// 客服会员投资统计
	@FindBy(linkText = "客服会员投资统计")
	public WebElement kfhytztj;

	// 实名认证
	@FindBy(linkText = "实名认证")
	public WebElement smrz;

	// VIP认证
	@FindBy(linkText = "VIP认证")
	public WebElement viprz;

	// 会员积分设置
	@FindBy(linkText = "会员积分设置")
	public WebElement hyjfsz;

	// 会员积分统计
	@FindBy(linkText = "会员积分统计")
	public WebElement hyjftj;

	// id5设置
	@FindBy(linkText = "id5设置")
	public WebElement id5sz;

	// id5认证
	@FindBy(linkText = "id5认证")
	public WebElement id5rz;

}
