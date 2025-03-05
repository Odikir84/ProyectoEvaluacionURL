package steps;

import io.cucumber.java.en.*;
import pages.EditaPassPage;


public class EditaPassStep {
    
    EditaPassPage editpass = new EditaPassPage();

    @Given("El usuario accede a autenticar cuenta para cambio de contraseña")
    public void abrirPaginaRegistro() {
        editpass.abrirPagina();   
    }

    @When("ingreso de email de inicio cambio pass {string}")
    public void ingresarDatosMod(String email) throws InterruptedException {
        editpass.ingresarDatos(email);
    }

    @And("ingreso de contraseña usuario cambio pass {string}")
    public void ingresarpassword(String password) throws InterruptedException {
        editpass.ingresarpassword(password);
    }
    
    @And("presionar el botón ingresar para cambio pass")
    public void botonIngresarlogin() {
        editpass.botonIngresarlogin();
    }

    @And("ingresar a seccion perfil para cambio pass")
    public void clickPerfil() {
        editpass.clickPerfil();
    }

    @And("hago click en boton CAMBIAR CONTRASEÑA")
    public void clickCambioPass() {
        editpass.clickCambioPass();
    }

    
    @And("Ingresa CONTRASENIA {string} y la REPITE {string}")
    public void ingresarpassword(String password, String repeatPassword) throws InterruptedException {
        editpass.ingresarpassword(password, repeatPassword);
    }


    @Then("presiona el botón CAMBIAR CONTRASEÑA")
    public void clickCambiarPass() {
        editpass.clickCambiarPass();
    }

}