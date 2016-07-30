package MecanicaDoJogo;
import java.util.List;

import embaralhadores.LeiaCVS;

public class BancoDePalavras {
	private String palavra;
	private static String[] BancoDePalavras = {"papagaio", "pindamonhangaba","jacaré","paralelepipedo","cachorro","tartaruga"};
	
	public static String[] Importar(String caminho) {
		List<String> ListaCSV = LeiaCVS.run(caminho);
		BancoDePalavras = (String[]) ListaCSV.toArray(new String[ListaCSV.size()]);
		return BancoDePalavras;
	}
			
	public String getPalavra() {
		return palavra;
	}
	
	String sortearPalavra(){
		int tam = BancoDePalavras.length;
		int random = (int)(Math.random() * tam);
		this.palavra = BancoDePalavras[random];
		return palavra;
	}

}
