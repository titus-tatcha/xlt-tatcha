package menu.item.check;

import org.junit.After;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import com.xceptance.xlt.api.webdriver.XltDriver;
import com.xceptance.xlt.api.engine.scripting.AbstractScriptTestCase;
import com.xceptance.xlt.api.engine.scripting.AbstractWebDriverScriptTestCase;
import com.xceptance.xlt.api.engine.scripting.ScriptName;

/**
 * TODO: Add class description
 */

//@ScriptName("menu.item.check.TcheckEachMenu")
public class TcheckEachMenuItem extends AbstractWebDriverScriptTestCase
{

    /**
     * Constructor.
     */
    public TcheckEachMenuItem()
    {
        super(new XltDriver(false), "http://demo-na01-tatcha.demandware.net");
    }

    /** Customly Added to switch web drivers */
//    public TcheckEachMenuItem(WebDriver webDriver, String baseURL)
//    {
//        super(webDriver, baseURL);
//    }

    /**
     * Executes the test.
     *
     * @throws Throwable if anything went wrong
     */
    
    @Test
    public void test() throws Throwable
    {
        //
        // ~~~ OpenStartPage ~~~
        //
        startAction("OpenStartPage");
//        open("/s/SiteGenesis/electronics/televisions/?lang=en_US");
        open("/s/SiteGenesis?lang=en_US");
        //
        // ~~~ TcheckEachMenuItem-0 ~~~
        //
        startAction("TcheckEachMenuItem_0");
        clickAndWait("//nav[@id='navigation']/ul[1]/li[4]/div/ul/li[1]/a");
        //
        // ~~~ TcheckEachMenuItem-1 ~~~
        //
        startAction("TcheckEachMenuItem_1");
        clickAndWait("//nav[@id='navigation']/ul[1]/li[4]/div/ul/li[2]/a");
        //
        // ~~~ TcheckEachMenuItem-2 ~~~
        //
        startAction("TcheckEachMenuItem_2");
        clickAndWait("//nav[@id='navigation']/ul[1]/li[4]/div/ul/li[3]/a");
        //
        // ~~~ TcheckEachMenuItem-3 ~~~
        //
        startAction("TcheckEachMenuItem_3");
        clickAndWait("//nav[@id='navigation']/ul[1]/li[4]/div/ul/li[4]/a");
        //
        // ~~~ TcheckEachMenuItem-4 ~~~
        //
        startAction("TcheckEachMenuItem_4");
        clickAndWait("//nav[@id='navigation']/ul[1]/li[4]/div/ul/li[5]/a");

    }

    /**
     * Clean up.
     */
    @After
    public void quitDriver()
    {
        // Shutdown WebDriver.
        getWebDriver().quit();
    }

}