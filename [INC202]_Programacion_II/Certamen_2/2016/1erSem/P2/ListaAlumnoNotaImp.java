
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class ListaAlumnoNotaImp {

    private List<Alumno> alumnos = null;
    private List<NotaAlumno> notasAlumnosAsignatura1 = null, notasAlumnosAsignatura2 = null;
    private final FuenteDeDatos fd = new FuenteDeDatos();
    private List<String> lineas = null;
    private StringTokenizer stringTokenizer = null;
    private Alumno alumno = null;
    private NotaAlumno notaAlumno = null;

    public ListaAlumnoNotaImp() {
        alumnos = new ArrayList<Alumno>();
        notasAlumnosAsignatura1 = new ArrayList<NotaAlumno>();
        notasAlumnosAsignatura2 = new ArrayList<NotaAlumno>();
        cargarAlumnos();
        cargarNotasAlumnos("asignatura1.csv", notasAlumnosAsignatura1);
        cargarNotasAlumnos("asignatura2.csv", notasAlumnosAsignatura2);
    }

    private void cargarAlumnos() {
        lineas = fd.leerArchivo("/Users/rolivares/Google Drive/Universidad/UV/Programacion_II/Certamen_2/2016/1erSem/alumnos.csv");
        for (String linea : lineas) {
            stringTokenizer = new StringTokenizer(linea, ";");
            if (stringTokenizer.hasMoreElements()) {
                alumno = new Alumno();
                alumno.setId(Integer.parseInt(stringTokenizer.nextToken()));
                alumno.setApellidoPaterno(stringTokenizer.nextToken());
                alumno.setApellidoMaterno(stringTokenizer.nextToken());
                alumno.setNombres(stringTokenizer.nextToken());
                alumnos.add(alumno);
            }
        }
    }

    private void cargarNotasAlumnos(String nombreArchivo, List<NotaAlumno> lista) {
        lineas = fd.leerArchivo("/Users/rolivares/Google Drive/Universidad/UV/Programacion_II/Certamen_2/2016/1erSem/" + nombreArchivo);
        for (String linea : lineas) {
            stringTokenizer = new StringTokenizer(linea, ";");
            if (stringTokenizer.hasMoreElements()) {
                notaAlumno = new NotaAlumno();
                notaAlumno.setIdAlumno(Integer.parseInt(stringTokenizer.nextToken()));
                notaAlumno.setNotaQuiz1(Float.parseFloat(stringTokenizer.nextToken().replace(",", ".")));
                notaAlumno.setNotaQuiz2(Float.parseFloat(stringTokenizer.nextToken().replace(",", ".")));
                notaAlumno.setNotaQuiz3(Float.parseFloat(stringTokenizer.nextToken().replace(",", ".")));
                notaAlumno.setNotaTarea1(Float.parseFloat(stringTokenizer.nextToken().replace(",", ".")));
                notaAlumno.setNotaTarea2(Float.parseFloat(stringTokenizer.nextToken().replace(",", ".")));
                notaAlumno.setNotaCertamen1(Float.parseFloat(stringTokenizer.nextToken().replace(",", ".")));
                notaAlumno.setNotaCertamen2(Float.parseFloat(stringTokenizer.nextToken().replace(",", ".")));
                notaAlumno.setNotaCertamen3(Float.parseFloat(stringTokenizer.nextToken().replace(",", ".")));
                lista.add(notaAlumno);
            }
        }
    }

    public void calcularPromedios() {
        lineas = new ArrayList<String>();
        String linea;
        for (Alumno alumnoAux : alumnos) {
            linea = alumnoAux.getId() + ";";
            for (NotaAlumno notaAlumnoAux : notasAlumnosAsignatura1) {
                if (notaAlumnoAux.getIdAlumno() == alumnoAux.getId()) {
                    linea += String.format("%f", notaAlumnoAux.getPromedioFinal()) + ";";
                    break;
                }
            }
            for (NotaAlumno notaAlumnoAux : notasAlumnosAsignatura2) {
                if (notaAlumnoAux.getIdAlumno() == alumnoAux.getId()) {
                    linea += String.format("%f", notaAlumnoAux.getPromedioFinal());
                    break;
                }
            }
            lineas.add(linea);
        }
        fd.escribirArchivo("/Users/rolivares/Google Drive/Universidad/UV/Programacion_II/Certamen_2/2016/1erSem/consolidado.csv", lineas);
    }
}
