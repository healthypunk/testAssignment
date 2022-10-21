import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class LeaveRequestTest {
    private WebDriver driver;
    @Before
    public void setUp(){
        System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir") + "\\src\\test\\resources\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://acceptance.mgthost.com/login");
        synchronized (driver){
            try {
                driver.wait(3000);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
        driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div[1]/div/span/div[1]/form/div[1]/div/div[3]/input")).sendKeys("demo+RP-01142@mercans.com");
        synchronized (driver){
            try {
                driver.wait(3000);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
        driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div[1]/div/span/div[1]/form/div[2]/div/div[3]/input")).sendKeys("Employee1!");
        synchronized (driver){
            try {
                driver.wait(3000);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
        driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div[1]/div/span/button")).click();
        synchronized (driver){
            try {
                driver.wait(9000);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }
    @Test
    public void annualLeaveRequestTest(){
        String startday = "23";
        String startmonth = "10";
        String startyear = "2022";
        String startcomplete = String.join("-",startyear,startmonth,startday);

        String endday = "28";
        String endmonth = "10";
        String endyear = "2022";
        String endcomplete = String.join("-",endyear,endmonth,endday);



        driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div/div[2]/div[3]/div[3]/div[1]/div/div[2]")).click();
        synchronized (driver){
            try {
                driver.wait(3000);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
        driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div/div[2]/div[3]/div[3]/div[2]/div/a[1]")).click();
        synchronized (driver){
            try {
                driver.wait(3000);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
        driver.findElement(By.xpath("/html/body/div[4]/div/div/div/div[2]/div[2]/div/div[1]/div/div/button")).click();
        synchronized (driver){
            try {
                driver.wait(3000);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
        driver.findElement(By.id(startcomplete)).click();
        driver.findElement(By.id(endcomplete)).click();
        synchronized (driver){
            try {
                driver.wait(3000);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
        driver.findElement(By.xpath("/html/body/div[4]/div/div/div/div[2]/div[3]/div/div[1]/div/div/div[3]/div/div/div/div/button[2]")).click();
        synchronized (driver){
            try {
                driver.wait(3000);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
        driver.findElement(By.xpath("//*[@id=\"confirmAction\"]")).click();

    }


}
