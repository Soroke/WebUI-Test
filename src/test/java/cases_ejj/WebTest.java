package cases_ejj;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import webtest.core.TestCase;

/**
 * Created by Administrator on 2016-04-11.
 */
public class WebTest extends TestCase {
    @Parameters({"index"})
    @BeforeMethod
    public void init(String url){
        TestCase.DriverManager.getDriver().manage().window().maximize();
        TestCase.DriverManager.getDriver().get(url);
    }
}
