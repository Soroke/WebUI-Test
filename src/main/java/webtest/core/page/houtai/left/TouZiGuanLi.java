package webtest.core.page.houtai.left;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import webtest.core.page.houtai.LeftPage;

/**
 * 投资管理左侧列表页面
 * 
 * @author han
 * 
 */
public class TouZiGuanLi extends LeftPage {

	// 投资列表
	@FindBy(linkText = "投资列表")
	public WebElement tzlb;

	// 投资人信息列表
	@FindBy(linkText = "投资人信息列表")
	public WebElement tzrxx;

	// 投资日志列表
	@FindBy(linkText = "投资日志列表")
	public WebElement tzrz;
}
