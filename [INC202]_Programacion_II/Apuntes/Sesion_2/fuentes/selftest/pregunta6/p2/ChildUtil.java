package selftest.pregunta6.p2;
import selftest.pregunta6.p1.ParentUtil;
public class ChildUtil extends ParentUtil {
    public static void main (String [ ] args) {
        new ChildUtil ( ).callStuff ( ) ;
    }
    void callStuff ( )  {
//        System.out.print ("this " + this.doStuff ( )  ) ;
        ParentUtil p = new ParentUtil ( ) ;
//        System.out.print (" parent " + p.doStuff ( )  ) ;
    }
}