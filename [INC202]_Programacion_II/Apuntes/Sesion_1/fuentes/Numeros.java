public class Numeros{
    static int seis;
    static int siete;
    static int ocho;
    static int nueve;
    static int diez;
    static int once;
    static int doce;

    public static void octales(){
        seis  = 06;
        siete = 07;
        ocho  = 0000010; // ceros a la izq no afectan
        nueve = 011;
        diez  = 012;
        once  = 013;
        doce  = 014;
    }
    
    public static void hexadecimales(){
        seis  = 0x6;
        siete = 0x7;
        ocho  = 0x0008; // ceros a la izq no afectan
        nueve = 0x9;
        diez  = 0x00000A; // mayusculas y
        once  = 0x00000b; // minusculas no afectan
        doce  = 0Xc;
    }
    
    public static void int2long(){
        long a = 0xffffffffL;
        
        System.out.println(a);
    }
    
    public static byte overflow(){
        byte b1 = 2;
        byte b = (byte) (127 + b1);
//        b= -77;
        System.out.println(Integer.toBinaryString(b));
        
        return b;
    }
    
}
