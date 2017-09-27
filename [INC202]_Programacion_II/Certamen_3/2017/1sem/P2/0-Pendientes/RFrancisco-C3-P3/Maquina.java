public class Maquina{
    //Aqui Funciona la maquina para que pueda jugar contra el usuario
    public int Artificial(int iteraciones, int modo, Tablero ta){
        int mflocal = 0; int mclocal = 0;
        int valor = eval(ta);
        if (valor != 2 || iteraciones==5) return valor;
        if (modo == 1) valor = -100; 
        else valor = 100;
        for (int i = 1; i < 4; i++){
            for (int j = 1; j < 4; j++){
                if (ta.tablero[i][j].equals("-")) {
                    if (modo == 1) {
                        ta.tablero[i][j] = "O";
                        int val = Artificial(iteraciones+1,2, ta);
                        if (valor < val) {
                        valor = val; mflocal = i; mclocal = j; }
                    }
                    else {
                        ta.tablero[i][j] = "X";
                        int val = Artificial(iteraciones+1, 1, ta);
                        if (valor > val) {
                            valor = val; mflocal = i; mclocal = j;
                        }
                    }
                    ta.tablero[i][j] = "-";
                }
            }
            ta.fila = mflocal;
            ta.columna = mclocal;
        }
    return valor;
  }
  public int eval(Tablero ta){
    int i, j;
    String ganador = "-";
    for (i = 1; i < 4; i++) {
      if ((!ta.tablero[i][1].equals("-")) && (ta.tablero[i][1].equals(ta.tablero[i][2])) && (ta.tablero[i][2].equals(ta.tablero[i][3])))
        ganador = ta.tablero[i][1];
    }
    for (j = 1; j < 4; j++) {
      if ((!ta.tablero[1][j].equals("-")) && (ta.tablero[1][j].equals(ta.tablero[2][j])) && (ta.tablero[2][j].equals(ta.tablero[3][j])))
        ganador = ta.tablero[1][j];
    }
    if ((!ta.tablero[1][1].equals("-")) && (ta.tablero[1][1].equals(ta.tablero[2][2])) && (ta.tablero[2][2].equals(ta.tablero[3][3]))) {
      ganador = ta.tablero[1][1];
    }
    if ((!ta.tablero[1][3].equals("-")) && (ta.tablero[1][3].equals(ta.tablero[2][2])) && (ta.tablero[2][2].equals(ta.tablero[3][1]))) {
      ganador = ta.tablero[1][3];
    }
    if ("X".equals(ganador)){
        return -1;
    }
    if ("O".equals(ganador)){
        return 1;
    }
    for (i = 1; i < 4; i++){
        for (j = 1; j < 4; j++){
            if (ta.tablero[i][j].equals("-")){
                return 2;
            }
        }
    }
    return 0;
  }
}