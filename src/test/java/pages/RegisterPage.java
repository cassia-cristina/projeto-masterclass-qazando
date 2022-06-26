package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import runner.Driver;

public class RegisterPage extends Driver {

    @FindBy(id = "btnRegister")
    private WebElement btnRegister;

    @FindBy(id = "errorMessageFirstName")
    private WebElement alertNameIsNull;

    public RegisterPage() {
        PageFactory.initElements(getDriver(), this);
    }

    public void clickInToRegister() {
        btnRegister.click();
    }

    public String returnMsgNameIsNull() {
        return alertNameIsNull.getText();
    }
}
