import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleAlerts {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();

        driver.get("https://the-internet.herokuapp.com/javascript_alerts");
        driver.manage().window().maximize();

        //1) Normal alert with OK button

        driver.findElement(By.xpath("//button[normalize-space()='Click for JS Alert']")).click();
        Thread.sleep(5000);

        Alert myalert = driver.switchTo().alert();
        System.out.println(myalert.getText());
        myalert.accept();

        //2) Confirmation Alert - OK & Cancel
        driver.findElement(By.xpath("//button[normalize-space()='Click for JS Confirm']")).click();
        Thread.sleep(5000);

        //driver.switchTo().alert().accept(); //close alert with OK button
        driver.switchTo().alert().dismiss(); //close alert using cancel button

        //3) Prompt alert - Input box
        driver.findElement(By.xpath("//button[normalize-space()='Click for JS Prompt']")).click();
        Thread.sleep(5000);

        Alert myalert2 = driver.switchTo().alert();

        myalert2.sendKeys("Welcome");
        myalert2.accept();
    }
}
