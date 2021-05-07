package model.classes;

/**
 * Classe Lista 
 * GET E SET e inicialização da lista com retorno 
 * Autor julio Sartori
 * versao 1.0.0
 */


import java.util.ArrayList;
import java.util.List;

public class Lista {

	private List<Jogo> jogos = new ArrayList<>();

	public Lista() {

	}

	public List<Jogo> getJogos() {
		return jogos;
	}

	public void addJogos(Jogo game) {
		jogos.add(game);
	}

}
