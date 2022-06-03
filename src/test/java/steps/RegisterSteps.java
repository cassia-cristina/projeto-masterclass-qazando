package steps;

import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Entao;
import org.junit.Assert;
import pages.RegisterPage;
import runner.RunBase;

public class RegisterSteps extends RunBase {
    RegisterPage registerPage;

    public RegisterSteps() {
        registerPage = new RegisterPage();
    }

    @E("clico em cadastrar")
    public void clicoEmCadastrar() {
        registerPage.clickInToRegister();
    }

    @Entao("vejo mensagem de campo nome nao preenchido")
    public void vejoMensagemDeCampoNomeNaoPreenchido() {
        String message = registerPage.returnMsgNameIsNull();
        Assert.assertEquals("O campo nome deve ser prenchido", message);
    }

}