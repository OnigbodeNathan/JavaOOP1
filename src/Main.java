
import java.util.InputMismatchException;
import java.util.Scanner;
public class Main {
     public static void main(String[] ars){
         Scanner input = new Scanner(System.in);
         try {
//           Geometry geometry = new Geometry();
//           Geometry.accessingPi();
             float breadth = input.nextFloat();

             float length = input.nextFloat();
//         System.out.println(geometry.areaOfTriangle(length, breadth));

         }catch (InputMismatchException ime){
             System.out.println("something went wrong");
         } catch (Exception e) {
             System.out.println("enter a valid number");
         }


     }
}
//javac folder name/filename --- for compiling code to bytecode(used for creating executable