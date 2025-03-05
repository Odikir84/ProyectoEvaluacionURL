package pages;


public class ValidarCrearTareaPage extends BasePage{
    
              

    // Localizadores
    private String inputEmail = "//input[@id='email']";  
    private String inputPassword = "//input[@id='password']";
    private String botonIngresar = "//button[@type='submit']";
    private String botonHome = "//span[normalize-space()='Home']";
    private String botonIngresarTask = "//button[normalize-space()='Nueva Tarea']";
    private String inputTitulo = "//input[@id='title']";
    private String inputDesc = "//textarea[@id='title']";
    private String expirationDateTextField = "//input[@type='datetime-local']";
    private String inputPriori = "//body/div[2]/div[3]/div[1]/div[1]/div[5]/div[1]/input[1]";
    private String botonCrearTarea = "//body/div[2]/div[3]/div[1]/div[2]/button[2]";
    
    public ValidarCrearTareaPage() {
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

    public void botonIngresarTask() {
        clickElement(botonIngresarTask);
    }

    public void ingresarTitulo(String Titulo) throws InterruptedException {
        write(inputTitulo,Titulo);
        
    } 

    public void ingresarDesc(String descrip) throws InterruptedException {
        write(inputDesc,descrip);
        
    } 

    public void enterExpirationDate(String data) throws InterruptedException{
        write(expirationDateTextField, data);
    }

    public void ingresarPriori(String Priori) throws InterruptedException {
        write(inputPriori,Priori);
        
    } 

    public void botonCrearTarea() {
        clickElement(botonCrearTarea);
    }
}
