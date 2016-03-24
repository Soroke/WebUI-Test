package cases.front;

import cases.WebTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import webtest.core.TestCase;
import webtest.core.page.qiantai.Account;
import webtest.core.page.qiantai.Outer;
import webtest.core.util.Wait;

/**
 *
 * 修改支付密码--验证码去不掉 先不做
 * Created by han on 2016/1/22.
 */
public class RePayPwdTest extends WebTest {



    public String rePayPwd(String oldPass, String newPwd, String reNewPwd){
        WebDriver driver = DriverManager.getDriver();
        Outer outer = new Outer();
        outer.account.click();
        Account acon = new Account();
        acon.title_zhgl.click();
        driver.findElement(By.xpath(acon.safety_xpath)).click();

        driver.findElement(By.id(acon.reLoginPwd_id)).click();
        driver.findElement(By.id(acon.oldLoginPwd_id)).sendKeys(oldPass);
        driver.findElement(By.id(acon.newLoginPwd_id)).sendKeys(newPwd);
        driver.findElement(By.id(acon.new2LoginPwd_id)).sendKeys(reNewPwd);
        driver.findElement(By.id(acon.submit_reLoginPwd_id)).click();

        Wait wait = new Wait();
        wait.element(5, "aui_content", "name");
        String msg = driver.findElement(By.className(acon.msgCenter_class)).getText();
        driver.findElement(By.xpath(acon.msgClose_xpath)).click();
        msg = msg.substring(0, msg.indexOf("！")+1);
        return msg;
    }

}
