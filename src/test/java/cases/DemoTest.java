package cases;

import cases_ejj.HomeLinkTest;
import cases_ejj.LoginTest;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import webtest.core.TestCase;
import webtest.core.page.RequestPage;
import webtest.core.page.SponsePage;
import webtest.core.page_ejj.dingdanguanli.LookAllOrderPage;
import webtest.core.util.Wait;

/**
 * Created by han on 2016/3/21.
 */
public class DemoTest{

    @Test
    public void case1() {
        String s = "订单总额：50.00元";
        String s1[] = s.split("：");
        String s2[] = s1[1].split("\\.");
        for(int i =0 ; i<s2.length;i++) {
            System.out.println(s2[i]+"No." + (i+1));
        }

    }
}
