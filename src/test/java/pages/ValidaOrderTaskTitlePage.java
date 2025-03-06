package pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ValidaOrderTaskTitlePage extends BasePage{
    
              

    // Localizadores
    private String inputEmail = "//input[@id='email']";  
    private String inputPassword = "//input[@id='password']";
    private String botonIngresar = "//button[@type='submit']";
    private String botonHome = "//span[normalize-space()='Home']";
    private String botonTitle = "//thead/tr[1]/th[1]/span[1]";
    
    public ValidaOrderTaskTitlePage() {
        super(driver);
    }   

    public List<String> obtenerTitulosTareas() {
    List<WebElement> elementosTareas = driver.findElements(By.cssSelector("#root > div > main > div:nth-child(2) > div > div > div.MuiTableContainer-root.css-kge0eu > table > thead > tr"));
    List<String> titulos = new ArrayList<>();

    for (WebElement tarea : elementosTareas) {
        titulos.add(tarea.getText().trim());
    }
    return titulos;
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
        clickElement(botonTitle);
    }

    
}
