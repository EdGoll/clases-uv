
import java.util.Scanner;
import java.util.Random;

public class Llenado {

    int[] b;
    int k, a, tam;

    public void tamano() {
        Scanner z = new Scanner(System.in);
        System.out.println("Ingrese tamaño del arreglo");//Ingresa el tamaño del arreglo
        tam = z.nextInt();//Guarda el tamaño del arreglo en la variable tam
        b = new int[tam];//Instancia el arreglo de tamaño tam
    }

    public void llenar_arreglo() {//Metodo para llenar el arreglo, ya obtenido el limite
        Random x = new Random();
        for (int i = 0; i < tam; i++) {
            b[i] = x.nextInt(1000) + 1;//Asigna valores random entre 1 y 1000
        }
    }

    public void digito() {//Metodo para ingresar por pantalla el digito a buscar
        Scanner z = new Scanner(System.in);
        do {//Necesitamos que entre al ciclo por lo menos 1 vez
            System.out.println("Ingrese digito a buscar");//Pide al usuario que ingrese el digito
            a = z.nextInt();//Asigna el valor que ingresan por teclado a la variable a
        } while ((a > 9) || (a < 0));//Verificar que sea un digito el entero que ingresa
    }

    public void mostrar_digitos() {//Metodo para mostrar en pantalla los digitos que concuerdan
        int aux = 0;
        for (int i = 0; i < tam; i++) {//Recorrer el arreglo buscando los digitos
            k = (b[i] % 10);//Encuentra los digitos 
            if (k == a) {//Verifica que el digito encontrado sea igua lal digito ingresado en pantalla
                System.out.println("Los numeros que concuerdan con el digito son : " + b[i]);//Muestra en pantalla los digitos encontrados
                aux++;//Una vez se encuentra por lo menos 1 digito que concuerde ya no puede entrar al condicional que muestra que no fueron encontrados
            }
        }
        if (aux == 0)//Si no concuerda ningun digito el condicional se cumple y muestra en pantalla el println
        {
            System.out.println("No se encontraron numeros terminados en ese digito");//En caso de no encontrar digito lo muestra en pantalla
        }
    }
}