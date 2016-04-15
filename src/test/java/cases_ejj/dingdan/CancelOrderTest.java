package cases_ejj.dingdan;

import cases_ejj.HomeLinkTest;
import cases_ejj.LoginTest;
import cases_ejj.WebTest;
import org.openqa.selenium.Alert;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.security.Credentials;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import webtest.core.page_ejj.dingdanguanli.LookAllOrderPage;
import webtest.core.util.Wait;

/**
 * Created by Administrator on 2016-04-14.
 */
public class CancelOrderTest extends WebTest{
    Wait w = new Wait();
    /**
     * 重写父类afterMethod方法，完成一个测试方法不关闭浏览器
     */
    @Override
    protected void testMethodEnd() {}

    /**
     * 执行完所有测试用例 关闭浏览器
     */
    @AfterClass
    public void after() {
        DriverManager.quitDriver();
    }

    /**
     * 前置条件，测试下单需要先登录 并进入下单页面
     * @param user 用户名
     * @param passwd 密码
     */
    @Parameters({"admin_user","admin_pass"})
    @BeforeMethod
    public void beforeMethod(String user,String passwd) {
        //调用已有测试方法进行测试
        LoginTest lt = new LoginTest();
        lt.login("登录成功", user, passwd);
        HomeLinkTest hlt = new HomeLinkTest();
        hlt.click_lookAllOrder();
    }

    /**
     * 取消订单测试流程
     * 默认选择取消原因为“客户原因”，具体原因为“用户不需要”
     * 备注默认为“自动化测试取消订单”
     */
    @Test
    public void cancelOrderTest() {
        LookAllOrderPage laop = new LookAllOrderPage();
        laop.cancelOrder.click();
        boolean b = true;
        while(b) {
            String s = laop.quxiaoform.getAttribute("style");
            if(s.equals("display: none;")) {

            } else {
                b = false;
                Reporter.log("取消订单form打开成功");
            }
        }
        /**
         * 选择取消原因为客户原因
         */
        laop.kehuyuanyin.click();
        Assert.assertEquals(true,laop.kehuyuanyin.isSelected());
        Reporter.log("选择取消原因为\"客户原因\"成功");
        /**
         * 选择具体原因为客户不需要
         */
        laop.kehubuxuyao.click();
        Assert.assertEquals(true,laop.kehubuxuyao.isSelected());
        Reporter.log("选择具体原因为\"客户不需要\"成功");
        /**
         * 输入备注信息
         * 点击提交按钮
         */
        laop.beizu.sendKeys("自动化测试取消订单");
        laop.querenanniu.click();

        /**
         * 等待alert出现
         * 获取取消订单成功alert ，并验证alert的提示信息是否为取消订单成功
         */
        for (int i = 0; i < 10 * 10; i++) {
            try {
                Thread.sleep(100);
                Alert alert = DriverManager.getDriver().switchTo().alert();
            } catch (NoAlertPresentException e) {
                return;
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        Alert alert = DriverManager.getDriver().switchTo().alert();
        Assert.assertEquals("取消订单成功！",alert.getText());
        alert.accept();
        Reporter.log("取消订单操作成功");
        //System.out.println(laop.firstOrderCode);

    }

}
