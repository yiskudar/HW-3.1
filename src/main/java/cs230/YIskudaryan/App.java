package cs230.YIskudaryan;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Eva\\Desktop\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.ted.com/");


      driver.findElement(By.className("css-vsqhey")).click();
      driver.findElement(By.className("css-1dgn86m-base")).sendKeys("some@email.com");
      driver.findElement(By.className("css-uuzc5y-base-button")).click();
      driver.findElement(By.className("css-1knpzs-base")).sendKeys("SomePassword");

    }
}
