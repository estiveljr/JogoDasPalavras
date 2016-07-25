package embaralhadores;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Random implements embaralhador {

	@Override
	public String embaralhar(String palavra) {
		
		
		char[] caracteres = palavra.toCharArray();
		List<Character> ocharaters  = new ArrayList<Character>(caracteres.length);
		for (char c:  caracteres ){
		  ocharaters.add(c); // autoboxing
		}
		Collections.shuffle(ocharaters);
		for ( int i =0; i < caracteres.length ; i++ ){
		     caracteres[i] = ocharaters.get(i); // unboxing
		}
		String palavraEmbaralhada = new String(caracteres);
		return palavraEmbaralhada;

	}

	@Override
	public int pesoPontuacao() {
		int pesoPontuacao = 10;
		return pesoPontuacao;
	}
	
	

}
