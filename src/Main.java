
import java.util.Scanner;
class Main{
  
  static Scanner input = new Scanner(System.in);
  public static void main(String[] args){

    //twoNumbersCompare();
    //numberDigitAdder();
    //hexagonAreaCalculator();
    //reveresString();
    //stringCharIdentifier();
    //validThreeDigitNumber();
    //asciiValue();
    //adderSameNo();
    //printOdd();
    //factor();
    //capitalizer();
    //beforeLastWord();
      sortarray();

  }
  public static void sortarray(){
    int [] array = {1,4,5,6,4,8};
    int max = 0;

    int length = array.length;
    for(int i = 0 ; i < length; i++){
      for (int j= 1 ; j<length;j++){
        if(array[j-1]> array[j]){
          max =  array[j-1];
          array[j-1] = array[j];
          array[j] = max;
        }
      }
      
    }
    for(int i = 0; i< length;i++){
      System.out.println(array[i]);
    }


  }
  public static void beforeLastWord(){
   
    System.out.println("Input the string: ");
    String text = input.nextLine(); 
    Scanner textScanner = new Scanner(text);
    String beforeWord = "";
    String latterWord = "";
    String[] hello = text.split("[ ]");
    System.out.println(hello[0]);
    while(textScanner.hasNext()){
      
      latterWord = textScanner.next();
      if(textScanner.hasNext())
        beforeWord = latterWord;
    }
    

    System.out.println(beforeWord);
 } 	
  public static void capitalizer(){
   
    System.out.println("Input the string: ");
    String text  = input.nextLine(); 
    boolean capitalize = true;
    char [] chartext = text.toCharArray();
    for (int i = 0 ; i < text.length();i++){
      if(capitalize == true){
        chartext[i] = Character.toUpperCase(chartext[i]);
        capitalize = false;
      } 
      if (chartext[i]== ' ')
        capitalize = true; 
    }
    text = String.valueOf(chartext);
    System.out.println(text);
 } 	
 
    public static void factor(){
     Scanner in = new Scanner(System.in);
     System.out.print("Input an integer: ");
     int x = in.nextInt(); 

   System.out.println(result(x));
  } 		
 public static int result(int num) {	
   int ctr = 0;
       for(int i=1; i<=(num); i++) {
           if(num % i == 0){
               ctr++;
           }
       }
       return ctr;
 }

  static void asciiValue(){
    System.out.println("insert one character  for ascii value");
    char ch = input.next().charAt(0);

    int asciiValue = (int)(ch);
    System.out.println("The asciiValue is "+asciiValue);
  }

    static void adderSameNo(){
    System.out.println("insert number to be added to its duplicate");
    String ch = input.nextLine();
    int sum = 0;
    String duplicated = ch;
    String output = ch;

    for (int i =0 ; i<3; i++)
      {
      
        sum = sum + Integer.parseInt(duplicated);
        if(i>0)
          output =output + "+" + duplicated;
        duplicated += ch;
      }
    
    System.out.println(output+" = "+ sum);
  }
  static void printOdd(){
   

    for (int i =1 ; i<=99; i+=2)
      {
        System.out.println(i);
      }
    
 
  }
  static void validThreeDigitNumber(){
    int count = 0;
    for (int i = 1; i<=4;i++){
     for (int j = 1;j<=4;j++){
      for(int k = 1; k<=4;k++){
        if(j!= i && k != i && j != k){
          System.out.println(i+""+j+""+""+k);
          count += 1;
            
        }
      }
     }
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
