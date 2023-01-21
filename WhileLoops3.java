import java.util.*;

public class WhileLoops3 {
  public static void main (String[] args) {
    //Declarations 
    Scanner input = new Scanner(System.in);
    String name; 
    //Accumulator 
    String inviteList = "";//Concatenate to "glue" our strings togehter. 
    //FLAG
    boolean addPeople = true;
    //Counter 
    int countPeople = 0;
    
    
    /*
     We can use FLAGS to control a while loop
     A FLAG is a simple boolean expression that tells the loop to start or stop.
     */ 
    
    
    
    while (addPeople == true) {
      System.out.print("Please enter the name of the person being invited: ");
      name = input.next();
      System.out.print("Do you want to add more people? YES or NO");
      String choice = input.next().toUpperCase();
      if (choice.equals("NO")) {//.= .equlas is used to compare string... == with strings declares location
        addPeople = false;//break;
      }//looking for NO
      inviteList += (name + " ");
      System.out.println();
      countPeople++;
    }//end while loop
    
    System.out.println(inviteList);
    System.out.println("Amount of people: "+countPeople);
  
    input.close();
  }//end main
}//end class 