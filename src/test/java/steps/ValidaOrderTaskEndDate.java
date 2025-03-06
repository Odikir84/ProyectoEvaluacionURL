package steps;


import static org.junit.Assert.assertTrue;


import io.cucumber.cienvironment.internal.com.eclipsesource.json.ParseException;
import io.cucumber.java.en.*;
import pages.ValidaOrderTaskEndDatePage;


public class ValidaOrderTaskEndDate {

    
    ValidaOrderTaskEndDatePage validOrderEnd = new ValidaOrderTaskEndDatePage();

    @Given("como usuario accedo a SESION para ingreso fecha")
    public void abrirPaginaRegistro() {
        validOrderEnd.abrirPagina();   
    }

    @When("ingresar CORREO de inicio para tarea fecha {string}")
    public void ingresarDatos(String email) throws InterruptedException {
        validOrderEnd.ingresarDatos(email);
    }

    @And("ingresar de CONTRASEÑA usuario para tarea fecha {string}")
    public void ingresarpassword(String password) throws InterruptedException {
        validOrderEnd.ingresarpassword(password);
    }
    
    @And("presionar el botón de INGRESO para login orden fecha")
    public void clickIngresar() {
        validOrderEnd.clickIngresar();
        
    }

    @And("presionar el botón HOME para listar de tareas fecha")
    public void clickHome() throws InterruptedException {
        Thread.sleep(1500);
        validOrderEnd.clickHome();
    }

    @Then("ordenar tareas por fecha termino y validar orden")
    public void validarOrdenFechas() throws InterruptedException, ParseException, java.text.ParseException {
        Thread.sleep(1500);
        validOrderEnd.clickTitle();
        boolean ordenCorrecto = validOrderEnd.validarOrdenFechas();
        assertTrue("Las fechas no están ordenadas correctamente", ordenCorrecto);
    }



}    
    