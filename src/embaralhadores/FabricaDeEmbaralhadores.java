package embaralhadores;

public class FabricaDeEmbaralhadores {
	String PalavraEmbaralhada = "erro";
	
	public String SortearEEmbaralhar(String palavra){
		int numSorteio = 2;
		//int numSorteio = (int)(Math.random() * 3);
		
		if (numSorteio == 1){
			embaralhador inversor = new inversor();
			this.PalavraEmbaralhada = inversor.embaralhar(palavra);
		}else if(numSorteio == 2){
			embaralhador random = new Random();
			this.PalavraEmbaralhada = random.embaralhar(palavra);
		}else if(numSorteio == 3){
			
		}
		
		return PalavraEmbaralhada;
	}
	
}
