package webtest.core.page.houtai.center.bianji;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import webtest.core.TestCase;
import webtest.core.page.houtai.CenterPage;

/**
 * 充值详情/审核页面
 * Created by han on 2016/1/24.
 */
public class ChongZhiXiangQing extends CenterPage {

    String myFrame = "detailForm";

//    @Override
//    protected void init() {
//        TestCase.DriverManager.getDriver().switchTo().defaultContent();
//        WebElement mainFrame = TestCase.DriverManager.getDriver().findElement(By.id(frame_id));
//        TestCase.DriverManager.getDriver().switchTo().frame(mainFrame);
//    }

    //充值总额
    @FindBy(xpath = "//*[@id=\"general-table\"]/tbody/tr[6]/td[2]")
    public WebElement czze;

    //审核-充值成功
    @FindBy(id = "success")
    public WebElement success;

    //审核-充值失败
    @FindBy(id = "fail")
    public WebElement fail;

    //审核说明
    @FindBy(id = "verifyRemark")
    public WebElement shsm;

    //提交审核
    @FindBy(xpath = "//*[@id=\"general-table\"]/tbody/tr[18]/td[2]/input[1]")
    public WebElement submit;

}
