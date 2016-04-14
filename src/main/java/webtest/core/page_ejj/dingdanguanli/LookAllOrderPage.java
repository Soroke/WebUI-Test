package webtest.core.page_ejj.dingdanguanli;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import webtest.core.Page;

/**
 * Created by Administrator on 2016-04-14.
 */
public class LookAllOrderPage extends Page {
    /**
     *  页面标题
     */
    @FindBy(id = "w1")
    public WebElement orderList;
    @FindBy(xpath = "/html/body/div[2]/aside[2]/section[1]/h1")
    public WebElement pageText;

    @FindBy(xpath = "//*[@id=\"w1\"]/div[2]/div/table/tbody/tr[1]/th")
    public WebElement case1;

    /**
     * 搜索模块
     * search_userPhoneNumber用户手机号输入框
     * search_ayiPhoneNumber阿姨手机号输入框
     * search_orderCode订单号输入框
     * searchButton搜索按钮
     */
    @FindBy(id = "ordersearchindex-order_customer_phone")
    public WebElement search_userPhoneNumber;

    @FindBy(id = "ordersearchindex-order_worker_phone")
    public WebElement search_ayiPhoneNumber;

    @FindBy(id = "ordersearchindex-order_code")
    public WebElement search_orderCode;

    @FindBy(className = "btn btn-primary button-search")
    public WebElement searchButton;


}
