package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import runner.RunCucumberTest;
import support.Utils;

public class CadastroPage extends RunCucumberTest {

    private By title1 = By.id("id_gender1");
    private By title2 = By.id("id_gender2");
    private By first_name = By.id("customer_firstname");
    private By last_name = By.id("customer_lastname");
    private By password = By.id("passwd");
    private By diasNascimento = By.id("days");
    private By mesNascimento = By.id("months");
    private By anoNascimento = By.id("years");
    private By endereco = By.id("address1");
    private By cidade = By.id("city");
    private By estado = By.id("id_state");
    private By codigoPostal = By.id("postcode");
    private By telefoneMovel = By.id("phone_mobile");
    private By botaoSubmit = By.id("submitAccount");


    public void selecionarTitle(int tipo){
        Utils.esperarElementoEstarPresente(title1,6);
        if (tipo == 1){
            getDriver().findElement(title1).click();
        }else {
            getDriver().findElement(title2).click();
        }
    }
    public void preencherNome(String nome){
        getDriver().findElement(first_name).sendKeys(nome);
    }

    public void preencherSobreNome(String sobreNome){
        getDriver().findElement(last_name).sendKeys(sobreNome);
    }

    public void preencherPassword(String senha){
        getDriver().findElement(password).sendKeys(senha);
    }

    public void selecionarDataNascimento(String dia, int mes, String ano){
        //Select selectDia = new Select(driver.findElement(diasNascimento));
        //selectDia.selectByVisibleText(dia);
        getDriver().findElement(diasNascimento).click();
        getDriver().findElement(By.xpath("//select[@id='days']/option[contains(.,'"+dia+"')]")).click();


        Select selectMes = new Select(getDriver().findElement(mesNascimento));
        selectMes.selectByIndex(mes);

        Select selectAno = new Select(getDriver().findElement(anoNascimento));
        selectAno.selectByValue(ano);
    }

    public void preencherEndereco(String end){
        getDriver().findElement(endereco).sendKeys(end);
    }

    public void preencherCidade(String cid){
        getDriver().findElement(cidade).sendKeys(cid);
    }

    public void selecionarEstado(String est){
        Select selectEstado = new Select(getDriver().findElement(estado));
        selectEstado.selectByVisibleText(est);
    }

    public void preencherCodigoPostal(String cod){
        getDriver().findElement(codigoPostal).sendKeys(cod);
    }

    public void preencherTelefone(String tel){
        getDriver().findElement(telefoneMovel).sendKeys(tel);
    }

    public void clicarBotaoRegistrar(){
        getDriver().findElement(botaoSubmit).click();
    }

    public void validaCadastro(String nome, String sobrenome){
        Utils.esperarElementoEstarPresente(By.xpath("//a[@title='View my customer account']"),6);
        Assert.assertEquals(nome + " " + sobrenome, getDriver().findElement(By.xpath("//a[@title='View my customer account']")).getText());
    }

}
