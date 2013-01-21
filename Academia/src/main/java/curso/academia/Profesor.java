/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package curso.academia;

import java.util.HashSet;

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

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public void addAsignatura(Asignatura newAsignatura) {
        asignaturasProfeesor.add(newAsignatura);
    }
}
