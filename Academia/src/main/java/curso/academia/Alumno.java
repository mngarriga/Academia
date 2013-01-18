/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package curso.academia;

import java.util.Set;

/**
 *
 * @author Usuario
 */
public class Alumno {
    private Integer id;
    private String nombre;
    private Set<Asignatura> asignaturas;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 29 * hash + (this.id != null ? this.id.hashCode() : 0);
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
        final Alumno other = (Alumno) obj;
        if (this.id != other.id && (this.id == null || !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }
    
    
    
    public void addAsignatura(Asignatura newAsignaturas) {
        
            if (!(asignaturas.contains(newAsignaturas)) ) {
                asignaturas.add(newAsignaturas);
               // newAsignatura.addAlumno(this); 
            }
        }
        
    }
    
//    public void removeAsignatura(Asignatura newAsignatura) {
//        asignatura.remove(newAsignatura);
//    }
    
    

