public class Question6{
//converts ints in string array to int and uses modulous to check if even
  public static long sumEven(String[] intArray, int count){
  //kinda like a while loop that checks count to length
    if(count == intArray.length -1){

      // returns last value if even or returns zero ending the loop 
      if (Integer.parseInt(intArray[count])  % 2 == 0) {
        return Integer.parseInt(intArray[count]);    
      }else{
        return 0;
      }
//if not end of array it checks if even and adds that to the return of the next recursion else only calls next recursion
    }else if (Integer.parseInt(intArray[count]) % 2 == 0) {
      return Integer.parseInt(intArray[count]) + sumEven(intArray, count+1);    
    }

    return sumEven(intArray,count+1);
  }
  public static void main(String[] args){
    //same set up 
    long startTime = System.nanoTime();
    long evenSum = sumEven(args,0);
    long endTime = System.nanoTime();

    System.out.println(" Evens added is "+ evenSum +" it took : "+(endTime - startTime) + " NanoSeconds to compute");

  }
}