import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;

public class CSSLocators {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();

        driver.get("https://demo.nopcommerce.com/");
        driver.manage().window().maximize();

       //driver.findElement(By.cssSelector(".search-box-text")).sendKeys("T-shirts");

        boolean displastatus = driver.findElement(By.xpath("//h3[text()='Featured']")).isDisplayed();
        System.out.println(displastatus);

        driver.findElement(By.xpath("//h3[text()='Featured']")).getText();
    }
}