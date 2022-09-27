package Selinum_Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Chrome_Launch {

	public static void main(String[] args) throws Exception 
	{
		
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\gmeka\\Desktop\\Selenium\\chromedriver_win32\\chromedriver.exe");  
          

        WebDriver driver=new ChromeDriver();
        
        WebDriverWait wait = new WebDriverWait(driver,30);
          
           
        driver.navigate().to("http://www.facebook.com/");  
       
          driver.manage().window().maximize();  
          
          driver.findElement(By.name("email")).sendKeys("Mobile Number/E-Mail Id");
          
          driver.findElement(By.name("pass")).sendKeys("Mobile Number/E-Mail Id");
          
          driver.findElement(By.xpath("//*[text()='Log In'][@name=\"login\"]")).click();
          
          wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='_9ay7']")));
          
          String Message=driver.findElement(By.xpath("//div[@class='_9ay7']")).getText();
         
          String Actual_Message="The password that you've entered is incorrect. Forgotten password?";
          
          if(Message.equals(Actual_Message))
          {
    
        	  System.out.println("forgot password error message dispalyed as expected");
          }
          else
          {
        	  System.out.println("forgot password error message is not dispalyed as expected ");
          }
         
          
          

	}

}
