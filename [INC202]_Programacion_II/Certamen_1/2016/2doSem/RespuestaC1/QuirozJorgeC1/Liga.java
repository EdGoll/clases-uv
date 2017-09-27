import java.util.Random;

public class Liga{

public Random shuffle;
public Equipo[] octavos = new Equipo[16];
public Equipo[] cuartos = new Equipo[8];
public Equipo[] semi = new Equipo[4];
public Equipo[] fin = new Equipo[2];

public void generarEquipos(){
//generar nombres numeros aleatorios
	shuffle = new Random();
	int[] name = new int[16];
	
	for (int i=0;i<16;i++){
		name[i]=shuffle.nextInt(50);
		}
//validar que numeros sean distintos
	for (int i=0;i<16;i++){
		for (int j=0;j<16;j++){
			if (name[i]==name[j])
				name[i]=shuffle.nextInt(50);
		}
	}

for (int i=0;i<16;i++){
	octavos[i] = new Equipo();
	octavos[i].setNombre(String.valueOf(name[i]));
	if (i<8){
		cuartos[i] = new Equipo();
		if (i<4){
			semi[i] = new Equipo();
			if (i<2){
				fin[i] = new Equipo();
			}
		}
	}
}
}
	public void partidoOctavos(){
	System.out.println("Octavos de final");
		Random shuffle = new Random();

	for (int i=0;i<8;i++){
		int equip1, equip2;
		String winner;

	equip1=shuffle.nextInt(16);
	equip2=shuffle.nextInt(16);

	if (octavos[equip2]!=octavos[equip1]){
	while (octavos[equip1].octavos==true){
		equip1=shuffle.nextInt(16);
	}
	while (octavos[equip2].octavos==true){
	equip2=shuffle.nextInt(16);
	}
	}
	else{
	equip1=shuffle.nextInt(16);
	equip2=shuffle.nextInt(16);
	}

	octavos[equip1].octavos=true;
	octavos[equip2].octavos=true;

	if (octavos[equip1].getJuegoColectivo()>octavos[equip2].getJuegoColectivo()){
		winner=octavos[equip1].nombre;
		cuartos[i]=octavos[equip1];
	}
	else{
		winner=octavos[equip2].nombre;
		cuartos[i]=octavos[equip2];
	}
	System.out.println("Equipo "+octavos[equip1].nombre+ "(nivel de juego: "+octavos[equip1].getJuegoColectivo()+
		" ) v/s Equipo "+octavos[equip2].nombre+ "(nivel de juego: "+octavos[equip2].getJuegoColectivo()+
		" ). Resultado: Ganador Equipo "+winner);
	cuartos[i].octavos=true;
}	
}

public void partidoCuartos(){
	System.out.println("Cuartos de final");
		Random shuffle = new Random();

	for (int i=0;i<4;i++){
		int equip1, equip2;
		String winner;

	equip1=shuffle.nextInt(8);
	equip2=shuffle.nextInt(8);

	if (cuartos[equip2]!=cuartos[equip1]){
	while (cuartos[equip1].cuartos==true){
		equip1=shuffle.nextInt(8);
	}
	while (cuartos[equip2].cuartos==true){
	equip2=shuffle.nextInt(8);
	}
	}
	else{
	equip1=shuffle.nextInt(8);
	equip2=shuffle.nextInt(8);
	}

	cuartos[equip1].cuartos=true;
	cuartos[equip2].cuartos=true;

	if (cuartos[equip1].getJuegoColectivo()>cuartos[equip2].getJuegoColectivo()){
		winner=cuartos[equip1].nombre;
		semi[i]=cuartos[equip1];
	}
	else{
		winner=cuartos[equip2].nombre;
		semi[i]=cuartos[equip2];
	}
	System.out.println("Equipo "+cuartos[equip1].nombre+ "(nivel de juego: "+cuartos[equip1].getJuegoColectivo()+
		" ) v/s Equipo "+cuartos[equip2].nombre+ "(nivel de juego: "+cuartos[equip2].getJuegoColectivo()+
		" ). Resultado: Ganador Equipo "+winner);
	semi[i].cuartos=true;
}	
}

public void partidoSemi(){
	System.out.println("Semi final");
	shuffle = new Random();

	for (int i=0;i<2;i++){
		int equip1, equip2;
		String winner;

	equip1=shuffle.nextInt(4);
	equip2=shuffle.nextInt(4);

	if (semi[equip2]!=semi[equip1]){

	while (semi[equip1].semi==true){
		equip1=shuffle.nextInt(4);
	}
	while (semi[equip2].semi==true){
	equip2=shuffle.nextInt(4);
	}
	}
	else{
	equip1=shuffle.nextInt(4);
	equip2=shuffle.nextInt(4);
	}

	semi[equip1].semi=true;
	semi[equip2].semi=true;

	if (semi[equip1].getJuegoColectivo()>semi[equip2].getJuegoColectivo()){
		winner=semi[equip1].nombre;
		fin[i]=semi[equip1];
	}
	else{
		winner=semi[equip2].nombre;
		fin[i]=semi[equip2];
	}
	System.out.println("Equipo "+semi[equip1].nombre+ "(nivel de juego: "+semi[equip1].getJuegoColectivo()+
		" ) v/s Equipo "+semi[equip2].nombre+ "(nivel de juego: "+semi[equip2].getJuegoColectivo()+
		" ). Resultado: Ganador Equipo "+winner);
	}
}

public void partidoFinal(){
	System.out.println("Final");
	String winner;

	
	if (fin[0].getJuegoColectivo()>fin[1].getJuegoColectivo()){
		winner=fin[0].nombre;
	}
	else{
		winner=fin[1].nombre;
	}
	System.out.println("Equipo "+fin[0].nombre+ "(nivel de juego: "+fin[0].getJuegoColectivo()+
		" ) v/s Equipo "+fin[1].nombre+ "(nivel de juego: "+fin[1].getJuegoColectivo()+
		" ). Resultado: Ganador Equipo "+winner);
}
}

