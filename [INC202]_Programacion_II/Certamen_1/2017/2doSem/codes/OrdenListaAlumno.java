/* Clase Principal - OrdenarListaAlumno */

public class OrdenListaAlumno {

    public static void main(String[] args) {
        ListaAlumno la = new ListaAlumno();
        
        System.out.println("\n Llenando Lista \n");
        la.llenarLista();

        System.out.println("\n Mostrando Lista \n");
        la.mostrarLista();

        System.out.println("\n Dividiendo Lista \n");
        la.dividirListas();

        System.out.println("\n Mostrando Grupos \n");
        la.mostrarGrupos();
    }
}