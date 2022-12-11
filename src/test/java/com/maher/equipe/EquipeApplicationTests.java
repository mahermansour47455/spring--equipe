package com.maher.equipe;

import com.maher.equipe.entities.Equipe;
import com.maher.equipe.repos.EquipeRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Date;

@SpringBootTest
class EquipeApplicationTests {
	@Autowired
	private EquipeRepository equipeRepository;

	@Test
	public void testCreateEquipe() {

		Equipe e1 = new Equipe("Equipe1", 2, new Date());
		equipeRepository.save(e1);
	}
}
