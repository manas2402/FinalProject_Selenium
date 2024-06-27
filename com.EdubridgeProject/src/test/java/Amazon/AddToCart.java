package Amazon;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AddToCart {
private WebDriver driver;
    
    public AddToCart(WebDriver driver) {
        this.driver = driver;
    }
    
    public void addItemToCart() {
//    	 WebElement newWindowLink = driver.findElement(By.linkText("https://www.amazon.in/sspa/click?ie=UTF8&spc=MTo2NDIyMzI3NTAxMTE5MTc0OjE3MTkxNDI3Mjg6c3BfYXRmOjMwMDIyNTM4NzMyNjYzMjo6MDo6&url=%2FChoice-HP-Gaming-Response-xd0020AX%2Fdp%2FB0CCVZP835%2Fref%3Dsr_1_1_sspa%3Fcrid%3DPVBYMWBUWZXR%26dib%3DeyJ2IjoiMSJ9.oTvYynn1YIcC8wDrWyD0tvK6T5cJrWW7hmqEqd6kgZ3JH0k0a5e9wsJtnpxYKs-FunHcWVsR0jF4n4toJ89h_01bTOvN7VM6NiLa6loviqf1i5gOZZs0VyeiCQxF6uQi0LNX5uVZ5p4dWyBJfKJmyPIgw-FGsk-h0lgxRw0W47IhP4X52dOJVav_fzME4eXmFs0C9mHK32CfZKR7mm9uZlSys5OpcEqP8AUMiP3XSBY.vzInfnw8MYnJHtEVlr6srkPOBUFixj4WBTMhMLrFIvU%26dib_tag%3Dse%26keywords%3DHP%2BOMEN%2BGaming%2BLaptop%252C%2BAMD%2BRyzen%2B7%26qid%3D1719142728%26sprefix%3Dhp%2Bomen%2Bgaming%2Blaptop%252C%2Bamd%2Bryzen%2B7%252Caps%252C217%26sr%3D8-1-spons%26sp_csd%3Dd2lkZ2V0TmFtZT1zcF9hdGY%26psc%3D1"));
//         newWindowLink.click();
         
//         String mainWindowHandle = driver.getWindowHandle();
//         
//         WebElement openNewWindowButton = driver.findElement(By.id("openNewWindowButton"));
//         openNewWindowButton.click();
//         // Get handles of all open windows/tabs
//         Set<String> windowHandles = driver.getWindowHandles();
//         
//         // Switch to the new window handle
//         for (String handle : windowHandles) {
//             if (!handle.equals(mainWindowHandle)) {
//                 driver.switchTo().window(handle);
//                 break;
//             }
//         }
    	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
         WebElement addToCartButton = driver.findElement(By.xpath("//button[@id='a-autoid-1-announce']"));
         addToCartButton.click();
         driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));

         // Close the new window/tab
//         driver.close();
//
//         // Switch back to the main window
//         driver.switchTo().window(mainWindowHandle);
    }
}
