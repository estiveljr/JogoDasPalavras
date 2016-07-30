import java.io.FileNotFoundException;
import java.util.Scanner;

import MecanicaDoJogo.BancoDePalavras;
import MecanicaDoJogo.FabricaMecanicaDoJogo;
import MecanicaDoJogo.MecanicaDoJogo;
 
public class Principal {
	
public static void main(String[] args) {
		
		String TipoDeJogo;
		String palavra;
		String tentativa;
		MecanicaDoJogo jogo = null;
		Scanner QualLista;
		String TipoLista = "";
		
		// Escolhe a lista de palavras		
		while (!TipoLista.equals("i") && !TipoLista.equals("p")){
			System.out.println("Voce deseja importar um arquivo do tipo \".CSV\" com palavras para o jogo ou deseja usar a lista padrao de animais?"
			+ "\nDigite \"P\" para a lista padrao ou \"I\" para importar uma lista e entao confirme com \"ENTER\"");
			QualLista = new Scanner(System.in);
			TipoLista = QualLista.nextLine().toLowerCase();
		}
		
		//
		if (TipoLista.equals("i")) {
			boolean ok;
			do {
				System.out.println("\nDigite o caminho do arquivo");
				Scanner ScannerCaminho = new Scanner(System.in);
				String caminho = ScannerCaminho.nextLine();
				try {
					BancoDePalavras.Importar(caminho);
					ok = true;
					
				} catch (FileNotFoundException e) {
					ok = false;
					System.err.println("Arquivo ou caminho invalido.");
					//e.printStackTrace();
					
				} 
			} while (!ok);
		} 
		
		FabricaMecanicaDoJogo FabricaJogo = new FabricaMecanicaDoJogo();
		System.out.println("Em qual nivel deseja jogar?");
		System.out.println("Digite \"F\" para facil ou \"D\" para dificil.");
		Scanner inDificuldade = new Scanner(System.in);
		TipoDeJogo = inDificuldade.nextLine().toLowerCase();
		
		while (!TipoDeJogo.equals("f") && !TipoDeJogo.equals("d")){
			System.err.println("Voce precisa escolher uma dificuldade.\n");
			System.out.println("Digite \"F\" para facil ou \"D\" para dificil.");
			inDificuldade = new Scanner(System.in);
			TipoDeJogo = inDificuldade.nextLine().toLowerCase();
		}	

		if (TipoDeJogo.equals("f")) {
			System.out.println("-----------------------------------");
			System.out.println("Voce escolheu o nivel FACIL. Boa Sorte!");
			System.out.println("-----------------------------------");
			FabricaMecanicaDoJogo fabricaMecJogo = new FabricaMecanicaDoJogo();
			jogo = fabricaMecJogo.EscolherMecanica(TipoDeJogo);
			System.out.println("Tentativas extras :" + jogo.GetVidasInciciais());
			System.out.println("Pontos para ganhar o jogo: " + jogo.GetPontosParaVitoria());
			System.out.println("-----------------------------------");
			
		}else if(TipoDeJogo.equals("d")){
			System.out.println("-----------------------------------");
			System.out.println("Voce escolheu o nivel DIFICIL. Boa Sorte!");
			System.out.println("---------------------");
			FabricaMecanicaDoJogo fabricaMecJogo = new FabricaMecanicaDoJogo();
			jogo = fabricaMecJogo.EscolherMecanica(TipoDeJogo);
			System.out.println("Tentativas extras :" + jogo.GetVidasInciciais());
			System.out.println("Pontos para ganhar o jogo: " + jogo.GetPontosParaVitoria());
			System.out.println("---------------------");
		}	
			
		do {
			palavra = jogo.EscolherPalavra();
			jogo.Embaralhar();
			System.out.println("Coloque a palavra em ordem. \n\n" + ">>> "+jogo.GetPalavraEmbaralhada() + " <<<");
			Scanner in = new Scanner(System.in);
			tentativa = in.nextLine().toLowerCase();

			if (jogo.PalavraCorreta(palavra, tentativa)) {
				System.out.println("-----------------------------------");
				System.out.println("Voce ACERTOU e ganhou " + jogo.Pontos() + " pontos!");
				System.out.println("Total de pontos conquistados: " + jogo.TotalDePontos());
			} else {
				if (jogo.ContagemDeVidas() >= 0) {
					System.out.println("-----------------------------------");
					System.out.println("Voce errou a palavra, mas nao desanime, voce ainda possui "
							+ jogo.ContagemDeVidas() + " chances!");
					System.out.println("Total de pontos conquistados: " + jogo.TotalDePontos());
				}
			}
		} while ((!jogo.FimDeJogo()));

		if (jogo.ContagemDeVidas() < jogo.GetVidasInciciais()) {
			System.err.println("FIM DE JOGO! VOCE PERDEU! =( \n");
			System.out.println("Total de Pontos: " + jogo.TotalDePontos());
		}
		if (jogo.TotalDePontos() >= jogo.GetPontosParaVitoria()) {
			System.err.println("\nVOCE VENCEU O JOGO! \\o/ Uhuuu");
			System.out.println("Total de Pontos: " + jogo.TotalDePontos());
		}
}

	
}
