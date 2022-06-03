package steps;

import io.cucumber.java.After;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import org.junit.Assert;
import pages.LoginPage;
import runner.RunBase;

import java.io.IOException;

public class LoginSteps extends RunBase {
    private LoginPage loginPage;

    public LoginSteps() {
        initDriver();
        loginPage = new LoginPage();
    }

    @After
    public void closeBrowser() {
        getDriver().quit();
    }

    @Dado("que estou na tela de login")
    public void queEstouNaTelaDeLogin() throws IOException {
        loginPage.openApp();
        loginPage.openLogin();
    }

    @Quando("preencho login {string} e senha {string}")
    public void preenchoLoginESenha(String user, String password) throws IOException {
        String username = getProperties(user);
        String pass = getProperties(password);
        loginPage.fillUsername(username);
        loginPage.fillPassword(pass);
    }

    @Quando("clico em Login")
    public void clicoEmLogin() {
        loginPage.clickInLogin();
    }

    @Entao("sou logado na aplicacao")
    public void souLogadoNaAplicacao() {
        String textLoginSucess = loginPage.returnMsgSucess();
        Assert.assertEquals("Login realizado", textLoginSucess);
    }

    @Entao("vejo a {string} de campo nao preenchido")
    public void vejoADeCampoNaoPreenchido(String message) {
        String textError = loginPage.returnMsgError();
        Assert.assertEquals(message, textError);
    }

    @Quando("preencho login {string} e senha {string} incorretamente")
    public void preenchoLoginESenhaIncorretamente(String user, String password) {
        loginPage.fillUsername(user);
        loginPage.fillPassword(password);
    }

    @Quando("acesso a tela de cadastro de usuario")
    public void acessoATelaDeCadastroDeUsuario() {
        loginPage.clickInRegister();
    }

    @Dado("que estou logado na aplicacao com user {string} e senha {string}")
    public void queEstouLogadoNaAplicacaoComUserESenha(String user, String password) throws IOException {
        loginPage.openApp();
        loginPage.openLogin();
        String username = getProperties(user);
        String pass = getProperties(password);
        loginPage.fillUsername(username);
        loginPage.fillPassword(pass);
        loginPage.clickInLogin();
        String textLoginSucess = loginPage.returnMsgSucess();
        Assert.assertEquals("Login realizado", textLoginSucess);
        loginPage.clickBtnOk();
    }
}