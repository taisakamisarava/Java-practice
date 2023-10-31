
public class Laptop{
private String producer;
private String ram;
private double cost;
private int id;
private int releaseDate;

public Laptop(String producer, String ram, double cost, int id, int releaseDate) {
	this.producer = producer;
	this.ram = ram;
	this.cost = cost;
	this.id = id;
	this.releaseDate = releaseDate;
}

public String getProducer() {
	return producer;
}
public String getRam() {
	return ram;
}
public double getCost() {
	return cost;
}
public void setProducer(String producer) {
	this.producer = producer;
}

}


