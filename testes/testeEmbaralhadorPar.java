import static org.junit.Assert.assertNotEquals;

import org.junit.Test;

import embaralhadores.Pares;

public class testeEmbaralhadorPar {

	@Test
	public void testPalavraPar() {
		String palavra = "papagaio";
		Pares embaralhador = new Pares(palavra);
		String palavraEmbaralhada = embaralhador.embaralhar();
		assertNotEquals("papagaio", palavraEmbaralhada);
	}

}
