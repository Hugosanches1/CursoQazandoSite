package steps;

import cucumber.api.java.pt.Dado;
import pages.LoginPage;
import runner.RunCucumberTest;

public class LoginSteps extends RunCucumberTest {

    LoginPage loginPage = new LoginPage();

    @Dado("^que estou na tela de login$")
    public void que_estou_na_tela_de_login() throws Throwable {
        loginPage.acessarTelaLogin();
    }

    @Dado("^acesso o cadastro de usuario$")
    public void acesso_o_cadastro_de_usuario() throws Throwable {
        loginPage.preencherCampoEmail();
        loginPage.clicarBotaoCriarConta();
    }
}
