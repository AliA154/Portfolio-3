import java.util.Scanner;
import java.text.DecimalFormat;

public class UsingMath10 {
  public static void main (String[] args) {
     Scanner input = new Scanner(System.in); 
     DecimalFormat df = new DecimalFormat("0.###");
   
     int num, den;
     double quo;
     
     System.out.print("Enter the numerator: ");
     num = input.nextInt();
     System.out.print("Enter the denamenator: ");
     den = input.nextInt();
    
     System.out.println("You entered "+num+"/"+den);
     quo = (double)num/den;
     System.out.println("The quotient is "+df.format(quo));
     
     
     
     
     
     
     
     input.close();  
  }//end main
}//end class 