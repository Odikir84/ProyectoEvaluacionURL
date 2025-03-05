package steps;

import org.openqa.selenium.Keys;

import io.cucumber.java.en.*;
import pages.CrearTareaPage;


public class CrearTareaStep {

    
    CrearTareaPage create = new CrearTareaPage();

    @Given("El usuario accede a la página de sesion para ingreso")
    public void abrirPaginaRegistro() {
        create.abrirPagina();   
    }

    @When("ingreso de email de inicio para tarea {string}")
    public void ingresarDatos(String email) throws InterruptedException {
        create.ingresarDatos(email);
    }

    @And("ingreso de contraseña usuario para tarea {string}")
    public void ingresarpassword(String password) throws InterruptedException {
        create.ingresarpassword(password);
    }
    
    @And("presionar el botón de ingreso para nueva tarea")
    public void clickIngresar() {
        create.clickIngresar();
        
    }

    @And("presionar el botón Home")
    public void clickHome() throws InterruptedException {
        Thread.sleep(1500);
        create.clickHome();
        
    }

    @And("presionar el botón nueva tarea")
    public void ibotonIngresarTask() {
        create.botonIngresarTask();
    }

    @And("ingresar titulo de tarea {string}")
    public void ingresarTitulo(String descrip) throws InterruptedException {
        create.ingresarTitulo(descrip);
    }

    @And("agregar descripcion de tarea {string}")
    public void ingresarDesc(String descrip) throws InterruptedException {
        create.ingresarDesc(descrip);
    }

    @And("ingreso fecha termino de tarea")
    public void EnterExpirationDate() throws InterruptedException{
        create.enterExpirationDate("22:02:2025" + Keys.ARROW_RIGHT + "17:30");
        
    }
    
    @And("indica prioridad de tarea {string}")
    public void ingresarPriori(String Priori) throws InterruptedException {
        create.ingresarPriori(Priori);
    } 

    @Then("finaliza y crea nueva tarea")
    public void botonCrearTarea() {
        create.botonCrearTarea();
    }

}