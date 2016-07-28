import java.util.Scanner;

import MecanicaDoJogo.Jogo;

public class Principal {

	public static void main(String[] args) {

		String palavra;
		String tentativa;

		Jogo jogo = new Jogo();
				
		//recebe tentativa do usuario
		
		do {
			palavra = jogo.EscolherPalavra();
			jogo.Embaralhar();
			Scanner in = new Scanner(System.in);
			tentativa = in.nextLine().toLowerCase();
			
			if (jogo.PalavraCorreta(palavra, tentativa)){
				System.out.println("Parabéns! Você acertou a palavra e ganhou " + jogo.Pontos() + " pontos");

			}else{
				if(jogo.Vidas()>=0){
					
					System.out.println("Você errou a palavra, mas não desanime, você ainda possui " + jogo.Vidas() + " chances!");
					System.out.println("\nTotal de Pontos: " + jogo.TotalDePontos());
				}
			}
		}while((!jogo.FimDeJogo()) );
		
		if (jogo.Vidas()<0) {
			System.err.println("FIM DE JOGO! =( \n");
			System.out.println("Total de Pontos: " + jogo.TotalDePontos());
		}if(jogo.TotalDePontos()>=2){
			System.err.println("\nVOCÊ VENCEU O JOGO!");
			System.out.println("Total de Pontos: " + jogo.TotalDePontos());
		}
		
		
		
	}
}
