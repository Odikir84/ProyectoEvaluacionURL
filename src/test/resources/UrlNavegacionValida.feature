Feature: Registro de validaciones en ingreso de pagina

  Como tester, 
  Quiero poder registrar las validaciones de sistema,
  Para luego dejar evidenciado en pruebas realizadas.


Scenario: Inicio de sesion con email vacio
    Given El usuario accede a la página de inicio para login en sistema
    And No ingreso NINGUN email ""
    Then presionar el botón ingresar a sistema y recibir mensaje de alerta para completar campo


Scenario: Inicio de sesion con pass vacio
    Given El usuario accede a  página de inicio para Login
    When ingreso de CORREO de inicio "ignacio.resp84@gmail.com"
    And No ingreso NINGUNA contraseña "" 
    Then presionar el botón de ingreso a sistema pass y recibir mensaje de alerta para COMPLETAR campo   


Scenario: Validar Registro de un nuevo usuario
    Given El usuario accede a la página de REGISTRO
    When Hace clic en el BOTON "Crear nuevo Usuario"
    And No se ingresan datos nombre "", apellido "", email "" 
    And No se ingresa contraseña "" y no se confirma ""
    Then Presiona el BOTON "Registrar Usuario"    


Scenario: Creacion exitosa de una nueva tarea
    Given El usuario valida acceso de sesion para ingreso
    When ingreso de email de inicio para VALIDACION "ignacio.resp84@gmail.com"  
    And ingreso de contraseña usuario para VALIDACION "Sentra5678" 
    And presionar el botón de ingreso para VALIDACION
    And presiono el botón HOME
    And presiono botón NUEVA TAREA
    And no ingreso nada en titulo de tarea ""
    And no agrego nada en descripcion de tarea ""
    And no ingreso nada en fecha termino de tarea
    And no indico prioridad de TAREA ""
    Then HAGO click y finalizo en boton CREAR TAREA

  
  Scenario: Validar modificacion de datos de informacion de usuario
    Given Que estoy autenticando en página de inicio para edicion de usuario
    When ingreso de email de INICIO "ignacio.resp84@gmail.com"  
    And ingreso de contraseña USUARIO "Sentra5678" 
    And presionar el botón ingresar para EDICION
    And ingresar a seccion PERFIL
    And edicion de datos de usuario al hacer CLICK en editar datos usuario
    And no se ingresan Nombre "", apellido "", email ""
    Then presiona el botón modificar usuario para finalizar edicion   


Scenario: Validar Orden de tareas de usuario por prioridad
    Given El usuario AUTENTICA para ingreso de PAGINA
    When ingreso de email de inicio para AUTENTICACION "ignacio.resp84@gmail.com"  
    And ingreso de contraseña usuario para AUTENTICACION "Sentra5678" 
    And presionar el botón de ingreso para AUTENTICACION de usuario
    And presionar el botón Home para DESPLIEGUE de tareas
    Then VALIDA orden de tareas por prioridad     


Scenario: Validar orden de tareas por fecha de término
    Given como usuario accedo a SESION para ingreso fecha
    When ingresar CORREO de inicio para tarea fecha "ignacio.resp84@gmail.com"
    And ingresar de CONTRASEÑA usuario para tarea fecha "Sentra5678"
    And presionar el botón de INGRESO para login orden fecha
    And presionar el botón HOME para listar de tareas fecha
    Then ordenar tareas por fecha termino y validar orden

@Test
Scenario: Validar edicion de contraseña de usuario en sección perfil 
    Given Que estoy autenticando en página de inicio para CAMBIO de contrasenia
    When ingreso de CORREO de INICIO autenticacion "ignacio.resp84@gmail.com"  
    And ingreso de CONTRASENIA usuario autenticacion "Sentra5678" 
    And presionar el botón ingresar para ingreso a SESION
    And ingreso y HAGO click en seccion PERFIL
    And hago click en boton para CAMBIAR CONTRASENIA
    And se deja campo vacio en CONTRASENIA "" y vacio en REPITE contrasenia ""
    Then Hago click en botón CAMBIAR CONTRASENIA    