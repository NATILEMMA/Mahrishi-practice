import java.util.Scanner;

class Main{
  
  static Scanner input = new Scanner(System.in);
  public static void main(String[] args){

    //twoNumbersCompare();
    //numberDigitAdder();
  }
 
  static void numberDigitAdder(){
    int inputInteger;
    
    
    System.out.println("Please insert the number");
    inputInteger = input.nextInt();
    input.close();
    System.out.println(inputInteger);
    int sum = 0;
    while(inputInteger > 0){
     sum = sum + (inputInteger % 10) ;
     inputInteger = inputInteger / 10; 
    }
    System.out.println("The sum of the digits is: "+ sum);
  }



  static void twoNumbersCompare(){
    long firstInput = 0;
    long secondInput = 0;
    
    System.out.println("Please insert first no ");
    firstInput = input.nextLong();
    System.out.println("Please insert second no ");
    secondInput = input.nextLong();
    input.close();
    
    if (firstInput != secondInput){
      System.out.println(firstInput+" != "+secondInput);
      if (firstInput < secondInput){
        System.out.println(firstInput+" < "+secondInput);
        if (firstInput <= secondInput){
           System.out.println(firstInput+" <= "+secondInput);
        }
      }
      else if (firstInput > secondInput){
        System.out.println(firstInput+" > "+secondInput);
        if (firstInput >= secondInput){
           System.out.println(firstInput+" >= "+secondInput);
        }
      }
    }
    else
      System.out.println(firstInput+" == "+secondInput);
    
  }
}
