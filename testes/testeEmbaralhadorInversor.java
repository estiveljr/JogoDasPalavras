import static org.junit.Assert.*;

import org.junit.Test;

import embaralhadores.Inversor;

public class testeEmbaralhadorInversor {

	@Test
	public void testPalavraInvertida() {
		String palavra = "papagaio";
		Inversor inversor = new Inversor(palavra);
		String palavraInvertida = inversor.embaralhar();
		assertEquals("oiagapap", palavraInvertida);
	}

}