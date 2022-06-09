package com.apllicationTest;

import org.testng.annotations.Test;

import com.SpurQlabs.SparQlab;
import com.SpurQlabs.WebDriverClass;

public class Applicatin_test extends WebDriverClass {


	@Test
	public void AddtionTest () throws InterruptedException {
		SparQlab pages  = SparQlab.getSparQlab();
		//LaunchBrowser();
		pages.addition ();Thread.sleep(2000);
		//closeBrowser();
		Thread.sleep(2000);

	}

	@Test
	public void substractionTest () throws InterruptedException {
		SparQlab pages  = SparQlab.getSparQlab();
		//LaunchBrowser();
		pages.substraction();
		Thread.sleep(2000);
	}
@Test
	public void	divisionTest() throws InterruptedException {
		SparQlab pages  = SparQlab.getSparQlab();
		pages.division();
		Thread.sleep(2000);
	}
@Test
	public void	multiplicationTest() throws InterruptedException {
		SparQlab pages  = SparQlab.getSparQlab();
		pages.multiplication();
		Thread.sleep(2000);
	}
}

