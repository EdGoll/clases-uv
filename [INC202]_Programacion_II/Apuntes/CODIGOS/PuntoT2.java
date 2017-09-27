public static void main (String args []){
Rectangulos1 rect = new Rectangulos1();
System.out.print("Llamar a constRect con las coordenadas : 25,25,50,50:");
rect.consRect(25,25,50,50);
rect.printRect();
System.out.print("Llamar a constRect con los puntos (10,10) y (20):");
rect.consRect(new PuntoT(10,10),new PuntoT(20));
rect.printRect();
System.out.print("Llamar a constRect con los puntos (0,0) y los valores 50,50 :");
rect.consRect(new PuntoT(),50,50);
rect.printRect();
PuntoT a=new PuntoT(3,5);
PuntoT b=new PuntoT();
PuntoT c=new PuntoT(4);
a.mostrar();
int v=2,w=4;
a.desplazar(v,w);
a.mostrar();
b.mostrar();
b.desplazar(v);
b.mostrar();		
short z=3;
c.mostrar();
c.desplazar(z);
c.mostrar();		
byte p=7;
a.desplazar(p);
a.mostrar();}}


