public class EjemploA{
  public static void main(String[] args) {
      EjemploA ejemplo= new EjemploA();
      char resp = ejemplo.clasificar(100);
      //System.out.println(resp);
      System.out.println(ejemplo.desclasificar('A'));
  }

  public char clasificar(int valor){
    char resp= ' ';
    if (valor >=91 && valor <= 100) {
      resp = 'A';
    }
    return resp;
  }

int desclasificar(char clase) {
      int valor=0;
   switch(clase) {
      case 'A':{
        valor = 91;
        break;
      }
      case 'B':{
        valor = 81;
        break;
      }
      case 'C': {
        valor = 71;break;}
      case 'F': {valor = 0;break;}
      default : {
        valor=0;
        break;
      }
    }
  return valor;
}
}
