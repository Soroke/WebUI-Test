package webtest.core.page.houtai.left;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import webtest.core.page.houtai.LeftPage;

/**
 * 借款管理左侧列表页面
 * 
 * @author han
 * 
 */
public class JieKuanGuanLi extends LeftPage {

	// 添加借款
	@FindBy(linkText = "添加借款")
	public WebElement addjk;

	// 借款标修改
	@FindBy(linkText = "借款标修改")
	public WebElement jkbxg;

	// 借款人列表
	@FindBy(linkText = "借款人列表")
	public WebElement jkrlb;

	// 提交借款
	@FindBy(linkText = "提交借款")
	public WebElement upjk;

	// 发标审核
	@FindBy(linkText = "发标审核")
	public WebElement fbsh;

	// 结束投标
	@FindBy(linkText = "结束投标")
	public WebElement jstb;

	// 满标审核
	@FindBy(linkText = "满标审核")
	public WebElement mbsh;

	// 满标审核未通过
	@FindBy(linkText = "满标审核未通过")
	public WebElement mbshwtg;

	// 发标审核
	@FindBy(linkText = "发标审核")
	public WebElement fbsh2;

	// 招标中借款
	@FindBy(linkText = "招标中借款")
	public WebElement zbzjk;

	// 满标借款
	@FindBy(linkText = "满标借款")
	public WebElement mbjk;

	// 还款中借款
	@FindBy(linkText = "还款中借款")
	public WebElement hkzjk;

	// 已还借款
	@FindBy(linkText = "已还借款")
	public WebElement yhjk;

	// 流标借款
	@FindBy(linkText = "流标借款")
	public WebElement lbjk;

	// 逾期借款
	@FindBy(linkText = "逾期借款")
	public WebElement yqjk;

	// 撤销借款
	@FindBy(linkText = "撤销借款")
	public WebElement cxjk;

	// 所有借款
	@FindBy(linkText = "所有借款")
	public WebElement syjk;

	// 借款申请列表
	@FindBy(linkText = "借款申请列表")
	public WebElement jksqlb;

}
