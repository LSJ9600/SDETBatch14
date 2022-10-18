package class23;

public interface Hw2 {
     /*
    Create a WebDriver Interface that will have the following unimplemented behaviour:
    openBrowser(), closeBrowser(), maximizeWindow(), findElement(). Create 2 classes that implements
    WebDriver interface: ChromeDriver and FirefoxDriver.
     */

    public static void main(String[] args) {
        WebDriver cd=new ChromeDriver();
        cd.openBrowser();
        cd.closeBrowser();
        cd.maximizeWindow();
        cd.findElement();
        System.out.println("================");
        WebDriver fd=new FirefoxDriver();
        fd.openBrowser();
        fd.closeBrowser();
        fd.maximizeWindow();
        fd.findElement();
    }
}
interface WebDriver{
    void openBrowser();
    void closeBrowser();
    void maximizeWindow();
    void findElement();
}
class ChromeDriver implements WebDriver{

    @Override
    public void openBrowser() {
        System.out.println("Opening the Chrome Browser");
    }

    @Override
    public void closeBrowser() {
        System.out.println("Closing the Chrome Browser");
    }

    @Override
    public void maximizeWindow() {
        System.out.println("Maximizing the Chrome Browser");
    }

    @Override
    public void findElement() {
        System.out.println("Finding the element in Chrome Browser");
    }
}

class FirefoxDriver implements WebDriver{

    @Override
    public void openBrowser() {
        System.out.println("Opening the Firefox Browser");
    }

    @Override
    public void closeBrowser() {
        System.out.println("Closing the Firefox Browser");
    }

    @Override
    public void maximizeWindow() {
        System.out.println("Maximizing the Firefox Browser");
    }

    @Override
    public void findElement() {
        System.out.println("Finding the element in Firefox Browser");
    }
}