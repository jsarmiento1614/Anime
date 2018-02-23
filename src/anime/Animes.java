/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package anime;
/**
 *
 * @author Alumnos
 */
public class Animes extends Estudios {
        private String nombreAnime;
        private String horarios;

    public Animes(String nombreAnime, String horarios, String nombre) {
        super(nombre);
        this.nombreAnime = nombreAnime;
        this.horarios = horarios;
    }

    public String getNombreAnime() {
        return nombreAnime;
    }

    public void setNombreAnime(String nombreAnime) {
        this.nombreAnime = nombreAnime;
    }

    public String getHorarios() {
        return horarios;
    }

    public void setHorarios(String horarios) {
        this.horarios = horarios;
    }
         
        
}
