package cases_ejj;

import junit.framework.Assert;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import webtest.core.page_ejj.HomePage;
import webtest.core.page_ejj.caiwuguanli.RefundAuditPage;
import webtest.core.page_ejj.dingdanguanli.CreateOrderPage;
import webtest.core.page_ejj.dingdanguanli.LookAllOrderPage;
import webtest.core.page_ejj.jiazhenggongshiguanli.AddNewHomemaking;
import webtest.core.page_ejj.jiazhenggongshiguanli.LookAllHomemaking;
import webtest.core.util.Wait;

/**
 * 测试首页所有链接有效性
 * @author Administrator
 * 封装成一个一个 的方法以供复用
 */
public class HomeLinkTest extends WebTest{
    //重写父类afterMethod方法，完成一个测试方法不关闭浏览器,当所有test都完成后再关闭浏览器
    @Override
    protected void testMethodEnd() {}

    @AfterClass
    public void after() {
        DriverManager.quitDriver();
    }

    Wait w = new Wait();

    @Parameters({"admin_user","admin_pass"})
    @Test(priority = 0)
    public void login(String user,String pass) {
        //调用已有测试方法进行测试
        LoginTest lt = new LoginTest();
        lt.login("登录成功", user, pass);
    }


    /**
     * 点击访问查看所有家政公司
     */
    @Test(priority = 1)
    public void click_LookAllHoemmaking() {
        HomePage hp = new HomePage();
        this.underElementClick(hp.lookAll_jiazhenggongshi);
        LookAllHomemaking ahp = new LookAllHomemaking();
        w.reFresh(1, ahp.pageText);
        Assert.assertEquals("所有家政公司", ahp.pageText.getText());
        Reporter.log("点击访问查看所有家政公司页面测试通过");
    }

    /**
     * 点击访问添加新家政
     */
    @Test(priority = 2)
    public void click_addNewHoemmaking() {
        HomePage hp = new HomePage();
        this.underElementClick(hp.addNew_jiazheng);
        AddNewHomemaking anhm = new AddNewHomemaking();
        w.reFresh(1, anhm.pageText);
        Assert.assertEquals("添加新家政", anhm.pageText.getText());
        Reporter.log("点击访问添加新家政页面测试通过");
    }

    /**
     * 点击访问查看所有订单
     */
    @Test(priority = 2)
    public void click_lookAllOrder() {
        HomePage hp = new HomePage();
        this.underElementClick(hp.lookAllOrder);
        LookAllOrderPage laop = new LookAllOrderPage();
        w.reFresh(1, laop.orderList);
        Assert.assertEquals("订单管理", laop.pageText.getText());
        Reporter.log("点击访问查看所有订单页面测试通过");
    }

    /**
     * 点击访问人工下单
     */
    @Test(priority = 3)
    public void click_humanMakeOrder() {
        HomePage hp = new HomePage();
        this.underElementClick(hp.humenMakeOrder);
        CreateOrderPage ho = new CreateOrderPage();
        w.reFresh(1, ho.pageText);
        Assert.assertEquals("人工下单", ho.pageText.getText());
        Reporter.log("点击访问人工下单页面测试通过");
    }

    /**
     * 点击访问退款审核页面
     */
    @Test(priority = 3)
    public void click_tuikuanshenhe() {
        HomePage hp = new HomePage();
        this.underElementClick(hp.tuikuanshenhe);
        RefundAuditPage rap = new RefundAuditPage();
        w.reFresh(1, rap.pageText);
        Assert.assertEquals("退单审核", rap.pageText.getText());
        Reporter.log("点击访问退单审核页面测试通过");
    }

}
