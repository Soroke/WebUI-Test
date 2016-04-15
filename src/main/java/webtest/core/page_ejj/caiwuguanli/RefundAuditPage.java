package webtest.core.page_ejj.caiwuguanli;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import webtest.core.Page;

/**
 * Created by Administrator on 2016-04-15.
 * 退款审核页面
 */
public class RefundAuditPage extends Page{
    /**
     * 页面标题
     */
    @FindBy(xpath = "/html/body/div[2]/aside[2]/section[1]/h1")
    public WebElement pageText;

    /**
     * 查询模块
     * orderCodeInput:订单号查询输入框
     */
    @FindBy(id = "financerefundsearch-finance_refund_pay_flow_num")
    public WebElement orderCodeInput;
    @FindBy(id = "search")
    public WebElement searchButton;

}
