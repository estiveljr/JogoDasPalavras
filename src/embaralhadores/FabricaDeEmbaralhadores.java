package embaralhadores;

public class FabricaDeEmbaralhadores {
	String PalavraEmbaralhada = "Erro no embaralhamento das palavras";
	int pesoPontos;
	
	public int getPesoPontos() {
		return pesoPontos;
	}

	public String SortearEEmbaralhar(String palavra){
		int numSorteio = (int)(Math.random() * 3);
		
		if (numSorteio == 0){
			embaralhador inversor = new inversor(palavra);
			this.PalavraEmbaralhada = inversor.embaralhar();
			this.pesoPontos = inversor.pesoPontuacao();
		}else if(numSorteio == 1){
			embaralhador random = new Random(palavra);
			this.PalavraEmbaralhada = random.embaralhar();
			this.pesoPontos = random.pesoPontuacao();
		}else if(numSorteio == 2 || numSorteio == 3){
			embaralhador Pares = new Pares(palavra);
			this.PalavraEmbaralhada = Pares.embaralhar();
			this.pesoPontos = Pares.pesoPontuacao();
		}
		
		return PalavraEmbaralhada;
	}
	
}
