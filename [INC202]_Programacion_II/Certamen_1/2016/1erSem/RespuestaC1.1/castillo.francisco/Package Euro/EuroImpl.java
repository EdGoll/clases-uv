package Euro;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EuroImpl {
    //Se definen atributos
    Scanner sc = new Scanner(System.in);
    private List<Valores> listeuro;
    List<String> lineas;
    FuenteDeDatos arc = new FuenteDeDatos();
    private Valores pt;
    int[] A = new int[11];
    String[] B = new String[50];
    int cont_fin = 0, cont_ret = 0, cont_elec = 0, cont_cons = 0, cont_car = 0, cont_food = 0, cont_che = 0, cont_mix = 0, cont_util = 0, cont_tel = 0, cont_cosm = 0;
    //Se crea constructor de la clase para importar los datos del archivo
    EuroImpl() {
        listeuro = new ArrayList<Valores>();
        lineas = arc.leerArchivo("/Users/francisco/Desktop/acciones.txt");
        recopilacionDatos();
    }
    //Con la recopilacion de datos se crean los obejtos y se guardan en la lista
    protected void recopilacionDatos() {
        Valores pt;
        for (String linea : lineas) {
            pt = new Valores();
            pt.setNombre(linea.substring(0, 23));
            pt.setPrecio(linea.substring(23, 33));
            pt.setVariacion(linea.substring(33, 41));
            pt.setVar_Porcentaje(linea.substring(41, 50));
            pt.setVolumen(linea.substring(50, 65));
            pt.setPais(linea.substring(65, 68));
            pt.setSector(linea.substring(68, 87));
            pt.setMercadoEvaluado(linea.substring(87, 93));
            pt.setPE(linea.substring(94));
            listeuro.add(pt);
        }
    }

    protected void sector() {

        String aux_1 = null;
        //Se recorre la lista y realiza un conteo por cada tipo y lo guarda en el arreglo
        for (Valores aux : listeuro) {
            if ("financial".equalsIgnoreCase(aux.getSector())) {
                A[0] = cont_fin + 1;
            } else if ("retail".equalsIgnoreCase(aux.getSector())) {
                A[1] = cont_ret + 1;
            } else if ("chemical".equalsIgnoreCase(aux.getSector())) {
                A[2] = cont_che + 1;
            } else if ("electronic".equalsIgnoreCase(aux.getSector())) {
                A[3] = cont_elec + 1;
            } else if ("construction".equalsIgnoreCase(aux.getSector())) {
                A[4] = cont_cons + 1;
            } else if ("car".equalsIgnoreCase(aux.getSector())) {
                A[5] = cont_car + 1;
            } else if ("telecommunication".equalsIgnoreCase(aux.getSector())) {
                A[6] = cont_tel + 1;
            } else if ("utility".equalsIgnoreCase(aux.getSector())) {
                A[7] = cont_util + 1;
            } else if ("mixed".equalsIgnoreCase(aux.getSector())) {
                A[8] = cont_mix + 1;
            } else if ("food".equalsIgnoreCase(aux.getSector())) {
                A[9] = cont_food + 1;
            } else if ("cosmetic".equalsIgnoreCase(aux.getSector())) {
                A[10] = cont_cosm + 1;
            }
        }
        //Se ordena el arreglo de menor a mayor
        for (int i = 0; i < A.length - 1; i++) {
            for (int j = 0; j < A.length - 1; j++) {
                if (A[j] < A[j + 1]) {
                    int tmp = A[j + 1];
                    A[j + 1] = A[j];
                    A[j] = tmp;
                }
            }
        }
        //Se busca el tipo el cual es el item con mayor numero de repeticiones
        if (A[10] == cont_fin) {
            aux_1 = "financial";
        } else if (A[10] == cont_ret) {
            aux_1 = "retail";
        } else if (A[10] == cont_che) {
            aux_1 = "chemical";
        } else if (A[10] == cont_elec) {
            aux_1 = "electronic";
        } else if (A[10] == cont_cons) {
            aux_1 = "construction";
        } else if (A[10] == cont_car) {
            aux_1 = "car";
        } else if (A[10] == cont_tel) {
            aux_1 = "telecommunication";
        } else if (A[10] == cont_util) {
            aux_1 = "utility";
        } else if (A[10] == cont_mix) {
            aux_1 = "mixed";
        } else if (A[10] == cont_food) {
            aux_1 = "food";
        } else if (A[10] == cont_cosm) {
            aux_1 = "cosmetic";
        }
        //Se imprime por pantalla
        System.out.println("El sector financiero que mas se repite es: " + aux_1);
    }
    //Se busca las instituciones con mayor y menor establecidos en diferentes paises 
    protected void paises() {

        for (Valores aux : listeuro) {
            if ("7".equals(aux.getPais())) {
                System.out.println("Institucion Mayor: " + aux.getNombre());
            }
        }
        for (Valores aux : listeuro) {
            if ("1".equals(aux.getPais())) {
                System.out.println("Institucion Menor: " + aux.getNombre());
            }
        }
    }
    //Se busca un objeto a pedido del usuario, ingresado por teclado 
    protected void institucion() {
        //Se declaran atributos 
        System.out.println("Ingrese el nombre de la institucion que desea buscar: ");
        String Aux = sc.nextLine();
        int contador = 0;
        //Se recorre la lista comparando el dato que ingreso el usuario y el objeto.nombre
        for (Valores aux : listeuro) {
            if (Aux.equalsIgnoreCase(aux.getNombre())) {
                System.out.println(aux.getNombre());
                System.out.println(aux.getPrecio());
                System.out.println(aux.getVariacion());
                System.out.println(aux.getVar_Porcentaje());
                System.out.println(aux.getVolumen());
                System.out.println(aux.getPais());
                System.out.println(aux.getSector());
                System.out.println(aux.getMercadoEvaluado());
                System.out.println(aux.getPE());
                contador=1;
            }
        }
        //Si el contador es 0 es por que no encuentra el dato
        if (contador == 0) {
            System.out.println("El nombre de la institucion no se encuentra en la base de datos");
        }
    }
    //Se imprimen por pantalla todos los nombres y volumenes de cada institucion
    protected void valoresMercado() {

        for (Valores aux : listeuro) {
            System.out.println(aux.getNombre() + "    " + aux.getVolumen());
        }
    }
    //Se muestra la cantidad de elementos de la lista
    protected void pe() {
        System.out.println("La cantidad de elementos dentro de la fuente de datos es: " + listeuro.size());
    }
    //Muestra todos los datos en la lista de cada obejto
    protected void muestraDatos() {
        for (Valores aux : listeuro) {
            System.out.println("Nombre: " + aux.getNombre() + " Precio: " + aux.getPrecio() 
                    + " Variacion: " + aux.getVariacion() + " Variacion Porcentaje: " 
                    + aux.getVar_Porcentaje() + " Volumen: " + aux.getVolumen() + " Pais: " 
                    + aux.getPais() + " Sector: " + aux.getSector() + " Mercado Evaluado: " 
                    + aux.getMercadoEvaluado() + " P/E 2005: " + aux.getPE() + "\n");
        }

    }

}
