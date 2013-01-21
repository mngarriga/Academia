/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package curso.academia;

import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author Usuario
 */
public class Asignatura {
    private static Integer idGen = 0;
    private Integer id;
    private String nombre;
    private Profesor prof;
    private Aula aula;
    private int horas;
    private Set<Alumno> alumnos;
    
    
    public Asignatura(){
        id = ++idGen;
        alumnos = new TreeSet<Alumno>();
    }
    
    public Asignatura(String nombre, int horas){
        this();
        this.nombre = nombre;
        this.horas = horas;       
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Profesor getProf() {
        return prof;
    }

    public void setProf(Profesor prof) {
        this.prof = prof;
    }

    public Aula getAula() {
        return aula;
    }

    public void setAula(Aula aula) {
        this.aula = aula;
    }

    public int getHoras() {
        return horas;
    }
    
    public Integer getId() {
        return id;
    }

   public void addAlumno(Alumno alumno){
        if (!alumnos.contains(alumno)) {
            alumnos.add(alumno);
            alumno.addAsignatura(this);
        }
    }
  
    public void removeAlumno(Alumno alumno){
       if (alumnos.contains(alumno)) {
            alumnos.remove(alumno);
            alumno.removeAsignatura(this);
        }
    }
    
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 79 * hash + (this.id != null ? this.id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Asignatura other = (Asignatura) obj;
        if (this.id != other.id && (this.id == null || !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }
    
    
    
}
