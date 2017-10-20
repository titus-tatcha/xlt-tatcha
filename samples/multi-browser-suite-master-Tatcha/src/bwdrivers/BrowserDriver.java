package bwdrivers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.safari.SafariOptions;

import com.xceptance.xlt.api.engine.scripting.AbstractScriptTestCase;
import com.xceptance.xlt.api.engine.scripting.ScriptName;

@ScriptName("noscript")
public class BrowserDriver extends AbstractScriptTestCase {

	 private WebDriver driver = null;
	 private DesiredCapabilities capabilities = null;
	 private String webDriver = null;
	 private String pathToBrowser = null;
	 private String pathToDriverServer = null;
	

	public WebDriver getFireFoxWebDriver(){
        pathToBrowser = getProperty("xlt.webDriver.firefox.pathToBrowser");
        pathToDriverServer = getProperty("xlt.webDriver.firefox.pathToDriverServer");
        
        System.out.println("output>>"+webDriver+":"+pathToBrowser+":"+pathToDriverServer);
        
        System.setProperty("webdriver.firefox.bin", pathToBrowser);
        System.setProperty("webdriver.gecko.driver", pathToDriverServer);
        System.setProperty("webdriver.firefox.port","4444");
        capabilities = DesiredCapabilities.firefox();
        driver = new FirefoxDriver();
        return driver;
 	}
 
	public WebDriver getChromeWebDriver(){
        
        pathToBrowser = getProperty("xlt.webDriver.chrome.pathToBrowser");
        pathToDriverServer = getProperty("xlt.webDriver.chrome.pathToDriverServer");
        
        System.out.println("output>>"+webDriver+":"+pathToBrowser+":"+pathToDriverServer);
        
        System.setProperty("webdriver.chrome.bin", pathToBrowser);
        System.setProperty("webdriver.chrome.driver", pathToDriverServer);
        System.setProperty("webdriver.chrome.port","4445");

        capabilities = DesiredCapabilities.chrome();
        driver = new ChromeDriver(capabilities);
        return driver;
 	}
 	
	public WebDriver getSafariWebDriver(){
 		System.setProperty("webdriver.safari.bin", "D:/programs/Safari/Safari.exe");
// 		capabilities = DesiredCapabilities.safari();
// 		capabilities.setCapability(CapabilityType.UNEXPECTED_ALERT_BEHAVIOUR, UnexpectedAlertBehaviour.IGNORE);
// 		driver = new SafariDriver(capabilities);
 		System.setProperty("webdriver.safari.noinstall", "true"); 
 		driver = new SafariDriver();	
 		return driver;
 	}
 	
	public WebDriver getSafariWebDriver2(){
	 	SafariOptions options = new SafariOptions();
	 	options.setUseCleanSession(true);
	 	driver = new SafariDriver(options);
//	 	capabilities = DesiredCapabilities.safari();
//	 	capabilities.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
//	 	capabilities.setCapability(CapabilityType.UNEXPECTED_ALERT_BEHAVIOUR, "dismiss");
//	 	capabilities.setCapability(SafariOptions.CAPABILITY, options);
//	 	driver = new SafariDriver(capabilities);
	 	driver.manage().deleteAllCookies();
	 	return driver;
 	}
}
