Feature: Registro de tareas de usuario para crear, visualizar, marcar y ordenar tareas

  Como usuario, 
  Quiero poder generar tareas al ingresar a sitio,
  Para luego presionar poder realizar distintas acciones de tareas tales como crear, ver, marcar y ordenar.


Scenario: Creacion exitosa de una nueva tarea
    Given El usuario accede a la página de sesion para ingreso
    When ingreso de email de inicio para tarea "ignacio.resp84@gmail.com"  
    And ingreso de contraseña usuario para tarea "Sentra1234" 
    And presionar el botón de ingreso para nueva tarea
    And presionar el botón Home
    And presionar el botón nueva tarea
    And ingresar titulo de tarea "Test Nueva Tarea"
    And agregar descripcion de tarea "Selenium Test Task java"
    And ingreso fecha termino de tarea
    And indica prioridad de tarea "2"
    Then finaliza y crea nueva tarea


Scenario: Despliegue de listado de tareas de usuario
    Given El usuario accede a la página de sesion para ingreso a listar
    When ingreso de email de inicio para tarea a listar "ignacio.resp84@gmail.com"  
    And ingreso de contraseña usuario para tarea a listar "Sentra1234" 
    And presionar el botón de ingreso para login listar
    And presionar el botón Home para lista de tareas


Scenario: Ordenar tareas de usuario por titulo
    Given El usuario accede a la página de sesion para ingreso a ordenar
    When ingreso de email de inicio para tarea a ordenar "ignacio.resp84@gmail.com"  
    And ingreso de contraseña usuario para tarea a ordenar "Sentra1234" 
    And presionar el botón de ingreso para login ordenar
    And presionar el botón Home para lista de tareas a ordenar
    Then ordenar tareas por titulo


Scenario: Ordenar tareas de usuario por prioridad
    Given El usuario accede a sesion para ingreso prioritario
    When ingreso de email de inicio para tarea a prioritaria "ignacio.resp84@gmail.com"  
    And ingreso de contraseña usuario para tarea prioritaria "Sentra1234" 
    And presionar el botón de ingreso para login orden prioritario
    And presionar el botón Home para lista de tareas prioritarias
    Then ordenar tareas por prioridad    


Scenario: Ordenar tareas de usuario por fecha termino
    Given El usuario accede a sesion para ingreso fecha
    When ingreso de email de inicio para tarea fecha "ignacio.resp84@gmail.com"  
    And ingreso de contraseña usuario para tarea fecha "Sentra1234" 
    And presionar el botón de ingreso para login orden fecha
    And presionar el botón Home para lista de tareas fecha
    Then ordenar tareas por fecha termino      


