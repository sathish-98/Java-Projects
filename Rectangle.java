package OOPS;

public class Rectangle {
    //Implement your code here 
    public float length = 78.8f;
    public float width = 56.6f;
    public double Area = 0;
    public double Perimeter = 0;
    
    public double calculateArea(){
        Area = length * width;
        
        return Area;
    }
    
    public double calculatePerimeter(){
        Perimeter = 2*(length+width);
       
        return Perimeter;
    }
    
    
}

