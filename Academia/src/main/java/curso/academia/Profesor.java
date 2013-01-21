/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package curso.academia;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author Usuario
 */
public class Profesor {
    private int id;
    private String nombre;
    private  static Integer genId = 0;
    
    HashSet<Asignatura> asignaturasProfeesor = new HashSet<Asignatura>();

    public Profesor(String nombre) {
        
        this.id = genId++;
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public HashSet<Asignatura> getAsignaturasProfeesor() {
        return asignaturasProfeesor;
    }
    
    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public void addAsignatura(Asignatura newAsignatura) {
        if (asignaturasProfeesor.contains(newAsignatura)){
            asignaturasProfeesor.add(newAsignatura);
            newAsignatura.setProf(this);    
        }
    }
    
    public Set<Alumno> alumnosAtendidosProfesor(){
        Set<Alumno> setAlumnos = new TreeSet<Alumno>();
        for (Asignatura asignatura : asignaturasProfeesor) {
            setAlumnos.addAll(asignatura.getAlumnos());
        }
        
        return setAlumnos;
    }
}
