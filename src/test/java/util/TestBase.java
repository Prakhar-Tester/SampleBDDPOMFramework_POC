package util;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class TestBase {

	public static WebDriver driver;
	public static Properties prop;
	String projectPath=System.getProperty("user.dir");
	public TestBase() {
		
			
			try {
				prop=new Properties();
				//FileInputStream fis= new FileInputStream(projectPath+"/src/test/java/config/config.properties");
				FileInputStream fis= new FileInputStream(System.getProperty("user.dir")+"/src/test/java/config/config.properties");
				prop.load(fis);
			} catch (IOException e) {
				e.getMessage();
			}
			
	}
	
	public static void initialization(){
		String browserName = prop.getProperty("browser");
		
		if(browserName.equalsIgnoreCase("chrome")){
			System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+ "/src/test/resources/drivers/chromedriver.exe");	
			driver = new ChromeDriver(); 
		}
		else if(browserName.equalsIgnoreCase("firefox")){
			System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+ "/src/test/resources/drivers/geckodriver.exe");	
			driver = new FirefoxDriver(); 
		}
		else if(browserName.equalsIgnoreCase("IE")){
			System.setProperty("webdriver.ie.driver",System.getProperty("user.dir")+ "/src/test/resources/drivers/IEDriverServer.exe");
			driver= new InternetExplorerDriver();
		}
		else {
			System.out.println("We donot support this browser");
		}
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);
		
		driver.get(prop.getProperty("url"));
		
	}
}
