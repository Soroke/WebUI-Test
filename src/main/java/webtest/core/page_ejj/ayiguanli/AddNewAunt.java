package webtest.core.page_ejj.ayiguanli;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import webtest.core.Page;

/**
 * Created by Administrator on 2016-05-27.
 * 录入新阿姨
 */
public class AddNewAunt extends Page{
    /**
     * pageText :当前页面的标题
     */
    @FindBy(xpath = "/html/body/div[2]/aside[2]/section[1]/h1")
    public WebElement pageText;

    /**
     * 所有的input
     */
    @FindBy(xpath = "//input[@class='form-control']")
    public WebElement inputs;



}
