package steps;

import io.cucumber.java.en.*;
import pages.ModificarDatoPage;


public class ModificarDatoStep {
    
    ModificarDatoPage modified = new ModificarDatoPage();

    @Given("El usuario accede a la página de inicio para inicio de sesion para modificacion")
    public void abrirPaginaRegistro() {
        modified.abrirPagina();   
    }

    @When("ingreso de email de inicio {string}")
    public void ingresarDatosMod(String email) throws InterruptedException {
        modified.ingresarDatos(email);
    }

    @And("ingreso de contraseña usuario {string}")
    public void ingresarpassword(String password) throws InterruptedException {
        modified.ingresarpassword(password);
    }
    
    @And("presionar el botón ingresar para cambios")
    public void botonIngresarlogin() {
        modified.botonIngresarlogin();
    }

    @And("ingresar a seccion perfil")
    public void clickPerfil() {
        modified.clickPerfil();
    }

    @And("edicion de datos de usuario en editar datos usuario")
    public void clickEditar() {
        modified.clickEditar();
    }

    @And("Ingresa Nombre {string}, apellido {string}, email {string}")
    public void ingresarDatos2(String nombre, String apellido, String email) throws InterruptedException {
        modified.ingresarDatos2(nombre, apellido, email);

}

    @Then("presiona el botón modificar usuario")
    public void clickModificar() {
        modified.clickModificar();
}

}