package webtest.core.page.houtai.left;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import webtest.core.page.houtai.LeftPage;

/**
 * 财务管理左侧列表页面
 * 
 * @author han
 * 
 */
public class CaiWuGuanLi extends LeftPage {

	// 客户账户信息
	@FindBy(linkText = "客户账户信息")
	public WebElement khzhxx;

	// 账户操作日志
	@FindBy(linkText = "账户操作日志")
	public WebElement zhczrz;

	// 客户帐户信息修改
	@FindBy(linkText = "客户帐户信息修改")
	public WebElement khzhxxxg;

	// 手动充值
	@FindBy(linkText = "手动充值")
	public WebElement sdcz;

	// 充值记录-手动
	@FindBy(linkText = "充值记录-手动")
	public WebElement czjl_sd;

	// 充值记录-线上
	@FindBy(linkText = "充值记录-线上")
	public WebElement czjl_xs;

	// 充值记录-线下
	@FindBy(linkText = "充值记录-线下")
	public WebElement czjl_xx;

	// 自动对账
	@FindBy(linkText = "自动对账")
	public WebElement zddz;

	// 提现审核
	@FindBy(linkText = "提现审核")
	public WebElement txsh;

	// 提现复审
	@FindBy(linkText = "提现复审")
	public WebElement txfs;

	// 转账打款
	@FindBy(linkText = "转账打款")
	public WebElement zzdk;

	// 提现异常
	@FindBy(linkText = "提现异常")
	public WebElement txyc;

	// 充值提示设置
	@FindBy(linkText = "充值提示设置")
	public WebElement cztssz;

	// 提现提示设置
	@FindBy(linkText = "提现提示设置")
	public WebElement txtssz;

}
