package com.maher.equipe.Services;

import com.maher.equipe.entities.Equipe;
import com.maher.equipe.entities.League;

import java.util.List;


public interface EquipeServices {
    Equipe saveEquipe(Equipe e);
    League saveLeague(League l);
    Equipe updateEquipe(Equipe e);
    void deleteEquipe(Equipe e);
    void deleteEquipeById(Long id);
    Equipe getEquipe(Long id);
    List <Equipe> getAllEquipe();


    List<Equipe> findByNomclassementEquipe(String nom,int classement);

    List<Equipe> findByLeagueId(Long id);
    List<Equipe>findByNomContains(String nom);
    List<Equipe> findByNom(String nom);
    List<Equipe> findByOrderByNomAsc();
    List<Equipe> trierEquipesNomsClassement();






}
