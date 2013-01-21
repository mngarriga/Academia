package curso.academia;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class Academia {

    private String nombre;
    private String direccion;
    HashMap<Integer, Alumno> alumnos = new HashMap<Integer, Alumno>();
    HashMap<Integer, Profesor> profesores = new HashMap<Integer, Profesor>();
    HashMap<Integer, Asignatura> asignaturas = new HashMap<Integer, Asignatura>();
    TreeMap<String, Aula> aulas = new TreeMap<String, Aula>();

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

    public void addAsignatura(String nombre, int horas, Date horaI, Date horaF) {
        Asignatura newAsignatura = new Asignatura(nombre, horas, horaI, horaF);
        asignaturas.put(newAsignatura.getId(), newAsignatura);
    }

    public void addAula(String nombre, int cap, boolean tieneProyec) {
        Aula newAula = new Aula(nombre, cap, tieneProyec);
        aulas.put(newAula.getNombre(), newAula);
    }

    public ArrayList<Aula> aulasLibres(Date horaI, Date horaF) {
        ArrayList<Aula> aulasLibres = new ArrayList<Aula>();
        
        Set<Aula> setAulas = (Set<Aula>) aulas.values();
        
        for (Aula aula: setAulas) {
            if (aula.estaLibre(horaI, horaF)) {
                aulasLibres.add(aula);
            }
        }

        return aulasLibres;
    }
    
    public Set<Alumno> alumnosAtendidosProfesor(Profesor profesor){
        Set<Alumno> setAlumnos = new TreeSet<Alumno>();
        Set<Asignatura> setAsig = profesor.getAsignaturasProfeesor();
        for (Asignatura asignatura : setAsig) {
            setAlumnos.addAll(asignatura.getAlumnos());
        }
        
        return setAlumnos;
    }
}
