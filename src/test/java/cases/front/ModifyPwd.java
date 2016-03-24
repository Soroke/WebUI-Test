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
import webtest.core.page.qiantai.AlOuter;
import webtest.core.page.qiantai.Outer;
import webtest.core.util.Wait;

/**
 * 修改密码
 * 只有成功数据
 * Created by han on 2016/1/22.
 */
public class ModifyPwd extends WebTest {

    String oldPass = null;
    String user = null;
    /**
     *
     * @param url
     */
    @Parameters({"index", "front_user", "front_pass"})
    @BeforeMethod
    public void init(String url, String user, String pass){
        oldPass = pass;
        this.user = user;
        //直接调用已有登录测试流程进行登录
        LoginTest lt = new LoginTest();
        lt.login("登录成功", user, pass);
    }

    /**
     *
     * @param jg
     * @param newPwd
     * @param reNewPwd
     */
    @Test(dataProvider = "getData")
    public void repwd(String jg, String newPwd, String reNewPwd){
        String reMsg = reLoginPwd(oldPass, newPwd, reNewPwd);
        Assert.assertEquals(reMsg, jg);
        //退出
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Outer outer = new Outer();
        outer.account.click();
        AlOuter ao = new AlOuter();
        System.out.println(ao.signOut.getText());
//        DriverManager.getDriver().findElement(By.xpath("/html/body/div[3]/div[1]/div/ul[2]/li/a")).click();
        ao.signOut.click();
        //登录
        LoginTest lt = new LoginTest();
        lt.login("登录成功", user, newPwd);
        reMsg = reLoginPwd(newPwd, oldPass, oldPass);
        Assert.assertEquals(reMsg, jg);
        //退出
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        AlOuter ao2 = new AlOuter();
        ao2.signOut.click();
        //登录
        lt = new LoginTest();
        lt.login("登录成功", user, oldPass);
    }

    /**
     * 修改密码流程
     * @param oldPass
     * @param newPwd
     * @param reNewPwd
     * @return 结果
     */
    public String reLoginPwd(String oldPass, String newPwd, String reNewPwd){
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
