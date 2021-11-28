package entities;

public class Employee {
	
	private int id;
	private String name;
	private double salary;
	
	
	public Employee(int id, String name, double salary) {
		this.name = name;
		this.salary = salary;
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalay() {
		return salary;
	}

	public void setSalay(double salay) {
		this.salary = salay;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}
	
	public void incraseSalary(double percentage) {
		salary += salary * percentage / 100.0;
	}
	
	public String toString() {
		return id + ", " + name + ", " + String.format("%.2f", salary);
	}
	
}
