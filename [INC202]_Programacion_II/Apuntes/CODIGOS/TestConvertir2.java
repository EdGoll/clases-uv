public class TestConvertir2{
		
		public void miMetodo(Object param) {
			if (param instanceof Number) {
				Number num = (Number)param;
				System.out.println("Objeto tipo Number : " + num);
			}
		}
		
		public static void main (String args[]){
			TestConvertir2 a = new TestConvertir2();
			a.miMetodo(22.0f);
		}}