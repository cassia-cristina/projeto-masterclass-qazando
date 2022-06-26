package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import runner.Driver;
import runner.Util;

import java.io.IOException;

public class LoginPage {

    private Util util;

    @FindBy(css = ".right_list_fix > li > a > .fa-user")
    private WebElement clickLogin;

    @FindBy(id = "user")
    private WebElement inputUser;

    @FindBy(id = "password")
    private WebElement inputPassword;

    @FindBy(id = "btnLogin")
    private WebElement btnLogin;

    @FindBy(id = "swal2-title")
    private WebElement msgSucess;

    @FindBy(className = "invalid_input")
    private WebElement msgError;

    @FindBy(css = ".right_list_fix li:nth-child(2) > a")
    private WebElement btnRegister;

    @FindBy(css = "button.swal2-confirm")
    private WebElement btnConfirm;

    public LoginPage() throws IOException {
        util= new Util();
        PageFactory.initElements(Driver.getDriver(), this);
    }

    public void openApp() throws IOException {
        Driver.getDriver().get(util.getProperty("site_url"));
    }

    public void openLogin() {
        clickLogin.click();
    }

    public void fillUsername(String username) {
        inputUser.sendKeys(username);
    }

    public void fillPassword(String password) {
        inputPassword.sendKeys(password);
    }

    public void clickInLogin() {
        btnLogin.click();
    }

    public void clickBtnOk() {
        btnConfirm.click();
    }

    public void clickInRegister() {
        btnRegister.click();
    }

    public String returnMsgSucess() {
        return msgSucess.getText();
    }

    public String returnMsgError() {
        return msgError.getText();
    }
}