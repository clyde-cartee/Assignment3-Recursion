
public class Question2{

  public static int strTraversal(String inString, char inChar){
//returns if end of string/ ends recursion
     if(inString == null || inString.isEmpty() || inString.equals("") ){
      return 0;
//checks if first letter in string is == to char then adds to total and continues
    }else if(inString.charAt(0) == inChar){
      return 1 + strTraversal(inString.substring(1), inChar);
    }
    else{
//continues recursion but doesnt add to total
      return strTraversal(inString.substring(1), inChar);
    }

  }

  public static void main(String[] args){
//takes first string and only first char of second string
    long startTime = System.nanoTime();
    int totalChar = strTraversal(args[0],args[1].toCharArray()[0]);
    long endTime = System.nanoTime();
//output
    System.out.println(totalChar + " characters " + args[1].toCharArray()[0] +" : " + (endTime - startTime) + " NanoSeconds to compute");

  }
}