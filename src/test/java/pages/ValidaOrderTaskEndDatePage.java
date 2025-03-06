package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ValidaOrderTaskEndDatePage extends BasePage {

     // Localizadores
     private String inputEmail = "//input[@id='email']";  
     private String inputPassword = "//input[@id='password']";
     private String botonIngresar = "//button[@type='submit']";
     private String botonHome = "//span[normalize-space()='Home']";
     private String botonEnd = "//thead/tr[1]/th[3]/span[1]";
     

    public ValidaOrderTaskEndDatePage() {
        super(driver);
    }      

    private By taskEndDateColumn = By.cssSelector("#root > div > main > div:nth-child(2) > div > div > div.MuiTableContainer-root.css-kge0eu > table > tbody > a:nth-child(1) > td:nth-child(3)"); // Ajusta el selector según HTML
    
   
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
        clickElement(botonEnd);
    }

    public boolean validarOrdenFechas() throws ParseException {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        wait.until(ExpectedConditions.visibilityOfElementLocated(taskEndDateColumn));

        List<WebElement> dateElements = driver.findElements(taskEndDateColumn);
        List<String> fechasTexto = new ArrayList<>();
        List<String> fechasOrdenadas = new ArrayList<>();

        // Extraer las fechas de la tabla
        for (WebElement dateElement : dateElements) {
            String fecha = dateElement.getText().trim();
            fechasTexto.add(fecha);
            fechasOrdenadas.add(fecha);
        }

        // Convertir fechas a formato Date
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss");
        List<java.util.Date> fechasConvertidas = new ArrayList<>();
        for (String fecha : fechasTexto) {
            fechasConvertidas.add(sdf.parse(fecha));
        }

        // Ordenar la copia de las fechas
        List<java.util.Date> fechasOrdenadasConvertidas = new ArrayList<>(fechasConvertidas);
        Collections.sort(fechasOrdenadasConvertidas);

        // Comparar si la lista original coincide con la ordenada
        return fechasConvertidas.equals(fechasOrdenadasConvertidas);
    }
}
