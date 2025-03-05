package steps;


import io.cucumber.java.en.*;
import pages.ValidarRegistroUsuarioPage;

public class ValidarRegistroUsuarioSteps {
    
    ValidarRegistroUsuarioPage Validregister = new ValidarRegistroUsuarioPage();

    @Given("El usuario accede a la página de REGISTRO")
    public void abrirPaginaRegistro() {
        Validregister.abrirPagina();   
    }

    @When("Hace clic en el BOTON \"Crear nuevo Usuario\"")
    public void clickCrearUsuario() {
        Validregister.clickCrearUsuario();
    }

    @And("No se ingresan datos nombre {string}, apellido {string}, email {string}")
    public void ingresarDatos(String nombre, String apellido, String email) throws InterruptedException {
        Validregister.ingresarDatos(nombre, apellido, email);
    }
    

    @And("No se ingresa contraseña {string} y no se confirma {string}")
    public void ingresarContrasena(String password, String confirmPassword) throws InterruptedException {
        Validregister.ingresarpassword(password, confirmPassword);
    }
    
    @Then("Presiona el BOTON \"Registrar Usuario\"")
    public void clickRegistrarse() {
        Validregister.clickRegistrarse();
    }

}