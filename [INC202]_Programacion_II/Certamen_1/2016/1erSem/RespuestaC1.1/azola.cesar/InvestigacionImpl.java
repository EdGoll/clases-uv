
package investigacionsocial;


public class InvestigacionImpl {
    public static void main(String[] args) {
        InvestigacionSocial I = new InvestigacionSocial();
       I.rellenar();
       I.eduSuperiorChile(); // porcentaje de acceso a educacion superior en chile 
       I.mayorMenor();//cual es el pais con mayor y menor acceso a los conocimientos basicos
       I.derechosPersonales();//los 10 paises con mayor derechos personales
       I.promedioAgua(); //cual es el promedio a nivel mundial de sanidad de agua
       I.tolerancia();// pais con menos tolerancia e inclusion
    }
}
