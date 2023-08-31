package chapter1;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Homepage {
	
	public static void main(String[]args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.shohoz.com/");
		driver.manage().window().maximize();
//		Contact us
		driver.findElement(By.xpath("//a[@title='Contact Us']")).click();
//		Purpose
		driver.findElement(By.xpath("(//div[@class='select-style']//select)[1]")).sendKeys("launch");
//		Name
		driver.findElement(By.xpath("//input[@placeholder='Mahmud']")).sendKeys("sohag");
//		City
		driver.findElement(By.xpath("(//div[@class='select-style']//select)[2]")).click();
//		phone number
		driver.findElement(By.xpath("(//label[text()='Phone Number']/following::input)[1]")).sendKeys("01677997319");
//		Email
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("sohagreal@gmail.com");
//		message
		driver.findElement(By.xpath("//div[@class='col-full']//textarea[1]")).sendKeys("Got the service");
		
//		//Bus//
		driver.findElement(By.xpath("//a[@title='Bus']")).click();
//		from
		driver.findElement(By.xpath("(//input[@placeholder='Enter City'])[1]")).sendKeys("Chittagong");
//		To
		driver.findElement(By.xpath("(//input[@placeholder='Enter City'])[2]")).sendKeys("Dhaka");
//		Date of journey
		driver.findElement(By.xpath("(//input[@placeholder='Pick a date'])[1]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'30')]")).click();
//		Date of return
		driver.findElement(By.xpath("(//input[@placeholder='Pick a date'])[2]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'31')]")).click();
//		Search bus
		driver.findElement(By.xpath("//button[@type='submit']")).click();
//		Close window
		driver.quit();

	}

}
