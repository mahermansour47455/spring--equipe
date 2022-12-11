package com.maher.equipe.restcontrollers;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.maher.equipe.Services.EquipeServices;
import com.maher.equipe.entities.Equipe;
import com.maher.equipe.entities.League;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin
public class EquipeRESTController {
    @Autowired
    EquipeServices equipeServices;

    @RequestMapping(method = RequestMethod.GET)
    @JsonIgnore
    public List<Equipe> getAllEquipes() {
        return equipeServices.getAllEquipe();
    }

    @RequestMapping(value="{id}",method = RequestMethod.GET)
    public Equipe getEquipe(@PathVariable("id") Long id) {
        return equipeServices.getEquipe(id);
    }
    @RequestMapping(method = RequestMethod.POST)
    public Equipe createEquipe(@RequestBody Equipe equipe) {
        return equipeServices.saveEquipe(equipe);
    }
    @RequestMapping(value="/{id}",method = RequestMethod.DELETE)
    public void deleteEquipe(@PathVariable("id") Long id)
    {
        equipeServices.deleteEquipeById(id);
    }
    @RequestMapping(method = RequestMethod.PUT)
    public Equipe updateEquipe(@RequestBody Equipe equipe) {
        return equipeServices.updateEquipe(equipe);
    }
    @RequestMapping(value="/prodscat/{id}",method = RequestMethod.GET)
    public List<Equipe> getProduitsByCatId(@PathVariable("id") Long id) {
        return equipeServices.findByLeagueId(id);
    }

    @RequestMapping(value="/equipeByName/{nom}",method = RequestMethod.GET)
    public List<Equipe> findByNomEquipeContains(@PathVariable("nom") String nom) {
        return equipeServices.findByNomContains(nom);

    }



}
