package groupProject;

public interface Task4 {
     /*
    Provide Implementation for the diagram below. Then create a test class in which you need to
    create Objects of ChromeDriver, FirefoxDrive and SafariDriver classes and see which methods available to them.
     */
     public static void main(String[] args) {
         RemoteWebDriver cd=new ChromeDriver();
         cd.open();
         cd.close();
         cd.getTitle();
         cd.navigate();

         RemoteWebDriver fd=new FirefoxDriver();
         fd.open();
         fd.close();
         fd.getTitle();
         fd.navigate();

         RemoteWebDriver sd=new SafariDriver();
         sd.open();
         sd.close();
         sd.getTitle();
         sd.navigate();
     }
}
interface WebDriver{
    void open();
    void close();
    String getTitle();
}
interface RemoteWebDriver extends WebDriver{
    void navigate();
}
interface TakeScreenshot extends RemoteWebDriver{

    void getScreenshot();
}
class ChromeDriver implements RemoteWebDriver{

    @Override
    public void open() {
        System.out.println("Opening Chrome");
    }

    @Override
    public void close() {
        System.out.println("Closing Chrome");
    }

    @Override
    public String getTitle() {
        return "getting title from the ChromeBrowser";
    }

    @Override
    public void navigate() {
        System.out.println("Navigate to the URL from the ChromeBrowser");
    }
}
class FirefoxDriver implements RemoteWebDriver{

    @Override
    public void open() {
        System.out.println("Opening Firefox");
    }

    @Override
    public void close() {
        System.out.println("Closing Firefox");
    }

    @Override
    public String getTitle() {
        return"getting title from the FirefoxBrowser";
    }

    @Override
    public void navigate() {
        System.out.println("Navigate to the URL from the FirefoxBrowser");
    }
}
class SafariDriver implements RemoteWebDriver{

    @Override
    public void open() {
        System.out.println("Opening Safari");
    }

    @Override
    public void close() {
        System.out.println("Closing Safari");
    }

    @Override
    public String getTitle() {
        return "getting title from the SafariBrowser";
    }

    @Override
    public void navigate() {
        System.out.println("Navigate to the URL from the SafariBrowser");
    }
}
