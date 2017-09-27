package Porcentajes;
import java.util.ArrayList;
import java.util.List;
public class Respuestas {
    private List<Preguntas> listaPreguntas;
    List<String> lineas;
    FuenteDeDatos nw = new FuenteDeDatos();
    private Preguntas Pr;
    Respuestas(){
        listaPreguntas = new ArrayList<Preguntas>();
        lineas = nw.leerArchivo("C:\\Users\\system.1\\Documents\\dataset.txt");
        Datos();
    }
    private void Datos(){
        Preguntas Pr;
        for (String linea : lineas) {
            Pr = new Preguntas();
            Pr.setPais(linea.substring(0, 28));
            Pr.setRNM(linea.substring(28, 39));
            Pr.setPE(linea.substring(39));
            listaPreguntas.add(Pr);
        }

    }
    public void paisMayorRNM(){
                int cont1 = 0;
        int cont2 = 0;
        int i = 0;
        String[] paises = new String[100];
        float[] Rnm = new float[100];
        for(Preguntas listaPregunta : listaPreguntas){
            paises[i] = listaPregunta.getPais();
            Rnm[i] = Float.parseFloat(listaPregunta.getRNM());
            ++i;
        }
        for (int j = 0; j < 99; j++) {
            if(Rnm[cont1] >= Rnm[j+1]){
                if(Rnm[j] == Rnm[j+1]){
                    cont2 = j+1;                     
                }
            }
            else{
                cont1 = j + 1;
            }
        }
        if(Rnm[cont1] == Rnm[cont2]){
            System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------------------");
            System.out.println("Los paises con mayor recien nacidos muertos son: " + paises[cont1] + " y " + paises[cont2] + "\nCon " + Rnm[cont1] + "Recien nacodos muertos por cada 1000.");
            System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------------------");
        }
        else{
            System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------------------");
           System.out.println("El pais con mas recien nacidos muertos es " + paises[cont1] + "con " + Rnm[cont1] + " Recien nacidos muertos por cada 1000.");
           System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------------------");
        }
    }
    public void paisMenorRNM(){
        int cont1 = 0;
        int cont2 = 0;
        int i = 0;
        String[] paises = new String[100];
        float[] Rnm = new float[100];
        for(Preguntas listaPregunta : listaPreguntas){
            paises[i] = listaPregunta.getPais();
            Rnm[i] = Float.parseFloat(listaPregunta.getRNM());
            ++i;
        }
        for (int j = 0; j < 99; j++) {
            if(Rnm[cont1] <= Rnm[j+1]){
                if(Rnm[j] == Rnm[j+1]){
                    cont2 = j+1;                     
                }
            }
            else{
                cont1 = j + 1;
            }
        }
        if(Rnm[cont1] == Rnm[cont2]){
            System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------------------");
            System.out.println("Los paises con menor recien nacidos muertos son: " + paises[cont1] + " y " + paises[cont2] + "\nCon " + Rnm[cont1] + "Recien nacodos muertos por cada 1000.");
            System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------------------");
        }
        else{
            System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------------------");
           System.out.println("El pais con menos recien nacidos muertos es " + paises[cont1] + "con " + Rnm[cont1] + " Recien nacidos muertos por cada 1000.");
           System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------------------");
        }
    }
public void paisMayorPE(){
        int cont1 = 0;
        int cont2 = 0;
        int i = 0;
        String[] paises = new String[100];
        float[] pe = new float[100];
        for(Preguntas listaPregunta : listaPreguntas){
            paises[i] = listaPregunta.getPais();
            pe[i] = Float.parseFloat(listaPregunta.getPE());
            ++i;
        }
        for (int j = 0; j < 99; j++) {
            if(pe[cont1] >= pe[j+1]){
                if(pe[j] == pe[j+1]){
                    cont2 = j+1;                     
                }
            }
            else{
                cont1 = j + 1;
            }
        }
        if(pe[cont1] == pe[cont2]){
            System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------------------");
            System.out.println("Los paises con mayor porcentaje de empleabilidad para personas mayores de 15 anios son: " + paises[cont1] + " y " + paises[cont2] + "\n Con %" + pe[cont1]);
            System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------------------");
        }
        else{
            System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------------------");
           System.out.println("El pais con mayor porcentaje de empleabilidad para personas mayores de 15 anios es: " + paises[cont1] + "\n Con %" + pe[cont1]);
           System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------------------");
        }
    }
public void paisMenorPE(){
        int cont1 = 0;
        int cont2 = 0;
        int i = 0;
        String[] paises = new String[100];
        float[] pe = new float[100];
        for(Preguntas listaPregunta : listaPreguntas){
            paises[i] = listaPregunta.getPais();
            pe[i] = Float.parseFloat(listaPregunta.getPE());
            ++i;
        }
        for (int j = 0; j < 99; j++) {
            if(pe[cont1] <= pe[j+1]){
                if(pe[j] == pe[j+1]){
                    cont2 = j+1;                     
                }
            }
            else{
                cont1 = j + 1;
            }
        }
        if(pe[cont1] == pe[cont2]){
            System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------------------");
            System.out.println("Los paises con menor porcentaje de empleabilidad para personas mayores de 15 anios son: " + paises[cont1] + " y " + paises[cont2] + "\n Con %" + pe[cont1]);
            System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------------------");
        }
        else{
            System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------------------");
           System.out.println("El pais con menor porcentaje de empleabilidad para personas mayores de 15 anios es: " + paises[cont1] + "\n Con %" + pe[cont1]);
           System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------------------");
        }
    }
    public void TotalRNM(){
        float cont1; //Variable que almacena el valor numerico de un String
        float cont2 = 0; // Variable que guarda la suma
        int cont3 = 0;
        for (Preguntas listaPregunta : listaPreguntas) {
                cont1 = Float.parseFloat(listaPregunta.getRNM()); 
                cont2 = cont2 + cont1;
                cont3++;
        }
        System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("En un total de " + cont3 + " paises, son " + cont2 + " los recien nacidos muertos.");
        System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------------------");
    }
    public void mostrarDatos(){
        int i = 0;
        System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("Pais                        Recien nacidos muertos por cada mil                                    Porcentaje personas mayores de 15 años que trabaja");
        for(Preguntas listaPregunta : listaPreguntas){
            System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------------------");
            System.out.println(listaPregunta.getPais()+listaPregunta.getRNM()+listaPregunta.getPE());            
            
        }
        System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------------------");
    }
}
