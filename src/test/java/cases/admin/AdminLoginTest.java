package cases.admin;

import junit.framework.Assert;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import webtest.core.TestCase;
import webtest.core.page.houtai.GuanLi_Cbt;
import webtest.core.page.houtai.Header;

/**
 * 后台管理员登录
 * @author han
 *
 */
public class AdminLoginTest extends TestCase {
	
	/**
	 * 测试后台管理员登录
	 * @param url
	 * @param user
	 * @param pass
	 */
	@Parameters({"guanli_cbt", "admin_user", "admin_pass"})
	@Test
	public void login(String url, String user, String pass){
		DriverManager.getDriver().get(url);
		GuanLi_Cbt admin = new GuanLi_Cbt();
		admin.user.sendKeys(user);
		admin.pass.sendKeys(pass);
		admin.login.click();
		Header head = new Header();
		Assert.assertEquals("系统设置", head.xtsz.getText());
	}
	
	@Parameters({"guanli_cbt", "admin_user", "admin_pass"})
	@Test
	public void singOut(String url, String user, String pass){
		DriverManager.getDriver().get(url);
		GuanLi_Cbt admin = new GuanLi_Cbt();
		admin.user.sendKeys(user);
		admin.pass.sendKeys(pass);
		admin.login.click();
		Header head = new Header();
		Assert.assertEquals("系统设置", head.xtsz.getText());
		head.signOut.click();
		admin = new GuanLi_Cbt();
		Assert.assertEquals("系统管理登录", DriverManager.getDriver().getTitle());
	}
}
