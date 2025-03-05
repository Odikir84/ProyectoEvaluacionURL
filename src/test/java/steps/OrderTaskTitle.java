package steps;


import io.cucumber.java.en.*;
import pages.OrderTaskTitlePage;


public class OrderTaskTitle {

    
    OrderTaskTitlePage order = new OrderTaskTitlePage();

    @Given("El usuario accede a la página de sesion para ingreso a ordenar")
    public void abrirPaginaRegistro() {
        order.abrirPagina();   
    }

    @When("ingreso de email de inicio para tarea a ordenar {string}")
    public void ingresarDatos(String email) throws InterruptedException {
        order.ingresarDatos(email);
    }

    @And("ingreso de contraseña usuario para tarea a ordenar {string}")
    public void ingresarpassword(String password) throws InterruptedException {
        order.ingresarpassword(password);
    }
    
    @And("presionar el botón de ingreso para login ordenar")
    public void clickIngresar() {
        order.clickIngresar();
        
    }

    @And("presionar el botón Home para lista de tareas a ordenar")
    public void clickHome() throws InterruptedException {
        Thread.sleep(1500);
        order.clickHome();
    }

    @Then("ordenar tareas por titulo")
    public void clickTitle() throws InterruptedException {
        Thread.sleep(1500);
        order.clickTitle();
    }
    

}