package steps;


import io.cucumber.java.en.*;
import pages.ValidarCrearTareaPage;


public class ValidarCrearTareaStep {

    
    ValidarCrearTareaPage validcreate = new ValidarCrearTareaPage();

    @Given("El usuario valida acceso de sesion para ingreso")
    public void abrirPaginaRegistro() {
        validcreate.abrirPagina();   
    }

    @When("ingreso de email de inicio para VALIDACION {string}")
    public void ingresarDatos(String email) throws InterruptedException {
        validcreate.ingresarDatos(email);
    }

    @And("ingreso de contraseña usuario para VALIDACION {string}")
    public void ingresarpassword(String password) throws InterruptedException {
        validcreate.ingresarpassword(password);
    }
    
    @And("presionar el botón de ingreso para VALIDACION")
    public void clickIngresar() {
        validcreate.clickIngresar();
        
    }

    @And("presiono el botón HOME")
    public void clickHome() throws InterruptedException {
        Thread.sleep(1500);
        validcreate.clickHome();
        
    }

    @And("presiono botón NUEVA TAREA")
    public void ibotonIngresarTask() {
        validcreate.botonIngresarTask();
    }

    @And("no ingreso nada en titulo de tarea {string}")
    public void ingresarTitulo(String descrip) throws InterruptedException {
        validcreate.ingresarTitulo(descrip);
    }

    @And("no agrego nada en descripcion de tarea {string}")
    public void ingresarDesc(String descrip) throws InterruptedException {
        validcreate.ingresarDesc(descrip);
    }

    @And("no ingreso nada en fecha termino de tarea")
    public void EnterExpirationDate() throws InterruptedException{
        validcreate.enterExpirationDate("");
        
    }
    
    @And("no indico prioridad de TAREA {string}")
    public void ingresarPriori(String Priori) throws InterruptedException {
        validcreate.ingresarPriori(Priori);
    } 

    @Then("HAGO click y finalizo en boton CREAR TAREA")
    public void botonCrearTarea() throws InterruptedException {
        Thread.sleep(1000);
        validcreate.botonCrearTarea();
    }

}