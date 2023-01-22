package basePackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Demo {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
WebDriver driver =new ChromeDriver();
		
		driver.get("http://whiteboxqa.com/");
		
		WebElement login=driver.findElement(By.linkText("Login"));
		login.click();
		Thread.sleep(3000L);

		WebElement usename =driver.findElement(By.xpath("//input[@id='username']"));
		usename.sendKeys("warghade.shrutee@gmail.com");
		WebElement password =driver.findElement(By.xpath("//input[@id='password']"));
		
		password.sendKeys("Pihu@1012");
		WebElement loginbtn=driver.findElement(By.xpath("//button[@id='login']"));
		boolean l =loginbtn.isDisplayed();
	
		System.out.println("This is login btn "+l);
		loginbtn.click();
		/*WebElement register =driver.findElement(By.xpath("//button[@id='register']"));
		register.click();
		System.out.println("This is register button "+ register);
		
		WebElement Home =driver.findElement(By.xpath("//a[text()='Home']"));
		Boolean h= Home.isDisplayed();
		System.out.println("This is Home button "+h);
		
		WebElement Schedule= driver.findElement(By.xpath("//a[text()='Schedule']"));
		Boolean s =Schedule.isDisplayed();
		System.out.println("This is Schedule button "+s);
		
		WebElement info=driver.findElement(By.linkText("info@whitebox-learning.com"));
		boolean i= info.isDisplayed();
	
		System.out.println("This is info " +i);*/
		
		Select s=new Select(driver.findElement(By.linkText("Presentations")));
		s.selectByVisibleText("Presentations");
		System.out.println("This is dropdown");
		
		
	//	s1.selectByIndex(0);
		
		//driver.findElement(By.xpath("//a[text()=' Recordings']")).click();
		
		
		
	}

}
