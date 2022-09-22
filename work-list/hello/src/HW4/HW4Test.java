package HW4;

public class HW4Test {

	public static void main(String[] args) {
		// TODO 自動產生的方法 Stub
		
		
		
		Shape Shape = new Shape();
		Shape Rectangle= new Rectangle();
		Shape Triangle= new Triangle();
		System.out.println(Shape);
		System.out.println(Rectangle);
		System.out.println(Triangle);
		
		
		Shape ShapeArray[] = new Shape[3];
		ShapeArray[0] = new Shape(10);
		ShapeArray[1] = new Rectangle(10,10);
		ShapeArray[2] = new Triangle(10,10);	
		
		
		for(int i=0;i<ShapeArray.length;i++) {
			System.out.println(ShapeArray[i]);
		}
		System.out.println(ShapeArray[0].getArea());
		ShapeArray[0].setArea(111);
		System.out.println(ShapeArray[0].toString());		
		
		
		System.out.println(((Rectangle)ShapeArray[1]).getLength());
		((Rectangle)ShapeArray[1]).setLength(222);
		System.out.println(((Rectangle)ShapeArray[1]).toString());
		
		System.out.println(((Triangle)ShapeArray[2]).getBase());
		((Triangle)ShapeArray[2]).setBase(333);
		System.out.println(((Triangle)ShapeArray[2]).toString());
	}

}
