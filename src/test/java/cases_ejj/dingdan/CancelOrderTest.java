package cases_ejj.dingdan;

import cases_ejj.HomeLinkTest;
import cases_ejj.LoginTest;
import cases_ejj.WebTest;
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

    @Test
    public void case1() {
        LookAllOrderPage laop = new LookAllOrderPage();
        String s1[] = laop.case1.getText().split("        ");
        String orderCode[] = s1[0].split("：");
        System.out.println(orderCode[1]);

    }

}
