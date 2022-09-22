package HW4;

import java.text.MessageFormat;

// Rectangle 繼承 Shape
public class Rectangle extends Shape {
	private double length;
	private double width;
	
	
	// super() 從子類別呼叫其父類別的建構式、方法
	public Rectangle(double length,double width){
		super();
		setLength(length);
		setWidth(width);
	}
	public Rectangle(){
		super();
		setLength(10);
		setWidth(10);
	}
	
	// set width value
	public void setWidth(double width) {
		if (width < 0.0) {
			throw new IllegalArgumentException("寬度不得小於 0.0");
		}
		this.width = width;
	}
	// get length value
	public double getWidth() {
		return width;
	}
	
	
	// set length value
	public void setLength(double length) {
		if (length < 0.0) {
			throw new IllegalArgumentException("長度不得小於 0.0");
		}
		this.length = length;
	}
	// get length value
	public double getLength() {
		return length;
	}
	
	// 計算 Area 面積
	public double computeArea() {		
		return length * width;
	}
	
	// 顯示面積
	@Override
	public String toString() {
		
		return MessageFormat.format("此類別為 Rectangle\n長度: {0}\n寬度: {1}\n矩形面積:{2}", getLength(), getWidth(),computeArea());
	} 
}
