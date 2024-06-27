package Amazon;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Checkout {
	private WebDriver driver;
    
    public Checkout(WebDriver driver) {
        this.driver = driver;
    }
    
    public void performCheckout() {
    	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
        driver.findElement(By.xpath("//a[normalize-space()='Go to Cart']")).click();
        // Add any additional steps to complete the checkout process
    }
}
