package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DialogContent {

    @FindBy(css = "")
    public WebElement username;

    @FindBy(css = "")
    public WebElement password;

    @FindBy(css = "")
    public WebElement loginButton;
}
