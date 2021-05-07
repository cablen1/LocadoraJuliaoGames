package model.classes;
/**
 * Classe Cliente com atributos /gets e sets e contrutores 
 * autor julio Sartori
 * versao 1.0.0
 * 
 */

public class Clientes {

	private String nome;
	private Integer codigo;

	public Clientes() {}
	
	public Clientes(Integer codigo, String nome) {
		this.codigo = codigo;
		this.nome = nome;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Integer getCodigo() {
		return codigo;
	}
	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}
	
	
	
	
	
}
