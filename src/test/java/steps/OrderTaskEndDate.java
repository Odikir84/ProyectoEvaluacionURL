package steps;


import io.cucumber.java.en.*;
import pages.OrderTaskEndDatePage;


public class OrderTaskEndDate {

    
    OrderTaskEndDatePage orderEnd = new OrderTaskEndDatePage();

    @Given("El usuario accede a sesion para ingreso fecha")
    public void abrirPaginaRegistro() {
        orderEnd.abrirPagina();   
    }

    @When("ingreso de email de inicio para tarea fecha {string}")
    public void ingresarDatos(String email) throws InterruptedException {
        orderEnd.ingresarDatos(email);
    }

    @And("ingreso de contraseña usuario para tarea fecha {string}")
    public void ingresarpassword(String password) throws InterruptedException {
        orderEnd.ingresarpassword(password);
    }
    
    @And("presionar el botón de ingreso para login orden fecha")
    public void clickIngresar() {
        orderEnd.clickIngresar();
        
    }

    @And("presionar el botón Home para lista de tareas fecha")
    public void clickHome() throws InterruptedException {
        Thread.sleep(1500);
        orderEnd.clickHome();
    }

    @Then("ordenar tareas por fecha termino")
    public void clickTitle() throws InterruptedException {
        Thread.sleep(1500);
        orderEnd.clickTitle();
    }
    

}