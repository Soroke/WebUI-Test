package cases.front;

import cases.WebTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import webtest.core.TestCase;
import webtest.core.page.qiantai.Account;
import webtest.core.page.qiantai.Outer;
import webtest.core.util.Wait;

/**
 * Created by han on 2016/1/20.
 * 测试实名认证
 */
public class AuthenticationTest extends WebTest {

    /**
     *
     * @param jg
     * @param name
     * @param idCardNumber
     */
    @Test(dataProvider = "getData")
    public void authentication(String jg, String name, String idCardNumber, String user, String pass){
        WebDriver driver = DriverManager.getDriver();
        Wait wait = new Wait();
        LoginTest lt = new LoginTest();
        lt.login("登录成功", user, pass);
        Outer outer = new Outer();
        outer.account.click();
        Account acon = new Account();
        acon.title_zhgl.click();
//        wait.element(5, acon.safety_xpath, "xpath");
        driver.findElement(By.xpath(acon.safety_xpath)).click();
        String smrz_zt = driver.findElement(By.xpath(acon.smrz_icon_xpath)).getAttribute("class");
        //检查未实名认证的状态
        Assert.assertEquals("icon-tanhao", smrz_zt);
        driver.findElement(By.id(acon.rz_id)).click();
        driver.findElement(By.id(acon.realName_id)).sendKeys(name);
        driver.findElement(By.id(acon.idcardNum_id)).sendKeys(idCardNumber);
        driver.findElement(By.id(acon.realSubmitBtn2_id)).click();
        wait.element(5, acon.msgCenter_class, "name");
        String msg = driver.findElement(By.className(acon.msgCenter_class)).getText();
        System.out.println(msg);
        driver.findElement(By.xpath(acon.msgClose_xpath)).click();
        String smrz_zt2 = driver.findElement(By.xpath(acon.smrz_icon_xpath)).getAttribute("class");
        //检查已实名认证的状态
        Assert.assertEquals("icon-check", smrz_zt2);

    }

}
