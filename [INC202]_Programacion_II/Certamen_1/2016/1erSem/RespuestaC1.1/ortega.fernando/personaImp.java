/*Cuantas personas estan subcontratadas
 cuantas personas sub contratadas son hombre y cuntas mujeres
 cuantas peronas fueron sub contratadas en febrero y trabajna ocn animales?
 en que mes se contrataron mas personas?
 cantidad de mujeres administrativas o prodctivas o directiva(mosrar ambas)
*/
 import java.util.ArrayList;
 import java.util.List;
 import java.util.StringTokenizer;

public  class personaImp{
	private int sub,subh,subm,animalf,enero,febrero,marzo,abril,mayo,junio,julio,agosto,septiembre,octubre,noviembre,diciembre,mayor=0,adm,dir;
	private String mesop;
	ArrayList<personas> per = new ArrayList<personas>();

	FuenteDeDatos fd = new FuenteDeDatos();

	private void LLenar(){
		List lista = fd.leerArchivo("C:\\Users\\Fiov\\Desktop\\tearea\\empleoPlantasDeProceso2005.csv");
		StringTokenizer st;
		personas ps=null;
		for(Object ob : lista){
			st = new StringTokenizer((String)ob,";");
			ps = new personas();
			ps.setanio(st.nextToken());
			ps.setnui(st.nextToken());
			ps.setregion(st.nextToken());
			ps.settrimestre(st.nextToken());
			ps.setmes(st.nextToken());
			ps.setcategoria(st.nextToken());
			ps.setfuncion(st.nextToken());
			ps.setgenero(st.nextToken());
			ps.setocupados(st.nextToken());
			ps.setclase(st.nextToken());
			per.add(ps);
		}
	}
	public void respuestas(){
		for(personas cl : per){
			if(cl.getcategoria().equals("SUBCONTRATO")){
				sub++;
			}
			if(cl.getcategoria().equals("SUBCONTRATO")&& cl.getgenero().equals("hombres")){
				subh++;
			}else if(cl.getcategoria().equals("SUBCONTRATO")&& cl.getgenero().equals("mujeres")){
				subm++;
			}
			if(cl.getcategoria().equals("SUBCONTRATO")&&cl.getmes().equals("febrero")&&cl.getclase().equals("ANIMAL")){
				animalf++;
			}
			if(cl.getgenero().equals("mujeres")&&cl.getfuncion().equals("Administrativos")){
				adm++;
			}
			if(cl.getgenero().equals("mujeres")&&cl.getfuncion().equals("Directivos")){
				dir++;
			}
			if(cl.getmes().equals("enero")){
				enero++;
				if(enero>mayor){
					mesop=cl.getmes();
					mayor=enero;
				}
			}
			if(cl.getmes().equals("febrero")){
				febrero++;
				if(febrero>mayor){
					mesop=cl.getmes();
					mayor=febrero;
				}
			}
			if(cl.getmes().equals("marzo")){
				marzo++;
				if(marzo>mayor){
					mesop=cl.getmes();
					mayor=marzo;
				}
			}
			if(cl.getmes().equals("abril")){
				abril++;
				if(abril>mayor){
					mesop=cl.getmes();
					mayor=abril;
				}
			}
			if(cl.getmes().equals("mayo")){
				mayo++;
				if(mayo>mayor){
					mesop=cl.getmes();
					mayor=mayo;
				}
			}
			if(cl.getmes().equals("junio")){
				junio++;
				if(junio>mayor){
					mesop=cl.getmes();
					mayor=junio;
				}
			}
			if(cl.getmes().equals("julio")){
				julio++;
				if(julio>mayor){
					mesop=cl.getmes();
					mayor=julio;
				}
			}
			if(cl.getmes().equals("agosto")){
				agosto++;
				if(agosto>mayor){
					mesop=cl.getmes();
					mayor=agosto;
				}
			}
			if(cl.getmes().equals("septiembre")){
				septiembre++;
				if(septiembre>mayor){
					mesop=cl.getmes();
					mayor=septiembre;
				}
			}
			if(cl.getmes().equals("octubre")){
				octubre++;
				if(octubre>mayor){
					mesop=cl.getmes();
					mayor=octubre;
				}
			}
			if(cl.getmes().equals("noviembre")){
				noviembre++;
				if(noviembre>mayor){
					mesop=cl.getmes();
					mayor=noviembre;
				}
			}
			if(cl.getmes().equals("diciembre")){
				diciembre++;
				if(diciembre>mayor){
					mesop=cl.getmes();
					mayor=diciembre;
				}
			}
		}
		System.out.println("la cantidad de personas sub contratadas es "+sub);
		System.out.print("la cantidad de hombres sub contratados es " +subh);
		System.out.println(" y de mujeres " +subm);
		System.out.println("la cantidad de personas que trabajaron en febrero y con animales es de "+animalf);
		System.out.println("en el mes " +mesop+ " se contrataron mas peronas");
		System.out.println("la cantidad de mujeres administrativas es " +adm );
		System.out.print("la cantidad de mujeres directiva " +dir);
	}
	public personaImp(){
		LLenar();
	}
}