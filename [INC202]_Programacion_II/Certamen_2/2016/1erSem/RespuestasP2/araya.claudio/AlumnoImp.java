/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

/**
 *
 * @author lab
 */
public class AlumnoImp {

    List<Alumno> listaAlumnos = new ArrayList<>();
    List<Asignatura> listaAsignaturas1 = new ArrayList<>();
    List<Asignatura> listaAsignaturas2 = new ArrayList<>();
    FuenteDeDatos fd;
    List<String> lineas = new ArrayList<>();

    public void cargarAlumnos() {
        fd = new FuenteDeDatos();
        lineas = fd.leerArchivo("alumnos.csv");
        StringTokenizer st;
       
        Alumno a;
        for (String linea : lineas) {
            st = new StringTokenizer(linea, ",");
            a = new Alumno();
            if (st.hasMoreTokens()) {
                a.setId(st.nextToken());
                a.setApPaterno(st.nextToken());
                a.setApMaterno(st.nextToken());
                a.setNombres(st.nextToken());
            }
            listaAlumnos.add(a);

        }
    }

    public void cargarAsignaturas1() {
        fd = new FuenteDeDatos();
        lineas = fd.leerArchivo("asignatura1.csv");
        StringTokenizer st;
       
        Asignatura asig;
        for (String linea : lineas) {
            st = new StringTokenizer(linea, ",");
            asig = new Asignatura();
            float nota1, nota2, nota3;
            float promQ, promT, promC;
            if (st.hasMoreTokens()) {
                asig.setIdAlumno(st.nextToken());
                nota1 = Float.parseFloat(st.nextToken()); //nota quz1
                nota2 = Float.parseFloat(st.nextToken());
                nota3 = Float.parseFloat(st.nextToken());

                promQ = (nota1 + nota2 + nota3) / 3;

                nota1 = Float.parseFloat(st.nextToken());
                nota2 = Float.parseFloat(st.nextToken());
                nota3 = Float.parseFloat(st.nextToken());

                promT = (nota1 + nota2 + nota3) / 3;

                nota1 = Float.parseFloat(st.nextToken());
                nota2 = Float.parseFloat(st.nextToken());
                nota3 = Float.parseFloat(st.nextToken());

                promC = (nota1 + nota2 + nota3) / 3;

                if (promC >= 4.0) {
                    asig.setNotaFinal(promC * 0.7f + promQ * 0.15f + promT * 0.15f);
                } else if (promC >= 3.5) {
                    asig.setNotaFinal(promC * 0.8f + promQ * 0.10f + promT * 0.10f);
                } else if (promC >= 3.0) {
                    asig.setNotaFinal(promC * 0.9f + promQ * 0.05f + promT * 0.05f);
                } else {
                    asig.setNotaFinal(promC);
                }
            }
            listaAsignaturas1.add(asig);

        }

    }

    public void cargarAsignaturas2() {

        fd = new FuenteDeDatos();
        lineas = fd.leerArchivo("asignatura2.csv");
        StringTokenizer st;

        Asignatura asig;
        for (String linea : lineas) {
            st = new StringTokenizer(linea, ",");
            asig = new Asignatura();
            float nota1, nota2, nota3;
            float promQ, promT, promC;
            if (st.hasMoreTokens()) {
                asig.setIdAlumno(st.nextToken());
                nota1 = Float.parseFloat(st.nextToken()); //nota quz1
                nota2 = Float.parseFloat(st.nextToken());
                nota3 = Float.parseFloat(st.nextToken());

                promQ = (nota1 + nota2 + nota3) / 3;

                nota1 = Float.parseFloat(st.nextToken());
                nota2 = Float.parseFloat(st.nextToken());
                nota3 = Float.parseFloat(st.nextToken());

                promT = (nota1 + nota2 + nota3) / 3;

                nota1 = Float.parseFloat(st.nextToken());
                nota2 = Float.parseFloat(st.nextToken());
                nota3 = Float.parseFloat(st.nextToken());

                promC = (nota1 + nota2 + nota3) / 3;

                if (promC >= 4.0) {
                    asig.setNotaFinal(promC * 0.7f + promQ * 0.15f + promT * 0.15f);
                } else if (promC >= 3.5) {
                    asig.setNotaFinal(promC * 0.8f + promQ * 0.10f + promT * 0.10f);
                } else if (promC >= 3.0) {
                    asig.setNotaFinal(promC * 0.9f + promQ * 0.05f + promT * 0.05f);
                } else {
                    asig.setNotaFinal(promC);
                }
            }
            listaAsignaturas2.add(asig);
        }

    }

    public void cargarAlumnosNota() {
        for (Alumno alumno : listaAlumnos) {
            for (Asignatura asignatura1 : listaAsignaturas1) {
                if (alumno.getId().equals(asignatura1.getIdAlumno())) {
                    alumno.setNotaFinal1(asignatura1.getNotaFinal());
                    break;
                }

            }

            for (Asignatura asignatura2 : listaAsignaturas2) {
                if (alumno.getId().equals(asignatura2.getIdAlumno())) {
                    alumno.setNotaFinal2(asignatura2.getNotaFinal());
                    break;
                }

            }

        }

    }

    public AlumnoImp() {
        cargarAlumnos();
        cargarAsignaturas1();
        cargarAsignaturas2();
        cargarAsignaturas2();
    }

}
