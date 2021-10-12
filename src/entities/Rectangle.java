package entities;

public class Rectangle {
   public double width;
   public double height ;
   
   public double area() {
	   return width * height;
   }
   
   public double perimeter() {
	   double perimetro = (width * 2)+ (height * 2);
	   return perimetro;
   }
   
   public double diagonal() {
	   double diagonal = Math.sqrt((Math.pow(width,2)) + (Math.pow(height,2)));
       return diagonal;
   }
   
   public void mostrarDados() {
	// concatenando mais de uma variavel no printf
    	System.out.printf("Area: %.2f %n Perímetro: %.2f %n Diagonal: %.2f" , area() , perimeter() , diagonal()); 
   }
}
