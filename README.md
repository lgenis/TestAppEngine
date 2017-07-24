# TestAppEngine

Disponible para su uso [online](https://poo-2017-testappengin.appspot.com/) en:
https://poo-2017-testappengin.appspot.com/

Este respositorio es un ejemplo de uso de servlets en html y su implementación en la nube de Google.

## Utilización

1. Lanzar código con Google App Engine para usar repositorio [local](http://localhost:8080/): http://localhost:8080/
2. Alternativamente acceder a su implementación [online](https://poo-2017-testappengin.appspot.com/).


## Contenidos

Este repositorio contiene 4 servlets de prueba accesibles desde la página inicial titulada ["Servlets de prueba"](https://poo-2017-testappengin.appspot.com/):

### 1. HelloAppEngine

Servlet de prueba que responde "Hello App Engine!" para demostrar correcto funcionamiento de la implementación. 
Accesible a través del enlace ["Prueba hola mundo"](https://poo-2017-testappengin.appspot.com/hello) en la página inicial o con la dirección https://poo-2017-testappengin.appspot.com/hello

### 2. Calculadora (SumaNumeros)

Servlet de tipo calculadora básica que permite operar con dos números. Las operaciones disponibles son:
+ Suma: Suma los dos digitos
+ Resta: Resta las dos cifras
+ Multiplicación: Hace el producto de las dos operandos introducidos
+ División: Divide los dos números. Acepta división por 0 retornando 'Infinity'

Este formulario se muestra en una página intermedia denominada ["metodopost.html"](https://poo-2017-testappengin.appspot.com/metodopost.html) 
accesible a través del enlace ["Opera Numeros"](https://poo-2017-testappengin.appspot.com/metodopost.html) en la página inicial.

La solicitud de respuesta al servidor se realiza con un método 'Post' que devuelve el resultado de la operación seleccionada.

En caso de acceder a la página de respuesta directamente [/calculadora](https://poo-2017-testappengin.appspot.com/calculadora) realiza un método 'Get' y 
devuelve un esquema de persistencia para bases de datos y la fecha y hora actuales.

### 3. CurrentDate

Servlet que retorna la fecha y hora actuales.
Accesible a través del enlace ["Current Date and Time"](https://poo-2017-testappengin.appspot.com/currentdate) en la pagina principal.

### 4. GetAdministrators

Servlet que muestra una lista aleatoria del nombre de 10 objetos de tipo "Admin" que serán utilizados en la prueba final.
Demostrador de funcionamiento de la clase Admin para futuras implementaciones.
Accesible a través del enlace ["Get Administrators"](https://poo-2017-testappengin.appspot.com/getadmins) de la pagina principal.

## Estructura

Este repositrio está dividido en tres carpetas principales

### src/main/java

- Contiene el código de los servlets en el packete por defecto.
- Contiene paquete model con la clase Admin y otras clases utilizadas en el método GetAdministrators.

### src/test/java

- Tests unitarios

### src/main/webapp

- Ficheros html de creación de la interfaz web y archivos xml de configuración además de archivos extra usados en la páginas web tales como imágenes.

Last Edited by Luis 24/07/2017
