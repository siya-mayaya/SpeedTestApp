
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class SpeedTestAppSetMethods
{
    public static void EnterText(WebDriver driver, String element, String value, String elementType)
    {
        if(elementType == "id")
        {
            driver.findElement(By.id(element)).sendKeys(value);
        }
        else if(elementType == "name")
        {
            driver.findElement(By.name(element)).sendKeys(value);
        }
        else if(elementType == "xpath")
        {
            driver.findElement(By.xpath(element)).sendKeys(value);
        }
    }

    //Find Radio buttons/Text boxes
    public static void Click(WebDriver driver, String element, String elementType)
    {
        if(elementType == "id")
        {
            driver.findElement(By.id(element)).click();
        }
        else if (elementType == "name")
        {
            driver.findElement(By.name(element)).click();
        }
        else if(elementType == "xpath")
        {
            driver.findElement(By.xpath(element)).click();
        }
    }

    public static void SelectDropDowns(WebDriver driver, String element, String value, String elementType)
    {
        if(elementType == "id")
        {
            Select DDL = new Select(driver.findElement(By.id(element)));
            DDL.selectByVisibleText(value);
        }
        else if (elementType == "name")
        {
            Select DDL = new Select(driver.findElement(By.name(element)));
            DDL.selectByVisibleText(value);
        }
        else if(elementType == "xpath")
        {
            Select DDL = new Select(driver.findElement(By.xpath(element)));
            DDL.selectByVisibleText(value);
        }
    }
}

