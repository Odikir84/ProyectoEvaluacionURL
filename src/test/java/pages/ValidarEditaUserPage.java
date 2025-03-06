
package pages;

public class ValidarEditaUserPage extends BasePage{
    
 // Localizadores
 private String inputEmail = "//input[@id='email']";  
 private String inputPassword = "//input[@id='password']";
 private String botonIngresarlogin = "//button[@type='submit']";
 private String botonPerfil = "//span[normalize-space()='Perfil']";
 private String botonEditar = "//button[normalize-space()='Editar Datos Usuario']";
 private String inputNombre = "//input[@id='firstname']";
 private String inputApellido = "//input[@id='lastname']";
 private String inputEmail2 = "//input[@id='email']";
 private String botonModificar = "//body/div[2]/div[3]/div[1]/div[2]/button[2]";
 
 public ValidarEditaUserPage() {
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

public void clickEditar() {
    clickElement(botonEditar);
}
 
public void ingresarDatos2(String nombre, String apellido, String email) throws InterruptedException {
    write(inputNombre, nombre);
    write(inputApellido, apellido);
    write(inputEmail2, email);
                                     
}

public void clickModificar() {
    clickElement(botonModificar);
}

}
