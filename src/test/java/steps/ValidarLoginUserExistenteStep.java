package steps;

import io.cucumber.java.en.*;
import pages.ValidarLoginUserExistentePage;


public class ValidarLoginUserExistenteStep {
    
    ValidarLoginUserExistentePage ValidLog = new ValidarLoginUserExistentePage();

    @Given("usuario inexistente accede a la página de inicio para inicio de sesion")
    public void abrirPaginaRegistro() {
        ValidLog.abrirPagina();   
    }

    @When("ingreso de email inexistente {string}")
    public void ingresarDatos(String email) throws InterruptedException {
        ValidLog.ingresarDatos(email);
    }

    @And("ingreso de contraseña inexistente {string}")
    public void ingresarpassword(String password) throws InterruptedException {
        ValidLog.ingresarpassword(password);
    }
    
    @Then("presionar el botón ingresar y recibir mensaje de alerta")
    public void clickIngresar() {
        ValidLog.clickIngresar();
    }

}
