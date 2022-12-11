package com.maher.equipe.entities;

import org.springframework.data.rest.core.config.Projection;

@Projection(name = "nomequipe", types = {Equipe.class})
public interface EquipeProjection {
    public String getNom();

}
