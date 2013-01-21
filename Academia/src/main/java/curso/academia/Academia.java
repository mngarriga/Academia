package curso.academia;

import java.util.Date;
import java.util.HashMap;
import java.util.TreeMap;

public class Academia {
    private String nombre;
    private  String direccion;
    
    HashMap<Integer, Alumno> alumnos = new HashMap<Integer, Alumno>();
    HashMap<Integer, Profesor> profesores = new HashMap<Integer, Profesor>();
    HashMap<Integer, Asignatura> asignaturas = new HashMap<Integer, Asignatura>();
    TreeMap<String, Aula> aulas = new  TreeMap<String, Aula>();

    public Academia(String nombre, String direccion) {
        this.nombre = nombre;
        this.direccion = direccion;
    }

    public String getNombre() {
        return nombre;
    }
    public String getDireccion() {
        return direccion;
    }

    public void addAlumno(String nombre) {
        Alumno newAlumno = new Alumno(nombre);
        alumnos.put(newAlumno.getId(), newAlumno);
    }
    
    public void addProfesor(String nombre) {
        Profesor newProfesor = new Profesor(nombre);
        profesores.put(newProfesor.getId(), newProfesor);
    }
    
    public void addAsignatura(String nombre, int horas, Date inicio, Date fin) {
        Asignatura newAsignatura = new Asignatura(nombre, horas, inicio, fin);
        asignaturas.put(newAsignatura.getId, newAsignatura);
    }
    
    public void addAula(String nombre, int cap, boolean tieneProyec) {
        Aula newAula = new Aula(nombre, cap, tieneProyec);
        aulas.put(newAula.getId, newAula);
    }
}
