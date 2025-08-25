import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SliderDemo {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.jqueryscript.net/demo/Price-Range-Slider-jQuery-UI/");
        driver.manage().window().maximize();

        Actions act = new Actions(driver);

        //Min slider
        WebElement min_slider = driver.findElement(By.xpath("//div[@class='price-range-block']//span[1]"));
        System.out.println("Default location of the min slider is: " + min_slider.getLocation());
        Thread.sleep(4000);
        act.dragAndDropBy(min_slider, 100, 0).perform();
        System.out.println("Location of the min slider after moving is: " + min_slider.getLocation());

        //Max slider
        WebElement max_slider = driver.findElement(By.xpath("//span[2]"));
        System.out.println("Default location of the max slider is: " + max_slider.getLocation());
        act.dragAndDropBy(max_slider, -100, 0).perform();
        System.out.println("Location of the max slider after moving is: " + max_slider.getLocation());
    }
}
