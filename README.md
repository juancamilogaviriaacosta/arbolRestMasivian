# Prueba rest arbol binario

[![Build Status](https://travis-ci.org/joemccann/dillinger.svg?branch=master)](https://travis-ci.org/joemccann/dillinger)

La aplicación cuenta con 3 capas

- Servicios web
- Controladores
- Negocio


En la sección release se encuentra un [WAR](https://github.com/juancamilogaviriaacosta/arbolRestMasivian/releases) compilado que se puede desplegar en glassfish 4.1.1 o posterior

Una vez desplegado el WAR, la aplicación crea por defecto el arbol binario del enunciado en una instancia singleton para todo el contexto

Para probar los servicios rest es necesario

1. Desplegar el WAR
2. Por medio de la URL [http://localhost:8080/arbolRestMasivian/webresources/getAncestro/40/78](http://localhost:8080/arbolRestMasivian/webresources/getAncestro/40/78) se puede obtener el menor ancestro comun de 40 y 78, puede modificar los paramentros en la URL para realizar mas pruebas
3. Por medio de la URL [http://localhost:8080/arbolRestMasivian/webresources/putArbol](http://localhost:8080/arbolRestMasivian/webresources/putArbol) se puede ingresar un nuevo arbol binario por medio del metodo PUT y enviando en JSON un arbol con la siguientre estructura (ejemplo del enunciado) {"arbol" : "70, 84, 85, 78, 80, 76, 49, 54, 51, 37, 40, 37, 22"} 

A continuación se muestran dos pantallazos de los métodos funcionando y probados por medio de postman

PUT (ingresar el arbol)
> Blockquote
![alt text](https://raw.githubusercontent.com/juancamilogaviriaacosta/arbolRestMasivian/master/web/WEB-INF/resources/put.png)

GET (obtener el menor ancestro comun entre dos nodos)
> Blockquote
![alt text](https://raw.githubusercontent.com/juancamilogaviriaacosta/arbolRestMasivian/master/web/WEB-INF/resources/get.png)

