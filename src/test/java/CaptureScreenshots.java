import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.time.Duration;

public class CaptureScreenshots {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://demo.nopcommerce.com/");
        driver.manage().window().maximize();

        // 1) full page screenshot
        TakesScreenshot ts = (TakesScreenshot) driver;

        File sourcefile = ts.getScreenshotAs(OutputType.FILE);
        File targetfile = new File(System.getProperty("user.dir") + "\\Screenshots\\fullpage.png");
        sourcefile.renameTo(targetfile);  //copy sourcefile to targetfile

        //2) capture the screenshot of specific section
        WebElement featureProducts = driver.findElement(By.xpath("//div[@class='product-grid home-page-product-grid']"));
        File sourcefile2 = featureProducts.getScreenshotAs(OutputType.FILE);
        File targetfile2 = new File(System.getProperty("user.dir") + "\\Screenshots\\featuredProducts.png");
        sourcefile2.renameTo(targetfile2);

        //3) capture the screenshot of WebElement
        WebElement logo = driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']"));
        File sourcefile3 = logo.getScreenshotAs(OutputType.FILE);
        File targetfile3 = new File(System.getProperty("user.dir") + "\\Screenshots\\logo.png");
        sourcefile3.renameTo(targetfile3);

        driver.quit();
    }
}
