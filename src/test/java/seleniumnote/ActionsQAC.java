package seleniumnote;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsQAC {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://qac.moneymart.ca/home");
		driver.manage().window().maximize();
        Thread.sleep(3000);
        
        Actions act= new Actions(driver);
        act.click(driver.findElement(By.xpath("//span[contains(text(),'Sign In / Sign Up')]"))).perform();
        
        Thread.sleep(3000);
        
      //Scroll down
		
  		JavascriptExecutor js = (JavascriptExecutor) driver;
  		js.executeScript("window.scrollBy(0,350)", "");
		
		act.click(driver.findElement(By.xpath("//a[contains(text(),'Sign Up now')]"))).perform();
		
		Thread.sleep(7000);
		//Action click and sendkeys
		
		By FirstName = By.name("firstName");
		By LastName =By.name("lastName");
		By DOB = By.name("dob");
		By PhoneNumber = By.name("phoneNumber");
		By Email = By.name("email");
		By SelectSeq = By.xpath("//button[@class='mm-select__value']");
		By SeqOpt =By.xpath("//button[text()='What was your childhood nickname?']");
		By SequrityAns = By.xpath("//input[@aria-label='securityQuesAns']");
		By NewPass = By.name("newPassword");
		By ConfirmPass = By.name("confirmPassword");
		By CreateAcBtn = By.xpath("//button[@value='Create Account']");
		   
	     
			
		act.sendKeys(driver.findElement(FirstName),"josefa").build().perform();
		act.sendKeys(driver.findElement(LastName),"potarao").build().perform();
		act.sendKeys(driver.findElement(DOB),"19860212").build().perform();
		 //Scroll down
		
		JavascriptExecutor js1 = (JavascriptExecutor) driver;
		js1.executeScript("window.scrollBy(0,350)", "");
		
		act.sendKeys(driver.findElement(PhoneNumber),"8374027476").perform();
		act.sendKeys(driver.findElement(Email),"josefadox@yopmail.com").perform();
		act.click(driver.findElement(SelectSeq)).perform();
		act.click(driver.findElement(SeqOpt)).perform();
		act.sendKeys(driver.findElement(SequrityAns),"Testing").perform();
        act.sendKeys(driver.findElement(NewPass),"sample@123").perform();
        act.sendKeys(driver.findElement(ConfirmPass),"sample@123").perform();
        act.click(driver.findElement(CreateAcBtn)).perform();

	}

}
