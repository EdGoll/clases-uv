package Euro;

import java.util.Scanner;

public class EuroMain {

    public static void main(String[] args) {
        //Declaran atributos
        int aux = 0, x = 0;
        Scanner sc = new Scanner(System.in);
        EuroImpl c = new EuroImpl();
        while (x != 2) {
            //Se pregunta al usuario por cual informacion desea revisar
            do {
                System.out.println("1)¿Cual es el sector financiero que mas se repite?\n"
                        + "2)¿Cuales son las instituciones de mayor y menor establecimientos en paises?\n"
                        + "3)¿Desea buscar los datos de alguna institucion en la base de datos?\n"
                        + "4)¿Desea revisar los valores del mercadoevaluado de cada institucion?\n"
                        + "5)¿Desea saber cuantas instituciones existen en la fuente de datos?\n"
                        + "6)¿Desea obtener todos los datos de cada institucion?");
                aux = sc.nextInt();
            } while (aux < 1 || aux > 6);
            //Comprobante de dato ingresa 
            //Se ingresa a un switch por cada pregunta
            switch (aux) {

                case 1:
                    c.sector();
                    break;
                case 2:
                    c.paises();
                    break;
                case 3:
                    c.institucion();
                    break;
                case 4:
                    c.valoresMercado();
                    break;
                case 5:
                    c.pe();
                    break;
                case 6:
                    c.muestraDatos();
                    break;
            }
            //Se pregunta si desea realizar otra operacion y se comprueba el dato ingresado
            do {
                System.out.println("¿Desea realizar otra operacion?\n1)Si\n2)No");
                x = sc.nextInt();
            } while (x>2 || x<1);
        }
    }
}
