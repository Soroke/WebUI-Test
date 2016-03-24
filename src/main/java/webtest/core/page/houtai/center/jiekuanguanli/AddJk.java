package webtest.core.page.houtai.center.jiekuanguanli;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import webtest.core.page.houtai.CenterPage;

/**
 * Created by han on 2016/1/25.
 */
public class AddJk extends CenterPage {

    //基本信息
    @FindBy(id = "general-tab")
    public WebElement jbxx;
    //基本属性
    @FindBy(id = "guarantyBasic-tab")
    public WebElement jbsx;
    //保障措施
    @FindBy(id = "guarantee-tab")
    public WebElement bzcs;
    //项目属性
    @FindBy(id = "guaranty-tab")
    public WebElement xmsx;
    //信用信息
    @FindBy(id = "credit-tab")
    public WebElement xyxx;
    //审批流程
    @FindBy(id = "verify-tab")
    public WebElement splx;
    //补充信息
    @FindBy(id = "detail-tab")
    public WebElement bcxx;
    //借款图片
    @FindBy(id = "image-tab")
    public WebElement jxtp;
    //保存
    @FindBy(id = "btnsave")
    public WebElement submit;


    public class jbxxPage{

        //借款标题
        @FindBy(id = "borrow_caption")
        public WebElement borrowTitle;
        //借款人
        @FindBy(id = "searchUserName")
        public WebElement searchUserName;
        //借款人搜索按钮
        @FindBy(xpath = "//*[@id=\"general-table\"]/tbody/tr[3]/td[2]/input[2]")
        public WebElement selectButton;
        //选择用户下拉框
        @FindBy(id = "borrowUserId")
        public WebElement selectUser;
        //借款标分类
        @FindBy(id = "borrow_classId")
        public WebElement borrowClass;
        //借款标类型
        @FindBy(id = "borrow_cateId")
        public WebElement borrowType;
        //还款方式
        @FindBy(id = "borrow_paytypeId")
        public WebElement borrowPayType;
        //借款金额
        @FindBy(id = "borrow_amount")
        public WebElement borrowAmount;
        //年利率
        @FindBy(id = "borrow_apr")
        public WebElement borrowApr;
        //借款周期
        @FindBy(id = "borrow_duration")
        public WebElement borrowDuration;
        //借款周期时间单位
        @FindBy(id = "borrow_termId")
        public WebElement borrowTerm;
        //最低投资额
        @FindBy(id = "borrow_investMin")
        public WebElement borrowInvestMin;
        //最高投资额
        @FindBy(xpath = "//*[@id=\"general-table\"]/tbody/tr[19]/td[2]/input")
        public WebElement borrowInvestMax;

    }

}
