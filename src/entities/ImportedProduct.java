package entities;

public class ImportedProduct extends Product{
	
	private Double customsFee;
	
	public ImportedProduct() {
		super();
	}

	public ImportedProduct(String name, Double price, Double customsFee) {
		super(name, price);
		this.customsFee = customsFee;
	}

	public Double getCustomsFree() {
		return customsFee;
	}

	public void setCustomsFree(Double customsFree) {
		this.customsFee = customsFree;
	}
	
	public double totalPrice() {
		return super.getPrice() + customsFee;
	}

	@Override
	public String PriceTag() {
		return super.getName() + " $ " + String.format("%.2f",totalPrice()) + "(Customs fee: $ " + String.format("%.2f", customsFee) + ") ";
	}
}
