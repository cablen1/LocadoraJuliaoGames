
package model.entities;

public class Jogos {

	private Double price;
	private String name;
	private Integer ID;
	
	public Jogos() {

	}

	public Jogos(Integer ID, String name, Double price) {
             this.ID = ID;
             this.name = name;
             this.price = price;
	}
	
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getID() {
		return ID;
	}
	public void setID(Integer iD) {
		ID = iD;
	}
	
	@Override
	public String toString() {
		return getID()+"- \""+getName()+"\" -> R$ "+String.format("%.2f", getPrice());
	}
}