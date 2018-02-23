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
public class Televisora {
    private String Nombre;
    private Animes anime;
    private String edadRestrincion;

    public Televisora(String Nombre, Animes anime, String edadRestrincion) {
        this.Nombre = Nombre;
        this.anime = anime;
        this.edadRestrincion = edadRestrincion;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public Animes getAnime() {
        return anime;
    }

    public void setAnime(Animes anime) {
        this.anime = anime;
    }

    public String getEdadRestrincion() {
        return edadRestrincion;
    }

    public void setEdadRestrincion(String edadRestrincion) {
        this.edadRestrincion = edadRestrincion;
    }
    
    
}
