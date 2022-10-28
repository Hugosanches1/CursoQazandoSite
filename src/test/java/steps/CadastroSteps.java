package steps;

import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;
import pages.CadastroPage;
import runner.RunCucumberTest;

public class CadastroSteps extends RunCucumberTest {

    CadastroPage cadPage = new CadastroPage();

    @Quando("^eu preencho o formulario de cadastro$")
    public void eu_preencho_o_formulario_de_cadastro() throws Throwable {
        cadPage.selecionarTitle(1);
        cadPage.preencherNome("Hugosanches");
        cadPage.preencherSobreNome("Correia");
        cadPage.preencherPassword("123456");
        cadPage.selecionarDataNascimento("25",10,"2022");
        cadPage.preencherEndereco("Rua do teste");
        cadPage.preencherCidade("Florianopolis");
        cadPage.selecionarEstado("Colorado");
        cadPage.preencherCodigoPostal("54879");
        cadPage.preencherTelefone("+5501561987875845");

    }

    @Quando("^clico em registrar$")
    public void clico_em_registrar() throws Throwable {
        cadPage.clicarBotaoRegistrar();
    }

    @Entao("^vejo cadastro realizado com sucesso$")
    public void vejo_cadastro_realizado_com_sucesso() throws Throwable {
        cadPage.validaCadastro("Hugosanches", "Correia");
    }




}
