package curso.academia;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        GregorianCalendar gc = new GregorianCalendar();
        System.out.println( "Ejericio Academia !!" );
        
        Academia academia = new Academia("CREA", "aqui N. 30");

        gc.set(Calendar.HOUR_OF_DAY, 5);
        Date horaI = gc.getTime();
        gc.set(Calendar.HOUR_OF_DAY, 7);
        Date horaF = gc.getTime();
        Asignatura asignatura1 = new Asignatura("Matematicas", 200, horaI, horaF);
        
        gc.set(Calendar.HOUR_OF_DAY, 4);
        horaI = gc.getTime();
        gc.set(Calendar.HOUR_OF_DAY, 5);
        horaF = gc.getTime();
        Asignatura asignatura2 = new Asignatura("Programacion", 250, horaI, horaF);
        
        Profesor prof1 = new Profesor("Pepe");
        Profesor prof2 = new Profesor("Luis");
        
        prof1.addAsignatura(asignatura1);
        prof2.addAsignatura(asignatura2);
        
        Aula aula1 = new Aula("aula1", 20, true);
        Aula aula2 = new Aula("aula2", 20, true);
        aula1.addAsignatura(asignatura1);
        aula2.addAsignatura(asignatura2);
        
        Alumno alumno1 = new Alumno("Juanito");
        Alumno alumno2 = new Alumno("Luisito");
        alumno1.addAsignatura(asignatura1);
        alumno1.addAsignatura(asignatura2);
        alumno2.addAsignatura(asignatura1);
        alumno2.addAsignatura(asignatura2);
        
        
        
        
        
        
        
        
        
        
        
        
    }
}
