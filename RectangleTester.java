package OOPS;

class RectangleTester {

	public static void main(String args[]) {
		
		Rectangle rectangle=new Rectangle();
		//Assign values to the member variables of Rectangle class

		//Invoke the methods of the Rectangle class to calculate the area and perimeter
		
		
		//Display the area and perimeter using the lines given below
		System.out.println("Area of the rectangle is " +(double) Math.round(rectangle.calculateArea()));
		System.out.println("Perimeter of the rectangle is " + (double) Math.round (rectangle.calculatePerimeter()));
	}

}
