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
		driver.findElement(By.xpath("//*[@id=\"s-refinements\"]/div[21]/ul/li[2]/span/a/div/label/i")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"a-autoid-0-announce\"]/span[2]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"s-result-sort-select_2\"]")).click();
		//driver.get("https://www.amazon.in/Samsung-inches-Ultra-Smart-QA85QN90BAKXXL/dp/B09Y65HV6N/ref=sr_1_2?qid=1666523265&refinements=p_89%3ASamsung&rnid=3837712031&s=electronics&sr=1-2");
		//driver.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/span[3]/div[2]/div[3]/div/div/div/div/div[2]/div[1]/h2/a/span")).click();
		String x ="https://www.amazon.in/Samsung-inches-Ultra-Smart-QA85QN90BAKXXL/dp/B09Y65HV6N/ref=sr_1_2?qid=1666523265&refinements=p_89%3ASamsung&rnid=3837712031&s=electronics&sr=1-2";
		System.out.println(x);
		Thread.sleep(3000);	
		amaz o1 = new amaz();
		o1.amj(x);
		
	}

}


class amaz {
	public void amj(String x) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(x);
		JavascriptExecutor js = (JavascriptExecutor)driver;
		Thread.sleep(3000);
		WebElement abt = driver.findElement(By.xpath("//*[@id=\"feature-bullets\"]/h1"));
		js.executeScript("arguments[0].scrollIntoView(true)",abt);
		String about = driver.findElement(By.xpath("//*[@id=\"feature-bullets\"]/ul")).getText();
		System.out.println(about);
		
		
		
	}
}