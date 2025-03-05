package pages;

public class ValidarRegistroUsuarioPage extends BasePage{

        
    // Localizadores
    private String botonCrearUsuario = "(//button[@type='button'])";
    private String inputNombre = "//input[@id='firstname']";
    private String inputApellido = "//input[@id='lastname']";
    private String inputEmail = "(//input[@id='email'])[2]";
    private String inputPassword = "(//input[@id='password'])[2]";
    private String inputConfirmPassword = "//input[@id='repeat_password']";
    private String botonRegistrarse = "(//body/div[2]/div[3]/div[1]/div[2]/button[2])";
    

    public ValidarRegistroUsuarioPage(){
        super(driver);
    }

       
    // Métodos de interacción con la página
    public void abrirPagina() {
        navigateTo("http://192.168.80.43:10700");
    }

    public void clickCrearUsuario() {
        clickElement(botonCrearUsuario);
    }

    public void ingresarDatos(String nombre, String apellido, String email) throws InterruptedException {
        write(inputNombre, nombre);
        write(inputApellido, apellido);
        write(inputEmail, email);
       
                                      
    }

    public void ingresarpassword(String password, String confirmPassword) throws InterruptedException {
        write(inputPassword,password);
        write(inputConfirmPassword, confirmPassword);

    } 
    

    public void clickRegistrarse() {
        clickElement(botonRegistrarse);
    }

    
}