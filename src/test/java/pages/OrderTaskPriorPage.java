package pages;


public class OrderTaskPriorPage extends BasePage{
    
              

    // Localizadores
    private String inputEmail = "//input[@id='email']";  
    private String inputPassword = "//input[@id='password']";
    private String botonIngresar = "//button[@type='submit']";
    private String botonHome = "//span[normalize-space()='Home']";
    private String botonTitlePrior = "//thead/tr[1]/th[4]/span[1]";
    
    public OrderTaskPriorPage() {
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

    public void clickHome() {
        clickElement(botonHome);
    }

    public void clickTitle() {
        clickElement(botonTitlePrior);
    }

    
}
