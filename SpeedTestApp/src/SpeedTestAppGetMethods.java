
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SpeedTestAppGetMethods
{
    public static String GetText(WebDriver driver, String element, String elementType)
    {
        if(elementType == "id")
        {
            return driver.findElement(By.id(element)).getAttribute("value");
        }
        else if(elementType == "name")
        {
            return driver.findElement(By.name(element)).getAttribute("value");
        }
        else if(elementType == "xpath")
        {
            return driver.findElement(By.xpath(element)).getAttribute("value");
        }
        else if(elementType == "className")
        {
            return driver.findElement(By.className(element)).getAttribute("value");
        }
        else
        {
            return "";
        }
    }


}