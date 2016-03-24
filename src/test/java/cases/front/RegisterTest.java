package cases.front;

import cases.WebTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import webtest.core.TestCase;
import webtest.core.page.qiantai.BlOuter;
import webtest.core.page.qiantai.Index;
import webtest.core.page.qiantai.Register;


/**
 * 测试用户注册
 */
public class RegisterTest extends WebTest {

	/**
	 *注册流程
	 * @param yqjg
	 * @param user
	 * @param pass
	 * @param rePass
	 * @param mobile
	 * @param phoneCodemsg
	 */
	@Test(dataProvider = "getData")
	public void register(String yqjg, String user, String pass, String rePass, String mobile, String phoneCodemsg){
		WebDriver driver = DriverManager.getDriver();
		driver.manage().window().maximize();
		//首页
		Index index = new Index();
		BlOuter bo = new BlOuter();
		bo.register_head.click();
		//注册页面
		Register regist = new Register();
		regist.userName.sendKeys(user);
		regist.pwd.sendKeys(pass);
		regist.rePwd.sendKeys(rePass);
		regist.mobile.sendKeys(mobile);
		regist.code.sendKeys(phoneCodemsg);
		regist.submit.click();
		String sjjg = driver.findElement(By.className(regist.cgText_class)).getText();
		Assert.assertEquals(yqjg, sjjg);
	}

}
