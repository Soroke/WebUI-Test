package webtest.core.page.houtai.left;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import webtest.core.page.houtai.LeftPage;

/**
 * 系统设置左侧列表页面
 * 
 * @author han
 * 
 */
public class XiTongSheZhi extends LeftPage {

	// 站点信息
	@FindBy(linkText = "站点信息")
	public WebElement zdxx;

	// 系统参数
	@FindBy(linkText = "系统参数")
	public WebElement xtcs;

	// 系统头部导航
	@FindBy(linkText = "系统头部导航")
	public WebElement tbdh;

	// 系统底部导航
	@FindBy(linkText = "系统底部导航")
	public WebElement dbdh;

	// 友情链接
	@FindBy(linkText = "友情链接")
	public WebElement yqlj;

	// 媒体报道
	@FindBy(linkText = "媒体报道")
	public WebElement mtbd;

	// 投票设置
	@FindBy(linkText = "投票设置")
	public WebElement tpsz;

	// 评论设置
	@FindBy(linkText = "评论设置")
	public WebElement plsz;

	// 咨询管理
	@FindBy(linkText = "咨询管理")
	public WebElement zxgl;

	// 评论管理
	@FindBy(linkText = "评论管理")
	public WebElement plgl;

	// 管理员设置
	@FindBy(linkText = "管理员设置")
	public WebElement glysz;

	// 用户分组
	@FindBy(linkText = "用户分组")
	public WebElement yhfz;

	// 管理员用户修改
	@FindBy(linkText = "管理员用户修改")
	public WebElement glyxg;

	// 部门管理
	@FindBy(linkText = "部门管理")
	public WebElement bmgl;

	// 用户级别
	@FindBy(linkText = "用户级别")
	public WebElement yhjb;

	// 邮件服务器设置
	@FindBy(linkText = "邮件服务器设置")
	public WebElement mailService;

	// 短信服务设置
	@FindBy(linkText = "短信服务设置")
	public WebElement dxfw;

	// 广告位管理
	@FindBy(linkText = "广告位管理")
	public WebElement ggwgl;

	// 广告管理
	@FindBy(linkText = "广告管理")
	public WebElement gggl;

}
