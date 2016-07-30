package MecanicaDoJogo;

public class FabricaMecanicaDoJogo {
	MecanicaDoJogo jogo;
	
	public MecanicaDoJogo EscolherMecanica(String TipoDeJogo){
		if (TipoDeJogo.equals("f")) {
			jogo = new JogoFacil();
		}else if(TipoDeJogo.equals("d")){
			jogo = new JogoDificil();
		}
		return jogo;
	}
	
}
