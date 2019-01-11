import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;


public class Driver {

    public static WebDriver Instance;


    public static String BaseAddress() {
        return "http://www.teknosa.com/login";
    }

    public static void Initialize() {

        Instance = new ChromeDriver();
        Instance.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }

    public static void Close() {
        Instance.close();
    }
}

