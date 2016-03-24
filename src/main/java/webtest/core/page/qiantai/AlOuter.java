package webtest.core.page.qiantai;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by han on 2016/1/20.
 * 登录后的外框页面
 */
public class AlOuter extends Outer {
    //顶部用户名
    @FindBy(className = "color_blue")
    public WebElement user_name_head;
    //顶部退出按钮
    @FindBy(className = "ar")
    public WebElement signOut;


}
