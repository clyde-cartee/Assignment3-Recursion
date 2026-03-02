/*****************************************************************************************
* - Project: Recursion_Question 3
*
* - Author: Clyde Cartee
*
* - Compiler: javac 25.0.1
*
* - Date 2/06/25
*
* - Purpose: gives the max int. In list. 
*
* - Complexity: The complexity is n because it is n-1 for finding it + constant so it simplifies to O(n)
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
public class Question3{
//used string array so I wouldn't have to traverse the array at the beginning
  public static int max(String[] intList, int currMax,int count){
//uses length because I didnt think it went against the assignment here and returns max if count is == to index max of int array/checks value against last one
    if(count == (intList.length-1) || intList.length -1 == 0){
      
      if(intList.length -1 == 0){
        return currMax;
      }
      if(currMax < Integer.parseInt(intList[count])){
        currMax = Integer.parseInt(intList[count]);
      }
      return currMax;
//parses integer from the array and compares value if larger than max replace and keep going
    }else if (currMax < Integer.parseInt(intList[count])) {
        currMax = Integer.parseInt(intList[count]);
        count++;
        return max(intList,currMax,count);
    }
//keep going if int is not greater
      count++;
      return max(intList,currMax,count);
  }

  public static void main(String[] args){
    //last case is max
    args = new String[]{"12", "345" ,"678"};
    int Largest = max(args,Integer.parseInt(args[0]),1);
    System.out.println( Largest + " is the largest number");
//one case
    args = new String[]{"12345678"};
    Largest = max(args,Integer.parseInt(args[0]),1);
    System.out.println( Largest + " is the largest number");
//multiple same
    args = new String[]{"12", "345" ,"678","12", "345" ,"678","12", "345" ,"678"};
    Largest = max(args,Integer.parseInt(args[0]),1);
    System.out.println( Largest + " is the largest number");
//first is max
    args = new String[]{"12345678","1","2","3"};
    Largest = max(args,Integer.parseInt(args[0]),1);
    System.out.println( Largest + " is the largest number");

    

  }
}