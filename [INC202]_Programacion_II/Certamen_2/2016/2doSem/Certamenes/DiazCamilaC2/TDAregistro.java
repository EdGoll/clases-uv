

public class TDAregistro {
    
    Nodo cabeza;
    Nodo ultimo;
    
    public TDAregistro(){
        cabeza=null;
        ultimo=null;
    }
    public boolean vacio(){        
        return (cabeza==null);  
    }
    public void insertar(Funcionario fun){ //agregar funcionario
        Nodo n= new  Nodo();
        n.informacion1=fun;
        if(cabeza==null){
            cabeza=n;
            cabeza.siguiente=null;
            ultimo=cabeza;
        }
        else{
            ultimo.siguiente=n;
            n.siguiente=null;
            ultimo=n;
        }
    }
    public void insertar(Academico fun){ //agregar academico
        Nodo n= new  Nodo();
        n.informacion2=fun;
        if(cabeza==null){
            cabeza=n;
            cabeza.siguiente=null;
            ultimo=cabeza;
        }
        else{
            ultimo.siguiente=n;
            n.siguiente=null;
            ultimo=n;
        }
    }
    public void insertar(Alumno fun){ //agregar alumno
        Nodo n= new  Nodo();
        n.informacion3=fun;
        if(cabeza==null){
            cabeza=n;
            cabeza.siguiente=null;
            ultimo=cabeza;
        }
        else{
            ultimo.siguiente=n;
            n.siguiente=null;
            ultimo=n;
        }
    }
    public void eliminar(){         
        if(cabeza!=null){
            cabeza=cabeza.siguiente;
        }
    }
    public void mostrar(){
        Nodo actual= new Nodo();
        actual=cabeza;
        while(cabeza!=null){
            System.out.println(cabeza.informacion1);
            actual=actual.siguiente;
        }
        System.out.println("");
    }
}
