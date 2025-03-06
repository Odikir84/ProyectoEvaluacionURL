package steps;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.junit.Assert;

import io.cucumber.java.en.*;
import pages.ValidaOrderTaskTitlePage;


public class ValidaOrderTaskTitleStep {

    
    ValidaOrderTaskTitlePage ValidOrderTitle = new ValidaOrderTaskTitlePage();

    @Given("El usuario accede a la página de SESION para ingreso y VALIDACION de titulos de tareas")
    public void abrirPaginaRegistro() {
        ValidOrderTitle.abrirPagina();   
    }

    @When("ingreso de email de inicio para validar titulo tareas {string}")
    public void ingresarDatos(String email) throws InterruptedException {
        ValidOrderTitle.ingresarDatos(email);
    }

    @And("ingreso de contraseña usuario para tarea a ordenar por TITULO {string}")
    public void ingresarpassword(String password) throws InterruptedException {
        ValidOrderTitle.ingresarpassword(password);
    }
    
    @And("presiono botón de ingreso para login y posterio validacion titulo")
    public void clickIngresar() {
        ValidOrderTitle.clickIngresar();
        
    }

    @And("presiono botón HOME para LISTAR tareas a ordenar por TITULO")
    public void clickHome() throws InterruptedException {
        Thread.sleep(1500);
        ValidOrderTitle.clickHome();
    }

    @Then("ordenar tareas por TITULO y validar orden")
    public void validarOrdenTareasPorTitulo() throws InterruptedException {
        Thread.sleep(1500);
        ValidOrderTitle.clickTitle();
    
    // Obtener la lista de títulos después de ordenar
    List<String> titulosObtenidos = ValidOrderTitle.obtenerTitulosTareas();

    // Clonar la lista y ordenarla para comparar
    List<String> titulosEsperados = new ArrayList<>(titulosObtenidos);
    Collections.sort(titulosEsperados);

    // Validar que la lista obtenida coincide con la ordenada
    Assert.assertEquals("Las tareas no están ordenadas por título", titulosEsperados, titulosObtenidos);
}
    }
    

