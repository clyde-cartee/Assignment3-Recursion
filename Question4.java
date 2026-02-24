public class Question4{
//I could use a string value of the first number to allow larger numbers to calculate
public static int numTraversal(long N,int D){
  if (N==0) {
    return 0;
  }    
  else if(N % 10 == D){
    return 1 + numTraversal((N/10),D);
  }
  else{
    return numTraversal((N/10),D);
  }
}

  public static void main(String[] args){
//same set up as other questions
    long startTime = System.nanoTime();
    int numOccurance = numTraversal(Long.parseLong(args[0]),Integer.parseInt(args[1]));
    long endTime = System.nanoTime();

    System.out.println( args[1] + " occurs "+ numOccurance +" Times in " + args[0] + " it took :"+(endTime - startTime) + " NanoSeconds to compute");

  }
}
