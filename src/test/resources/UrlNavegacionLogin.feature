Feature: Registro de usuario, inicio de sesion y modificacion de informacion de usuario

  Como nuevo usuario, 
  Quiero poder registrarme ingresando al sitio,
  Para luego presionar "Crear nuevo Usuario" e ingresar mis datos, para posteriormente iniciar sesion y poder modificar datos.

Scenario: Registro exitoso de un nuevo usuario
    Given El usuario accede a la página de registro
    When Hace clic en el botón "Crear nuevo Usuario"
    And Ingresa nombre "Ignacio", apellido "Medina", email "ignacio.resp84@gmail.com" 
    And Ingresa contraseña "Sentra1234" y la confirma "Sentra1234"
    Then Presiona el botón "Registrar Usuario"
 
 
  Scenario: Inicio de sesion como usuario registrado con email y contraseña
    Given El usuario accede a la página de inicio para inicio de sesion
    When ingreso de email "jmedina@sentra.cl"
    And ingreso de contraseña "Sentra2025"
    Then presionar el botón ingresar

 
  Scenario: Modificacion datos de informacion de usuario
    Given El usuario accede a la página de inicio para inicio de sesion para modificacion
    When ingreso de email de inicio "ignacio.resp84@gmail.com"  
    And ingreso de contraseña usuario "Sentra1234" 
    And presionar el botón ingresar para cambios
    And ingresar a seccion perfil
    And edicion de datos de usuario en editar datos usuario
    And Ingresa Nombre "Odin", apellido "Kira", email "ignacio.med84@gmail.com"
    Then presiona el botón modificar usuario


  Scenario: Inicio de sesion con usuario inexistente con email y contraseña
    Given usuario inexistente accede a la página de inicio para inicio de sesion
    When ingreso de email inexistente "inexistente@gmail.cl"
    And ingreso de contraseña inexistente "010101"
    Then presionar el botón ingresar y recibir mensaje de alerta



  Scenario: Modificar contraseña de usuario en perfil exitosamente
    Given El usuario accede a autenticar cuenta para cambio de contraseña
    When ingreso de email de inicio cambio pass "ignacio.resp84@gmail.com"  
    And ingreso de contraseña usuario cambio pass "5678" 
    And presionar el botón ingresar para cambio pass
    And ingresar a seccion perfil para cambio pass
    And hago click en boton CAMBIAR CONTRASEÑA
    And Ingresa CONTRASENIA "Sentra5678" y la REPITE "Sentra5678"
    Then presiona el botón CAMBIAR CONTRASEÑA 