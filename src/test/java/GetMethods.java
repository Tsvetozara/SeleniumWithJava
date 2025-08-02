import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetMethods {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();

        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

        //getTitle() - returns title of the page
        System.out.println(driver.getTitle());

        //getCurrentUrl() - return URL of the page
        System.out.println(driver.getCurrentUrl());

        //getPageSource() - returns source code of the page
        System.out.println(driver.getPageSource());

        //getWindowHandle() - returns ID of the single Browser window
        String windowid = driver.getWindowHandle() ;
        System.out.println("Window ID: " + windowid);
    }
}
