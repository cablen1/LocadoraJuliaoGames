package model.entities;

/**
 * 
 * Classe de DataBase , onde estao cadastrados informaçoes de clientes na base de dados interna
 * metodos de update,procura por ID e por nome e remove. 
 *Autor Julio Sartori 
 *versao 1.0.0
 * 
 * 
 */


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import model.classes.Clientes;

public class ClientesService {

	private List<Clientes> clientesDatabase =  new ArrayList<>();

	{	clientesDatabase.add(new Clientes(1, "Rafael Ferreira"));
		clientesDatabase.add(new Clientes(2, "Julio Sartori"));
	}
	
	public List<Clientes> getClientes(){
		return clientesDatabase;
	}

	public void addNewCliente(Clientes client) {

		this.clientesDatabase.add(client);
	}

	/*
	 * Faz atualização dos clientes na base.
	 */

	public void updateNewClient(Clientes client) {
		int count = 0;
		for (Clientes clienteDB : clientesDatabase) {
			/*
			 * se o codigo do cliente DB for igual o codigo do cliente que eu recebo =
			 * atualizo ele pelo codigo.
			 */
			if (clienteDB.getCodigo().equals(client.getCodigo())) {
				clientesDatabase.get(count).setCodigo(client.getCodigo());
				clientesDatabase.get(count).setNome(client.getNome());
				break;
			}
			count++;

		}

	}
	
	
	public void removeClient(Clientes client) {
		int count = 0;
		for (Clientes clienteDB : clientesDatabase) {

			if (clienteDB.getCodigo().equals(client.getCodigo())) {
				clientesDatabase.remove(count);
				break;
			}
			count++;
		}
	}

	public Clientes procuraClientesPorNome(String nome) {
		Clientes resultado = null;
		
		for (Clientes clientUnico : clientesDatabase) {
			
			if(clientUnico.getNome().contains(nome)) {
				
				resultado = clientUnico;
				break;
			}
		}
			
		return resultado;
	}
	
	
	
	public Clientes procuraClientesPorCodigo(Integer codigo) {
		Clientes resultado = null;
		
		for (Clientes clientUnico : clientesDatabase) {
			
			if(clientUnico.getCodigo().equals(codigo)) {
				
				resultado = clientUnico;
				break;
			}
		}
			
		return resultado;
	}

	
}
