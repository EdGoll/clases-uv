import java.util.StringTokenizer;

//ESTA CLASE INCORPORA LOS METODOS DE ASCII Y MORSE, ESTE RECIBE LA PALABRA RANDOM DESDE INTERFAZMOSTRAR(AQUI EL METODO RANDOM ES INVOCADO) Y AQUI LO TRANSFORMA EN MORSE Y ASCII Y LO DEVUELVE A INTERFAZMOSTRAR

public class transformar{ //ESTA CLASE POSEE DOS 
    
    //metodo
    public static String transformarmorse(String Palabra){
    String cad=Palabra;
    String guardar="";
    StringTokenizer tokens = new StringTokenizer(cad);
    while(tokens.hasMoreTokens()){
        System.out.println(tokens.nextToken());
    }
    System.out.println("\n\n");
    
    String [ ] palabra = cad.split(""); 
    int j=0;
    //hasta aqui todo bien.
        while(j <= palabra.length-1){ //recorro morse
        if (palabra[j].equals("a")) {
            guardar=(".- ")+guardar ;
        } else if (palabra[j].equals("b")) {
            guardar=("-... ")+guardar ;
        } else if (palabra[j].equals("c")) {
            guardar=("-.-. ")+guardar ;
        } else if (palabra[j].equals("d")) {
            guardar=("-.. ")+guardar ;
        } else if (palabra[j].equals("e")) {
            guardar=(". ")+guardar ;
        } else if (palabra[j].equals("f")) {
            guardar=("..-. ")+guardar ;
        } else if (palabra[j].equals("g")) {
            guardar=("--. ")+guardar ;
        } else if (palabra[j].equals("h")) {
            guardar=("... ")+guardar ;
        } else if (palabra[j].equals("i")) {
            guardar=(".. ")+guardar ;
        } else if (palabra[j].equals("j")) {
            guardar=(".--- ")+guardar ;
        } else if (palabra[j].equals("k")) {
            guardar=("-.- ")+guardar ;
        } else if (palabra[j].equals("l")) {
            guardar=(".-.. ")+guardar ;
        } else if (palabra[j].equals("m")) {
            guardar=("-- ")+guardar ;
        } else if (palabra[j].equals("n")) {
            guardar=("-. ")+guardar ;
        } else if (palabra[j].equals("o")) { 
            guardar=("--- ")+guardar ;
        } else if (palabra[j].equals("p")) {
            guardar=(".--. ")+guardar ;
        } else if (palabra[j].equals("q")) {
            guardar=("--.- ")+guardar ;
        } else if (palabra[j].equals("r")) {
            guardar=(".-. ")+guardar ;
        } else if (palabra[j].equals("s")) {
            guardar=("... ")+guardar ;
        } else if (palabra[j].equals("t")) {
            guardar=("- ")+guardar ;
        } else if (palabra[j].equals("u")) {
            guardar=("..- ")+guardar ;
        } else if (palabra[j].equals("v")) {
            guardar=("...- ")+guardar ;
        } else if (palabra[j].equals("w")) {
            guardar=(".-- ")+guardar ;
        } else if (palabra[j].equals("x")) {
            guardar=("-..- ")+guardar ;
        } else if (palabra[j].equals("y")) {
            guardar=("-.-- ")+guardar ;
        } else if (palabra[j].equals("z")) {
            guardar=("--.. ")+guardar ;
        } else if (palabra[j].equals("0")) {
            guardar=("- - - - - ")+guardar ;
        } else if (palabra[j].equals("1")) {
            guardar=(".- - - - ")+guardar ;
        } else if (palabra[j].equals("2")) {
            guardar=("..- - - ")+guardar ;
        } else if (palabra[j].equals("3")) {
            guardar=("...- - ")+guardar ;
        } else if (palabra[j].equals("4")) {
            guardar=("....- ")+guardar ;
        } else if (palabra[j].equals("5")) {
            guardar=("..... ")+guardar ;
        } else if (palabra[j].equals("6")) {
            guardar=("-.... ")+guardar ;
        } else if (palabra[j].equals("7")) {
            guardar=("- -... ")+guardar ;
        } else if (palabra[j].equals("8")) {
            guardar=("- - -.. ")+guardar ;
        } else if (palabra[j].equals("9")) {
            guardar=("- - - -. ")+guardar ;
        }
        j++;
        
    }
    guardar=("      ")+guardar; //hago un espacio para separar morse y ascii
    System.out.println("palabra"+ guardar);
    j=0;
        while(j <= palabra.length-1){
        if (palabra[j].equals("a")) {
            guardar=("&#65; ")+guardar ;
        } else if (palabra[j].equals("b")) {
            guardar=("&#66; ")+guardar ;
        } else if (palabra[j].equals("c")) {
            guardar=("&#67; ")+guardar ;
        } else if (palabra[j].equals("d")) {
            guardar=("&#68; ")+guardar ;
        } else if (palabra[j].equals("e")) {
            guardar=("%#69; ")+guardar ; //HASTA AQUI ALCANCE A HACER ASCII, LOS NUMEROS DE ABAJO SON EL COPYPASTE DEL MORSE, LAS DEMAS ASCII ESTAN EN LA HOJA DEL PROFE!
        } else if (palabra[j].equals("f")) {
            guardar=("%#70; ")+guardar ;
        } else if (palabra[j].equals("g")) {
            guardar=("%#71; ")+guardar ;
        } else if (palabra[j].equals("h")) {
            guardar=("%#72; ")+guardar ;
        } else if (palabra[j].equals("i")) {
            guardar=("%#73; ")+guardar ;
        } else if (palabra[j].equals("j")) {
            guardar=("%#74; ")+guardar ;
        } else if (palabra[j].equals("k")) {
            guardar=("%#75; ")+guardar ;
        } else if (palabra[j].equals("l")) {
            guardar=("%#76; ")+guardar ;
        } else if (palabra[j].equals("m")) {
            guardar=("%#77; ")+guardar ;
        } else if (palabra[j].equals("n")) {
            guardar=("%#78; ")+guardar ;
        } else if (palabra[j].equals("o")) { 
            guardar=("%#79; ")+guardar ;
        } else if (palabra[j].equals("p")) {
            guardar=("%#80; ")+guardar ;
        } else if (palabra[j].equals("q")) {
            guardar=("%#81; ")+guardar ;
        } else if (palabra[j].equals("r")) {
            guardar=("%#82; ")+guardar ;
        } else if (palabra[j].equals("s")) {
            guardar=("%#83; ")+guardar ;
        } else if (palabra[j].equals("t")) {
            guardar=("%#84; ")+guardar ;
        } else if (palabra[j].equals("u")) {
            guardar=("%#85; ")+guardar ;
        } else if (palabra[j].equals("v")) {
            guardar=("%#86; ")+guardar ;
        } else if (palabra[j].equals("w")) {
            guardar=("%#87; ")+guardar ;
        } else if (palabra[j].equals("x")) {
            guardar=("%#88; ")+guardar ;
        } else if (palabra[j].equals("y")) {
            guardar=("%#89; ")+guardar ;
        } else if (palabra[j].equals("z")) {
            guardar=("%#90; ")+guardar ; 
        } else if (palabra[j].equals("0")) {
            guardar=("%#48; ")+guardar ;
        } else if (palabra[j].equals("1")) {
            guardar=("%#49; ")+guardar ;
        } else if (palabra[j].equals("2")) {
            guardar=("%#50; ")+guardar ;
        } else if (palabra[j].equals("3")) {
            guardar=("%#51; ")+guardar ;
        } else if (palabra[j].equals("4")) {
            guardar=("%#52; ")+guardar ;
        } else if (palabra[j].equals("5")) {
            guardar=("%#53; ")+guardar ;
        } else if (palabra[j].equals("6")) {
            guardar=("%#54; ")+guardar ;
        } else if (palabra[j].equals("7")) {
            guardar=("%#55; ")+guardar ;
        } else if (palabra[j].equals("8")) {
            guardar=("%#56; ")+guardar ;
        } else if (palabra[j].equals("9")) {
            guardar=("%#57; ")+guardar ;
        }
        j++;
        
        }
    return guardar; //LO ENVIO A INTERFAZMOTRAR JBUTTON1 METODO(BOTON CONTINUAR SEGUNDA VENTANA)
    }
}