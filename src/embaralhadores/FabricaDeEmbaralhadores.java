package embaralhadores;

public class FabricaDeEmbaralhadores {
	String PalavraEmbaralhada = "erro";
	
	public String SortearEEmbaralhar(String palavra){
		int random = (int)(Math.random() * 1);
		
		if (random == 1){
			embaralhador inversor = new inversor();
			this.PalavraEmbaralhada = inversor.embaralhar(palavra);
		}else{
			embaralhador inversor = new inversor();
			this.PalavraEmbaralhada = inversor.embaralhar(palavra);
		}
		
		return PalavraEmbaralhada;
	}
	
}
