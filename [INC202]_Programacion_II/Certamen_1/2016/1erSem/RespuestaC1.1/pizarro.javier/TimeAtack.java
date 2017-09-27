
package certamen1.pkg1;
//PREGUNTA 1 CUANTOS PARTICIPANTES CORRIERON EN ESTA FECHA
//PREGUNTA 2 CUALES FUERON LAS CATEGORIAS QUE SE CORRIERON?
//PREGUNTA 3 CUANTOS PARTICIPANTES CORRIERON EN LA CATEGORIA PRO?
//PREGUNTA 4 NOMBRE DE TODOS LOS PARTICIPANTES Y SUS AUTOS
//PREGUNTA 5 Cuantos autos iguales hay y cuales son?

public class TimeAtack {
    public static void main( String[] args){
    TimeAtackImp ti= new TimeAtackImp();
    ti.llenarCorredores();
    ti.categorias();
    ti.corredorAuto();
    
    }
    
}
