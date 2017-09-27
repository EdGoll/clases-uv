import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class PersonaImp{
	List<String> lineas;
    List<DatosP> personas = new ArrayList<DatosP>();
    Persona persona;

    public void impLineas(){
        FuenteDeDatos fd = new FuenteDeDatos();
        lineas = fd.leerArchivo("registro.txt");
        for(String linea : lineas){
            persona = new DatosP();
            StringTokenizer st = new StringTokenizer(linea,";");
            persona.setDni(st.nextToken());
            persona.setNombre(st.nextToken());
            persona.setApellido(Integer.parseInt(st.nextToken()));
            paciente.setEdad(Integer.parseInt(st.nextToken()));
            paciente.setDireccionL(Integer.parseInt(st.nextToken()));
            paciente.setDireccionP(Integer.parseInt(st.nextToken()));
            paciente.setCalle(Integer.parseInt(st.nextToken()));
            paciente.setNumero(Integer.parseInt(st.nextToken()));
            
            personas.add(persona);
            //System.out.println(persona.toString());
        }

    }
    public void guardarDatos(){
    	
    }
}