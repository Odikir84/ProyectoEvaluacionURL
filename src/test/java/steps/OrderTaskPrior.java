package steps;


import io.cucumber.java.en.*;
import pages.OrderTaskPriorPage;


public class OrderTaskPrior {

    
    OrderTaskPriorPage orderpri = new OrderTaskPriorPage();

    @Given("El usuario accede a sesion para ingreso prioritario")
    public void abrirPaginaRegistro() {
        orderpri.abrirPagina();   
    }

    @When("ingreso de email de inicio para tarea a prioritaria {string}")
    public void ingresarDatos(String email) throws InterruptedException {
        orderpri.ingresarDatos(email);
    }

    @And("ingreso de contraseña usuario para tarea prioritaria {string}")
    public void ingresarpassword(String password) throws InterruptedException {
        orderpri.ingresarpassword(password);
    }
    
    @And("presionar el botón de ingreso para login orden prioritario")
    public void clickIngresar() {
        orderpri.clickIngresar();
        
    }

    @And("presionar el botón Home para lista de tareas prioritarias")
    public void clickHome() throws InterruptedException {
        Thread.sleep(1500);
        orderpri.clickHome();
    }

    @Then("ordenar tareas por prioridad")
    public void clickTitle() throws InterruptedException {
        Thread.sleep(1500);
        orderpri.clickTitle();
    }
    

}