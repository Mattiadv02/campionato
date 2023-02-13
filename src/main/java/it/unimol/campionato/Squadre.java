package it.unimol.campionato;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
@Entity

public class Squadre {
    @Id @GeneratedValue
    private Integer id;
    private String nome;
    private String abbreviazione;
    private String imgUrl;
    public Squadre() { }

    public Squadre(Integer id, String nome, String abbreviazione, String imgUrl) {
        this.id = id;
        this.nome = nome;
        this.abbreviazione = abbreviazione;
        this.imgUrl = imgUrl;
    }
    public Integer getId(){
        return id;
    }
    public String getNome(){
        return nome;
    }
    public String getAbbreviazione(){
        return abbreviazione;
    }
    public String getImgUrl(){
        return imgUrl;
    }


    public void setId (Integer id){
        this.id = id;
    }
    public void setNome (String nome){
        this.nome = nome;
    }
    public void setAbbreviazione (String abbreviazione){
        this.abbreviazione = abbreviazione;
    }
    public void setImgUrl (String imgUrl){
        this.imgUrl = imgUrl;
    }
}


