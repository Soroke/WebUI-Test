package webtest.core.page.houtai.left;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import webtest.core.page.houtai.LeftPage;

/**
 * 业务设置左侧列表页面
 * 
 * @author han
 * 
 */
public class YeWuSheZhi extends LeftPage {

	// 借款基础设置
	@FindBy(linkText = "借款基础设置")
	public WebElement jkjc;

	// 业务收费设置
	@FindBy(linkText = "业务收费设置")
	public WebElement ywsf;

	// 借款利率限制
	@FindBy(linkText = "借款利率限制")
	public WebElement jkll;

	// 奖励设置
	@FindBy(linkText = "奖励设置")
	public WebElement jl;

	// 逾期设置
	@FindBy(linkText = "逾期设置")
	public WebElement yq;

	// 借款分类设置
	@FindBy(linkText = "借款分类设置")
	public WebElement jkfl;

	// 借款标类型设置
	@FindBy(linkText = "借款标类型设置")
	public WebElement jkblx;

	// 还款方式设置
	@FindBy(linkText = "还款方式设置")
	public WebElement hkfs;

	// 扣款方式设置
	@FindBy(linkText = "扣款方式设置")
	public WebElement kkfs;

	// 借款周期设置
	@FindBy(linkText = "借款周期设置")
	public WebElement jkzq;

	// 奖励类型设置
	@FindBy(linkText = "奖励类型设置")
	public WebElement jllx;

	// 奖励支付时间设置
	@FindBy(linkText = "奖励支付时间设置")
	public WebElement jlzfsj;

	// 信用级别设置
	@FindBy(linkText = "信用级别设置")
	public WebElement xyjbsz;

	// 支付方式设置
	@FindBy(linkText = "支付方式设置")
	public WebElement zffs;

	// 可提现银行信息设置
	@FindBy(linkText = "可提现银行信息设置")
	public WebElement txyh;

	// 线下银行帐号充值设置
	@FindBy(linkText = "线下银行帐号充值设置")
	public WebElement xxcz;

	// 保理机构信息设置
	@FindBy(linkText = "保理机构信息设置")
	public WebElement bljg;

	// 用户详细信息设置
	@FindBy(linkText = "用户详细信息设置")
	public WebElement yhxx;

	// 企业用户详细信息设置
	@FindBy(linkText = "企业用户详细信息设置")
	public WebElement qyyh;

	// 信用级别属性
	@FindBy(linkText = "信用级别属性")
	public WebElement xyjbsx;

	// 项目属性设置
	@FindBy(linkText = "项目属性设置")
	public WebElement xmsx;

	// 基本属性设置
	@FindBy(linkText = "基本属性设置")
	public WebElement jbsx;

	// 借款协议内容设置
	@FindBy(linkText = "借款协议内容设置")
	public WebElement jkxynr;

	// 借款协议图片设置
	@FindBy(linkText = "借款协议图片设置")
	public WebElement jkxytp;

	// 字典设置
	@FindBy(linkText = "字典设置")
	public WebElement zd;

}
