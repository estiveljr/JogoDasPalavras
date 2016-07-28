package MecanicaDoJogo;

public class BancoDePalavras {
	private String palavra;
	private String[] BancoDePalavras = {"papagaio", "pindamonhangaba","jacaré","paralelepipedo","cachorro","tartaruga"};
	
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
