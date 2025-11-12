package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Loginpage {
WebDriver driver;
public Loginpage(WebDriver driver) {
	// TODO Auto-generated constructor stub
	this.driver=driver;
}

public void setclickbtn() {
	WebElement btn=driver.findElement(By.linkText("Log in"));
	btn.click();
	
}
public void setUsername(String Uname) {
	WebElement name=driver.findElement(By.id("loginusername"));
	name.clear();
	name.sendKeys(Uname);
}
public void setPassword(String password) {
	WebElement pswrd=driver.findElement(By.id("loginpassword"));
	pswrd.clear();
	pswrd.sendKeys(password);
}
public void setLoginbtn() {
	WebElement login=driver.findElement(By.xpath("//*[@id=\"logInModal\"]/div/div/div[3]/button[2]"));
	login.click();
}
public void selectProduct()
{
    WebElement lp=driver.findElement(By.linkText("Laptops"));
    lp.click();
    WebElement sony=driver.findElement(By.linkText("Sony vaio i5"));
    sony.click();

}

}