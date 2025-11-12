package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {
	WebDriver driver;
	public HomePage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}
	
	public void selectCart() {
		WebElement crt=driver.findElement(By.xpath("//*[@id=\"tbodyid\"]/div[2]/div/a"));
		crt.click();
		
	}
	public void addToCart() throws InterruptedException
    {
        WebElement add=driver.findElement(By.linkText("Add to cart"));
        add.click();
        Thread.sleep(1000);
        driver.switchTo().alert().accept();
    } 
	public void locateToCart() {
		WebElement lct=driver.findElement(By.id("cartur"));
		lct.click();
	}
	public void placeOrder() {
		WebElement ord=driver.findElement(By.xpath("//*[@id=\"page-wrapper\"]/div/div[2]/button"));
		ord.click();
		WebElement ordname=driver.findElement(By.id("name"));
		ordname.sendKeys("abd");
		WebElement ordcntry=driver.findElement(By.id("country"));
		ordcntry.sendKeys("XYZ");
		WebElement ordcity=driver.findElement(By.id("city"));
		ordcity.sendKeys("Tvm");
		WebElement ordcrd=driver.findElement(By.id("card"));
		ordcrd.sendKeys("hmgnb123");
		WebElement ordmnth=driver.findElement(By.id("month"));
		ordmnth.sendKeys("Jan");
		WebElement ordyr=driver.findElement(By.id("year"));
		ordyr.sendKeys("2025");
		WebElement ordbtn=driver.findElement(By.xpath("//*[@id=\"orderModal\"]/div/div/div[3]/button[2]"));
		ordbtn.click();
	}
}
