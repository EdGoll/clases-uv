//Sebastian Brito
Explicacion del dataset:

Es un inventario de un almacen que vende provisiones (como los de barrios), el cual esta divido por 4 "columnas", la primera que indica el id del producto,
la segunda corresponde al nombre del producto, la tercera viene siendo el valor de este, y por ultimo la cuarta corresponde al inventario del mismo.

Consultas que debe realizar el dataset:
A)Imprima por pantalla el listado completo de los productos del dataset:
Primero partimos declarando un String llamado linea, que mas adelante le asignaremos un objeto br de tipo BufferedReader, luego ocupamos dentro de un ciclo for la 
funcion realLine, la condicion del ciclo es, primero: el objeto  linea  sea igual al objeto de tipo BufferedRReader, y segundo: que a la vez distinto de null. Por ende 
nos permite leer las linas completas del dataset, de tal forma que si el dataset termina sera igual a null, por lo cual se finalizara la impresion de este por pantalla.

B)Ordene los productos del dataset de acuero a su id (de menor a mayor):
Se hace en la clase producto que implementa una interfaz llamado compareTo, se hace mediante un metodo que permite comparar los elementos y de esa forma pueden ser 
ordenados por id, de menor a mayor.



