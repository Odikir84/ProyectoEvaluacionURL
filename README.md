######### ACERCA DE LAS EJECUCIONES DE PRUEBAS EN PROYECTOEVALUACIONURL ########


Este proyecto implementa pruebas automatizadas usando **Selenium WebDriver**, **Cucumber** y **Java** para validar funcionalidades de una aplicaci贸n web.  

## 馃殌 Tecnolog铆as Utilizadas  
- **Java 17+**  
- **Selenium WebDriver**  
- **Cucumber (BDD)**  
- **JUnit/TestNG** 
- **Maven**  

- Mencionar que por medio de archivo TestRunner.java se pueden ejecutar todas las pruebas modeladas en el proyecto, en el cual desde este archivo se podra ejecutar cualquier prueba a realizarse aplicando "Run Test" o bien aplicando "gradle test" ingresando a la terminal y posicionandose en carpeta donde se encuentra alojado el proyecto. 

- Los primeros casos de prueba est谩n asociados con el proceso de inicio de sesi贸n (Login). En el PPF, se puede observar que estos casos est谩n relacionados tanto con la creaci贸n de un usuario como con el inicio de sesi贸n como usuario, adem谩s de incluir validaciones para el proceso de inicio de sesi贸n. Para ejecutar estos casos de prueba en el c贸digo, debes dirigirte al archivo "Login.feature" y descomentar el tag "@Test".

	El prop贸sito de este tag es seleccionar un escenario espec铆fico para la prueba. Debes mover este tag en el archivo "Login.feature" coloc谩ndolo encima de cada escenario que desees probar, tal como se muestra, pero sin el s铆mbolo "#" (comentario). El asterisco se debe a帽adir cuando ya no desees probar nada relacionado con el inicio de sesi贸n. Se recomienda probar los escenarios de arriba hacia abajo para una ejecuci贸n m谩s ordenada.


- Las siguientes pruebas se centran en el apartado del perfil una vez que se ha iniciado sesi贸n como usuario. En el archivo "Perfil.feature", encontrar谩s casos relacionados con la modificaci贸n de la informaci贸n del usuario, la actualizaci贸n de la contrase帽a y validaciones de formularios. Para ejecutar estas pruebas en el c贸digo, sigue los mismos pasos que mencion茅 anteriormente con el tag "@Test" en este archivo.


- Finalmente, las pruebas corresponden a la pantalla de inicio (home) e involucran la creaci贸n de tareas, la visualizaci贸n de las mismas y el ordenamiento mediante "filtros". Adem谩s, se incluye una validaci贸n en relaci贸n con la creaci贸n de tareas. Estas pruebas est谩n contenidas en el archivo "Home.feature".

	Para ejecutar estas pruebas en el c贸digo, repite el mismo proceso mencionado anteriormente con el tag "@Test" en este archivo. Aseg煤rarse de que en los otros archivos de caracter铆sticas, como "Login.feature" y "Perfil.feature", el tag "@Test" est茅 comentado para evitar ejecuciones no deseadas y posibles errores.

	Al igual que en los casos anteriores, utiliza el tag "@Test" para seleccionar el escenario espec铆fico que deseas probar, movi茅ndolo sobre cada escenario sin el s铆mbolo "#" (comentario). Si ya no deseas realizar pruebas relacionadas con la pantalla de inicio, agrega un asterisco al tag.

- En los pasos (steps) de cada escenario, se han definido valores predeterminados para los distintos campos. Estos valores son configurables seg煤n las necesidades de la prueba. Si se desea probar escenarios con valores diferentes, es posible modificar los datos en los steps correspondientes. Sin embargo, es fundamental garantizar que se cumplan las precondiciones especificadas en el PPF para asegurar la validez de las pruebas.


## 馃搧 **Estructura del Proyecto**  

馃摝 PROYECTOEVALUACIONURL
鈹溾攢鈹� .gradle
鈹溾攢鈹� .vscode
鈹溾攢鈹� build
鈹溾攢鈹� gradle
鈹溾攢鈹� 馃搧 src
  鈹?  鈹斺攢鈹� 馃搧 test # C贸digo de pruebas
        鈹?    鈹斺攢鈹� 馃搧 java
        鈹?                鈹溾攢鈹� 馃搧 pages # Page Objects (clases de p谩ginas web)
        鈹?                鈹溾攢鈹� 馃搧 runner # Ejecutores de pruebas con JUnit/TestNG
        鈹?                鈹斺攢鈹� 馃搧 steps # Definici贸n de los pasos de Cucumber
      鈹斺攢 馃搧 resources
              鈹斺攢鈹� 馃搧 features # Archivos .feature con escenarios Gherkin
鈹溾攢鈹� .gitattributes
鈹溾攢鈹� .gitignore # Ignorar archivos innecesarios
鈹溾攢鈹� build.gradle # Uso de plugins, repositorios y dependencias
鈹溾攢鈹� gradlew
鈹溾攢鈹� gradlew.bat
鈹傗攢鈹� settings.gradle
鈹傗攢鈹� 馃搫 README.md # Documentaci贸n del proyecto