package webtest.core.page.qiantai;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * 我要投资页面
 * @author han
 *
 */
public class Invest extends Outer {
	
	//借款标列表
	@FindBy(className="b_c_c")
	public WebElement borrowList;
	
	//借款时间 5个区间范围
	@FindBy(linkText = "//*[@id=\"listForm\"]/div[1]/ul/li[2]/a[1]")
	public WebElement month_all;
	@FindBy(linkText = "//*[@id=\"listForm\"]/div[1]/ul/li[2]/a[2]")
	public WebElement month_1;
	@FindBy(linkText = "//*[@id=\"listForm\"]/div[1]/ul/li[2]/a[3]")
	public WebElement month1_3;
	@FindBy(linkText = "//*[@id=\"listForm\"]/div[1]/ul/li[2]/a[4]")
	public WebElement month3_6;
	@FindBy(linkText = "//*[@id=\"listForm\"]/div[1]/ul/li[2]/a[5]")
	public WebElement month6_;
	
	//借款利率5个区间范围
	@FindBy(linkText = "//*[@id=\"listForm\"]/div[1]/ul/li[3]/a[1]")
	public WebElement rate_all;
	@FindBy(linkText = "//*[@id=\"listForm\"]/div[1]/ul/li[3]/a[2]")
	public WebElement rate_8;
	@FindBy(linkText = "//*[@id=\"listForm\"]/div[1]/ul/li[3]/a[3]")
	public WebElement rate8_10;
	@FindBy(linkText = "//*[@id=\"listForm\"]/div[1]/ul/li[3]/a[4]")
	public WebElement rate10_13;
	@FindBy(linkText = "//*[@id=\"listForm\"]/div[1]/ul/li[3]/a[5]")
	public WebElement rate13_;
	
	//还款方式4种
	@FindBy(linkText = "//*[@id=\"listForm\"]/div[1]/ul/li[4]/a[1]")
	public WebElement repayment_all;
	@FindBy(linkText = "//*[@id=\"listForm\"]/div[1]/ul/li[4]/a[2]")
	public WebElement dqhbfx;
	@FindBy(linkText = "//*[@id=\"listForm\"]/div[1]/ul/li[4]/a[3]")
	public WebElement ayfxdqhb;
	@FindBy(linkText = "//*[@id=\"listForm\"]/div[1]/ul/li[4]/a[4]")
	public WebElement arfxdqhb;
	
	//借款类型4种
	@FindBy(linkText = "//*[@id=\"listForm\"]/div[1]/ul/li[5]/a[1]")
	public WebElement loanType_all;
	@FindBy(linkText = "//*[@id=\"listForm\"]/div[1]/ul/li[5]/a[2]")
	public WebElement xyb;
	@FindBy(linkText = "//*[@id=\"listForm\"]/div[1]/ul/li[5]/a[3]")
	public WebElement dbb;
	@FindBy(linkText = "//*[@id=\"listForm\"]/div[1]/ul/li[5]/a[4]")
	public WebElement dyb;
	
	/**
	 * 可以取到页面上的任意一个借款标
	 * @param line 借款标所在行数
	 * @return 位处于第line行的借款标
	 */
	public WebElement getBorrow(int line){
		return borrowList.findElement(By.xpath("li["+line+"]"));
	}
	
	/**
	 * 根据指定的borrow定位这个borrow的标题
	 * @param borrow 借款标对象
	 * @return borrow 的标题
	 */
	public WebElement getBorrowTitle(WebElement borrow){
		return borrow.findElement(By.className("ar"));
	}
	/**
	 * 根据指定的borrow定位这个borrow的发售金额
	 * @param borrow 借款标对象
	 * @return borrow 的发售金额
	 */
	public WebElement getBorrowMoney(WebElement borrow){
		return borrow.findElement(By.className("p2"));
	}
	/**
	 * 根据指定的borrow定位这个borrow的年化收益
	 * @param borrow 借款标对象
	 * @return borrow 的年化收益
	 */
	public WebElement getBorrowProfit(WebElement borrow){
		return borrow.findElement(By.className("p3"));
	}
	/**
	 * 根据指定的borrow定位这个borrow的期限
	 * @param borrow 借款标对象
	 * @return borrow 的期限
	 */
	public WebElement getBorrowTerm(WebElement borrow){
		return borrow.findElement(By.className("p4"));
	}
	/**
	 * 根据指定的borrow定位这个borrow的进度
	 * @param borrow 借款标对象
	 * @return borrow 的进度
	 */
	public WebElement getBorrowProgress(WebElement borrow){
		return borrow.findElement(By.className("p5"));
	}
	/**
	 * 根据指定的borrow定位这个borrow的按钮
	 * @param borrow 借款标对象
	 * @return borrow 的按钮
	 */
	public WebElement getBorrowButton(WebElement borrow){
		return borrow.findElement(By.className("p6"));
	}
	
}
