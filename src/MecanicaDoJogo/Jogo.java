package MecanicaDoJogo;
import embaralhadores.FabricaDeEmbaralhadores;

public class Jogo implements MecanicaDoJogo {

	private String palavra;
	private String palavraEmbaralhada;
	private FabricaDeEmbaralhadores fabrica = new FabricaDeEmbaralhadores();
	private int TotalDePontos = 0;
	private int Vidas = 3;
	private int pontosParaVitoria = 2; // define a pontuação necessária para ganhar o jogo
	
	@Override
	public boolean FimDeJogo() {
		if (TotalDePontos >= pontosParaVitoria || Vidas < 0)
			return true;
		return false;
	}

	@Override
	public boolean PalavraCorreta(String p, String t) {
		if (p.equals(t)){
			TotalDePontos += Pontos();
			return true;
		}else{
			Vidas -= 1; 
			return false;
		}
	}

	@Override
	public String EscolherPalavra() {
		BancoDePalavras ListaDePalavras = new BancoDePalavras();
		ListaDePalavras.sortearPalavra();
		this.palavra = ListaDePalavras.getPalavra();
		System.out.println("Palavra Sorteada = " + palavra);
		return palavra;
	}

	@Override
	public String Embaralhar() {
		palavraEmbaralhada = fabrica.SortearEEmbaralhar(palavra);
		System.out.println("Palavra embaralhada = " + palavraEmbaralhada);
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
	public int Vidas() {
		return Vidas;
	}
	
	@Override
	public void limpaTela(){
		System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
				 
	}

}
