/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package curso.academia;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.HashSet;

/**
 *
 * @author Usuario
 */
public class Aula {

    private String nombre;
    private int capacidad;
    private boolean tieneProyector;
    private HashSet<Asignatura> asignaturas;

    public Aula(String nombre, int capacidad, boolean tieneProyector) {
        this.nombre = nombre;
        this.capacidad = capacidad;
        this.tieneProyector = tieneProyector;
        asignaturas = new HashSet<Asignatura>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public boolean isTieneProyector() {
        return tieneProyector;
    }

    public void setTieneProyector(boolean tieneProyector) {
        this.tieneProyector = tieneProyector;
    }

    public boolean estaLibre(Date horaI, Date horaF) {
        GregorianCalendar gc = new GregorianCalendar();
        int horaAuxI, horaILs, horaAuxF, horaFLs;

        gc.setTime(horaI);
        horaAuxI = gc.get(Calendar.HOUR);
        gc.setTime(horaF);
        horaAuxF = gc.get(Calendar.HOUR);

        for (Asignatura asignatura : asignaturas) {
            gc.setTime(asignatura.getHoraI());
            horaILs = gc.get(Calendar.HOUR);
            gc.setTime(asignatura.getHoraF());
            horaFLs = gc.get(Calendar.HOUR);

            if ((horaAuxI > horaILs && horaAuxI < horaFLs) ||
                (horaAuxF > horaILs && horaAuxF < horaFLs)){
                return false;
            }
        }
        return true;
    }

    public void addAsignatura(Asignatura asignatura){
        if(estaLibre(asignatura.getHoraI(), asignatura.getHoraF())) {
            asignaturas.add(asignatura);
            asignatura.addAula(this);
        }
    }
    
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 29 * hash + (this.nombre != null ? this.nombre.hashCode() : 0);
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
        final Aula other = (Aula) obj;
        if ((this.nombre == null) ? (other.nombre != null) : !this.nombre.equals(other.nombre)) {
            return false;
        }
        return true;
    }
}
