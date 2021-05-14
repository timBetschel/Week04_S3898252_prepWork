import java.util.Scanner;

public class TriangleArea {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      
      Triangle triangle1 = new Triangle();
      Triangle triangle2 = new Triangle();

      // TODO: Read and set base and height for triangle1 (use setBase() and setHeight())   
      // TODO: Read and set base and height for triangle2 (use setBase() and setHeight())
      // TODO: Determine larger triangle (use getArea())
      // TODO: Output larger triangle's info (use printInfo())

      triangle1.setBase(scnr.nextDouble());
      triangle1.setHeight(scnr.nextDouble());
      triangle2.setBase(scnr.nextDouble());
      triangle2.setHeight(scnr.nextDouble());

      scnr.close();

      if (triangle1.getArea() > triangle2.getArea()){
         System.out.println("Triangle with larger area:");
         triangle1.printInfo();
         }
      else if(triangle2.getArea() > triangle1.getArea()) {
          System.out.println("Triangle with larger area:");
          triangle2.printInfo();  
            }
      else{
         System.out.println("Something went wrong");
         }
   }
}
