/*****************************************************************************************
* - Project: Recursion_Question 6
*
* - Author: Clyde Cartee
*
* - Compiler: javac 25.0.1
*
* - Date 2/06/25
*
* - Purpose: gives sum of even numbers

* - Complexity: The complexity is n because all things besides recursive call are constants.
*
*
* - I used W3schools java documentation to help me with syntax
*************************************************************************************************/

/*******************************************************************
* I declare and confirm the following:
* - I have not discussed this program code with anyone other than my
* instructor or the teaching assistants assigned to this course.
* - I have not used programming code obtained from someone else,
* or any unauthorised sources, including the Internet, either
* modified or unmodified.
* - If any source code or documentation used in my program was
* obtained from other sources, like a text book or course notes,
* I have clearly indicated that with a proper citation in the
* comments of my program.
* - I have not designed this program in such a way as to defeat or
* interfere with the normal operation of the supplied grading code.
*
* <Clyde Cartee>
* <W30648739>
********************************************************************/
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
  //number list
    args = new String[]{"1","2","3"};
    long evenSum = sumEven(args,0);
    System.out.println(" Evens added is "+ evenSum);
//only evens
    args = new String[]{"2","10","6"};
    evenSum = sumEven(args,0);
    System.out.println(" Evens added is "+ evenSum);
//only odds
    args = new String[]{"1","3","7"};
    evenSum = sumEven(args,0);
    System.out.println(" Evens added is "+ evenSum);


  }
}