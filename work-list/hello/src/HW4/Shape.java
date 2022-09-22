package HW4;

public class Shape {
	
	// 物件建立時的初始方式，無引數建構式=> new Shape()
	public Shape(){
		setArea(0);
	}
	// 物件建立時的初始方式，有引數建構式=> new Shape(100)
	public Shape(double area) {
		setArea(area);
	}
	
	private double area;	// 「area」屬性，代表圖形的面積
	
	// set area value
	public void setArea(double area) {
		if(area<0.0) {
			// 如果 area 參數大於0 拋錯
			throw new IllegalArgumentException("參數需大於0.0");
		}
		this.area = area;
	}
	// get area value
	public double getArea() {
		return area;
	}
	
	@Override
	public String toString() {		
		return String.format("%s%n%s%.2f%n","此類別為Shape","面積：",getArea());
	}
}
