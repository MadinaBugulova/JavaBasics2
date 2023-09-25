package Class21;

public abstract class WebDriver {

   abstract void openBrowser();
   abstract void loadURL(String url);
   abstract void performTesting();
   abstract void close();
}
class ChromeDriver extends WebDriver{


    @Override
    void openBrowser() {
        System.out.println("Opening the google chrome browser");

    }

    @Override
    void loadURL(String url) {
        System.out.println("Loading the URL "+url);

    }

    @Override
    void performTesting() {
        System.out.println("performing Testing");

    }

    @Override
    void close() {
        System.out.println("Closing the chrome browser");

    }
}
class FireFoxDriver extends WebDriver{

    @Override
    void openBrowser() {
        System.out.println("Opening the FireFox Browser");

    }

    @Override
    void loadURL(String url) {
        System.out.println("Loading the URL in FireFox "+url);

    }

    @Override
    void performTesting() {
        System.out.println("Performing testing on FireFox");

    }

    @Override
    void close() {
        System.out.println("Closing the browser");

    }
}
