public class Question3{

  public static int max(String[] intList, int currMax,int count){
    if(count == (intList.length - 1)){
      return currMax;
    }else if (currMax < Integer.parseInt(intList[count])) {
        currMax = Integer.parseInt(intList[count]);
        count++;
        max(intList,currMax,count);
    }
      count++;
      return max(intList,currMax,count);
  }

  public static void main(String[] args){

    long startTime = System.nanoTime();
    int Largest = max(args,Integer.parseInt(args[0]),0);
    long endTime = System.nanoTime();

    System.out.println( Largest + " is the largest number : " + (endTime - startTime) + " NanoSeconds to compute");

  }
}