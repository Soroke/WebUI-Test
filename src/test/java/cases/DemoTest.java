package cases;

import org.testng.annotations.Test;
import webtest.core.TestCase;
import webtest.core.page.RequestPage;
import webtest.core.page.SponsePage;

/**
 * Created by han on 2016/3/21.
 */
public class DemoTest extends TestCase{

    @Test
    public void baiDuYiXia(){
        RequestPage baidu = new RequestPage();
        baidu.input.sendKeys("百度一下你就知道");
        baidu.button.click();
        //SponsePage qurey = new SponsePage();
    }

}
