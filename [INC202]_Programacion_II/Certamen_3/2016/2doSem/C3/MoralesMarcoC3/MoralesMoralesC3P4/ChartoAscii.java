
	//---Empieza el codigo
public class ChartoAscii {
/*
* Hecho por Grekz,  https://grekz.wordpress.com
* Version java 5 o superior
* Ej.
* Introduce: a
* Devuelve: El caracter leido es: a
*				Su valor Ascii Decimal es:97
*				Su valor Ascii Hexadecimal es:61
*				Su valor Ascii Octal es:141
*/
public static void main(String[] args) {
    java.util.Scanner in = new java.util.Scanner(System.in);
    char aux = in.next().charAt(0);
    System.out.println("El caracter leido es: " + aux
        + "\n Su valor Ascii Decimal es:" + (int) aux
        + "\n Su valor Ascii Hexadecimal es:" + Integer.toHexString((int) aux)
        + "\n Su valor Ascii Octal es:"+Integer.toOctalString((int)aux));
}
}


