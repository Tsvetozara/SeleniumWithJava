import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://gmail.com");

        driver.manage().window().maximize();

        driver.findElement(By.id("Email")).sendKeys("tsvetozara.beneva@gmail.com");

        driver.findElement(By.id("Passwd")).sendKeys("password");

        driver.findElement(By.id("signIn")).click();

    }
}