package webtest.core.page.houtai.center.caiwuguanli;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import webtest.core.TestCase;
import webtest.core.page.houtai.CenterPage;

/**
 * Created by han on 2016/1/24.
 */
public class ChongZhiJiLuXianShang extends CenterPage {

    String listFrame_id = "listForm";

    //待审核
    @FindBy(xpath = "//*[@id=\"newtab-div\"]/li[1]/a")
    public WebElement title_dsh;
    //充值成功
    @FindBy(xpath = "//*[@id=\"newtab-div\"]/li[2]/a")
    public WebElement title_czcg;
    //充值失败
    @FindBy(xpath = "//*[@id=\"newtab-div\"]/li[3]/a")
    public WebElement title_czsb;
    //充值中
    @FindBy(xpath = "//*[@id=\"newtab-div\"]/li[4]/a")
    public WebElement title_czz;
    //异常状态
    @FindBy(xpath = "//*[@id=\"newtab-div\"]/li[5]/a")
    public WebElement title_yczt;

    //（检索条件）
    //用户名输入框
    public String userName_id = "userName";
    //查询按钮
    public String select_button_xpath = "//*[@id=\"listForm\"]/div[1]/input[5]";


    //结果列表
    public String jgList_xpath = "//*[@id=\"listDiv\"]/table/tbody";

    /**
     * 取充值金额
     * @param line 行数
     * @return
     */
    public String getCzje(int line){
        return TestCase.DriverManager.getDriver().findElement(
                By.xpath("//*[@id=\"listDiv\"]/table/tbody/tr[" + (line+1) + "]/td[7]/font")).getText();
    }

    /**
     * 取订单号
     * @param line 行数
     * @return
     */
    public String getDdh(int line){
        WebElement element  = TestCase.DriverManager.getDriver().findElement(
                By.xpath("//*[@id=\"listDiv\"]/table/tbody/tr[" + (line + 1) + "]/td[2]"));
        return element.getText();
    }
    /**
     * 审核
     * @param line 行数
     */
    public void shenHe_ChaKan(int line){
        TestCase.DriverManager.getDriver().findElement(
                By.xpath("//*[@id=\"listDiv\"]/table/tbody/tr[" + (line+1) + "]/td[15]/a")).click();
    }

//    public void toListFrame(){
////        TestCase.DriverManager.getDriver().switchTo().defaultContent();
//        WebElement leftFrame = TestCase.DriverManager.getDriver().findElement(By.id(listFrame_id));
//        TestCase.DriverManager.getDriver().switchTo().frame(leftFrame);
//    }

}
