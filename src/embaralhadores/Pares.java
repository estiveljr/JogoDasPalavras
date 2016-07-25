package embaralhadores;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Pares implements embaralhador {
	private String palavra;
	public Pares(String palavra) {
		super();
		this.palavra = palavra;
	}
	@Override
	public String embaralhar() {
		String palavraEmbaralhada;
		char[] caracteres = palavra.toCharArray();
		int tam = caracteres.length;
		int tamPar;
		//Define tamanho da lista dos caracteres pares
		if (!(tam % 2 == 0)) {
			tamPar = tam / 2 + 1;
		} else {
			tamPar = tam / 2;
		}
		char[] caracteresEmbaralhados = new char[tam];
		//lista com todas as letras da palavra em ordem
		List<Character> ocharaters = new ArrayList<Character>(tam);
		//lista  para os numeros pares 
		List<Character> ocharatersPares = new ArrayList<Character>(tamPar);
		for (int i = 0; i < tam; i++) {
			char letra;
			letra = caracteres[i];
			ocharaters.add(letra); // autoboxing	  		
		}
		for (int i = 0; i < tamPar; i++) {
			char letra;
			letra = caracteres[i * 2];
			ocharatersPares.add(letra); // autoboxing	  		
		}
		
		//mistura apenas as letras pares e retorna palavraEmbaralhada
		do 
		{
			Collections.shuffle(ocharatersPares);
			for (int i = 0; i < tam; i++) {
				if ((i % 2) == 0) {
					caracteresEmbaralhados[i] = ocharatersPares.get(i / 2); // unboxing
				} else {
					caracteresEmbaralhados[i] = ocharaters.get(i); // unboxing
				}
			} 
			palavraEmbaralhada = new String(caracteresEmbaralhados);
			
		} while (palavra.equals(palavraEmbaralhada));
		
		return palavraEmbaralhada;
	}
	
	@Override
	public int pesoPontuacao() {
		int pesoPontuacao = 6; // peso base do embaralhamento
		if (palavra.length()>10)
			pesoPontuacao *= 2;
		return pesoPontuacao;
	}
	
}
