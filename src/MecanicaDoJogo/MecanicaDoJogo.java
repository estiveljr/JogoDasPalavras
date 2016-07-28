package MecanicaDoJogo;

public interface MecanicaDoJogo {
	

	boolean FimDeJogo();
	boolean PalavraCorreta(String p, String t);	//Compara a entrada do usuário com a palavra solicitada
	String EscolherPalavra(); 	//Escolher palavra aleatoria do banco
	String Embaralhar();		//Embaralha palavra sorteada
	int Pontos();				//Retorna numero de pontos no caso de acerto
	int TotalDePontos();
	int Vidas();		
	void limpaTela();
}
