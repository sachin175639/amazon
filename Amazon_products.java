package amazon;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;



public class Amazon_products {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Sachin B\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		//driver.get("https://www.amazon.in/Samsung-inches-Ultra-Smart-QA85QN90BAKXXL/dp/B09Y65HV6N/ref=sr_1_2?qid=1666523265&refinements=p_89%3ASamsung&rnid=3837712031&s=electronics&sr=1-2");
		driver.findElement(By.xpath("//*[@id=\"nav-hamburger-menu\"]/span")).click();
		driver.findElement(By.xpath("//*[@id=\"hmenu-content\"]/ul[1]/li[16]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"hmenu-content\"]/ul[9]/li[3]/a")).click();
		JavascriptExecutor js = (JavascriptExecutor)driver;
		Thread.sleep(3000);
		js.executeScript("window.scrollBy(0,3000)");
		driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[2]/div[2]/div/div/div[21]/ul/li[3]/span/a/div/label/i")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"a-autoid-0-announce\"]/span[2]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"s-result-sort-select_2\"]")).click();
		//driver.get("https://www.amazon.in/Samsung-inches-Ultra-Smart-QA85QN90BAKXXL/dp/B09Y65HV6N/ref=sr_1_2?qid=1666523265&refinements=p_89%3ASamsung&rnid=3837712031&s=electronics&sr=1-2");
		
		
		
		String originalWindow = driver.getWindowHandle();
		assert driver.getWindowHandles().size() == 1;
		
		driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[1]/div[1]/div/span[3]/div[2]/div[3]/div/div/div/div/div[2]/div[1]/h2/a/span")).click();
		
		
		
		//Loop through until we find a new window handle
		for (String windowHandle : driver.getWindowHandles()) {
		    if(!originalWindow.contentEquals(windowHandle)) {
		        driver.switchTo().window(windowHandle);
		        break;
		    }
		}

		
		
		WebElement abt = driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[5]/div[4]/div[4]/div[43]/div/div[2]/a/span"));
		js.executeScript("arguments[0].scrollIntoView(true)",abt);
		Thread.sleep(3000);
		String x = driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[5]/div[4]/div[4]/div[44]/div/ul")).getText();
		System.out.println(x);
	
	}

}

