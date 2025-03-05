package pages;


public class ValidaLoginPassVacioPage extends BasePage{
    
              

    // Localizadores
    private String inputEmail = "//input[@id='email']";
    private String inputPassword = "//input[@id='password']"; 
    private String botonIngresar = "//button[@type='submit']";
    
    public ValidaLoginPassVacioPage() {
        super(driver);
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

    
}