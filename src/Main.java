import java.util.Arrays;
import java.util.Scanner;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.ArrayList;
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
    int [] array ={9};
    int n = 5;
    String string = "";
    //System.out.println(checkifMiddle(array));
    //System.out.println(DifferenceEVENODD(array));
    //reverseArray(array);
    String [] stringArray = {"fl","hello","flight","hello","hello","fl"};
    //System.out.println(longestCommonPrefix(string));
    // insertArray(array,0,4576);
    // addElementToArray(array,0,4567);
    //arrayDeleteArrayElement(5,array);
    //duplicateString(stringArray);
    //deleteDuplicateArrayElement();
   // threeSum();
    
   // mharish updated compro question page length 91 exersice
   //System.out.println(ounUpCount({6,3,1},11));
   //System.out.println(nUpCount(array,n));
    //System.out.println(primeCount(-10,6));
    //System.out.println(isMadhavArray(array));
    //System.out.println(isInertial(array));
    System.out.println(countSquarePairs(array));
    
  }

 
  public static boolean isPerfectSquare(int num){
    if(num<0)
      return false;
    double double_value =  Math.sqrt(num);
    int int_value = (int)Math.sqrt(num);

    if((double_value*double_value) == (double)(int_value *int_value)){
        return true;
    }else 
    return false;
  }

  public static int countSquarePairs(int[ ] a){
    Arrays.sort(a);
    int sum;
    int count = 0;
    for (int i = 0;i<a.length;i++){
      for (int j = i+1;j<a.length;j++){
        sum = 0;
        if(a[i]<a[j] && a[i]>0 && a[j]>0 ){
          sum = a[i]+a[j];
          if(isPerfectSquare(sum)){
            System.out.println("x"+a[i] +"y"+a[j]);
            count ++;
          }
           
        }

      }
    }
    return count;
  }
  public static int isInertial(int[ ] a){
    boolean inOdd = true;
    Arrays.sort(a);
    if(a[a.length-1] %2 != 0)
      return 0;
    if(a[0]%2 == 0)
      inOdd = false;
    for(int i = 0;i<a.length;i++){
      if(a[i]%2 == 0 && !(inOdd)  && a[a.length-1] != a[i]){
        continue;
      }else if(a[i]%2 == 0 && (inOdd) && a[a.length-1] != a[i] ){
          return 0;
      }else if (a[i]%2 != 0 ){
        inOdd = true;
        
      }else if (a[i]%2 == 0 && a[a.length-1] == a[i]&& inOdd ){
        return 1;
      }else{
        return 0;
      }
      
    }
    return 0;
  }
  public static int isMadhavArray(int []a){
    int j = 0;
    int current_sum = 0;
    int min = 0;
    int max = 0;
    double double_value =  Math.sqrt(1+8*a.length);
    int int_value = (int)Math.sqrt(1+8*a.length);

    if((double_value*double_value) == (double)(int_value *int_value)){
      while(max<a.length){
        current_sum = 0;
        for(int  i = min; i<=max;i++){
          current_sum +=a[i];          
        }
        if(current_sum == a[0]){
          min = max+1;
          max = max+2+j;
          j++;
        }
        else{
          return 0;
        }
      }
      return 1; 
    }else
      return 0;
  }
  public static int primeCount(int start, int end){
    int count = 0;
    for(int i = start; i<= end; i++){
      if(i == 1 || i<0)
      continue;
      else if( i == 3 || i ==5 || i == 2)
        count++;
      else if(!(i % 3 == 0 || i % 2 == 0|| i % 5 == 0)){
        count++;
      }
    }
    return count;
  }
  

  public static int nUpCount(int[] a, int n) {
    int upcount = 0;
    int sum = 0;
    for (int i = 0; i< a.length; i++){
      if(sum <= n){
        sum = sum + a[i];
        if(sum > n){
          upcount++;
        }
      }else{
        sum = sum + a[i];
      }
     }

return upcount;
  }
  public static int perfectSquare(int num){
  int perfectsquare = 0;
  if(num<0)
  return perfectsquare;
  else{
    int root = (int) Math.sqrt((double)num)+1;
    perfectsquare = ( root)*(root);
    return perfectsquare;
  }

  }

  
public static int sumOddLengthSubarrays(int[] arr) {
    int sum  = 0;
    for (int i = 0;i<arr.length;i++){
        for (int j = i;j<=arr.length-1;j+=2){
            for (int k =i ; k<=j;k++ ){
                sum = sum + arr[k];
            }
        }
    }
  return sum;

      

}
  
//     public static void threeSum() {
//         Map <Integer, Integer> map = new HashMap<>();
//         //int size = nums.length;
//         int index;
//         String abe = "bay";
//         Character ch = 'h';
//         abe = abe + ch;
//         System.out.print(abe);
// //         int complement;
// //         Arrays.sort(nums);
// //         map.clear();
// //         for(int i = 0 ;i<size;i++){
// //             map.put(nums[i],i);
// //         }

// //         List <List<Integer>> result = new ArrayList<>();
// //         List <Integer> list;
// //         if(!(nums[size-1]<0)){
// //             for (int i = 0;( i< size && nums[i] <= 0);i++){
// //             for(int j = i+1;j<size;j++){
// //                 complement = -1*(nums[i]+nums[j]);
                
// //                 if(map.containsKey(complement)){
// //                    index = map.get(complement);
// //                     list = new ArrayList(List.of(nums[i],nums[j],complement));
                    
// //                     if((index != i && index != j && index > j && !result.contains(list))){

// //                             result.add(list);
            
// //                     } 
// //                 }
                    
// //             }
 
         
      
     
// // }
// //         }
        
//         // return result;
//     }


  
  
  

  public static void duplicateString(String []array){
   
    HashMap <String,Integer> dictionary = new HashMap <>();
    Integer val = 0;
    for (String string : array){
      if (dictionary.containsKey(string)){
        val = dictionary.get(string);
        dictionary.put(string,++val);
      }else {
        dictionary.put(string,1);
      }
    }
    dictionary.forEach((key,value)->{
        if(value>1){
          System.out.println(key +" :" + value);
        }
    });
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
    String hello = "hello";
      
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
