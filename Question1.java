
public class Question1{
//Recursive character length function
  public static int strLength(String inString){
//This exits the program when there is no more characters left
    if(inString == null || inString.isEmpty() || inString.equals("") ){
      //Returns zero so it doesn't add a character since there isnt one
      return 0;
    }
//Recursively adds for each "loop" in recursion also reduces the string by one character
    return 1 + strLength(inString.substring(1));
  }

  public static void main(String[] args){
//start time
    long startTime = System.nanoTime();
//starts recursion
    int totalChar = strLength(args[0]);
//end time
    long endTime = System.nanoTime();
//prints out length and find the value of time it took to compute
    System.out.println(totalChar + " characters: " + (endTime - startTime) + " NanoSeconds to compute");

  }
}