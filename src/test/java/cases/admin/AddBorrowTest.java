package cases.admin;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import webtest.core.TestCase;
import webtest.core.page.houtai.Header;
import webtest.core.page.houtai.left.JieKuanGuanLi;

/**
 * Created by han on 2016/1/25.
 */
public class AddBorrowTest extends TestCase {

    @BeforeMethod
    @Parameters({"guanli_cbt", "admin_user", "admin_pass"})
    public void login(String url, String user, String pass){
        AdminLoginTest alt = new AdminLoginTest();
        alt.login(url, user, pass);
    }


    @Test
    public void addBorrow(){
        Header head = new Header();
        head.jkgl.click();
        JieKuanGuanLi jkgl = new JieKuanGuanLi();
        jkgl.addjk.click();


    }

}
