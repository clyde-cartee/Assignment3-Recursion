public class Question6{
  public static long sumEven(String[] intArray){
    
  }
  public static void main(String[] args){
    long startTime = System.nanoTime();
    long evenSum = sumEven(args);
    long endTime = System.nanoTime();

    System.out.println( args + " evens added is "+ evenSum +" it took : "+(endTime - startTime) + " NanoSeconds to compute");

  }
}