import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExecuteMethods
{
    public static void main(String[] args)
    {
        String path = "C:\\Users\\sndlovu\\Downloads\\chromedriver_win32\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver",path);
        WebDriver driver = new ChromeDriver();

        SpeedTest speedTest = new SpeedTest();

        speedTest.Initialize(driver);
        speedTest.RunSpeedTest(driver);
        speedTest.getSpeeds(driver);
    }
}


