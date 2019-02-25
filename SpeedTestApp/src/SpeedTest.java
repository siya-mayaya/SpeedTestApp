
import org.openqa.selenium.WebDriver;

public class SpeedTest
{

    public void Initialize(WebDriver driver)
    {
        driver.get("https://www.speedtest.net/");
        driver.manage().window().maximize();
    }

    public void RunSpeedTest(WebDriver driver)
    {
        SpeedTestAppSetMethods.Click(driver, "//*[@id=\"container\"]/div[2]/div/div/div/div[3]/div[1]/div[1]/a", "xpath");
    }

    public void getSpeeds(WebDriver driver)
    {
        SpeedTestAppGetMethods.GetText(driver, "result-data-large number result-data-value download-speed", "claaName");

    }
}
