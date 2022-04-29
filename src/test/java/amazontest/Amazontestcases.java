package amazontest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import basefunctions.Baseclass;

public class Amazontestcases extends Baseclass
{
	public WebDriver driver;
	@BeforeMethod
	public void browser()
	{
		driver=intialisedriver();
		
	}
	public String getDate()
	{
		Date date = new Date();
		SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy hh:mm:ss");
		String str = formatter.format(date);
	    System.out.println(str);
		return str;
		
	}
	@Test
	public void tc01() throws InterruptedException
	{
		/*
	driver.get("https://www.amazon.in/");
	driver.manage().window().maximize();
	WebElement searchbox=driver.findElement(By.id("twotabsearchtextbox"));
	searchbox.sendKeys("samsung");
	driver.findElement(By.id("nav-search-submit-button")).submit();
	List<WebElement> productnames=driver.findElements(By.xpath("//div[@class='sg-col-inner']//span[@class='a-size-medium a-color-base a-text-normal']"));
	for(int i=0;i<productnames.size();i++)
	{
		System.out.println(productnames.get(i).getAttribute("class"));
	}*/
	/*
	driver.navigate().to("https://www.redbus.in/");
	driver.findElement(By.id("src")).sendKeys("kottayam");
	Thread.sleep(1000);
	driver.findElement(By.xpath("//ul[@class='autoFill homeSearch']//li")).click();
	driver.findElement(By.id("dest")).sendKeys("Bangalore");
	Thread.sleep(1000);
	driver.findElement(By.xpath("//ul[@class = 'autoFill homeSearch']//li[text()='Madiwala, Bangalore']")).click();
	driver.findElement(By.xpath("//span[@class='fl icon-calendar_icon-new icon-onward-calendar icon']")).click();
	Thread.sleep(1000);
	//driver.findElement(By.xpath("//td[@class='current day']")).click();
	*/
	
	//driver.navigate().to("https://www.in.cheapflights.com/");
	//String CurrentDate1= getDate();
	//driver.findElement(By.xpath("(//div[@class='_itL ']//div)[7])).sendKeys("29/04/2022");
	//driver.navigate().to("https://www.makemytrip.com/");
	//Thread.sleep(3000);
	//driver.findElement(By.xpath("(//span[@class='tabsCircle appendRight5'])[1]")).click();
	//div[@class='sg-col-inner']//span[@class='a-size-medium a-color-base a-text-normal']
	/*driver.findElement(By.id("twotabsearchtextbox")).clear();
	driver.navigate().to("https://www.flipkart.com/");
	driver.navigate().back();
	driver.navigate().forward();
	driver.navigate().refresh();
	driver.quit();
	driver.close();
*/
			/*
	getDate();
	List<WebElement> dates = driver.findElements(By.xpath("//td[@class='wd day' or @class='we day']"));
	for (int i=0;i<=dates.size();i++) {
		String Datevalue = dates.get(i).getText();
		if(Datevalue.equals("30")) {
			dates.get(i).click();
	}
}*/
	driver.navigate().to("http://automationpractice.com/index.php?id_category=8&controller=category");
	Thread.sleep(2000);
	WebElement drp=driver.findElement(By.id("selectProductSort"));
	Select dropdown=new Select(drp);
    dropdown.selectByValue("name:asc");
    dropdown.selectByVisibleText("In stock");
    JavascriptExecutor jse=(JavascriptExecutor)driver;
    jse.executeScript("window.scrollBy(0,500)");
	}
}

