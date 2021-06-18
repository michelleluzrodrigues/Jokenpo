package desafio.gft.service.jokenpo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

import desafio.jokenpo.Item;
import desafio.jokenpo.Jogador;
import desafio.jokenpo.Jokenpo;

public class JokenpoTest {

	@Test
	public void pedraEmpataPedra() {
		Jogador jogador1 = new Jogador("Maria", Item.PEDRA);
		Jogador jogador2 = new Jogador("Lucas", Item.PEDRA);
		Jokenpo jokenpo = new Jokenpo(jogador1, jogador2);
		String resultado = jokenpo.jogar();
		assertEquals("Empate", resultado);
	}
	
	
	@Test
	public void pedraGanhaTesoura() {
		Jogador jogador1 = new Jogador("Maria", Item.PEDRA);
		Jogador jogador2 = new Jogador("Lucas", Item.TESOURA);
		Jokenpo jokenpo = new Jokenpo(jogador1, jogador2);
		String resultado = jokenpo.jogar();
		assertEquals("Maria", resultado);

	}
	
	@Test
	public void tesouraPerdePedra() {
		Jogador jogador1 = new Jogador("Maria", Item.TESOURA);
		Jogador jogador2 = new Jogador("Lucas", Item.PEDRA);
		Jokenpo jokenpo = new Jokenpo(jogador1, jogador2);
		String resultado = jokenpo.jogar();
		assertEquals("Lucas", resultado);

	}
	
	@Test
	public void tesouraEmpataTesoura() {
		Jogador jogador1 = new Jogador("Maria", Item.TESOURA);
		Jogador jogador2 = new Jogador("Lucas", Item.TESOURA);
		Jokenpo jokenpo = new Jokenpo(jogador1, jogador2);
		String resultado = jokenpo.jogar();
		assertEquals("Empate", resultado);
	}
	
	@Test
	public void tesouraGanhaPapel() {
		Jogador jogador1 = new Jogador("Maria", Item.TESOURA);
		Jogador jogador2 = new Jogador("Lucas", Item.PAPEL);
		Jokenpo jokenpo = new Jokenpo(jogador1, jogador2);
		String resultado = jokenpo.jogar();
		assertEquals("Maria", resultado);
	}
	
	@Test
	public void papelPerdeTesoura() {
		Jogador jogador1 = new Jogador("Maria", Item.PAPEL);
		Jogador jogador2 = new Jogador("Lucas", Item.TESOURA);
		Jokenpo jokenpo = new Jokenpo(jogador1, jogador2);
		String resultado = jokenpo.jogar();
		assertEquals("Lucas", resultado);
	}
	
	@Test
	public void papelEmpataPapel() {
		Jogador jogador1 = new Jogador("Maria", Item.PAPEL);
		Jogador jogador2 = new Jogador("Lucas", Item.PAPEL);
		Jokenpo jokenpo = new Jokenpo(jogador1, jogador2);
		String resultado = jokenpo.jogar();
		assertEquals("Empate", resultado);
	}
	
	@Test
	public void papelGanhaPedra() {
		Jogador jogador1 = new Jogador("Maria", Item.PAPEL);
		Jogador jogador2 = new Jogador("Lucas", Item.PEDRA);
		Jokenpo jokenpo = new Jokenpo(jogador1, jogador2);
		String resultado = jokenpo.jogar();
		assertEquals("Maria", resultado);
	}
	
	@Test
	public void pedraPerdePapel() {
		Jogador jogador1 = new Jogador("Maria", Item.PEDRA);
		Jogador jogador2 = new Jogador("Lucas", Item.PAPEL);
		Jokenpo jokenpo = new Jokenpo(jogador1, jogador2);
		String resultado = jokenpo.jogar();
		assertEquals("Lucas", resultado);
	}
}
