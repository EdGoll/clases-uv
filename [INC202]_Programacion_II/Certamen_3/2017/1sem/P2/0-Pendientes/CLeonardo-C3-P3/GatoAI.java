package gatomain;


public class GatoAI {

 private int[][] arr;
 public static final int vacio = 0;
 public static final int uno = 1;
 public static final int dos = 2;

 public GatoAI() {
  arr = new int[3][3];
 }


 public int getValor(int i,int j) {
  if(i < 0 || i >= 3) return vacio;
  if(j < 0 || j >= 3) return vacio;
  return arr[i][j];
    }


 public void setValor(int i,int j,int token) {
  if(i < 0 || i >= 3) return;
  if(j < 0 || j >= 3) return;
  arr[i][j] = token;
    }

 
 public int []nextWinMover(int token) {

  for(int i=0;i<3;i++)
   for(int j=0;j<3;j++)
    if(getValor(i, j)==vacio) {
     arr[i][j] = token;
     boolean win = ganador(token);
     arr[i][j] = vacio;
     if(win) return new int[]{i,j};
    }

  return null;
    }

    public int inverse(int token) {
  return token==uno ? dos : uno;
 }

    public int []nextMover(int token) {

        if(getValor(1, 1)==vacio) return new int[]{1,1};

        int winMove[] = nextWinMover(token);
        if(winMove!=null) return winMove;

        for(int i=0;i<3;i++)
            for(int j=0;j<3;j++)
                if(getValor(i, j)==vacio)
                {
                    arr[i][j] = token;
              boolean ok = nextWinMover(inverse(token)) == null;
                    arr[i][j] = vacio;
                    if(ok) return new int[]{i,j};
                }

        for(int i=0;i<3;i++)
            for(int j=0;j<3;j++)
                if(getValor(i, j)==vacio)
                    return new int[]{i,j};

        return null;
    }

 public boolean ganador(int token) {
  final int DI[]={-1,0,1,1};
  final int DJ[]={1,1,1,0};
  for(int i=0;i<3;i++)
   for(int j=0;j<3;j++) {

    if(getValor(i, j)!=token) continue;

    for(int k=0;k<4;k++) {
     int aux = 0;
                 while(getValor(i+DI[k]*aux, j+DJ[k]*aux)==token) aux++;

     if(aux==3) return true;
    }
  }
  return false;
    }
} 