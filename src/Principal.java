import embaralhadores.FabricaDeEmbaralhadores;

public class Principal {

	public static void main(String[] args) {

		String palavra;
		String palavraEmbaralhada;
		
		//escolher palavra aleatoria do banco
		BancoDePalavras ListaDePalavras = new BancoDePalavras();
		ListaDePalavras.sortearPalavra();
		palavra = ListaDePalavras.getPalavra();
		System.out.println("Palavra Sorteada = " + palavra);
		
		//embaralha palavra
		FabricaDeEmbaralhadores fabrica = new FabricaDeEmbaralhadores();
		palavraEmbaralhada = fabrica.SortearEEmbaralhar(palavra);
		System.out.println("Palavra embaralhada = " + palavraEmbaralhada);
			
	}
}
