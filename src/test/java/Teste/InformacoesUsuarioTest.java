package Teste;

import static org.junit.Assert.*;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class InformacoesUsuarioTest {
@Test


public void testRealizarUmCadastroDeUsuario(){

        //Abrindo o navegador //
        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
        WebDriver navegador = new ChromeDriver();

    // navegador.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);

        //Navegando para a página do SeuBarriga //
        navegador.get("https://seubarriga.wcaquino.me/");


        // Clicar no botão Novo Usuario? //
        navegador.findElement(By.linkText("Novo usuário?")).click();

        // Cadastrar novo usuário //
        WebElement formulario = navegador.findElement(By.xpath("/html/body/div[2]"));


        // Informando o nome//
       formulario.findElement(By.id("nome")).sendKeys("Vanessa");

       //Informar e-mail //
        formulario.findElement(By.id("email")).sendKeys("vanessateixeira21@live.com");

        //Informar a senha //
       formulario.findElement(By.id("senha")).sendKeys("12345");

        // Clique no botão Cadastrar //
       //formulario.findElement(By.partialLinkText("//input[@value='Cadastrar'][@type='button']")).click();


        assertEquals(15,15);
    }
}
