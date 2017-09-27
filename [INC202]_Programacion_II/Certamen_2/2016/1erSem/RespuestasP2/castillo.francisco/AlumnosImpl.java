

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;
import java.util.logging.Level;
import java.util.logging.Logger;

public class AlumnosImpl {
    
    private File archivo = new File("consolidado.csv");
    private List<Alumno> listAlumno;
    private List<Asignatura1> listAsig1;
    private List<Asignatura2> listAsig2;
    private List<NotasAlumno> listNT;
    List<String> lineas;
    FuenteDeDatos fd = new FuenteDeDatos();
    Alumno us;
    Asignatura1 ut;
    Asignatura2 ux;
    NotasAlumno uq;
    
    AlumnosImpl() {
        listAlumno = new ArrayList<Alumno>();
        listAsig1 = new ArrayList<Asignatura1>();
        listAsig2 = new ArrayList<Asignatura2>();
        listNT = new ArrayList<NotasAlumno>();
        lineas = fd.leerArchivo("alumnos.csv");
        leerDatos();
    }
    
    private void leerDatos() {
        StringTokenizer st = null;
        for (String linea : lineas) {
            st = new StringTokenizer(linea, ";");
            if (st.hasMoreElements()) {
                us = new Alumno();
                int aux;
                aux = Integer.parseInt(st.nextToken());
                us.setIdentificar(aux);
                us.setApellidoPaterno(st.nextToken());
                us.setApellidoMaterno(st.nextToken());
                us.setNombres(st.nextToken());
                listAlumno.add(us);
            }
        }
        for (String linea : lineas) {
            st = new StringTokenizer(linea, ";");
            if (st.hasMoreElements()) {
                ut = new Asignatura1();
                int aux1;
                float aux;
                aux1 = Integer.parseInt(st.nextToken());
                ut.setIdentificar(aux1);
                aux = Float.parseFloat(st.nextToken());
                ut.setQuiz1(aux);
                aux = Float.parseFloat(st.nextToken());
                ut.setQuiz2(aux);
                aux = Float.parseFloat(st.nextToken());
                ut.setQuiz3(aux);
                aux = Float.parseFloat(st.nextToken());
                ut.setTarea1(aux);
                aux = Float.parseFloat(st.nextToken());
                ut.setTarea2(aux);
                aux = Float.parseFloat(st.nextToken());
                ut.setTarea3(aux);
                aux = Float.parseFloat(st.nextToken());
                ut.setCertamen1(aux);
                aux = Float.parseFloat(st.nextToken());
                ut.setCertamen1(aux);
                aux = Float.parseFloat(st.nextToken());
                ut.setCertamen1(aux);
                listAsig1.add(ut);
            }
        }
        for (String linea : lineas) {
            st = new StringTokenizer(linea, ";");
            if (st.hasMoreElements()) {
                ux = new Asignatura2();
                int aux1;
                float aux;
                aux1 = Integer.parseInt(st.nextToken());
                ux.setIdentificar(aux1);
                aux = Float.parseFloat(st.nextToken());
                ux.setQuiz1(aux);
                aux = Float.parseFloat(st.nextToken());
                ux.setQuiz2(aux);
                aux = Float.parseFloat(st.nextToken());
                ux.setQuiz3(aux);
                aux = Float.parseFloat(st.nextToken());
                ux.setTarea1(aux);
                aux = Float.parseFloat(st.nextToken());
                ux.setTarea2(aux);
                aux = Float.parseFloat(st.nextToken());
                ux.setTarea3(aux);
                aux = Float.parseFloat(st.nextToken());
                ux.setCertamen1(aux);
                aux = Float.parseFloat(st.nextToken());
                ux.setCertamen1(aux);
                aux = Float.parseFloat(st.nextToken());
                ux.setCertamen1(aux);
                listAsig2.add(ux);
            }
        }
    }
    
    public void calculoNotas() {
        
        float ntquiz, nttarea, ntcertamen;
        for (Asignatura1 ut : listAsig1) {
            NotasAlumno uq = null;
            ntquiz = ((ut.getQuiz1() + ut.getquiz2() + ut.getQuiz3()) / 3);
            nttarea = ((ut.getTarea1() + ut.getTarea2() + ut.getTarea3()) / 2);
            ntcertamen = ((ut.getCertamen1() + ut.getCertamen2() + ut.getCertamen3()) / 3);
            uq.setIdentificar(us.getIdentificar());
            uq.setPQ(ntquiz);
            uq.setPT(nttarea);
            uq.setPC(ntcertamen);
            listNT.add(uq);
        }
        for (Asignatura2 ut : listAsig2) {
            NotasAlumno uq = null;
            ntquiz = ((ux.getQuiz1() + ux.getquiz2() + ux.getQuiz3()) / 3);
            nttarea = ((ux.getTarea1() + ux.getTarea2() + ux.getTarea3()) / 2);
            ntcertamen = ((ux.getCertamen1() + ux.getCertamen2() + ux.getCertamen3()) / 3);
            uq.setIdentificar(ux.getIdentificar());
            uq.setPQ(ntquiz);
            uq.setPT(nttarea);
            uq.setPC(ntcertamen);
            listNT.add(uq);
        }
    }
    
    public void promedios() {
        
        for (NotasAlumno uq : listNT) {
            if (uq.getPC() >= 4.0) {
                uq.setPrAsig1(uq.getPC());
            } else if (uq.getPC() >= 3.5) {
                uq.setPrAsig1((float) ((uq.getPC() * 0.8) + (uq.getPQ() * 0.10) + (uq.getPT() * 0.10)));
            } else if (uq.getPC() >= 3.0) {
                uq.setPrAsig1((float) ((uq.getPC() * 0.9) + (uq.getPQ() * 0.05) + (uq.getPT() * 0.05)));
            } else {
                uq.setPrAsig1(uq.getPC());
            }
        }
    }
    
    public void guardarArchivo() {
        
        try {
            PrintWriter pt = new PrintWriter(archivo);
            for (NotasAlumno uq : listNT) {
                pt.println(uq.getIdentificar() + ";" + uq.getPrAsig1() + ";" + uq.getPrAsig2());
            }
        } catch (FileNotFoundException ex) {
            
        }        
    }
}
