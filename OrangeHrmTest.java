package com.mohs10.scripts;

import org.testng.annotations.Test;

import com.mohs10.or.OrangeHrmAdmin;
import com.mohs10.reuse.OrangeHrmFun;

public class OrangeHrmTest 
{
	@Test
	public void OrangeHrmTestCase() throws Exception
	{
		OrangeHrmFun of= new OrangeHrmFun();
		of.alogin("Admin", "admin123");
		Thread.sleep(6000);
		of.homepage();
		Thread.sleep(7000);
		int i=OrangeHrmAdmin.list.size();
		if(i==0)
		{
			System.out.println("deleted");
		}
		else 
		{
			System.out.println("unable to delete");
		}
	}
}
