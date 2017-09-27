class Punto {....}
class PuntoColor {....}
....
PuntoColor pc;
pc=new Punto(....) // error!!

Punto P;
PuntoColor pc1=new PuntoColor();
pc1=p;  // error!!

pc1=(PuntoColor) p;}