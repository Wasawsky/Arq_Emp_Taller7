# Aplicación distribuida segura en todos sus frentes

Arquitecturas Empresariales 2020-2

## Generalidades

https://ec2-3-95-38-184.compute-1.amazonaws.com:35000/hello

https://ec2-54-210-150-219.compute-1.amazonaws.com:25000/index

Este repositorio presenta un ejercicio desplegado en AWS para arquitecturas empresariales, usando las herramientas Maven, Spark, Git y JAVA para su desarrollo.

Se implementa la arquitectura, donde se debe autenticar la conexion de las partes.
![](/resources/img/taller.jpg)

Se ubicaron certificado en cada una de las maquinas, donde se implementaron llaves de acceso, adicionalmente se comprueba el login del usuario
![](/resources/img/Capture.jpg)

Se hace el despliegue en 2 maquinas ec2 de AWS, para el servicio de login y para el otro servicio
![](/resources/img/Capture2.jpg)

El browser identifica el certificado como no valido, porque no esta avalado por alguna entidad de certificacion.
![](/resources/img/Capture3.jpg)

![](/resources/img/Capture4.jpg)


### Prerrequisitos

Para poder usar este repositorio necesitara instalar Maven en su computador.
http://maven.apache.org/download.html

Puede encontrar la guía para la instalación desde:
http://maven.apache.org/download.html#Installation

También necesitara tener la versión más reciente de Java y jdk actualizados.

Instale git si aún no lo tiene instalado en su computador.

Lo puede encontrar y seguir los pasos de su instalación en:
https://git-scm.com/book/en/v2/Getting-Started-Installing-Git

Use un framework como Visual Studio Code, IntelliJ o alguno de su preferencia para más comodidad cuando use este repositorio.


### Preparando el espacio de trabajo

Cuando esté preparado abra un directorio en su computador donde quiera trabajar.

Ejecuta la consola de comandos desde el directorio y escribe en la línea de comandos

```
git clone https://github.com/Wasawsky/Arq_Emp_Taller7.git
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
web: java -cp target/classes;target/dependency/* edu.escuelaing.arep.SecureSparkServicesApp
```
Abra su navegador y busque la direccion web:

http://localhost:5001/index


### Funcionalidades

Este proyecto, permite calcular la media aritmética de un conjunto de valores, además podemos hallar la desviación estándar de los datos.

## Uso

Puede ejecutar el método principal de la clase Calculator.java desde la consola de comandos para iniciar el programa, indique el archivo con los datos que quiere operar y oprima ENTER.

Podrá visualizar la media aritmética de los datos y la desviación estándar de los mismos.

Si necesita casos de prueba vaya a OtherService para ver los casos que se usan en las pruebas. 

## Construido con

* [Maven](https://maven.apache.org/) - Dependency Management
* [GIT](https://git-scm.com/) - Environment Version Control System
* [Java](https://www.java.com/es/) - General-purpose programming language
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

