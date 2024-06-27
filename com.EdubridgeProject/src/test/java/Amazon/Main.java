package Amazon;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\PC-DELL\\.cache\\selenium\\chromedriver\\win64\\126.0.6478.55\\chromedriver.exe");  // Set the path to your chromedriver
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.in/");
        driver.manage().window().maximize();
        
        // Sign in
        SignIn signIn = new SignIn(driver);
        signIn.performSignIn("manas.2402@gmail.com", "@Alliswell33058");
        
        // Search for a product
        ProductSearch productSearch = new ProductSearch(driver);
        productSearch.searchProduct("handmade Clapjoy Soft Hand Knitted");
        
        // Add to cart
        AddToCart addToCart = new AddToCart(driver);
        addToCart.addItemToCart();
        
        // Checkout
        Checkout checkout = new Checkout(driver);
        checkout.performCheckout();
        
        //driver.quit();
	}

}
