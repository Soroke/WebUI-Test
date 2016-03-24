package webtest.core.page;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import webtest.core.Page;
import webtest.core.TestCase.DriverManager;
import webtest.core.util.Wait;

/**
 * 例子页面2 百度搜索结果页面
 * 
 */
public class SponsePage extends Page {

	// 结果页面所有的标题链接
	@FindBy(className = "t")
	public List<WebElement> links;

	@FindBy(className = "to_tieba")
	public WebElement toTieBa;
	
	
	private Wait wait = new Wait();
	private String news_xpath = "//*[@id='s_tab']/a[1]";
	public String new_title_class = "c-title";
	
	@Override
	protected void init() {
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		super.init();
	}


	/**
	 * 结果页面切换到 新闻 
	 * @return 新闻页面的搜索结果
	 */
	public void chengeToNew() {
		DriverManager.getDriver().findElement(By.xpath(news_xpath)).click();
		links = DriverManager.getDriver().findElements(By.className(new_title_class));
	}

	/**
	 * 下一页 并重新装入链接
	 */
	public void next(){
		DriverManager.getDriver().findElement(By.linkText("下一页>")).click();
		wait.reFresh(5, links.get(0));
		reLoad();
	}
	
	/**
	 * 上一页 并重新装入链接
	 */
	public void back(){
		DriverManager.getDriver().findElement(By.linkText("<上一页")).click();
		wait.reFresh(5, links.get(0));
		reLoad();
	}
	
	/**
	 * 重新装入链接
	 */
	public void reLoad(){
		links = null;
		links = DriverManager.getDriver().findElements(By.className("t"));
	}
}
