/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package curso.academia;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 *
 * @author Usuario
 */
public class Aula {

    private String nombre;
    private int capacidad;
    private boolean tieneProyector;
    private ArrayList<Horario> horarios;

    public Aula(String nombre, int capacidad, boolean tieneProyector) {
        this.nombre = nombre;
        this.capacidad = capacidad;
        this.tieneProyector = tieneProyector;
        horarios = new ArrayList<Horario>();
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

        for (Horario horario : horarios) {
            gc.setTime(horario.getHoraI());
            horaILs = gc.get(Calendar.HOUR);
            gc.setTime(horario.getHoraF());
            horaFLs = gc.get(Calendar.HOUR);

            if ((horaAuxI > horaILs && horaAuxI < horaFLs) ||
                (horaAuxF > horaILs && horaAuxF < horaFLs)){
                return false;
            }
        }
        return true;
    }

    public void addHorario(Date horaI, Date horaF, Asignatura asignatura) {
        horarios.add(new Horario(horaI, horaF, this, asignatura));
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
