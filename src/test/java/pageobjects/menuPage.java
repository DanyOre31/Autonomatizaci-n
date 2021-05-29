package pageobjects;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import support.util;

public class menuPage extends util {
    //link Text
    @FindBy(linkText = "Generate Card Number") protected WebElement lnkGenerarTarjeta;
    //css Selector
    @FindBy(css = "#nav > a:nth-child(2)") protected WebElement cssGenerarTarjeta;
    //xpath : Podemos consultar esta pagina - https://www.guru99.com/xpath-selenium.html
    @FindBy(xpath = "//nav/a[@href='cardnumber.php']")  protected WebElement xpGenerarTarjeta;

    public menuPage() {
        PageFactory.initElements(driver, this);
    }
    public void clickGenerarTarjeta(){
        wait.until(ExpectedConditions.elementToBeClickable(xpGenerarTarjeta));
        xpGenerarTarjeta.click();
    }
}
