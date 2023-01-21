public class WhileLoops2 {
  public static void main (String[] args) {
    //Declarations 
   
    
    /*System.out.println("Used a for loop to print the numbers");
    for (int i = 1; i<=33 ; i+=2) {
      System.out.print(i + " ");
    }
    System.out.println();
    */
    
    //Print every number divissble by 3 with stars around it.. *3*
    System.out.println("Used a while loop to print numbers");
    int x = 1;
    while ( x <= 33) {
      if (x == 33) {
        System.out.print("*"+x+"*");
      }
      else if (x % 3 == 0) {
        System.out.print("*"+x+"*, ");
      }
      else {
       System.out.print(x + ", "); 
      }
      x+=2;
    }
    System.out.println();
    
    
    /* DEFENTION OF WHILE LOOP
     * A While loop will repeat code in its code block.
     * It will continue as long as its single condtion is true.
     * The code will not stop unless the conditon becomes false or 
       there is a break in the code that stops it.
     */ 
     
    //Create a while loop that start at 2, 5, 8, 11, 74 vertically
    int y = 2;
    while (y <= 74) {
      System.out.println(y);
      y+=3;  
    }
    //While loop to print 10 - 1
    int j = 10;
    while (j > 0) {
     System.out.println(j);
     j--;
    }
  
  }//end main
}//end class