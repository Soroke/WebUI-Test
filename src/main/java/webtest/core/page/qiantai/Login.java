package webtest.core.page.qiantai;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by han on 2016/1/20.
 */
public class Login extends Outer {

    //用户名
    @FindBy(id = "username")
    public WebElement userName;

    //密码
    @FindBy(id = "password")
    public WebElement passWord;

    //登录按钮
    @FindBy(className = "a_but")
    public WebElement login;

    //忘记密码
    @FindBy(className = "xy_a")
    public WebElement forGerPwd;

    public void dl(String user, String pass){
        userName.sendKeys(user);
        passWord.sendKeys(pass);
        login.click();
    }
}
