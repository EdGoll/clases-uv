
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Conjunto {

    protected List<Integer> numeros;
    private int tamanio;

    public Conjunto(int tamanio) {
        numeros = new ArrayList<Integer>();
        this.tamanio = tamanio;
    }

    public Conjunto(List<Integer> numeros) {
        this.numeros = numeros;
    }

    public Conjunto union(Conjunto c) {
        List<Integer> numerosAux = new ArrayList<Integer>();
        numerosAux.addAll(this.numeros);
        for (Integer obj : c.numeros) {
            if (!pertenece(obj)) {
                numerosAux.add(obj);
            }
        }
        return new Conjunto(numerosAux);
    }

    public Conjunto interseccion(Conjunto c) {
        List<Integer> numerosAux = new ArrayList<Integer>();

        for (Integer obj : c.numeros) {
            if (pertenece(contains(obj))) {
                numerosAux.add(obj);
            }
        }

        return new Conjunto(numerosAux);
    }

    public boolean pertenece(Integer numero) {
        return this.numeros.contains(numero);
    }

    public boolean isSubConjunto(Conjunto c) {
        boolean status = true;
        int count = 0;
        while (count < c.numeros.size() && status) {
            status = pertenece(c.numeros.get(count));
            count++;
        }
        return status;
    }

    public Conjunto diferencia(Conjunto c) {
        List<Integer> numerosAux = new ArrayList<Integer>();
        
        for (Integer obj : this.numeros) {
            if (!c.pertenece(obj)) {
                numerosAux.add(obj);
            }
        }
        
        return new Conjunto(numerosAux);
    }

    public boolean isVacio() {
        return numeros.isEmpty();
    }

    public final void llenar() {
        Random rand = new Random();
        for (int i = 0; i < tamanio; i++) {
            this.numeros.add(rand.nextInt(100) + 1);
        }
    }

    @Override
    public String toString() {
        String conjuntoExtension = "{";
        for (Integer numero : numeros) {
            conjuntoExtension += numero + ", ";
        }
        return conjuntoExtension.substring(0, conjuntoExtension.length() - 2) + "}";
    }
}
