package steps;


import io.cucumber.java.en.*;
import pages.ValidarModificarDatoPage;


public class ValidarModificarDatoStep {

    

    ValidarModificarDatoPage validmodified = new ValidarModificarDatoPage();

    @Given("Que estoy autenticando en página de inicio para edicion de usuario")
    public void abrirPaginaRegistro() {
        validmodified.abrirPagina();   
    }

    @When("ingreso de email de INICIO {string}")
    public void ingresarDatosMod(String email) throws InterruptedException {
        validmodified.ingresarDatos(email);
    }

    @And("ingreso de contraseña USUARIO {string}")
    public void ingresarpassword(String password) throws InterruptedException {
        validmodified.ingresarpassword(password);
    }
    
    @And("presionar el botón ingresar para EDICION")
    public void botonIngresarlogin() {
        validmodified.botonIngresarlogin();
    }

    @And("ingresar a seccion PERFIL")
    public void clickPerfil() {
        validmodified.clickPerfil();
    }

    @And("edicion de datos de usuario al hacer CLICK en editar datos usuario")
    public void clickEditar() {
        validmodified.clickEditar();
    }

   
    @And("no se ingresan Nombre {string}, apellido {string}, email {string}")
    public void ingresarDatos2(String nombre, String apellido, String email) throws InterruptedException {
        validmodified.ingresarDatos2(nombre, apellido, email);

    }

    @Then("presiona el botón modificar usuario para finalizar edicion")
    public void clickModificar() {
        validmodified.clickModificar();
}

}