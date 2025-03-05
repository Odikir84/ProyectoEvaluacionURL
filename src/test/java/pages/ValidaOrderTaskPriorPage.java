
package pages;


import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


public class ValidaOrderTaskPriorPage extends BasePage{
    
     

    // Localizadores
    private String inputEmail = "//input[@id='email']";  
    private String inputPassword = "//input[@id='password']";
    private String botonIngresar = "//button[@type='submit']";
    private String botonHome = "//span[normalize-space()='Home']";
    private String botonTitlePrior = "//thead/tr[1]/th[4]/span[1]";
    private String listaPrioridades = "//tbody/a[1]/td[4]";
    
    public ValidaOrderTaskPriorPage() {
        super(driver);
    }   
       
    // Método para encontrar múltiples elementos
    public List<WebElement> findElements(By locator) {
        return driver.findElements(locator);
    }
    
    // Métodos de interacción con la página
    public void abrirPagina() {
        navigateTo("http://192.168.80.43:10700");
    }

   
    public void ingresarDatos(String email) throws InterruptedException {
        write(inputEmail, email);
                                             
    }

    public void ingresarpassword(String password) throws InterruptedException {
        write(inputPassword,password);
        
    } 
    
    public void clickIngresar() {
        clickElement(botonIngresar);
    }

    public void clickHome() {
        clickElement(botonHome);
    }

    public void clickTitle() {
        clickElement(botonTitlePrior);
    }

    // Método para obtener las prioridades en formato numérico
    public List<Integer> obtenerPrioridadesNumericas() {
        List<WebElement> elementos = findElements(By.xpath(listaPrioridades));
                
                // Convertir los valores de texto a números enteros
                return elementos.stream()
                        .map(WebElement::getText) // Obtener el texto de cada celda
                        .map(String::trim) // Eliminar espacios en blanco
                        .map(Integer::parseInt) // Convertir a número
                        .collect(Collectors.toList());
            }
            
}
