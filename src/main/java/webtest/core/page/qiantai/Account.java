package webtest.core.page.qiantai;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by han on 2016/1/20.
 */
public class Account extends Outer {

    //用户名
    @FindBy(xpath = "/html/body/div[5]/div/div[1]/div[1]/div[1]/div[2]/p/span[1]")
    public WebElement userName;

    //账户主页
    @FindBy(linkText = "账户主页")
    public WebElement title_zhzy;
    //资产管理
    @FindBy(linkText = "资产管理")
    public WebElement title_zcgl;
    //投资管理
    @FindBy(linkText = "投资管理")
    public WebElement title_tzgl;
    //奖励管理
    @FindBy(linkText = "奖励管理")
    public WebElement title_jlgl;
    //消息管理
    @FindBy(linkText = "消息管理")
    public WebElement title_xxgl;
    //账户管理
    @FindBy(xpath = "//*[@id=\"user-account-nav-list\"]/li[6]/div/span")
    public WebElement title_zhgl;
    //可用余额
    @FindBy(xpath = "/html/body/div[5]/div/div[2]/div[1]/div/dl[1]/dd/span/strong")
    public WebElement home_kyye;
    //充值按钮
    @FindBy(xpath = "/html/body/div[5]/div/div[2]/div[1]/div/dl[1]/dd/a[1]")
    public WebElement chongZhi;


    //我要充值
    public String chongZhi_xpath = "//*[@id=\"user-account-nav-list\"]/li[2]/ul/li[1]/a";
    //充值金额输入框
    public String czje_input_id = "paymentamounts";
    //确认重置按钮
    public String qrcz_button_xpath = "/html/body/div[4]/div[1]/div[2]/div/div[4]/div[2]/input";




    //安全设置
    public String safety_xpath = "//*[@id=\"user-account-nav-list\"]/li[6]/ul/li[3]/a";
    //实名认证状态的icon
    public String smrz_icon_xpath = "//*[@id=\"saftyPageList\"]/li[2]/div/span[1]/i";
    //实名认证按钮
    public String rz_id = "realnameBtn1";
    //实名认证姓名输入框
    public String realName_id = "realName";
    //身份证号
    public String idcardNum_id = "idcardNum";
    //提交实名认证
    public String realSubmitBtn2_id = "realSubmitBtn2";

    //修改登录密码
    public String reLoginPwd_id = "pwdBtn1";
    //原登录密码
    public String oldLoginPwd_id = "old_pwd";
    //新登录密码
    public String newLoginPwd_id = "new_pwd";
    //再次输入新登录密码
    public String new2LoginPwd_id = "new_pwd_more";
    //修改登录密码-提交
    public String submit_reLoginPwd_id = "pwdSubmit";

    //修改支付密码
    public String rePayPwd_id = "payPwdBtn2";
    //原支付密码
    public String oldPayPwd_id = "oldPayPwd";
    //新支付密码
    public String newPayPwd_id = "newPayPwd";
    //再次输入新支付密码
    public String new2PayPwd_id = "confirmNewPwd";
    //修改支付密码-提交
    public String submit_rePayPwd_id = "ppSubmit2";

    //通知消息
    public String msgCenter_class = "aui_content";
    //消息关闭按钮
    public String msgClose_xpath = "/html/body/div[2]/div/table/tbody/tr[2]/td[2]/div/table/tbody/tr[1]/td/div/a";




}
