import java.util.*;

public class WhileLoops1 {
  public static void main (String[] args) {
    //Declarations 
    Scanner input = new Scanner(System.in);
    String sec;
    String guess; 
    int secLen;
    //counter
    int correctL = 0;
    
    System.out.print("Player 1, please enter the secret word: ");
    sec = input.nextLine().toLowerCase();
    secLen = sec.length();
    System.out.println("\n\n\n\n\n\n\n\n\n\n\n");


    //lets temp use 5 guesses to get the word right
    while (true) {
      System.out.println("\nThe secret word is "+secLen+" letters long, press ? to quit");
      System.out.print("Try to gues the secret word: ");
      guess = input.nextLine().toLowerCase();
      
      if (guess.equals("?")) {
        System.out.println("Nice try, the secret word was "+sec);
        break;
       }//lookinjg for question mark to break loop
      
      
      if (guess.length() < secLen) {
        System.out.println("The guess is to small, it needs "+secLen+" letters");
        continue;
      }//Look for guess legth being shorter than the secretlegth
      
      
      //reset the counter after each guess
      correctL = 0;
      
      for (int j = 0; j < secLen ;j++) {
        //how can we comapre the leeters at a given index point?
        //use .charAt
        if (sec.charAt(j) == guess.charAt(j)) {
          System.out.println("Letter "+ (j +1) +" is "+guess.charAt(j));
          correctL++;
        }//end if that compares the letters.
      }//end for loop that compares all the letters in both words
      System.out.println("Correct letters = "+correctL);
      //if the words are the same break
      if (sec.equals(guess)) {//correctLetter is the same as the length of secret
        System.out.println("Congrats! You are the word guessing champion!!!!");
        break;
      }//end if to stop the code
    }//end for loop to temporarily give 5 guesses
    
    
  
  
  
  
  
  
  
  }//end main
}//end class 