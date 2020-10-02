# Taller de Introducción a Heroku

Arquitecturas Empresariales 2020-2

## Generalidades

https://warm-thicket-08550.herokuapp.com/inputdata

Este repositorio presenta un ejercicio básico arquitecturas empresariales, usando las herramientas Maven, Heroku, Spark, Git y JAVA para su desarrollo.

Puede encontrar el informe en https://github.com/Wasawsky/Arq_Emp_Taller2/tree/master/src/site/resources


### Prerrequisitos

Para poder usar este repositorio necesitara instalar Maven en su computador.
http://maven.apache.org/download.html

Puede encontrar la guía para la instalación desde:
http://maven.apache.org/download.html#Installation

También necesitara tener la versión más reciente de Java y jdk actualizados.

Si necesita ejecutar el servidor web con heroku, debe instalar el CLI que ofrece heroku, ingrese con su usuario y contraseña.
https://www.heroku.com

Instale git si aún no lo tiene instalado en su computador.

Lo puede encontrar y seguir los pasos de su instalación en:
https://git-scm.com/book/en/v2/Getting-Started-Installing-Git

Use un framework como Visual Studio Code, IntelliJ o alguno de su preferencia para más comodidad cuando use este repositorio.


### Preparando el espacio de trabajo

Cuando esté preparado abra un directorio en su computador donde quiera trabajar.

Ejecuta la consola de comandos desde el directorio y escribe en la línea de comandos

```
git clone https://github.com/Wasawsky/Arq_Emp_Taller2.git
```

Se le creara una carpeta llamada Arq_Emp_Taller1 en el directorio, es este repositorio desde donde trabajara.

Ingrese a la carpeta y ejecute la consola de comandos, o usando un framework de desarrollo abra la carpeta.

Desde la consola de comandos y estando en el repositorio escriba

```
mvn package
```

Para que se ejecute el POM.xml del proyecto.
Se descargarán librerías que necesitara el proyecto, puede tardar algunos minutos si es la primera vez que ejecuta el comando.

## Despliegue Local

Si necesita ejecutar localmente el servidor, use el siguiente comando para ejecutarlo desde cmd de Windows

```
web: java -cp target/classes;target/dependency/* edu.escuelaing.arep.SparkWebApp
```
Abra su navegador y busque la direccion web:

http://localhost:4567/inputdata

Si desea usar heroku para el despliegue local, coloque en la consola el comando

```
heroku local web
```

Abra su navegador y busque la direccion web:


http://localhost:5000/inputdata

### Funcionalidades

Este proyecto, desplegado en heroku, permite calcular la media aritmética de un conjunto de valores, además podemos hallar la desviación estándar de los datos.

![diagram](https://github.com/Wasawsky/Arq_Emp_Taller2/blob/master/src/resources/Capture.JPG)


## Uso

Puede ejecutar el método principal de la clase Calculator.java desde la consola de comandos para iniciar el programa, indique el archivo con los datos que quiere operar y oprima ENTER.

Podrá visualizar la media aritmética de los datos y la desviación estándar de los mismos.

Si necesita casos de prueba vaya a https://github.com/Wasawsky/Arq_Emp_Taller1/tree/master/src/test/resources/data para ver los casos que se usan en las pruebas. 

## Construido con

* [Maven](https://maven.apache.org/) - Dependency Management
* [GIT](https://git-scm.com/) - Environment Version Control System
* [Java](https://www.java.com/es/) - General-purpose programming language
* [Heroku](https://www.heroku.com) - Cloud platform as a service
* [Spark](http://sparkjava.com/) - Micro framework for creating web applications

## Sobre el autor

*Michael Ballesteros*

Apasionado por el desarrollo y la gestión de sistemas

## Licencia

Para más información de la licencia ver LICENSE.md

Para más proyectos, Sígueme y encuentra mis repositorios :D

## Agradecimientos

Felipe Portales-Oliva

Johni0702


