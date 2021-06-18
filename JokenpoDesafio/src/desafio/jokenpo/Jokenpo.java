package desafio.jokenpo;

public class Jokenpo {

	private Jogador jogador1;
	private Jogador jogador2;

	public Jokenpo(Jogador jogador1, Jogador jogador2) {
		this.jogador1 = jogador1;
		this.jogador2 = jogador2;
	}

	public String jogar() {
		if (jogador1.getIntens().equals(jogador2.getIntens())) {
			return "Empate";
		} else if (jogador1.getIntens().equals(Item.PEDRA) && jogador2.getIntens().equals(Item.TESOURA)
				|| jogador1.getIntens().equals(Item.TESOURA) && jogador2.getIntens().equals(Item.PEDRA)) {
			return jogador1.getIntens().equals(Item.PEDRA) ? jogador1.getNome() : jogador2.getNome();
		}else if (jogador1.getIntens().equals(Item.TESOURA) && jogador2.getIntens().equals(Item.PAPEL)
				|| jogador1.getIntens().equals(Item.PAPEL) && jogador2.getIntens().equals(Item.TESOURA)) {
			return jogador1.getIntens().equals(Item.TESOURA) ? jogador1.getNome() : jogador2.getNome();
		}
		else if (jogador1.getIntens().equals(Item.PAPEL) && jogador2.getIntens().equals(Item.PEDRA)
				|| jogador1.getIntens().equals(Item.PEDRA) && jogador2.getIntens().equals(Item.PAPEL)) {
			return jogador1.getIntens().equals(Item.PAPEL) ? jogador1.getNome() : jogador2.getNome();
		}
		return " ";
	}

}
