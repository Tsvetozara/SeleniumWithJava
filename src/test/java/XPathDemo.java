import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XPathDemo {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();

        driver.get("https://demo.opencart.com/");
        driver.manage().window().maximize();

        //By Xpath with single attribute
        driver.findElement(By.xpath("//input[@placeholder='Search']")).sendKeys("TShirts");

        //By XPath with multiple attributes
        driver.findElement(By.xpath("//input[@name='search'][@placeholder='Search']")).sendKeys("TShirts");

        //By Xpath with 'and' and 'or' operators
        driver.findElement(By.xpath("//input[@name='search' and @placeholder='Search']")).sendKeys("TShirts");
        driver.findElement(By.xpath("//input[@name='search' or @placeholder='xyz']")).sendKeys("TShirts");

        //By Xpath with inner text - text()
        driver.findElement(By.xpath("//*[text()='MacBook']")).click();

        boolean displaystatus = driver.findElement(By.xpath("//h3[text()='Featured']")).isDisplayed();
        System.out.println(displaystatus);

        String value = driver.findElement(By.xpath("//h3[text()='Featured']")).getText();
        System.out.println(value);

        //By Xpath with contains()
        driver.findElement(By.xpath("//input[contains(@placeholder,'Sea')]")).sendKeys("TShirts");

        //By Xpath with starts-with()
        driver.findElement(By.xpath("//input[starts-with(@placeholder,'Sea')]")).sendKeys("TShirts");

        //Chained xpath
        boolean imagestatus = driver.findElement(By.xpath("//div[@id='logo']/a/img")).isDisplayed();
        System.out.println(imagestatus);

    }
}
