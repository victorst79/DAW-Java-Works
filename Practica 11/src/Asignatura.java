/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author victo
 */
public class Asignatura {
    int idAsignatura, idCurso;
    String asignatura;

    public Asignatura(int idAsignatura, String asignatura, int idCurso) {
        this.idAsignatura = idAsignatura;
        this.idCurso = idCurso;
        this.asignatura = asignatura;
    }

    public int getIdAsignatura() {
        return idAsignatura;
    }

    public int getIdCurso() {
        return idCurso;
    }

    public String getAsignatura() {
        return asignatura;
    }
    
    
    
}
