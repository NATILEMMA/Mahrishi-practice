import java.util.Scanner;
class Main{
  
  static Scanner input = new Scanner(System.in);
  public static void main(String[] args){

    //twoNumbersCompare();
    //numberDigitAdder();
    hexagonAreaCalculator();
  }
  static void hexagonAreaCalculator(){
 

  
  // 34. Write a Java program to compute the area of a hexagon. Go to the editor
  // Area of a hexagon = (6 * s^2)/(4*tan(π/6))
  // where s is the length of a side
  // Input Data:
  // Input the length of a side of the hexagon: 6
  // Expected Output
  // The area of the hexagon is: 93.53074360871938

    double lengthOfSide;
    double AreaoFHexagon;
    double PI =3.14;
  
  
    System.out.println("Please insert the length of hexagon side");
    lengthOfSide = input.nextInt();
    input.close();

    AreaoFHexagon =((6 * (Math.pow(lengthOfSide,2)))/(4*Math.tan(PI/6)));

    System.out.println("The area of hexagon is: "+ AreaoFHexagon);
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
