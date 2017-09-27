package Mundial;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Consulta c = new Consulta();
        int menu;
        Scanner nw = new Scanner(System.in);

        System.out.println("Mundial Brazil 2014\nPara cualquier consulta, ingrese algunas de las opciones\n1)¿Cuantos partidos se jugaron?\n2)¿Cuantos partidos jugo chile?\n3)¿Cuales fueron los resultados de chile en el mundial?\n4)¿Cuales fueron los lugares donde jugo chile?\n5)¿Cual fue el pais mas goleador?\n6)¿Cual fue el pais mas batido\n7)¿Cuantos partidos terminaron empatados?\n8)¿Cual fue el partido con mayor diferencia de goles?\n9)¿Que pais fue campeon?\n10)¿Cuales fueron los lugares donde se disputaron el tercer puesto y la final?");
        menu = nw.nextInt();
        switch (menu) {
            case 1:
                c.partidosJugados();
                break;
            case 2:
                c.partidosChile();
                break;
            case 3:
                c.resultadosChile();
                break;
            case 4:
                c.lugaresChile();
                break;
            case 5:
                break;
            case 6:
                break;
            case 7:
                break;
            case 8:
                break;
            case 9:
                break;
            case 10:
                c.tercerLugarYFinal();
                break;
        }
    }
}
