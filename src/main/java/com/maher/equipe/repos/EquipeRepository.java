package com.maher.equipe.repos;

import com.maher.equipe.EquipeApplication;
import com.maher.equipe.entities.Equipe;
import com.maher.equipe.entities.League;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;
@RepositoryRestResource(path = "rest")
public interface EquipeRepository extends JpaRepository<Equipe, Long> {


    List<Equipe> findByNom(String nom);
    List<Equipe> findByNomContains(String nom);
    @Query("select e from Equipe e where e.nom like %?1 and e.classement = ?2")
    List<Equipe> findByNomclassementEquipe(String nom, int classement);

    /*@Query("select e from Equipe e where e.nom like %:nom and e.classement > :classement")
    List<Equipe> findByNomEquipe(@Param("nom") String nom, @Param("classement") int classement);*/
    @Query("select e from Equipe e where e.league=?1")
    List<Equipe> findByLeague(League league);
    List<Equipe> findByLeagueId(Long id);
    List<Equipe> findByOrderByNomAsc();

    @Query("select e from Equipe e order by e.nom ASC,e.classement DESC")
    List<Equipe> trierEquipesNomsClassement();




}

