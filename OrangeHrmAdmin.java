package com.mohs10.or;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class OrangeHrmAdmin 
{
	public static By username= By.xpath("//input[contains(@name,'username')]");
	public static By password= By.xpath("//input[contains(@name,'password')]");
	public static By login= By.xpath("//button[contains(@type,'submit')]");
	public static By admin= By.xpath("//span[contains(text(),'Admin')]");
	public static By checkbox= By.xpath("//i[contains(@class,'oxd-icon bi-dash oxd-checkbox-input-icon')]");
	public static By delete= By.xpath("(//button[contains(@type,'button')])[5]");
	@SuppressWarnings("unchecked")
	public static List<WebElement> list = (List<WebElement>) By.xpath("//div[contains(text(),'Enabled')]");
}
