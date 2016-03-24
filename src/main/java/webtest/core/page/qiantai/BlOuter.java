package webtest.core.page.qiantai;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by han on 2016/1/20.
 * 登录前的外框页面
 */
public class BlOuter extends Outer {
    //顶部登录链接
    @FindBy(xpath = "/html/body/div[2]/div[1]/div/ul[2]/li/a[2]")
    public WebElement login_head;
    //顶部注册链接
    @FindBy(xpath = "/html/body/div[2]/div[1]/div/ul[2]/li/a[1]")
    public WebElement register_head;
}
