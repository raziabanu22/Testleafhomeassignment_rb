package week2.day1;

import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchFacebook {
	

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		driver.close();
		
	}

}
