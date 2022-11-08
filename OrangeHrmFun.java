package com.mohs10.reuse;

import org.openqa.selenium.WebDriver;

import com.mohs10.ActionDriver.Action;
import com.mohs10.base.StartBrowser;
import com.mohs10.or.OrangeHrmAdmin;

public class OrangeHrmFun 
{
	public WebDriver driver;
	public Action adriver;
	
	public OrangeHrmFun()
	{
		adriver = new Action();
		driver = StartBrowser.driver;
	}
	public void alogin(String username, String password) throws Exception
	{
		StartBrowser.childTest = StartBrowser.parentTest.createNode("Login in to OrangeHrm");
		adriver.navigateToApplication("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		adriver.type(OrangeHrmAdmin.username, username, "username text box");
		adriver.type(OrangeHrmAdmin.password, password, "passowrd text field");
		adriver.click(OrangeHrmAdmin.login, "login button");
		//adriver = new Action();
	}
	public void homepage() throws Exception
	{
		//StartBrowser.childTest = StartBrowser.parentTest.createNode("Homepage of OrangeHrm");
		adriver.click(OrangeHrmAdmin.admin, "admin button");
		adriver.click(OrangeHrmAdmin.checkbox, "all checkox");
		adriver.click(OrangeHrmAdmin.delete, "delete button");
	}
}
