package testcases;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.Config;

public class Testcase1 extends Config {

	@Test
	public void test() {
		driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_Login1_UserName\"]")).sendKeys("abcd");
	}
}
