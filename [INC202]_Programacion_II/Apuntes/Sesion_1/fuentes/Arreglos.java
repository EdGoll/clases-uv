public class Arreglos {
    int[] miArreglo;
    
    public static void procesarArreglo(int[] arreglo){
        //hacer algo con el arreglo
    }
    
    public static void arregloAnonimo(){
        procesarArreglo(new int[]{1, 2, 3});
    }
    
    public static String[][][][] multiArreglo(){
        String[] []cuatroDim[] [];
        
        cuatroDim = new String[1][2][3][4];
        
        return cuatroDim;
    }
    
    public static String[][][][] arregloDeArreglos(){
        String[] []cuatroDim[] [];
        
        cuatroDim = new String[2][][][];
        cuatroDim[0] = new String[4][][];
        cuatroDim[0][0] = new String[6][];
        cuatroDim[0][0][0] = new String[8];
        
        return cuatroDim;
    }
    
    public static String[][] autoAsignacion(){
        String[][] arreglo;
        arreglo = new String[2][];
        arreglo[0] = new String[7];
        arreglo[1] = arreglo[0];
        
        return arreglo;
    }
    
    public static Object[] inicializacionEnLinea(){
        Object str = new String("string 2");

        // solo funciona de esta forma
        Object[] varios = {"string 1", str, new StringBuffer(str.toString())};
        
        return varios;
    }
    
    public static String[][] DosDimEnLinea(){
        String[][] arr = {{"0,0", "0,1"},
                          {"1,0", new String("1,1"), null}};
                          
        // Object [][] arrObj = arr; //OK si es que soporta el casting
                          
        return arr;                  
    }
    
    public static String[] inicializacionArregloAnonimo(){
        String str3 = "str3";
        return new String[]{"str1", "str2", str3};
    }
}
