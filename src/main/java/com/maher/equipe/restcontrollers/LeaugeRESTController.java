package com.maher.equipe.restcontrollers;


import com.maher.equipe.entities.League;
import com.maher.equipe.repos.LeagueRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/leagues")
@CrossOrigin("*")
public class LeaugeRESTController {

    @Autowired
    LeagueRepository leagueRepository;

    @RequestMapping(method = RequestMethod.GET)
    public List<League> getAllLeagues() {
        return leagueRepository.findAll();
    }
    @RequestMapping(value="/{id}",method = RequestMethod.GET)
    public League getLeagueById(@PathVariable("id") Long id) {
        return leagueRepository.findById(id).get();
    }

    @RequestMapping(method = RequestMethod.POST)
    public League createLeague(@RequestBody League league) {
        return leagueRepository.save(league);
    }
    //put
    @RequestMapping(method = RequestMethod.PUT)
    public League updateLeague(@RequestBody League league) {
        return leagueRepository.save(league);
    }



    /*
        @RequestMapping(method = RequestMethod.POST)
    public DrugClass saveDrugClass(@RequestBody DrugClass drugClass) {
        return drugClassRepository.save(drugClass);
    }

    @RequestMapping(method = RequestMethod.PUT)
    public DrugClass updateDrugs(@RequestBody DrugClass drugClass) {
        return drugClassRepository.save(drugClass);
    }
     */


}
