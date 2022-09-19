import java.util.ArrayList;
import java.util.Scanner;
class Main{
  
  static Scanner input = new Scanner(System.in);
  public static void main(String[] args){

    //twoNumbersCompare();
    //numberDigitAdder();
    //hexagonAreaCalculator();
    //reveresString();
    //stringCharIdentifier();
    validThreeDigitNumber();
  }
  static void validThreeDigitNumber(){
    int [] numsarray = {1,2,3,4};
    ArrayList<Integer> nums = new ArrayList<Integer>(nums); 
  
    for (int i=1; i<=4;i++){
      
      ArrayList<Integer> choosenIndex = new ArrayList<Integer>(); 
      ArrayList<Integer> number = new ArrayList<Integer>(); 


      
      

      
      // for (int j=1; j<=4;j++){
      //   if(j==i)
    
      //     continue;
      //   number = ((number*10) +  j);
      //   for (int k=1; k<=4;k++){
      //     if(k==j)
      //     continue;
      //     number = ((number*10) +  j);
      //     for (int l=1; l<=4;l++){
      //       if(l==k)
      //       continue;
      //       number = ((number*10) +  j);
      //     }
      //   }
      }
      count++;
      System.out.println(number);
    }
    System.out.println(count);
  }
  static void stringCharIdentifier(){
    System.out.println("Please insert the string to be reversed");
    String inputString = input.nextLine();
    input.close();

    int letters = 0, numbers = 0, space = 0, other = 0;
    boolean inList = false;

    String list = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz 1234567890";
 
    for(int i = 0 ; i<inputString.length();i++){
      inList = false;
      for(int j = 0; j<list.length();j++){
        if(inputString.charAt(i)== list.charAt(j)){
          if(j <= 51){
            letters +=1;
            inList = true;
          }
           
          else if(j == 52){
            space += 1;
            inList = true;
          }       
          else 
            numbers += 1;
            inList = true;
        }
      }
      if(inList == false)
           other += 1;
    }
//     The string is :  Aa kiu, I swd skieo 236587. GH kiu: sieo?? 25.33
//  23                                               
//  9                                                 
// 10                                               
//  6
    System.out.println(" The string is : "+ inputString);
    System.out.println(" letter   : "+ letters);
    System.out.println(" space    : "+ space);
    System.out.println(" number   : "+ numbers);
    System.out.println(" other    : "+ other);
  }
  static void reveresString(){
 

  
    // 34. Write a Java program to compute the area of a hexagon. Go to the editor
    // Area of a hexagon = (6 * s^2)/(4*tan(π/6))
    // where s is the length of a side
    // Input Data:
    // Input the length of a side of the hexagon: 6
    // Expected Output
    // The area of the hexagon is: 93.53074360871938
  
      String inputString;

      System.out.println("Please insert the string to be reversed");
      inputString = input.nextLine();
      input.close();
      //teth   length = 4     upto 3 h  
      int stringLength = inputString.length()-1;
      String reverse = "";
      for (int i= 0; i <= stringLength ; i++ ){
        reverse += inputString.charAt((stringLength - i));

      }
      System.out.println(reverse);
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
