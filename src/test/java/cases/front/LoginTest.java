package cases.front;

import cases.WebTest;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import webtest.core.TestCase;
import webtest.core.page.qiantai.*;

/**
 * Created by han on 2016/1/20.
 * 测试用户登录
 */
public class LoginTest extends WebTest {

    /**
     *
     * @param user
     * @param pass
     */
    @Test(dataProvider = "getData")
    public void login(String jg, String user, String pass){
        BlOuter bo = new BlOuter();
        bo.login_head.click();
        Login dl = new Login();
        dl.dl(user, pass);

        if(jg.equals(1) || jg.equals("登录成功")){
            jg = "登录成功";
            AlOuter ao = new AlOuter();
            Assert.assertEquals(user, ao.user_name_head.getText());
        }else
        if(jg.equals(0) || jg.equals("登录失败")){
            BlOuter bl = new BlOuter();
            Assert.assertEquals("登录", bl.login_head.getText());
        }else {
            log.error("预期结果无法识别---" + jg);
            Assert.assertEquals("1", "0");
        }

    }

}
