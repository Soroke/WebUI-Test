package webtest.core.page_ejj.dingdanguanli;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import webtest.core.Page;
import webtest.core.TestCase;

public class CreateOrderPage extends Page{
    //页面标题
    @FindBy(xpath = "/html/body/div[2]/aside[2]/section[1]/h1")
    public WebElement pageText;

    //手机号输入框
    @FindBy(id = "order-order_customer_phone")
    public WebElement phoneNumber;

    //用户的第一个地址
    @FindBy(xpath="//*[@id='order-address_id']/div[1]")
    public WebElement addressOne;

    //新增地址按钮
    @FindBy(id="add_address_btn")
    public WebElement addAddress_button_id;


    //家庭保洁选择
    @FindBy(xpath="//*[@id='order-order_service_item_id']/label[1]")
    WebElement bjrw_click_xpath;

    //要指定阿姨姓名、手机号搜索
    @FindBy(id="worker_name_search")
    WebElement ayiname_text_id;

    //服务信息DIV
    @FindBy(xpath="//*[@id='order_create_form']/div/div[4]")
    WebElement serverMessage_div_xpath;

    //搜索出来阿姨信息的div_ID
    @FindBy(id="order-order_booked_worker_id")
    WebElement zhidingayi_div_id;

    //所有ClassName="radio-inline"的元素
    @FindBy(className="radio-inline")
    List<WebElement> inline_All;

    //日期
    @FindBy(id="order-orderbookeddate")
    WebElement rili_input_id;

    //服务时长ID
    @FindBy(id = "order-order_booked_count")
    private WebElement serviceTime_div_ID;

    //服务时间段ID
    String fwsj_div_id = "order-orderbookedtimerange";

    //第一个时间段
    String fristTime_xpath = "//*[@id='order-orderbookedtimerange']/label[1]/input";

    //客户备注
    @FindBy(id="order-order_customer_memo")
    private WebElement khbz;

    //客服备注
    @FindBy(id="order-order_cs_memo")
    private WebElement kfbz;

    /**
     * 获取用户的下单地址集合
     * 返回数据为下单地址WebElement集合
     */
    public List<WebElement> getOrderAddress() {
        return this.getAllElement_ClassName("order-address_id", "div","radio");
    }

    /**
     * 查看当前手机号下有多少个下单地址
     */
    public int count_address() {
        int i = this.getOrderAddress().size();
        if(i==1) {
            try{
                TestCase.DriverManager.getDriver().findElement(By.xpath("//*[@id='order-address_id']/div[" + i + "]/div[1]/select"));
                return 0;
            }catch(Exception e) {
                return 1;
            }

        }
        return i;
    }

    /**
     *
     */

}
