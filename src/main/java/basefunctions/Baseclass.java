package basefunctions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Baseclass 
{
public WebDriver driver;
public WebDriver intialisedriver()
{
System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\src\\main\\resources\\drivers\\chromedriver.exe");	
driver=new ChromeDriver();
return driver;
}

}
