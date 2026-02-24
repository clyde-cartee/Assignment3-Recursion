public class Question3{
//used string array so I wouldn't have to traverse the array at the beginning
  public static int max(String[] intList, int currMax,int count){
//uses length because I didnt think it went against the assignment here and returns max if count is == to index max of int array/checks value against last one
    if(count == (intList.length -1)){
      if(currMax < Integer.parseInt(intList[count])){
        currMax = Integer.parseInt(intList[count]);
      }
      return currMax;
//parses integer from the array and compares value if larger than max replace and keep going
    }else if (currMax < Integer.parseInt(intList[count])) {
        currMax = Integer.parseInt(intList[count]);
        count++;
        max(intList,currMax,count);
    }
//keep going if int is not greater
      count++;
      return max(intList,currMax,count);
  }

  public static void main(String[] args){
//same set up as other questions
    long startTime = System.nanoTime();
//makes first max the first element in the array
    int Largest = max(args,Integer.parseInt(args[0]),1);
    long endTime = System.nanoTime();

    System.out.println( Largest + " is the largest number : " + (endTime - startTime) + " NanoSeconds to compute");

  }
}