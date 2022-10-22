import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AnnualLeaveApproveTest {
    WebDriver driver;
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
        driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div[1]/div/span/div[1]/form/div[1]/div/div[3]/input")).sendKeys("demo+VT-00342@mercans.com");
        synchronized (driver){
            try {
                driver.wait(3000);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
        driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div[1]/div/span/div[1]/form/div[2]/div/div[3]/input")).sendKeys("Manager1!");
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
        driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div/div[2]/div[3]/div[3]/div[1]/div/div[2]")).click();
        synchronized (driver){
            try {
                driver.wait(9000);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }
    @Test
    public void annualLeaveTest(){
        driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div[1]/div[2]/div[3]/div[3]/div[2]/div[2]")).click();
        synchronized (driver){
            try {
                driver.wait(9000);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
        driver.findElement(By.xpath("/html/body/div[4]/div/div/div/div[2]/div[3]/div/div/table/tbody/tr/td[2]/div")).click();
        synchronized (driver){
            try {
                driver.wait(9000);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
        driver.findElement(By.xpath("/html/body/div[4]/div/div/div/div[2]/div[4]/div[1]/div/div/div[3]/div/div/div/div/button[2]")).click();

    }
}
