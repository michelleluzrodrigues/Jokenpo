package desafio.jokenpo;

public class Jogador {

	private String nome;
	private Item intens;

	public Jogador(String nome, Item intens) {
		this.nome = nome;
		this.intens = intens;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Item getIntens() {
		return intens;
	}

	public void setIntens(Item intens) {
		this.intens = intens;
	}

}
