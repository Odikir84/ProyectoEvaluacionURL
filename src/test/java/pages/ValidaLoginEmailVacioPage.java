package pages;


public class ValidaLoginEmailVacioPage extends BasePage{
    
              

    // Localizadores
    private String inputEmail = "//input[@id='email']";
    private String botonIngresar = "//button[@type='submit']";
    
    public ValidaLoginEmailVacioPage() {
        super(driver);
    }   
       
    
    // Métodos de interacción con la página
    public void abrirPagina() {
        navigateTo("http://192.168.80.43:10700");
    }


    public void ingresarDatos(String email) throws InterruptedException {
        write(inputEmail, email);
                                             
    }
    
    public void clickIngresar() {
        clickElement(botonIngresar);
    }

    
}