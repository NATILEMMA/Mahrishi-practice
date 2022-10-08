
import java.util.Arrays;
import java.util.Scanner;
import java.util.Dictionary;
import java.util.Hashtable;
import java.util.HashMap;
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
    //sortarray();
    int [] array = {9,8,7,6,5,3,2,1};
    String string = "";
    //System.out.println(checkifMiddle(array));
    //System.out.println(DifferenceEVENODD(array));
    //reverseArray(array);
    String [] stringArray = {"fl","hello","flight"};
    //System.out.println(longestCommonPrefix(string));
    // insertArray(array,0,4576);
    // addElementToArray(array,0,4567);
    //arrayDeleteArrayElement(5,array);
    duplicateString(stringArray);

  }
  

  public static void duplicateString(String []array){
    //create a dictionary
`
    Dictionary dict = new Hashtable();
    Integer exist = 0;
    
    
    for (String string : array){
      if(dict.get(string) != null){
        
      }
     
    }
    
    //if string dictionary exity if true increament
    // else add to dictionary
    // print everyword of dictonay which has more value than 1
  }

  public static void arrayDeleteArrayElement(int index, int[] array){
    int carry1 = 0;
    int carry2 = 0;
    int len = array.length;

    
    if(index<array.length){
      carry1 = array[len-1];
      
      array= Arrays.copyOf(array, len-1);
     
      for (int i = array.length-1; i >= index;i--){
        carry2 = array[i];
        array[i] = carry1;
        carry1 = carry2;
    }
  }
  System.out.println(Arrays.toString(array));
}
  public static void addElementToArray(int [] array1 , int index1, int value1){
    int index =index1;
    int value= value1;
    int [] array = array1;
    if(array.length > index){

      array = Arrays.copyOf(array,array.length+1);
      for(int i = array.length-2; i>=index;i--){
        array[i+1] = array[i];
      }
      array[index]= value;
    }
    else{
      array = Arrays.copyOf(array,index+1);
      array[index] = value;
    }
    System.out.println(Arrays.toString(array));
  }
  public static String longestCommonPrefix(String[] strs) {
    char charP ;
    String prefix = "";
    int length = strs[0].length();
    boolean isPreifx = true;
        
    for(int i = 0 ; i<length ;i++){
        charP = (strs[0].toCharArray())[i];
        for (String string :strs){
          if(string == "")
              return prefix;
            else{
                if (string.charAt(i) == charP){
                     continue;
                 }
           
                else{
                    isPreifx = false;
                    break;
                }
            }
        }
        if(isPreifx){
            prefix = prefix + charP;
        }
        
        else
            break;
    }
    return prefix;
}

  public static void insertArray(int []array1, int index1, int value1){
    int[] array = array1;
    int index = index1;
    int value = value1;
    System.out.println(Arrays.toString(array));
    if(index > array.length-1){
      array = Arrays.copyOf(array, index+1);
    }else
       array = Arrays.copyOf(array, array.length+1);
    
    if(index < array.length){
      for (int i = (array.length-1) ; i>=(index); i--){
      if(i == index)
        array[i]= value;
      else
        array[i] = array[i-1];
        
      }
    }
    System.out.println(Arrays.toString(array));
 }

  public static void reverseArray(int [] array){
    int length = (array.length);
    String s = "hello";
    
    char[] prefix= {};
    prefix[0] = (s.toCharArray())[0];
    int number = 0;
    for (int i = 0; i<(length/2); i++){
      number = array[i];
      array[i] = array[(length-1)-i];
      array[(length-1)-i] = number;
      
    }
    System.out.println(Arrays.toString(array));
  }
  public static int DifferenceEVENODD(int [] array1){
    int [] array = array1;
    int sumEven = 0;
    int sumOdd = 0;

    if (array.length == 0)
      return 0;
    else{
      for(int i = 0 ; i < array.length; i++){
        if(Math.abs(array[i]%2) == 0){
          sumEven += array[i];
        }
        else{
          sumOdd += array[i];
        }
  
      }
      return sumOdd - sumEven;
    }
  }
 
  public static void sortarray(){
    int [] array = {3, 2, 1, 4, 5};
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

    public static int checkifMiddle(int[] array){
      int [] array1 =array;
      //index of middle array element and arrray size divided two and adding 1 are not equal thing 
      //when you make a fution that returns make the function signature right
  

      if((array1.length%2) == 0 || (array1.length == 0)){
        return 0;
      }
      else{
        for(int i = 0;i<array1.length ;i++){
          if(i ==((array1.length/2))){
            continue;
          }
          else if(array1[i] <= array1[((array1.length/2))]){
            return 0;
          }

        }
        return 1;

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
