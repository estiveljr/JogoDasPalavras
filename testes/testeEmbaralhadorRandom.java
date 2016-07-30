import static org.junit.Assert.assertNotEquals;

import org.junit.Test;

import embaralhadores.Random;

public class testeEmbaralhadorRandom {

	@Test
	public void testPalavraPar() {
		String palavra = "papagaio";
		Random embaralhador = new Random(palavra);
		String palavraEmbaralhada = embaralhador.embaralhar();
		assertNotEquals("papagaio", palavraEmbaralhada);
	}

}
