package pages;

import org.openqa.selenium.By;
import runner.RunCucumberTest;
import support.Utils;


public class LoginPage extends RunCucumberTest{

    private By campo_email = By.id("email_create");
    private By botao_criar_conta = By.id("SubmitCreate");

    public void acessarTelaLogin(){
        getDriver().get("http://automationpractice.com/index.php?controller=authentication&back=my-account");
        Utils.esperarElementoEstarPresente(campo_email, 4);
    }
    public  void preencherCampoEmail(){
        getDriver().findElement(campo_email).sendKeys(Utils.gerarEmailAleatorio());

    }
    public void clicarBotaoCriarConta(){
        getDriver().findElement(botao_criar_conta).click();
    }
}
