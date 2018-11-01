package com.example.hermenegildo.sociomatico.contoler.core;

/**
 * Created by Hermenegildo on 10-10-2018.
 */

public class Noticia {
    public String tituloNoticia;
    public Integer imagemNoticia;
    public Integer imagemAutor;
    public  String autorNoticia;
    public  String descricaoNoticia;

    public Noticia () {}

    public  Noticia (String tituloNoticia, Integer imagemNoticia, String autorNoticia, String descricaoNoticia, Integer imagemAutor){
         this.tituloNoticia = tituloNoticia;
         this.imagemNoticia = imagemNoticia;
         this.autorNoticia = autorNoticia;
         this.descricaoNoticia = descricaoNoticia;
         this.imagemAutor = imagemAutor;

    }

    public String getTituloNoticia() {
        return tituloNoticia;
    }

    public void setTituloNoticia(String tituloNoticia) {
        this.tituloNoticia = tituloNoticia;
    }

    public Integer getImagemNoticia() {
        return imagemNoticia;
    }

    public void setImagemNoticia(Integer imagemNoticia) {
        this.imagemNoticia = imagemNoticia;
    }

    public String getAutorNoticia() {
        return autorNoticia;
    }

    public void setAutorNoticia(String autorNoticia) {
        this.autorNoticia = autorNoticia;
    }

    public String getDescricaoNoticia() {
        return descricaoNoticia;
    }

    public void setDescricaoNoticia(String descricaoNoticia) {
        this.descricaoNoticia = descricaoNoticia;
    }

    public Integer getImagemAutor() {
        return imagemAutor;
    }

    public void setImagemAutor(Integer imagemAutor) {
        this.imagemAutor = imagemAutor;
    }
}
