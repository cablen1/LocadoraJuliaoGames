package model.entities;



import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import model.classes.Jogo;

/**
 * Classe  que tem jogos cadastrados na DataBase e retorna a lista dos mesmos
 * GETS E SETS 
 * Metodo de retorno procuraJogosPorCodigo 
 * julio sartori
 * 07.05.2021
 * versao 1.0.0
 */
public class JogosService {
	
	
	public List<Jogo> jogosDisponiveis = new ArrayList<>();


	{
		jogosDisponiveis.add(new Jogo(1, "The last of us", new BigDecimal(20.00)));
		jogosDisponiveis.add(new Jogo(2, "God Of War", new BigDecimal(50.00)));
		jogosDisponiveis.add(new Jogo(3, "Infamous", new BigDecimal(15.00)));
		jogosDisponiveis.add(new Jogo(4, "Need For Speed", new BigDecimal(30.00)));
		jogosDisponiveis.add(new Jogo(5, "Clash Of Clans", new BigDecimal(10.00)));
		jogosDisponiveis.add(new Jogo(6, "Fortnite", new BigDecimal(5.00)));
	}
	
	
	
	

	public List<Jogo> getJogos() {
		return jogosDisponiveis;

	}
	
	
	public List<Jogo> setJogos() {
		return jogosDisponiveis;
	}

	public Jogo procuraJogosPorCodigo(Integer codigo) {
		Jogo resultado = null;

		for (Jogo jogos : jogosDisponiveis) {

			if (jogos.getcodigo().equals(codigo)) {

				resultado = jogos;
				break;
			}
		}

		return resultado;
	}
	
	public void add(Jogo jogoTemp) {

		
		
	}
	
	
	
	

}
