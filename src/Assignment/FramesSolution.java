package Assignment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FramesSolution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Pre Req-Replace location of chromedriver.exe file if running on your
		// machine (Step15)
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Vanshul Suneja\\Chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		WebElement l, m, r, b;
		driver.get("http://the-internet.herokuapp.com/nested_frames");
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().window().maximize();

		driver.switchTo().frame("frame-top");
		driver.switchTo().frame("frame-left");
		l = driver.findElement(By.cssSelector("body"));
		System.out.println(l.getText());
		driver.switchTo().parentFrame(); // switching to previous frame
		driver.switchTo().frame("frame-middle");
		m = driver.findElement(By.cssSelector("div"));
		System.out.println(m.getText());
		driver.switchTo().parentFrame();
		driver.switchTo().frame("frame-right");
		r = driver.findElement(By.cssSelector("body"));
		System.out.println(r.getText());
		driver.switchTo().defaultContent(); // switching to default content
		driver.switchTo().frame("frame-bottom");
		b = driver.findElement(By.cssSelector("body"));
		System.out.println(b.getText());
	}

}
