package entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public class UsedProduct extends Product{
	
	private static final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	
	private Date manufaturedDate;

	public UsedProduct(String name, Double price, Date manufaturedDate) {
		super(name, price);
		this.manufaturedDate = manufaturedDate;
	}

	public Date getManufaturedDate() {
		return manufaturedDate;
	}

	public void setManufaturedDate(Date manufaturedDate) {
		this.manufaturedDate = manufaturedDate;
	}
	
	@Override
	public String priceTag() {		
		return getName()
				+ "(used) $ "
				+ String.format("%.2f", getPrice())
				+ " (Manufatured date: " + sdf.format(manufaturedDate) + ")";
	}
	
	
}
