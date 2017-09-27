public class Caracteres {
    // un char es internamente un numero de 16bits sin signo
    // 0..65535
    static char letra = '@';
    static char iniciacionPorDefecto;
    
    // un String es un arreglo de char
    // y no olvidar que es un Objeto
    // (notese que parte con mayuscula)
    static String palabra = "este es un objeto String";
    
    public static void asignacionNumerica(){
        letra = 65; // letra A mayuscula
        
        char letraLocal = 'A';
        
        if (letra == letraLocal){
            System.out.println("ambas son letras A ...");
        }
    }
    
    public static void objetoString(){
        palabra = "A";
        letra   = 'A';
        
        //ESTO NO COMPILA, NO SE PUDE COMPARA
        // un Objeto con un primitivo
        // if (palabra == letra){ ... }
        
    }
    
    
}