Punto p=new Punto();
Object o;
.....
o=p;
o.desplazar(); //error!!
Punto p1 = (Punto)o;
p1.desplazar();

