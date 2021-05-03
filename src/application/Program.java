package application;

import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import model.entities.Jogos;
import model.entities.Lista;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);

		Calendar c = Calendar.getInstance();
		c.setTime(new Date());

		System.out.print("Digite seu nome: ");
		String name = scan.nextLine();
		System.out.println();

		if(c.get(Calendar.HOUR) < 12) {
			System.out.println("Bom dia, " + name + ", temos essa lista de jogos disponíveis: \n");

		} else if(c.get(Calendar.HOUR) > 12 && c.get(Calendar.HOUR) < 18) {
			System.out.println("Boa tarde, " + name + ", temos essa lista de jogos disponíveis: \n");

		} else if(c.get(Calendar.HOUR) >18){
			System.out.println("Boa noite, " + name + ", temos essa lista de jogos disponiveis: \n");	
		}else {
			System.out.println("Boa Madrugada");
		}
		
		
		Lista list = new Lista();

		list.addJogos(new Jogos(1, "The last of us", 20.00));
		list.addJogos(new Jogos(2, "God Of War", 50.00));
		list.addJogos(new Jogos(3, "Infamous", 15.00));
		list.addJogos(new Jogos(4, "Need For Speed", 30.00));
		list.addJogos(new Jogos(5, "Clash Of Clans", 10.00));
		list.addJogos(new Jogos(6, "Fortnite", 5.00));

		for(Jogos j : list.getJogos()) { //EXIBE A LISTA DE JOGOS
			System.out.println(j);
		}

		//MANUNTENÇÃO
		System.out.println();
		double total_value = 0;
		int cont = 1;

		System.out.println("### COMPRAR ###");
		
		for(int i = 0; i < cont; i ++) {
			System.out.print("Digite o ID do jogo de 1 a 5: ");
			int idGame = scan.nextInt();

			System.out.print("Deseja adicionar mais jogos à lista (y/n)? ");
			char resposta = scan.next().charAt(0);
			
			for(Jogos j: list.getJogos()) {
				if(j.getID().equals(idGame)) {
					total_value += j.getPrice();
				}
			}

			if(resposta == 'y') {
				cont++;
			} else {
				cont = 0;
			}
			System.out.println();
		}
		System.out.println("Total: R$ " + String.format("%.2f", total_value));
		scan.close();
	}
}