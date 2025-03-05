package steps;


import io.cucumber.java.en.*;
import pages.RegistroUsuarioPage;

public class RegistroUsuarioSteps {
    
    RegistroUsuarioPage register = new RegistroUsuarioPage();

    @Given("El usuario accede a la página de registro")
    public void abrirPaginaRegistro() {
        register.abrirPagina();   
    }

    @When("Hace clic en el botón \"Crear nuevo Usuario\"")
    public void clickCrearUsuario() {
        register.clickCrearUsuario();
    }

    @And("Ingresa nombre {string}, apellido {string}, email {string}")
    public void ingresarDatos(String nombre, String apellido, String email) throws InterruptedException {
        register.ingresarDatos(nombre, apellido, email);
    }
    

    @And("Ingresa contraseña {string} y la confirma {string}")
    public void ingresarContrasena(String password, String confirmPassword) throws InterruptedException {
        register.ingresarpassword(password, confirmPassword);
    }
    
    @Then("Presiona el botón \"Registrar Usuario\"")
    public void clickRegistrarse() {
        register.clickRegistrarse();
    }

}