package webtest.core.page.houtai.left;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import webtest.core.page.houtai.LeftPage;

/**
 * 统计报表左侧列表页面
 * @author han
 *
 */
public class TongJiBaoBiao extends LeftPage {
	
	//用户统计
	@FindBy(linkText = "用户统计")
	public WebElement yh;
	
	//充值统计
	@FindBy(linkText = "充值统计")
	public WebElement cz;
	
	//提现统计
	@FindBy(linkText = "提现统计")
	public WebElement tx;
	
	//项目融资统计
	@FindBy(linkText = "项目融资统计")
	public WebElement xmrz;
	
	//项目融资统表（时间段）
	@FindBy(linkText = "项目融资统表（时间段）")
	public WebElement xmrztb;
	
	//充值类型统计
	@FindBy(linkText = "充值类型统计")
	public WebElement czlx;
	
	//提现类型统计
	@FindBy(linkText = "提现类型统计")
	public WebElement txlx;
	
	//项目融资类型统计
	@FindBy(linkText = "项目融资类型统计")
	public WebElement xmrzlx;
	
	//用户投资查询
	@FindBy(linkText = "用户投资查询")
	public WebElement yhtzcx;
	
	//用户投资统计
	@FindBy(linkText = "用户投资统计")
	public WebElement yhtztj;
	
	//借款统计
	@FindBy(linkText = "借款统计")
	public WebElement jktj;
	
	//投资统计
	@FindBy(linkText = "投资统计")
	public WebElement tztj;
	
	//系统支出统计
	@FindBy(linkText = "系统支出统计")
	public WebElement zctj;
	
	//系统收入统计
	@FindBy(linkText = "系统收入统计")
	public WebElement srtj;
	
	//发标统计
	@FindBy(linkText = "发标统计")
	public WebElement fbtj;	
	
}
