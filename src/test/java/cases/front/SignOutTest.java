package cases.front;

import cases.WebTest;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import webtest.core.TestCase;
import webtest.core.page.qiantai.Account;
import webtest.core.page.qiantai.AlOuter;
import webtest.core.page.qiantai.BlOuter;


/**
 * Created by han on 2016/1/20.
 * 测试退出
 */
public class SignOutTest extends WebTest {


    /**
     *
     * @param user
     * @param pass
     */
    @Parameters({"front_user", "front_pass"})
    @BeforeMethod
    public void init(String user, String pass){
        //直接调用已有登录测试流程进行登录
        LoginTest lt = new LoginTest();
        lt.login("登录成功", user, pass);
    }

    /**
     * 退出
     */
    @Test
    public void signOut(){
        AlOuter ao = new AlOuter();
        Assert.assertEquals("退出", ao.signOut.getText());
        ao.signOut.click();
        BlOuter bo = new BlOuter();
        Assert.assertEquals("登录", bo.login_head.getText());
        Assert.assertEquals("注册账户", bo.register_head.getText());
    }
}
