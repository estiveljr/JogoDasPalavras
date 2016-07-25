package embaralhadores;

public class inversor implements embaralhador {
	
	@Override
	public String embaralhar(String palavra) {
		  
	    int tam = palavra.length();
	    char[] charArray = new char[tam];
	    char[] charArrayInvertido = new char[tam];
		
		//transforma palavra em array de char
		for (int i = 0; i < tam; i++) {
			charArray[i] = palavra.charAt(i);
		    }
		
		//inverte o array de char
	    for (int j = 0; j < tam; j++) {
	    	charArrayInvertido[j] = charArray[tam - 1 - j];
	      }
		
		String palavraEmbaralhada = new String(charArrayInvertido);
		return palavraEmbaralhada;
	}
	
	@Override
	public int pesoPontuacao() {
		int pesoPontuacao = 2;
		return pesoPontuacao;
	}
}
