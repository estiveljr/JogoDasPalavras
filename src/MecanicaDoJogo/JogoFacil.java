package MecanicaDoJogo;

import embaralhadores.FabricaDeEmbaralhadores;

public class JogoFacil implements MecanicaDoJogo {
	
	private int VidasInciciais = 3;		//Define o número de tentativas possiveis
	private int pontosParaVitoria = 60; // define a pontuação necessária para ganhar o jogo
	private String palavra;
	private String palavraEmbaralhada;
	private FabricaDeEmbaralhadores fabrica = new FabricaDeEmbaralhadores();
	private int TotalDePontos;
	private int ContagemDeVidas = VidasInciciais;

	@Override
	public int GetVidasInciciais(){
		return VidasInciciais;
	};
	
	@Override
	public int GetPontosParaVitoria(){
		return pontosParaVitoria;
	};
	
	@Override
	public boolean FimDeJogo() {
		if (TotalDePontos >= pontosParaVitoria || ContagemDeVidas < 0)
			return true;
		return false;
	}

	@Override
	public boolean PalavraCorreta(String p, String t) {
		if (p.equals(t)){
			TotalDePontos += Pontos();
			return true;
		}else{
			ContagemDeVidas -= 1; 
			return false;
		}
	}

	@Override
	public String EscolherPalavra() {
		BancoDePalavras ListaDePalavras = new BancoDePalavras();
		ListaDePalavras.sortearPalavra();
		this.palavra = ListaDePalavras.getPalavra();
		return palavra;
	}

	@Override
	public String Embaralhar() {
		palavraEmbaralhada = fabrica.SortearEEmbaralhar(palavra);
		return palavraEmbaralhada;
	}
	
	@Override
	public String GetPalavraEmbaralhada() {
		return palavraEmbaralhada;
	}

	@Override
	public int Pontos() {
		return fabrica.getPesoPontos();
	}
	
	@Override
	public int TotalDePontos() {
		return TotalDePontos;
	}

	@Override
	public int ContagemDeVidas() {
		return ContagemDeVidas;
	}




	


}
