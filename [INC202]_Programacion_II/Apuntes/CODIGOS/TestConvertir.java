public class TestConvertir{
	
	public void myMethod(Object param) {
		Number num = (Number)param;
		System.out.println("El valor es: " + num);
		}
	public static void main (String args[]){
		TestConvertir a = new TestConvertir();
		a.myMethod(67.8f);
	}}