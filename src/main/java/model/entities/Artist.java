package model.entities;

import jakarta.persistence.*;
import model.enums.MusicalGenre;

@Entity
public class Artist {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String nome;

    @Enumerated(EnumType.STRING)
    private MusicalGenre musicalGenre;

    private String mostFamousSong;

    public Artist(String nome, MusicalGenre musicalGenre, String mostFamousSong) {
        this.nome = nome;
        this.musicalGenre = musicalGenre;
        this.mostFamousSong = mostFamousSong;
    }

    public Artist(Integer id, String nome, MusicalGenre musicalGenre, String mostFamousSong) {
        this.id = id;
        this.nome = nome;
        this.musicalGenre = musicalGenre;
        this.mostFamousSong = mostFamousSong;
    }


    public Artist() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public MusicalGenre getMusicalGenre() {
        return musicalGenre;
    }

    public void setMusicalGenre(MusicalGenre musicalGenre) {
        this.musicalGenre = musicalGenre;
    }

    public String getMostFamousSong() {
        return mostFamousSong;
    }

    public void setMostFamousSong(String mostFamousSong) {
        this.mostFamousSong = mostFamousSong;
    }
}
