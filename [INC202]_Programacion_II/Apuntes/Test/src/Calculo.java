
import java.util.ArrayList;
import java.util.Random;
import java.lang.Integer;

public class Calculo {//Inicializa la clase Calculo

    private ArrayList lista = new ArrayList();//Instanciar ArrayList
    private Random rand = new Random();//Instanciar Random
    private int size;//Variable de tipo entero para guardar la cantidad de numeros a ingresar al ArrayList

    public void creartamanio() {//Metodo para crear el limite de valores a guardar en el ArrayList
        size = rand.nextInt(99) + 1;//Entrega un valor random desde 0 hasta 99 para llenar el ArrayList
    }

    public void llenar() {//Metodo para llenar el ArrayList
        for (int lista = 0; lista < size; lista++) {//Repetir hasta el limite "size" ya asignado.
            this.lista.add(rand.nextInt(99));//llenr ArrayList con valores Random
        }
    }

    public int suma() {//Metodo para sumar valores de ArrayList
        int suma = 0;//declarar variable tipo entero para guardar la suma
        for (int lista = 0; lista < size; lista++) {//Recorrer el ArrayList
            suma += Integer.parseInt(this.lista.get(lista).toString());//Sumar todos los valores dentro del ArrayList
        }
        return suma;//Retornar el valor de la suma total
    }

    public void bubble() {//Metodo bubblesort para ordenar los valores del ArrayList
        int sen;//Declarar variable de tipo entero 
        for (int i = 0; i < this.size; i++) {//1er for para recorrer mas de 1 vez el for a continuacion
            for (int j = 0; j < this.size - 1; j++) {//2do for para recorrer el ArrayList completo 
                if (Integer.parseInt(lista.get(j).toString()) > Integer.parseInt(lista.get(j + 1).toString())) {//Condicional para intercambiar las casillas de memoria	
                    sen = Integer.parseInt(this.lista.get(j).toString());//Asigna el valor en la casilla (j) a la variable sen
                    lista.set(j, this.lista.get(j + 1));//Asigna el valor de la casilla (j+1) a la casilla j
                    this.lista.set(j + 1, sen);//Asigna el valor sen a la casilla j+1
                }
            }
        }
    }

    public float promedio() {//Metodo para calcular el promedio
        return this.suma() / size;//Se toma el valor de suma y se divide en size(tamaño total de valores) para calcular el promedio y se retorna
    }

    public void mediana() {//Metodo para calcular la mediana
        int h;//Variable de tipo entero
        float k;//Variable de tipo flotante

        for (int i = 0; i < lista.size(); i++) { //NO SE SI ES NECESARIO MOSTRAR EL ARRAYLIST YA ORDENADO EN PANTALLA PERO EN CASO DE SER ASI BORRAR LOS COMENTARIOS
            System.out.println(i + " .- " + lista.get(i)); // PARA MOSTRAR EN PANTALLA LOS VALORES ORDENADOS
        }

        if (this.lista.size() % 2 == 0) {//Si el tamaño del ArrayList es par veriricando que su modulo sea igual a 0, encontramos la mitad del ArrayList
            k = (int) this.lista.get(size / 2 + 1);//Tomamos el valor que esta en la casilla del medio menos 1 del ArrayList
            h = (int) this.lista.get((size / 2));//Tomamos el valor que es al medio del ArrayList
            k = (k + h) / 2;//Calculamos el promedio entre los 2 valores para encontrar la mediana
            System.out.println("La mediana es : " + k);//Mostramos en pantalla la mediana
        } else {//Si el tamaño del ArrayList es impar entonces simplemente necesitamos dividirlo en 2
            k = (int) this.lista.get(size / 2);//Tomamos el valor que esta en la mitad al ser impar
            System.out.println("La mediana es : " + k);//Mostramos en pantalla el valor impar
        }
    }

    public static void main(String[] args) {//Metodo main el cual da inicio a todos los otros metodos
        Calculo a = new Calculo();//Instancia el objeto Calculo
        a.creartamanio();//Llama al metodo creartamanio para asignar un limite de valores a agregar al ArrayList
        a.llenar();	//Llena el ArrayList con valores random, hasta el limite asignado en creartamanio()	
        System.out.println("La suma de los valores es : " + a.suma());//Muestra en pantalla el valor que retorna suma()
        System.out.println("El promedio es : " + a.promedio());//Llama al metodo promedio y muestra el valor que retorna en pantalla
        a.bubble();//Llama al metodo burbuja para ordenar los valores del ArrayList de menor a mayor
        a.mediana();//Encuentra el valor de la mediana y lo muestra en pantalla
        System.out.println("----------------------\nFin del programa\n----------------------");//Una vez se ejecutan todos los metodos anteriores muestra en pantalla el final del programa
    }
}