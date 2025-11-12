package Test;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

import Base.TestBase;
import Pages.HomePage;
import Pages.Loginpage;


public class TestCase extends TestBase {
Loginpage lg;
HomePage hmg;
@BeforeClass
public void Obinit() {
	lg=new Loginpage(driver);
	hmg=new HomePage(driver);
}
@Test
 public void tc001() {
lg.setclickbtn();
lg.setUsername("Hasna");
lg.setPassword("hasna123");
lg.setLoginbtn();
lg.selectProduct();

}
@Test
 public void tc002() throws InterruptedException {
	hmg.selectCart();
	hmg.addToCart();
	hmg.locateToCart();
	hmg.placeOrder();
}

}
