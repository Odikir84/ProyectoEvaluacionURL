package steps;

import io.cucumber.java.en.*;
import pages.ValidaLoginPassVacioPage;


public class ValidaLoginPassVacio {
    
    ValidaLoginPassVacioPage login2 = new ValidaLoginPassVacioPage();

    @Given("El usuario accede a  página de inicio para Login")
    public void abrirPaginaRegistro() {
        login2.abrirPagina();   
    }

    @When("ingreso de CORREO de inicio {string}")
    public void ingresarDatos(String email) throws InterruptedException {
        login2.ingresarDatos(email);
    }

    @And("No ingreso NINGUNA contraseña {string}")
    public void ingresarpassword(String password) throws InterruptedException {
        login2.ingresarpassword(password);
    }
    
    @Then("presionar el botón de ingreso a sistema pass y recibir mensaje de alerta para COMPLETAR campo")
    public void clickIngresar() {
        login2.clickIngresar();
    }

}