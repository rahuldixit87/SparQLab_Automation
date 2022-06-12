package com.SpurQlabs;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;


public class SparQlab  {
	
	public WebDriver driver = WebDriverClass.getDriver ();
	// finding the elements  	

 // find requred Webelements 
	
 @FindBy (xpath="//span[text()='AC']")
private   WebElement Allclear ;  

  @FindBy (xpath="//div[@id='sciOutPut']")
 private   WebElement ansewr ;  
  
@FindBy (xpath="//div[@id='sciInPut']")
 private   WebElement textbarinput ;  


public void addition () {
               
          try {
        	  Thread .sleep(3000);
        	 
		  Actions action = new Actions(driver); 
		  action.sendKeys(Keys.SUBTRACT).build().perform();
		  action.sendKeys(Keys.NUMPAD2).build().perform();
		  action.sendKeys(Keys.NUMPAD3).build().perform();
		  action.sendKeys(Keys.NUMPAD4).build().perform();
		  action.sendKeys(Keys.NUMPAD2).build().perform();
		  action.sendKeys(Keys.NUMPAD3).build().perform();
		  action.sendKeys(Keys.NUMPAD4).build().perform();
		  action.sendKeys(Keys.ADD).build().perform();
		  action.sendKeys(Keys.NUMPAD3).build().perform();
		  action.sendKeys(Keys.NUMPAD4).build().perform();
		  action.sendKeys(Keys.NUMPAD5).build().perform();
		  action.sendKeys(Keys.NUMPAD3).build().perform();
		  action.sendKeys(Keys.NUMPAD4).build().perform();
		  action.sendKeys(Keys.NUMPAD5).build().perform();
		
	Thread.sleep(3000);
	        String numAns = ansewr.getText();
	        String ans = "111111";
		   System.out.println("addition  "+numAns);
		   String num= ansewr.getText();
			  
		   
			 Assert.assertEquals(num.trim(), "111111");
		  
	
          } 
          catch (Exception e )
          {
        	 Assert.fail("addtion is not matching ");
        	 System.out.println("Addition test case fail ");
          }
	 }

public void substraction () {
	try {
		Allclear.click();
	Thread .sleep(3000);
	Allclear.click();
	  Actions action = new Actions(driver); 
	  action.sendKeys(Keys.SUBTRACT).build().perform();
	  action.sendKeys(Keys.NUMPAD2).build().perform();
	  action.sendKeys(Keys.NUMPAD3).build().perform();
	  action.sendKeys(Keys.NUMPAD4).build().perform();
	  action.sendKeys(Keys.NUMPAD8).build().perform();
	  action.sendKeys(Keys.NUMPAD2).build().perform();
	  action.sendKeys(Keys.NUMPAD3).build().perform();
	  action.sendKeys(Keys.SUBTRACT).build().perform();
	  action.sendKeys(Keys.NUMPAD2).build().perform();
	  action.sendKeys(Keys.NUMPAD3).build().perform();
	  action.sendKeys(Keys.NUMPAD0).build().perform();
	  action.sendKeys(Keys.NUMPAD9).build().perform();
	  action.sendKeys(Keys.NUMPAD4).build().perform();
	  action.sendKeys(Keys.NUMPAD8).build().perform();
	  action.sendKeys(Keys.NUMPAD2).build().perform();
	  action.sendKeys(Keys.NUMPAD3).build().perform();
	
       
	   System.out.println("substraction    "+ansewr.getText());
	   
	   String num= ansewr.getText();
		  
	   
		 Assert.assertEquals(num.trim(), "-23329646");
	

    } 
    catch (Exception e )
    {
  	 Assert.fail("substraction is not matching ");
  	 System.out.println("substraction test case fail ");
    }
}

public void division  () throws InterruptedException{
	try {
	Allclear.click();
	Thread .sleep(3000);
	//Allclear.click();
	  Actions action = new Actions(driver); 
	 
	  action.sendKeys(Keys.NUMPAD4).build().perform();
	  action.sendKeys(Keys.NUMPAD0).build().perform();
	  action.sendKeys(Keys.NUMPAD0).build().perform();
	  action.sendKeys(Keys.NUMPAD0).build().perform();
	  action.sendKeys(Keys.DIVIDE).build().perform();
	  action.sendKeys(Keys.NUMPAD2).build().perform();
	 
	  action.sendKeys(Keys.NUMPAD0).build().perform();
	  action.sendKeys(Keys.NUMPAD0).build().perform();
	  System.out.println("division      "+ansewr.getText());
	  
	  
	   System.out.println("division    "+ansewr.getText());
	   String num= ansewr.getText();
	  
	   
	 Assert.assertEquals(num.trim(), "20");
	  
} 
catch (Exception e )
{
	 Assert.fail("division is not matching ");
	 System.out.println("division test case fail ");
} 
	
	
}
public void multiplication (){
	try {
		Allclear.click();
		Thread .sleep(3000);
		//Allclear.click();
		  Actions action = new Actions(driver); 
		 
		  action.sendKeys(Keys.NUMPAD4).build().perform();
		  action.sendKeys(Keys.NUMPAD2).build().perform();
		  action.sendKeys(Keys.NUMPAD3).build().perform();
		  action.sendKeys(Keys.MULTIPLY).build().perform();
		  action.sendKeys(Keys.NUMPAD5).build().perform();
		  action.sendKeys(Keys.NUMPAD2).build().perform();
		 
		  action.sendKeys(Keys.NUMPAD5).build().perform();
		  System.out.println(" multiplication   "+ansewr.getText());
		  
		  String num= ansewr.getText();
		  Assert.assertEquals(num.trim(), "222075");
			  
	} 
	catch (Exception e )
	{
		 Assert.fail("multiplication () is not matching ");
		 System.out.println("multiplication () test case fail ");
	} 
		

}
public static SparQlab getSparQlab() {
	return PageFactory.initElements(WebDriverClass.getDriver (), SparQlab.class);
}
}

