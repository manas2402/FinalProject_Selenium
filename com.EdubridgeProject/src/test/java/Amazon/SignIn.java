package Amazon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SignIn {
	private WebDriver driver;
    
    public SignIn(WebDriver driver) {
        this.driver = driver;
    }
    
    public void performSignIn(String email, String password) {
        driver.findElement(By.id("nav-link-accountList-nav-line-1")).click();
        driver.findElement(By.id("ap_email")).sendKeys(email);
        driver.findElement(By.id("continue")).click();
        driver.findElement(By.id("ap_password")).sendKeys(password);
        driver.findElement(By.id("signInSubmit")).click();
    }
}
