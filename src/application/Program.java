package application;
/**
 * Código atualizado 07.05.2021
 * autor julio Sartori
 * versao 1.0.0
 */
import java.math.BigDecimal;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import model.classes.Clientes;
import model.classes.Jogo;
import model.classes.Lista;
import model.entities.ClientesService;
import model.entities.JogosService;

public class Program {

	public static void main(String[] args) throws Exception {
		
		//Programa main que roda os servicos 
		ClientesService servicoCliente = new ClientesService();
		JogosService servicoJogo = new JogosService();

		Scanner scan = new Scanner(System.in);

		System.out.println("Digite seu nome: ");
		String nome = scan.nextLine();
		System.out.println();
		
		// codigo busca Clientes por nome na base ClientesService
		//caso seja um nome diferente do dataBase ele roda a exception e encerra o programa
		Clientes client = servicoCliente.procuraClientesPorNome(nome);
		if (client == null) {
			throw new Exception("Cliente não encontrado....");
		}
		System.out.println("Olá seja bem vindo " + client.getCodigo() + "-" + client.getNome());

		//instanciado uma lista atraves da declaração de JogosService , onde estao cadastrados 
		//os jogos 
		JogosService list = new JogosService();
		
		
		//percorrendo a lista de jogos ,para cada Jogo cadastrado na lista de jogos 
		//pegue o nome de cada um deles e exiba no console.
		for (Jogo j : list.getJogos()) { // EXIBE A LISTA DE JOGOS
			System.out.println(j);
		}

		// MANUNTENÇÃO
		System.out.println();
		
		//inica a variavel com valor zerado para a partir da escolha do usuario poder atribuir valor
		double total_value = 0;
		int cont = 1;

		System.out.println("### COMPRAR ###");

		System.out.print("Digite o ID do jogo de 1 a 5: ");
		String idGame = scan.next();

		String[] valoresEscolhidos = idGame.split(",");//foi usado split para que fosse possivel  a escolha 
		//atraves de numerais seguidos de virgula ex: 1,2,3,4,5,6

		//Instanciado uma List de Jogo para conseguir percorrer ela no looping for.
		List<Jogo> jogosEscolhidos = new ArrayList<>();
		BigDecimal valorSomado = new BigDecimal("0");

		// looping for que para cada String valor escolhido converte o valor para Integer
		// e apos isso procura o jogo por codigo.
		for (String valor : valoresEscolhidos) {
			Integer valorConvertido = Integer.parseInt(valor);
			Jogo jogoTemp = servicoJogo.procuraJogosPorCodigo(valorConvertido);

			
			//condicao que indica que se o jogo escolhido for diferente de nulo ele imprime no 
			//console "jogo escolhido + jogoTemp.getNome"
			if (jogoTemp != null) {
				System.out.println("Jogo escolhido: " + jogoTemp.getnome());
				jogosEscolhidos.add(jogoTemp);
				valorSomado = valorSomado.add(jogoTemp.getpreco());

			}
		}
		//imprime a quantidade de jogos escolhidos : exemplo = 3 (jogosescolhidos.size)
		System.out.println("Quantidade de jogos escolhidos: " + jogosEscolhidos.size());

		System.out.println("Somando os valores . . . ");

		
		System.out.println("Valor total " + valorSomado.toString());
		// System.out.println("Total: R$ " + String.format("%.2f", total_value));
		scan.close();
	}
}
