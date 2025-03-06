package steps;

import io.cucumber.java.en.*;
import pages.ValidarEditaUserPage;


public class ValidarEditaUserStep {
    
    ValidarEditaUserPage ValidEditUser = new ValidarEditaUserPage();

    @Given("usuario accede a la página para INICIO de sesion para validacion de usuario")
    public void abrirPaginaRegistro() {
        ValidEditUser.abrirPagina();   
    }

    @When("ingreso de EMAIL de inicio para validacion {string}")
    public void ingresarDatosMod(String email) throws InterruptedException {
        ValidEditUser.ingresarDatos(email);
    }

    @And("ingreso de contrasenia usuario VALIDACION {string}")
    public void ingresarpassword(String password) throws InterruptedException {
        ValidEditUser.ingresarpassword(password);
    }
    
    @And("se presiona el botón ingresar para CAMBIOS")
    public void botonIngresarlogin() {
        ValidEditUser.botonIngresarlogin();
    }

    @And("ingresar a seccion PERFIL para validacion")
    public void clickPerfil() {
        ValidEditUser.clickPerfil();
    }

    @And("edicion de DATOS de usuario en BOTON editar")
    public void clickEditar() {
        ValidEditUser.clickEditar();
    }

    @And("no se Ingresa nada en Nombre {string}, apellido {string}, email {string}")
    public void ingresarDatos2(String nombre, String apellido, String email) throws InterruptedException {
        ValidEditUser.ingresarDatos2(nombre, apellido, email);

}

    @Then("presiona el botón modificar usuario para termino de validacion")
    public void clickModificar() {
        ValidEditUser.clickModificar();
}

}