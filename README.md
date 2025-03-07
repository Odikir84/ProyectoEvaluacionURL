######### ACERCA DE LAS EJECUCIONES DE PRUEBAS EN PROYECTOEVALUACIONURL ########


Este proyecto implementa pruebas automatizadas usando **Selenium WebDriver**, **Cucumber** y **Java** para validar funcionalidades de una aplicacion web.  

## Tecnologias Utilizadas  
- **Java 17+**  
- **Selenium WebDriver**  
- **Cucumber (BDD)**  
- **JUnit/TestNG** 
- **Maven**  

- Mencionar que por medio de archivo TestRunner.java se pueden ejecutar todas las pruebas modeladas en el proyecto, en el cual desde este archivo se podra ejecutar cualquier prueba a realizarse aplicando "Run Test" o bien aplicando "gradle test" ingresando a la terminal y posicionandose en carpeta donde se encuentra alojado el proyecto. 

- Los primeros casos de prueba están asociados con el proceso de inicio de sesión (Login). En el PPF, se puede observar que estos casos están relacionados tanto con la creación de un usuario como con el inicio de sesión como usuario, además de incluir validaciones para el proceso de inicio de sesión. Para ejecutar estos casos de prueba en el código, debes dirigirte al archivo "Login.feature" y descomentar el tag "@Test".

	El propósito de este tag es seleccionar un escenario específico para la prueba. Debes mover este tag en el archivo "Login.feature" colocándolo encima de cada escenario que desees probar, tal como se muestra, pero sin el símbolo "#" (comentario). El asterisco se debe añadir cuando ya no desees probar nada relacionado con el inicio de sesión. Se recomienda probar los escenarios de arriba hacia abajo para una ejecución más ordenada.


- Las siguientes pruebas se centran en el apartado del perfil una vez que se ha iniciado sesion como usuario. En el archivo "Perfil.feature", encontraras casos relacionados con la modificacion de la informacion del usuario, la actualizacion de la contrasenia y validaciones de formularios. Para ejecutar estas pruebas en el codigo, sigue los mismos pasos que mencione anteriormente con el tag "@Test" en este archivo.


- Finalmente, las pruebas corresponden a la pantalla de inicio (home) e involucran la creacion de tareas, la visualizacion de las mismas y el ordenamiento mediante "filtros". Ademas, se incluye una validacion en relacion con la creacion de tareas. Estas pruebas estan contenidas en el archivo "Home.feature".

	Para ejecutar estas pruebas en el codigo, repite el mismo proceso mencionado anteriormente con el tag "@Test" en este archivo. Asegurarse de que en los otros archivos de caracteristicas, como "Login.feature" y "Perfil.feature", el tag "@Test" esta comentado para evitar ejecuciones no deseadas y posibles errores.

	Al igual que en los casos anteriores, utiliza el tag "@Test" para seleccionar el escenario especifico que deseas probar, moviendolo sobre cada escenario sin el simbolo "#" (comentario). Si ya no deseas realizar pruebas relacionadas con la pantalla de inicio, agrega un asterisco al tag.

- En los pasos (steps) de cada escenario, se han definido valores predeterminados para los distintos campos. Estos valores son configurables segun las necesidades de la prueba. Si se desea probar escenarios con valores diferentes, es posible modificar los datos en los steps correspondientes. Sin embargo, es fundamental garantizar que se cumplan las precondiciones especificadas en el PPF para asegurar la validez de las pruebas.

- Se agrega proyecto de evaluacion a GIT, el cual informa detalladamente los cambios realizados ademas de informar estructura completa de proyecto y sus respectivas carpetas de creacion.

## **Estructura del Proyecto**  

 PROYECTOEVALUACIONURL
������.gradle
������.vscode
������build
������gradle
������src
  �� ������ test # Codigo de pruebas
  �� �� ������ java
  �� �� �� ������pages # Page Objects (clases de páginas web)
  �� �� �� ������runner # Ejecutores de pruebas con JUnit/TestNG
  �� �� �� ������steps # Definicion de los pasos de Cucumber
  �� ������ resources
  �� �� ������ features # Archivos .feature con escenarios Gherkin
�� ������.gitattributes
�� ������.gitignore # Ignorar archivos innecesarios
�� ������build.gradle # Uso de plugins, repositorios y dependencias
�� ������gradlew
�� ������gradlew.bat
�� ������settings.gradle
�� ������README.md # Documentacion del proyecto