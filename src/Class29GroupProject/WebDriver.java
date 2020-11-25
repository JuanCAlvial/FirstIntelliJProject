package Class29GroupProject;

import java.util.ArrayList;

public interface WebDriver {
    void open();
    void close();
    String getTitle();
}
interface TakesScreenshot {
    void getScreenshot();
}
interface RemoteWebDriver extends WebDriver, TakesScreenshot {
    void navigate();

}

class SafariDriver implements RemoteWebDriver {
    final static String TITLE = "Safari";
    @Override
    public void navigate() {
        System.out.println("Navigating on Safari");
    }
    @Override
    public void getScreenshot() {
        System.out.println("Screenshotting on Safari");
    }
    @Override
    public void open() {
        System.out.println("Opening on Safari");
    }
    @Override
    public void close() {
        System.out.println("Closing on Safari");
    }
    @Override
    public String getTitle() {
        return TITLE;
    }
}
class ChromeDriver implements RemoteWebDriver {
    final static String TITLE = "Chrome";
    @Override
    public void navigate() {
        System.out.println("Navigating on Chrome");
    }
    @Override
    public void getScreenshot() {
        System.out.println("Screenshotting on Chrome");
    }
    @Override
    public void open() {
        System.out.println("Opening on Chrome");
    }
    @Override
    public void close() {
        System.out.println("Closing on Chrome");
    }
    @Override
    public String getTitle() {
        return TITLE;
    }
}
class FirefoxDriver implements RemoteWebDriver {
    final static String TITLE = "Firefox";
    @Override
    public void navigate() {
        System.out.println("Navigating on Firefox");
    }
    @Override
    public void getScreenshot() {
        System.out.println("Screenshotting on Firefox");
    }
    @Override
    public void open() {
        System.out.println("Opening on Firefox");
    }
    @Override
    public void close() {
        System.out.println("Closing on Firefox");
    }
    @Override
    public String getTitle() {
        return TITLE;
    }
}

class MainDriver {
    public static void main(String[] args) {
        RemoteWebDriver chrome = new ChromeDriver();
        RemoteWebDriver safari = new SafariDriver();
        RemoteWebDriver firefox = new FirefoxDriver();
        ArrayList<RemoteWebDriver> listOfDrivers = new ArrayList<RemoteWebDriver>();
        listOfDrivers.add(chrome);
        listOfDrivers.add(safari);
        listOfDrivers.add(firefox);
        for (RemoteWebDriver driver : listOfDrivers) {
            System.out.println(driver.getTitle());
            System.out.println();
            driver.close();
            driver.getTitle();
            driver.open();
            driver.navigate();
            driver.getScreenshot();
            System.out.println();
        }
    }
}

