package cases.front;


import cases.WebTest;
import cases.admin.AdminLoginTest;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import webtest.core.page.houtai.Header;
import webtest.core.page.houtai.center.bianji.ChongZhiXiangQing;
import webtest.core.page.houtai.center.caiwuguanli.ChongZhiJiLuXianShang;
import webtest.core.page.houtai.left.CaiWuGuanLi;
import webtest.core.page.qiantai.Account;
import webtest.core.page.qiantai.Outer;
import webtest.core.util.PageTool;
import webtest.core.util.Wait;

/**
 * Created by han on 2016/1/24.
 */
public class RechargeTest extends WebTest {

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
        userName = user;
    }

    private String userName = null;
    private Double oldKyye = null;
    private int CZJE = 0;

    /**
     *  前台充值
     * @param czje
     */
    @Test(dataProvider = "getData")
    public void recharge(String jg, String czje){
        Wait wait = new Wait();
        CZJE = Integer.parseInt(czje);
        WebDriver driver = DriverManager.getDriver();
        Outer outer = new Outer();
        outer.account.click();
        Account acon = new Account();
        String tmp = acon.home_kyye.getText();
        tmp = tmp.substring(1, tmp.length());
        oldKyye = Double.parseDouble(tmp);
        acon.chongZhi.click();
        driver.findElement(By.id(acon.czje_input_id)).sendKeys(CZJE+"");
        driver.findElement(By.xpath(acon.qrcz_button_xpath)).click();
        wait.time(1);
        Alert qr = driver.switchTo().alert();
        String alert_text = qr.getText();
        qr.accept();
        wait.time(1);
        Assert.assertEquals("确认要提交线上充值吗？", alert_text);
        PageTool pt = new PageTool();
        String handel = pt.changeHandel();
        Assert.assertEquals("https://pay.ecpss.com/sslpayment", driver.getCurrentUrl());
        driver.close();
        pt.changeHandel(handel);
    }

    //后台审核
    @Parameters({"guanli_cbt", "admin_user", "admin_pass"})
    @Test(dependsOnMethods = {"recharge"})
    public void shenHe(String url, String user, String pass){
        Wait wait = new Wait();
        WebDriver driver = DriverManager.getDriver();
        AdminLoginTest alt = new AdminLoginTest();
        alt.login(url, user, pass);
        Header head = new Header();
        head.cwgl.click();
        CaiWuGuanLi cwgl = new CaiWuGuanLi();
        cwgl.czjl_xs.click();
        ChongZhiJiLuXianShang czjl_xs = new ChongZhiJiLuXianShang();
        WebElement select_buttom = driver.findElement(By.xpath(czjl_xs.select_button_xpath));
        //进入充值中列表
        czjl_xs.title_czz.click();
        wait.reFresh(3, select_buttom);
        driver.findElement(By.id(czjl_xs.userName_id)).sendKeys(userName);
        select_buttom = driver.findElement(By.xpath(czjl_xs.select_button_xpath));
        select_buttom.click();//查询
        wait.reFresh(3, select_buttom);
        String w_czje = czjl_xs.getCzje(1);//取到列表里的充值金额
        czjl_xs.shenHe_ChaKan(1);//审核第一行
        ChongZhiXiangQing czxq = new ChongZhiXiangQing();
        String n_czje = czxq.czze.getText();
        Assert.assertEquals(w_czje, n_czje);//比较外面和里面的充值金额是否一致

        Assert.assertEquals(true, czxq.fail.isSelected());
        Assert.assertEquals(false, czxq.success.isSelected());
        czxq.success.click();//选中审核成功
        Assert.assertEquals(false, czxq.fail.isSelected());
        Assert.assertEquals(true, czxq.success.isSelected());
        //输入审核说明
        czxq.shsm.sendKeys("自动化测试-----cases.front.RechargeTest:shenHe 审核自动写入内容");
        czxq.submit.click();

        wait.time(1);
        Alert qrsh = driver.switchTo().alert();
        String qr_text = qrsh.getText();
        qrsh.accept();
        Assert.assertEquals("确定要提交审核吗？", qr_text);
    }

    /**
     *审核成功后去前台验证充值金额是否正确
     */
    @Test(dependsOnMethods={"shenHe"})
    public void yanZheng(){
        Double kyye = null;
        Outer outer = new Outer();
        outer.account.click();
        Account acon = new Account();
        String tmp = acon.home_kyye.getText();
        tmp = tmp.substring(1, tmp.length());
        kyye = Double.parseDouble(tmp);
        Assert.assertEquals(CZJE+oldKyye, kyye);//验证充值后金额比充值前增加了相应数量
    }

}
