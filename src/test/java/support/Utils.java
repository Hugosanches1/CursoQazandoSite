package support;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import runner.RunCucumberTest;

import java.util.Random;

public class Utils extends RunCucumberTest {
    public static void esperarElementoEstarPresente(By elemento, int tempo){
        WebDriverWait wait = new WebDriverWait(getDriver(), tempo);
        wait.until(ExpectedConditions.elementToBeClickable(elemento));
    }

    public static String gerarEmailAleatorio(){
        String inicio = "hugosanches_";
        String fim = "@gmail.com";

        Random randon = new Random();
        int min = 1;
        int max = 9999;
        int resultado = randon.nextInt(max-min) + min;

        return inicio + resultado + fim;
    }
}
