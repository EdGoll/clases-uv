
import java.util.Scanner;

public class ConjuntoImpl {

    public static int getTamanio() {
        int tamanio = -1;
        Scanner sc = new Scanner(System.in);

        do {
            try {
                System.out.print("Ingrese el tamaño del conjunto ");
                tamanio = sc.nextInt();
            } catch (Exception ex) {
                System.out.println("Error: Valor inválido. Ingréselo nuevamente.");
                tamanio = -1;
            }
        } while (tamanio < 0);
        return tamanio;
    }

    public static void main(String[] args) {
        Conjunto A = new Conjunto(getTamanio());
        Conjunto B = new Conjunto(getTamanio());

        System.out.println();
        System.out.println("Conjunto A: " + A.toString());
        System.out.println();
        System.out.println("Conjunto B: " + B.toString());
        System.out.println();
        System.out.println("A union B: " + A.union(B).toString());
        System.out.println();
        System.out.println("A intersectado B: " + A.interseccion(B).toString());
        System.out.println();
        System.out.println("A diferencia B: " + A.diferencia(B).toString());
        System.out.println();
        System.out.println("B diferencia A: " + B.diferencia(A).toString());        
        System.out.println();
        System.out.println("A sub B ?: " + (A.isSubConjunto(B) ? "SI" : "NO"));
        System.out.println();
        System.out.println("B sub A ?: " + (B.isSubConjunto(A) ? "SI" : "NO"));
    }
}
