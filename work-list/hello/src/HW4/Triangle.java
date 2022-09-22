package HW4;

import java.text.MessageFormat;

public class Triangle extends Shape {
	private double base;
	private double height;

	public Triangle() {
		this.base = 10;
		this.height = 10;
	}
	public Triangle(double base, double height) {
		super();
		this.base = base;
		this.height = height;
	}
	
	// set base value
	public void setBase(double base) {
		if (base < 0.0) {
			throw new IllegalArgumentException("底不得小於 0.0");
		}
		this.base = base;
	}
	// get base value
	public double getBase() {
		return base;
	}

	
	// set height value
	public void setHeight(double height) {
		if (height < 0.0) {
			throw new IllegalArgumentException("高不得小於 0.0");
		}
		this.height = height;
	}
	
	// get height value
	public double getHeight() {
		return height;
	}

	// 計算面積
	public double computeArea() {
		return ((getBase() * getHeight()) / 2);
	}

	@Override
	public String toString() {
		return MessageFormat.format("此類別為 Triangle\n底長: {0}\n高度: {1}\n三角形面積:{2}", getBase(), getHeight(),computeArea());
	}
}
