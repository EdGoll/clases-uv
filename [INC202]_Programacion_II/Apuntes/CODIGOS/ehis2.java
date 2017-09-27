public class Prueba{
	int test=10;	
	void prinTest(){
		int test = 20;	
		System.out.println("test = " + test );
		System.out.println("test = " + this.test );}
	public static void main(String arg[]){
		Prueba miObj=new Prueba();
		miObj.prinTest();}}