
package model.classes;
/**
 * Classe de Jogo com atributos 
 * GETS E SETS 
 * Construtores 
 * Autor Julio Sartori
 * versao 1.0.0
 * 
 */



import java.math.BigDecimal;

public class Jogo {

	private BigDecimal preco;
	private String nome;
	private Integer codigo;
	private int idConsole1 = 1;
	private int idConsole2 = 2;
	
	
	public Jogo() {

	}
	
	public int getIdConsole1() {
		int PS4;
		return PS4 = idConsole1;
	}

	public void setIdConsole1(int idConsole1) {
		this.idConsole1 = idConsole1;
	}

	public int getIdConsole2() {
		int xBox;
		return xBox = idConsole2;
	}



	public void setIdConsole2(int idConsole2) {
		this.idConsole2 = idConsole2;
	}



	public Jogo(Integer codigo, String nome, BigDecimal preco) {
             this.codigo = codigo;
             this.nome = nome;
             this.preco = preco;
	}
	
	public BigDecimal getpreco() {
		return preco;
	}
	public void setpreco(BigDecimal preco) {
		this.preco = preco;
	}
	public String getnome() {
		return nome;
	}
	public void setName(String nome) {
		this.nome = nome;
	}
	public Integer getcodigo() {
		return codigo;
	}
	public void setcodigo(Integer codigo) {
		codigo = codigo;
	}
	
	@Override
	public String toString() {
		return getcodigo()+"- \""+getnome()+"\" -> R$ "+String.format("%.2f", getpreco());
	}
}