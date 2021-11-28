package entities;

import entities.enums.Color;

public class Rectangle extends Shape {

	private Double width;
	private Double height;
	
	public Rectangle() {
		super();
	}	

	public Rectangle(Color color, Double wigth, Double heigt) {
		super(color);
		this.width = wigth;
		this.height = heigt;
	}

	public Double getWigth() {
		return width;
	}

	public void setWigth(Double wigth) {
		this.width = wigth;
	}

	public Double getHeigt() {
		return height;
	}

	public void setHeigt(Double heigt) {
		this.height = heigt;
	}

	@Override
	public double area() {
		// TODO Auto-generated method stub
		return width * height;
	}

	
}
