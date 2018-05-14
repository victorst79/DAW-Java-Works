/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author victo
 */
public class Nota {
    int idAlumno, idAsignatura, nota;
    String evaluciaon;

    public Nota(int idAlumno, int idAsignatura, String evaluciaon, int nota) {
        this.idAlumno = idAlumno;
        this.idAsignatura = idAsignatura;
        this.nota = nota;
        this.evaluciaon = evaluciaon;
    }

    public int getIdAlumno() {
        return idAlumno;
    }

    public int getIdAsignatura() {
        return idAsignatura;
    }

    public int getNota() {
        return nota;
    }

    public String getEvaluciaon() {
        return evaluciaon;
    }
    
    
}
