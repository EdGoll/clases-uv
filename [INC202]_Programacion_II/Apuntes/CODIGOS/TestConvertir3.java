//import java.lang.Integer;
public class TestConvertir3{
		
		public void miMetodo(Object param) {
			if (param instanceof Number) {
				Number num = (Number)param;
				System.out.println("Objeto tipo Number : " + num);
				double d = num.doubleValue();
				System.out.println("Tipo primitivo double : " + d);
			}
		}
		
		public static void main (String args[]){
			TestConvertir3 a = new TestConvertir3();
			Integer intObjeto = new Integer((int)(23.4));
			System.out.println("Objeto tipo Integer: " + intObjeto);
			a.miMetodo(intObjeto);
		}}