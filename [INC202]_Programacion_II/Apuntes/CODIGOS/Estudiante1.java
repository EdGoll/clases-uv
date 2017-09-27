void promedio(){ 
// Promedio de notas
float promedio=0;
for (int i = 0 ; i < NB_NOTAS ; i++) { 
promedio+=notas[i];}
promedio/=NB_NOTAS;
System.out.println ("El promedio es :"+promedio) ; 
}
public static void main (String arg []) { 
// Crear un objeto del tipo Estudiante 
Estudiante duran = new Estudiante() ; 

// Crear el arreglo de notas
duran.notas = new int [NB_NOTAS] ; 
duran.llenar();
duran.mostrar();
duran.promedio();
}} 