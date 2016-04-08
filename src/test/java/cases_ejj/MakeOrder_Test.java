package cases_ejj;

import org.junit.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import webtest.core.TestCase;
import webtest.core.page_ejj.HomePage;
import webtest.core.page_ejj.LoginPage;
import webtest.core.page_ejj.dingdanguanli.CreateOrderPage;

/**
 * Created by Administrator on 2016-04-08.
 */
public class MakeOrder_Test extends TestCase{
    @Parameters({"admin_user","admin_pass"})
    @BeforeMethod
    public void test(String user,String passwd) {
        LoginPage lp = new LoginPage();
        lp.login(user, passwd);
        HomePage hp = new HomePage();
        this.underElementClick(hp.humenMakeOrder);
        CreateOrderPage co = new CreateOrderPage();
        Assert.assertEquals(co.pageText.getText(),"人工下单");
    }

    @Parameters({"admin_user","admin_pass"})
    @Test
    public void makeOrder(String phoneNumber) {
        CreateOrderPage co = new CreateOrderPage();
        co.phoneNumber.sendKeys(phoneNumber);
        co.count_address()
    }

}
