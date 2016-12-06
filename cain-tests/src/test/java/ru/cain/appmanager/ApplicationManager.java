package ru.cain.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.BrowserType;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.util.concurrent.TimeUnit;

/**
 * Created by www on 17.11.2016.
 */
public class ApplicationManager {
  WebDriver wd;

  private NavigationHelper navigationHelper;
  private SmsHelper smsHelper;
  private SessionHelper sessionHelper;
  private PdHelper pdHelper;
  private BuyHelper buyHelper;
  private ProductHelper productHelper;
  private CatalogHelper catalogHelper;
  private String browser;

  public ApplicationManager(String browser) {
    this.browser = browser;
  }


  public void init() {
    DesiredCapabilities capabilities = new DesiredCapabilities();
    capabilities.setCapability(CapabilityType.PAGE_LOAD_STRATEGY, "none");
    if (browser.equals(BrowserType.FIREFOX)) {
      wd = new FirefoxDriver(capabilities);
    } else if (browser.equals(BrowserType.CHROME)) {
      wd = new ChromeDriver(capabilities);
    } else if (browser.equals(BrowserType.IE)) {
      wd = new InternetExplorerDriver(capabilities);
    }
    wd.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
    wd.get("https://cainft7.alfaintra.net/cain");
    smsHelper = new SmsHelper(wd);
    navigationHelper = new NavigationHelper(wd);
    sessionHelper = new SessionHelper(wd);
    pdHelper = new PdHelper(wd);
    buyHelper = new BuyHelper(wd);
    productHelper = new ProductHelper(wd);
    catalogHelper = new CatalogHelper(wd);
    sessionHelper.login("2939518", "000000");
    sessionHelper.initAlfa();
  }

  public void stop() {
    wd.quit();
  }

  public SmsHelper getSmsHelper() {
    return smsHelper;
  }


  public NavigationHelper getNavigationHelper() {
    return navigationHelper;
  }

  public PdHelper getPdHelper() {
    return pdHelper;
  }

  public BuyHelper getBuyHelper() {
    return buyHelper;
  }

  public ProductHelper getProductHelper() {
    return productHelper;
  }

  public SessionHelper getSessionHelper() {
    return sessionHelper;
  }

  public CatalogHelper getCatalogHelper() {
    return catalogHelper;
  }

}
