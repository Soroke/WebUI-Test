package webtest.core.page.houtai.left;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import webtest.core.page.houtai.LeftPage;

/**
 * 文章管理左侧列表页面
 * 
 * @author han
 * 
 */
public class WenZhangGuanLi extends LeftPage {

	// 文章管理
	@FindBy(linkText = "文章管理")
	public WebElement wzgl;

	// 文章分类
	@FindBy(linkText = "文章分类")
	public WebElement wzfl;

}
