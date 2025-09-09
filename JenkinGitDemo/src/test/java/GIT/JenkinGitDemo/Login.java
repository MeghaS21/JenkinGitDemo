package GIT.JenkinGitDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Login {

	@Test
	public void login() throws InterruptedException {
		WebDriver driver = new ChromeDriver();

		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		WebElement uName = driver.findElement(By.cssSelector("#inputUsername")); // find the element

		uName.sendKeys("megha");

		WebElement pwd = driver.findElement(By.name("inputPassword"));
		pwd.sendKeys("password@1234");
		WebElement btn = driver.findElement(By.cssSelector(".submit.signInBtn"));
		
		btn.submit();
		Thread.sleep(2000);
		System.out.println(driver.findElement(By.className("error")).getText());
		driver.close();
		}

}
