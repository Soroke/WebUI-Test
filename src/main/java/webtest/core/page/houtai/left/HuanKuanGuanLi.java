package webtest.core.page.houtai.left;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import webtest.core.page.houtai.LeftPage;

/**
 * 还款管理左侧列表页面
 * 
 * @author han
 * 
 */
public class HuanKuanGuanLi extends LeftPage {

	// 代户列表
	@FindBy(linkText = "代户列表")
	public WebElement dhlb;

	// 流转标还款
	@FindBy(linkText = "流转标还款")
	public WebElement lzbhk;

	// 用户手动还款
	@FindBy(linkText = "用户手动还款")
	public WebElement yhsdhk;

	// 代户手动还款
	@FindBy(linkText = "代户手动还款")
	public WebElement dhsdhk;

	// 所有还款
	@FindBy(linkText = "所有还款")
	public WebElement syhk;

}
