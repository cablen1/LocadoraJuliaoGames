package model.entities;

	import java.util.ArrayList;
	import java.util.List;

	public class Lista {

		private List<Jogos> jogos = new ArrayList<>();
		
		public Lista() {
			
		}

		public List<Jogos> getJogos() {
			return jogos;
		}

		public void addJogos(Jogos game) {
	       jogos.add(game);
		}
		
		
	}

