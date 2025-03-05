package steps;



import java.util.List;
import org.junit.Assert;


import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.*;
import pages.ValidaOrderTaskPriorPage;


public class ValidaOrderTaskPriorStep {
    WebDriver driver;
    
    
    ValidaOrderTaskPriorPage validorderpri = new ValidaOrderTaskPriorPage();

    @Given("El usuario AUTENTICA para ingreso de PAGINA")
    public void abrirPaginaRegistro() {
        validorderpri.abrirPagina();   
    }

    @When("ingreso de email de inicio para AUTENTICACION {string}")
    public void ingresarDatos(String email) throws InterruptedException {
        validorderpri.ingresarDatos(email);
    }

    @And("ingreso de contraseña usuario para AUTENTICACION {string}")
    public void ingresarpassword(String password) throws InterruptedException {
        validorderpri.ingresarpassword(password);
    }
    
    @And("presionar el botón de ingreso para AUTENTICACION de usuario")
    public void clickIngresar() {
        validorderpri.clickIngresar();
        
    }

    @And("presionar el botón Home para DESPLIEGUE de tareas")
    public void clickHome() throws InterruptedException {
        Thread.sleep(1500);
        validorderpri.clickHome();
    }

    @Then("VALIDA orden de tareas por prioridad")
    public void clickTitle() throws InterruptedException {
        Thread.sleep(1500);
        validorderpri.clickTitle();

    // Obtener la lista de prioridades después de ordenar
    List<Integer> prioridades = validorderpri.obtenerPrioridadesNumericas();

    // Validar que la lista está ordenada en orden ascendente
    Assert.assertTrue("Las tareas no están ordenadas correctamente por prioridad", estaOrdenadaPorPrioridad(prioridades));
}

private boolean estaOrdenadaPorPrioridad(List<Integer> prioridades) {
    for (int i = 0; i < prioridades.size() - 1; i++) {
        if (prioridades.get(i) > prioridades.get(i + 1)) {
            return false; // No está ordenado correctamente
        }
    }
    return true;
    }

}