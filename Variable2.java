public class Variable2 {
  public static void main(String[] args){
    //initializing the variables..
    int num;
    num = 7;
    
    double pie = 3.14159;
    String topic = "Computer Science";//set this to computer science 
    
    System.out.println(num);
    System.out.println("num");
    System.out.println(pie);
    System.out.println(topic);
    //lets expand on this 
    System.out.println(num + num);
    System.out.println(pie + pie);
    System.out.println(topic + topic);//concatenate.. glue togther 
    
    //Create the following outputs 
    //the number is,,, use Num 
    //Pi is ... use PIE 
    //The topic is... use TOPIC 
    System.out.println("The number is " + num);
    System.out.println("Pi is "+ pie);
    System.out.println("The topic is "+ topic);
    //RULE.. once a variable is established with a type 
    //we don't have to initalize it again 
    //AKA we can chnage the value but we can't change the type 
    num = 15;
    System.out.println("The new number is " + num);
    num = 1283;
    System.out.println("The new number is " + num);
    num = -71;
    System.out.println("The new number is " + num);
    //chnage pie to a new value and change topic to a new value 
    pie = 3.333333;
    topic = "Programming is Easy!";
    System.out.println("pie is now " + pie);
    System.out.println("Topic is now " + topic);
    //the complier reads from top to bottom, left to right  
  
  }//endmain
}//end class 