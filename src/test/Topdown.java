package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Topdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		//System.setProperty("webdriver.chrome.driver","C:\\Users\\micha\\eclipse-workspace\\Sample Test 1\\chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", 
		        "C:\\Users\\micha\\Downloads\\New folder\\chromedriver.exe");
	    
	    //Creating an instance of driver, to launch browser
	    WebDriver browser = new ChromeDriver();
	    
	    //to open the bpms login page 
	    browser.get("http://bpms-testing.initsconduit.com");

	    //to maximize the browser
	    browser.manage().window().maximize();
	    
	    //to check the actual url is displayed
	    System.out.println(browser.getTitle());
	    
	    //to click the login/signup icon
	    //browser.findElement(By.xpath("/html/body/div[1]/div/div/div/div/div[2]/div[2]/form/div[1]/input")).click();
	    
	    //to write email into email field
	    browser.findElement(By.xpath("/html/body/div[1]/div/div/div/div/div[2]/div[2]/form/div[1]/input")).sendKeys("jane@initsng.com");
	    System.out.println("Email Entered");
	    
	    //to write password into the password field
	    browser.findElement(By.xpath("/html/body/div[1]/div/div/div/div/div[2]/div[2]/form/div[2]/div[2]/input")).sendKeys("qwert1234");
	    System.out.println("Password Entered");
	    
	    //to click the login button
	    browser.findElement(By.xpath("/html/body/div[1]/div/div/div/div/div[2]/div[2]/form/div[4]/button")).click();
	    System.out.println("Login button clicked");
	    
	    Thread.sleep(1000);
	    
	    //to click on Generate bill button
	    browser.findElement(By.xpath("/html/body/div[2]/div[1]/div[1]/div/div/div[3]/ul/li[3]/a")).click();
	    System.out.println("Generate bill button clicked");
	    
	    Thread.sleep(1000);
	    
	  //to click on Ministry selection field button
	    browser.findElement(By.xpath("/html/body/div[2]/div[1]/div[2]/div/div[2]/div/div/div[2]/form/div[1]/div/span/span[1]/span/span[1]")).click();
	    System.out.println("Ministry field clicked");
	    
	    Thread.sleep(1000);
	    
	    //to select a particular Ministry
	    browser.findElement(By.xpath("/html/body/div[2]/div[1]/div[2]/div/div[2]/div/div/div[2]/form")).click();
	    System.out.println("Particular Ministry clicked");
	   
	    //browser.close();
	}

	}


