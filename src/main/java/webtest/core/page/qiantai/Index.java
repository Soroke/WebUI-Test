package webtest.core.page.qiantai;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import webtest.core.TestCase.DriverManager;

/**
 * 首页
 */
public class Index extends Outer {

	//查看更多-标
	@FindBy(xpath = "/html/body/div[3]/div[4]/div/a")
	public WebElement seeMore;
	//更多公告
	@FindBy(xpath = "/html/body/div[3]/div[8]/div[1]/p/a")
	public WebElement moreNotice;
	//首页轮播banner
	@FindBy(id = "ran_ggBox")
	public WebElement banner;

}
