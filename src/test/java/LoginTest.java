import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {
    private WebDriver driver;

    @Before
    public void setUp(){
        System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir") + "\\src\\test\\resources\\chromedriver.exe");
        driver = new ChromeDriver();
    }
    @Test
    public void testLoginManager(){
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
        driver.close();
    }

    @Test
    public void testLoginEmployee(){
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
        driver.close();
    }


}
