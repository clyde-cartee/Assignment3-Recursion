
public class Question2{

  public static int strTraversal(String inString, char inChar){

     if(inString == null || inString.isEmpty() || inString.equals("") ){

      return 0;
    }else if(inString.charAt(0) == inChar){
      return 1 + strTraversal(inString.substring(1), inChar);
    }
    else{
      return strTraversal(inString.substring(1), inChar);
    }

  }

  public static void main(String[] args){

    long startTime = System.nanoTime();

    int totalChar = strTraversal(args[0],args[1].toCharArray()[0]);

    long endTime = System.nanoTime();
    
    System.out.println(totalChar + " characters " + args[1].toCharArray()[0] +" : " + (endTime - startTime) + " NanoSeconds to compute");

  }
}