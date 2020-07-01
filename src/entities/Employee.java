package entities;

public class Employee {

	
	private String Name;
	private Integer Hours;
	private Double valuePerHour;
	
	public Employee() {
		
	}
	
	public Employee(String name, Integer hours, Double valuePerHour) {
		Name = name;
		Hours = hours;
		this.valuePerHour = valuePerHour;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public Integer getHours() {
		return Hours;
	}

	public void setHours(Integer hours) {
		Hours = hours;
	}

	public Double getValuePerHour() {
		return valuePerHour;
	}

	public void setValuePerHour(Double valuePerHour) {
		this.valuePerHour = valuePerHour;
	}
	
	public double payment() {
		return Hours * valuePerHour;
	}
	
}
