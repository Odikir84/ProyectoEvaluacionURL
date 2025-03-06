package pages;

public class ValidarEditaPassPage extends BasePage{
    
 // Localizadores
 private String inputEmail = "//input[@id='email']";  
 private String inputPassword = "//input[@id='password']";
 private String botonIngresarlogin = "//button[@type='submit']";
 private String botonPerfil = "//span[normalize-space()='Perfil']";
 private String botonCambioPass = "//button[normalize-space()='Cambiar Contraseña']";
 private String EditPassword = "//input[@id='password']";
 private String InputRepeatPassword = "//input[@id='repeat_password']";
 private String botonCambiarPass = "//button[@class='MuiButtonBase-root MuiButton-root MuiButton-text MuiButton-textPrimary MuiButton-sizeMedium MuiButton-textSizeMedium MuiButton-root MuiButton-text MuiButton-textPrimary MuiButton-sizeMedium MuiButton-textSizeMedium css-1y36nkv'][normalize-space()='Cambiar Contraseña']";
 
 public ValidarEditaPassPage() {
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
 
 public void botonIngresarlogin() {
     clickElement(botonIngresarlogin);
 }

 public void clickPerfil() {
    clickElement(botonPerfil);
}

public void clickCambioPass() {
    clickElement(botonCambioPass);
}
 

public void ingresarpassword(String password, String repeatPassword) throws InterruptedException {
    write(EditPassword, password);
    write(InputRepeatPassword, repeatPassword);

} 

public void clickCambiarPass() {
    clickElement(botonCambiarPass);
}

}
