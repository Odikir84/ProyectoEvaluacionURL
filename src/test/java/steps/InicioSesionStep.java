package steps;

import io.cucumber.java.en.*;
import pages.InicioSesionPage;


public class InicioSesionStep {
    
    InicioSesionPage register = new InicioSesionPage();

    @Given("El usuario accede a la página de inicio para inicio de sesion")
    public void abrirPaginaRegistro() {
        register.abrirPagina();   
    }

    @When("ingreso de email {string}")
    public void ingresarDatos(String email) throws InterruptedException {
        register.ingresarDatos(email);
    }

    @And("ingreso de contraseña {string}")
    public void ingresarpassword(String password) throws InterruptedException {
        register.ingresarpassword(password);
    }
    
    @Then("presionar el botón ingresar")
    public void clickIngresar() {
        register.clickIngresar();
    }

}
