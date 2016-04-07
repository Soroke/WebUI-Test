package webtest.core.page_ejj;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import webtest.core.Page;

public class HomePage extends Page{
    //用户名
    @FindBy(xpath = "/html/body/div[2]/aside[1]/div/section/div[1]/div[2]/p[1]")
    public WebElement userName;

    /*
     * E家洁图标按钮
     * 功能点击返回首页
     */
    @FindBy(xpath = "/html/body/header/a")
    public WebElement backHome;

    //查看所有家政公司
    @FindBy(xpath = "/html/body/div[2]/aside[1]/div/section/ul/li[1]/ul/li[1]/a")
    public WebElement lookAll_jiazhenggongshi;

    //添加新家政
    @FindBy(xpath = "/html/body/div[2]/aside[1]/div/section/ul/li[1]/ul/li[2]/a")
    public WebElement addNew_jiazheng;

    //人工下单
    @FindBy(xpath = "/html/body/div[2]/aside[1]/div/section/ul/li[5]/ul/li[2]/a")
    public WebElement humenMakeOrder;
}
