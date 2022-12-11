package com.maher.equipe.Services;

import com.maher.equipe.repos.EquipeRepository;
import com.maher.equipe.entities.Equipe;
import com.maher.equipe.entities.League;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class EquipeServicesimpl implements EquipeServices {
    @Autowired
    EquipeRepository equipeRepository;
    @Override
    public Equipe saveEquipe(Equipe e) {
        return equipeRepository.save(e);
    }

    @Override
    public League saveLeague(League l) {
        return null;
    }

    @Override
    public Equipe updateEquipe(Equipe e) {
        return equipeRepository.save(e);
    }

    @Override
    public void deleteEquipe(Equipe e) {
        equipeRepository.delete(e);

    }

    @Override
    public void deleteEquipeById(Long id) {
        equipeRepository.deleteById(id);


    }

    @Override
    public Equipe getEquipe(Long id) {
        return equipeRepository.findById(id).get();
    }


    public List<Equipe> getAllEquipe() {
        return equipeRepository.findAll();
    }



    @Override
    public List<Equipe> findByNomclassementEquipe(String nom, int classement) {
        return equipeRepository.findByNomclassementEquipe(nom, classement);
    }

    @Override
    public List<Equipe> findByLeagueId(Long id) {
        return equipeRepository.findByLeagueId(id);
    }

    @Override
    public List<Equipe> findByNomContains(String nom) {
        return equipeRepository.findByNomContains(nom);
    }

    @Override
    public List<Equipe> findByNom(String nom) {
        return equipeRepository.findByNom(nom);
    }

    @Override
    public List<Equipe> findByOrderByNomAsc() {
        return equipeRepository.findByOrderByNomAsc();
    }

    @Override
    public List<Equipe> trierEquipesNomsClassement() {
        return equipeRepository.trierEquipesNomsClassement();
    }


}

