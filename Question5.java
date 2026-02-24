public class Question5{

  public static String reversalRecursive(String SIn){
/*checks if there is a value in string and returns empty string if true, this starts the compilation of the chars and
 allows to still have a return type that doesn't change anything if empty*/
    if(SIn == null || SIn.isEmpty() || SIn.equals("") ){
      return "";
    }
    //puts the current first char at the end of the next recursion return and then removes it from next recursive string
    return  reversalRecursive(SIn.substring(1)) + SIn.charAt(0);
  }
  public static void main(String[] args){
  //Similar set up to previous questions
    String S = args[0];

    long startTime = System.nanoTime();
    String Sreverse = reversalRecursive(S);
    long endTime = System.nanoTime();

    System.out.println( S + " Reversed is "+ Sreverse +" it took : "+(endTime - startTime) + " NanoSeconds to compute");

  }
}