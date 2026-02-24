
public class Question1{
//Recursive character length 
  public static int strLength(String inString){
    if(inString == null || inString.isEmpty() || inString.equals("") ){
      return 0;
    }
    return 1 + strLength(inString.substring(1));
  }

  public static void main(String[] args){

    long startTime = System.nanoTime();

    strLength(args[0]);

    long endTime = System.nanoTime();

    System.out.println(endTime-startTime + " NanoSeconds");

  }
}