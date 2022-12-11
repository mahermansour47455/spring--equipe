package com.maher.equipe.repos;

import com.maher.equipe.entities.Equipe;
import com.maher.equipe.entities.League;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.web.bind.annotation.CrossOrigin;

@RepositoryRestResource(path = "leg")
@CrossOrigin(origins = "http://localhost:4200/")
public interface LeagueRepository extends JpaRepository<League, Long> {






}

