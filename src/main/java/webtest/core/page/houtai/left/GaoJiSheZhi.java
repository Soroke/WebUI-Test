package webtest.core.page.houtai.left;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import webtest.core.page.houtai.LeftPage;

/**
 * 高级设置左侧列表页面
 * 
 * @author han
 * 
 */
public class GaoJiSheZhi extends LeftPage {

	// 自动投标设置
	@FindBy(linkText = "自动投标设置")
	public WebElement zdtbsz;

	// 自动投标用户
	@FindBy(linkText = "自动投标用户")
	public WebElement zdtbyh;

	// 续投奖励设置
	@FindBy(linkText = "续投奖励设置")
	public WebElement xtjlsz;

	// 续投奖励列表
	@FindBy(linkText = "续投奖励列表")
	public WebElement xtjllb;

	// 债权转让设置
	@FindBy(linkText = "债权转让设置")
	public WebElement zqzrsz;

	// 债权转让统计
	@FindBy(linkText = "债权转让统计")
	public WebElement zqzrtj;

	// 待转让
	@FindBy(linkText = "待转让")
	public WebElement dzr;

	// 已转让
	@FindBy(linkText = "已转让")
	public WebElement yzr;

	// 加息劵制作
	@FindBy(linkText = "加息劵制作")
	public WebElement jzqzz;

	// 加息劵制作管理
	@FindBy(linkText = "加息劵制作管理")
	public WebElement jxqzzgl;

	// 加息劵设置
	@FindBy(linkText = "加息劵设置")
	public WebElement jxqsz;

	// 加息劵管理
	@FindBy(linkText = "加息劵管理")
	public WebElement jxqgl;

	// 现金券设置
	@FindBy(linkText = "现金券设置")
	public WebElement xjqsz;

	// 活动管理
	@FindBy(linkText = "活动管理")
	public WebElement hdgl;

	// 现金券制作
	@FindBy(linkText = "现金券制作")
	public WebElement xjqzz;

	// 现金券制作管理
	@FindBy(linkText = "现金券制作管理")
	public WebElement xjqzzgl;

	// 现金券使用列表
	@FindBy(linkText = "现金券使用列表")
	public WebElement xjqsylb;

	// 现金券列表
	@FindBy(linkText = "现金券列表")
	public WebElement xjqlb;

	// 现金券统计
	@FindBy(linkText = "现金券统计")
	public WebElement xjqtj;

	// 联盟推广设置
	@FindBy(linkText = "联盟推广设置")
	public WebElement tglmsz;

	// 推广人设置
	@FindBy(linkText = "推广人设置")
	public WebElement tgrsz;

	// 推广人注册统计
	@FindBy(linkText = "推广人注册统计")
	public WebElement tgrzctj;

	// 推广人投资统计
	@FindBy(linkText = "推广人投资统计")
	public WebElement tgrtztj;

	// 添加推广人关系
	@FindBy(linkText = "添加推广人关系")
	public WebElement tjtggx;

}
