/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package curso.academia;

import java.util.Date;

/**
 *
 * @author Usuario
 */
public class Horario {
    private Date horaI;
    private Date horaF;
    private Aula aula;
    private Asignatura asignatura;

    public Horario(Date horaI, Date horaF, Aula aula, Asignatura asignatura) {
        this.horaI = horaI;
        this.horaF = horaF;
        this.aula = aula;
        this.asignatura = asignatura;
    }

    public Aula getAula() {
        return aula;
    }

    public void setAula(Aula aula) {
        this.aula = aula;
    }

    public Asignatura getAsignatura() {
        return asignatura;
    }

    public void setAsignatura(Asignatura asignatura) {
        this.asignatura = asignatura;
    }

    public Date getHoraI() {
        return horaI;
    }

    public void setHoraI(Date horaI) {
        this.horaI = horaI;
    }

    public Date getHoraF() {
        return horaF;
    }

    public void setHoraF(Date horaF) {
        this.horaF = horaF;
    }
    
}
