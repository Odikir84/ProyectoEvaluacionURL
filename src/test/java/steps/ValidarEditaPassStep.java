package steps;


import io.cucumber.java.en.*;
import pages.ValidarEditaPassPage;


public class ValidarEditaPassStep {

    

    ValidarEditaPassPage ValidEditPass = new ValidarEditaPassPage();

    @Given("Que estoy autenticando en página de inicio para CAMBIO de contrasenia")
    public void abrirPaginaRegistro() {
        ValidEditPass.abrirPagina();   
    }

    @When("ingreso de CORREO de INICIO autenticacion {string}")
    public void ingresarDatosMod(String email) throws InterruptedException {
        ValidEditPass.ingresarDatos(email);
    }

    @And("ingreso de CONTRASENIA usuario autenticacion {string}")
    public void ingresarpassword(String password) throws InterruptedException {
        ValidEditPass.ingresarpassword(password);
    }
    
    @And("presionar el botón ingresar para ingreso a SESION")
    public void botonIngresarlogin() {
        ValidEditPass.botonIngresarlogin();
    }

    @And("ingreso y HAGO click en seccion PERFIL")
    public void clickPerfil() {
        ValidEditPass.clickPerfil();
    }

    @And("hago click en boton para CAMBIAR CONTRASENIA")
    public void clickCambioPass() {
        ValidEditPass.clickCambioPass();
    }

    
    @And("se deja campo vacio en CONTRASENIA {string} y vacio en REPITE contrasenia {string}")
    public void ingresarpassword(String password, String repeatPassword) throws InterruptedException {
        ValidEditPass.ingresarpassword(password, repeatPassword);
    }


    @Then("Hago click en botón CAMBIAR CONTRASENIA")
    public void clickCambiarPass() {
        ValidEditPass.clickCambiarPass();
    }

}