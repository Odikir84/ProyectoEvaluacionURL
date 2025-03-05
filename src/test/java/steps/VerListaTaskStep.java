package steps;


import io.cucumber.java.en.*;
import pages.VerListaTaskPage;


public class VerListaTaskStep {

    
    VerListaTaskPage listar = new VerListaTaskPage();

    @Given("El usuario accede a la página de sesion para ingreso a listar")
    public void abrirPaginaRegistro() {
        listar.abrirPagina();   
    }

    @When("ingreso de email de inicio para tarea a listar {string}")
    public void ingresarDatos(String email) throws InterruptedException {
        listar.ingresarDatos(email);
    }

    @And("ingreso de contraseña usuario para tarea a listar {string}")
    public void ingresarpassword(String password) throws InterruptedException {
        listar.ingresarpassword(password);
    }
    
    @And("presionar el botón de ingreso para login listar")
    public void clickIngresar() {
        listar.clickIngresar();
        
    }

    @And("presionar el botón Home para lista de tareas")
    public void clickHome() throws InterruptedException {
        Thread.sleep(1500);
        listar.clickHome();
        
    }

    

}