package com.Project.selenium.ProjectM;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.ContextClickAction;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ProjectMM
{

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", ".\\Driver\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://the-internet.herokuapp.com/");
        driver.findElement(By.linkText("Hovers")).click();
        //Actions action=new Actions(driver);
       //action.moveToElement(driver.findElement(By.xpath("//h5[contains(t]"))).perform();
       driver.navigate().back();
       //2
       driver.findElement(By.linkText("Checkboxes")).click();
       WebElement check=driver.findElement(By.xpath("//input[@type='checkbox']"));
        for(int i=0;i<3;i++)
        {
        	check.click();
        	check.isSelected();
        }
        Thread.sleep(2000);
        driver.navigate().back();
        
        //3.input
        driver.findElement(By.linkText("Inputs")).click();
        driver.findElement(By.xpath("//input[@type='number']")).sendKeys("1234");
       driver.navigate().back();
       //4
       driver.findElement(By.linkText("Dropdown")).click();
       Select dropdown=new Select(driver.findElement(By.xpath("//select[@id='dropdown']")));
       dropdown.selectByVisibleText("Option 2");
       driver.navigate().back();
       //5
       driver.findElement(By.linkText("File Upload")).click();
       WebElement upload=driver.findElement(By.xpath("//input[@id='file-upload']"));
       upload.sendKeys("C:\\Users\\mindc1may87\\Desktop\\html.txt");
       driver.findElement(By.xpath("//input[@id='file-submit']")).click();
       System.out.println("File uploaded");
       driver.navigate().back();
       driver.navigate().back();
       //6
      // driver.findElement(By.linkText("Sortable Data Tables"));
       //driver.findElement(By.linkText("Key Presses")).click();
       
       //8
       driver.findElement(By.linkText("Multiple Windows")).click();
       driver.findElement(By.linkText("Click Here")).click();
       Set<String> windowhandal=driver.getWindowHandles();
		Iterator<String> iterator= windowhandal.iterator();
		String parent=iterator.next();
		String child=iterator.next();
		driver.switchTo().window(parent);
		driver.navigate().back();
		//9
		driver.findElement(By.linkText("Context Menu")).click();
		Actions a=new Actions(driver);
		a.moveToElement(driver.findElement(By.xpath("//div[@id='hot-spot']"))).contextClick().build().perform();
		driver.switchTo().alert().accept();
		
		
		
		
       
       
       
       
       
       
        
       // driver.close();
		
	}

}
