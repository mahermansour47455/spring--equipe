package com.maher.equipe.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
@Entity
@Data @AllArgsConstructor
@NoArgsConstructor
public class Equipe {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private long id;
    private String nom;
    private int classement;
    private Date datematch;
    @ManyToOne
    private League league;
   /* public Equipe() {
        super();
    }*/

    public Equipe(String nom,int classement,Date datematch) {
        super();
        this.nom = nom;
        this.classement = classement;
        this.datematch = datematch;
    }

    public String getNom() {
        return nom;
    }

    public int getClassement() {
        return classement;
    }

    public void setClassement(int classement) {
        this.classement = classement;
    }

    public Date getDatematch() {
        return datematch;
    }

    public void setDatematch(Date datematch) {
        this.datematch = datematch;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }


    public String toString() {
        return "Equipe [id="+id+"nom=" + nom + ", classement=" + classement + ", datematch=" + datematch + "]";
    }

    public League getLeague() {
        return league;
    }

    public void setLeague(League league) {
        this.league = league;
    }
}

