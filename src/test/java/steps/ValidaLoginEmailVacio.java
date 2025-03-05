package steps;

import io.cucumber.java.en.*;
import pages.ValidaLoginEmailVacioPage;


public class ValidaLoginEmailVacio {
    
    ValidaLoginEmailVacioPage login = new ValidaLoginEmailVacioPage();

    @Given("El usuario accede a la página de inicio para login en sistema")
    public void abrirPaginaRegistro() {
        login.abrirPagina();   
    }

    @When("No ingreso NINGUN email {string}")
    public void ingresarDatos(String email) throws InterruptedException {
        login.ingresarDatos(email);
    }
    
    @Then("presionar el botón ingresar a sistema y recibir mensaje de alerta para completar campo")
    public void clickIngresar() {
        login.clickIngresar();
    }

}