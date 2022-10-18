package class21;

public class Browser {
    void openBrowser(){
        System.out.println("Opening a Browser");
    }
    void navigate(){
        System.out.println("opening the url");
    }
    void test(){
        System.out.println("Testing the webpage");
    }
    void closeBrowser(){
        System.out.println("closing the browser");
    }
}
class Chrome extends Browser{
    void openBrowser(){
        System.out.println("opening the browser in less than 1 second");
    }
}
class FireFox extends Browser{
    void openBrowser(){
        System.out.println("opening the browser in less than 2 seconds");
    }
}
class BrowserTester{
    public static void main(String[] args) {
        Chrome c=new Chrome();
        c.openBrowser();
        c.closeBrowser();
    }
}