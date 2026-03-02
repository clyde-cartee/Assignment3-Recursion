/*****************************************************************************************
* - Project: Recursion_Question 1
*
* - Author: Clyde Cartee
*
* - Compiler: javac 25.0.1
*
* - Date 2/06/25
*
* - Purpose: counts the amount of characters in a string.
*
* - Complexity: At first I thought this was o(n), after researching the substring I believe it is o(n^2) because it goes through the first recurison which
* is one but then turns out the substring copies everything again adding that extra step. You could use indexing to make this o(n). 
* I found this by n(original recursion), times n(the copy) +1 the additon/2 because we go forward then back for the output
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
public class Question1{
//Recursive character length function
  public static int strLength(String inString){
//This exits the program when there is no more characters left
    if(inString == null || inString.isEmpty() || inString.equals("") ){
      //Returns zero so it doesn't add a character since there isnt one
      return 0;
    }
//Recursively adds for each "loop" in recursion also reduces the string by one character
    return 1 + strLength(inString.substring(1));
  }

  public static void main(String[] args){
//Test cases 

//empty case
    args = new String[]{""};
    int totalChar = strLength(args[0]);
    System.out.println(totalChar + " characters");

//shows it is accurate in counting
    args[0]= "12345";
    totalChar = strLength(args[0]);
    System.out.println(totalChar + " characters");

//shows it counts gaps
    args[0]= "1 2 3 4 5 6 7 8";
    totalChar = strLength(args[0]);
    System.out.println(totalChar + " characters");
// shows long spaces counted
    args[0]= "Hello there             ";
    totalChar = strLength(args[0]);
    System.out.println(totalChar + " characters");
//different characters counted
    args[0]= "!!!!!!!!Wow!!!!!!!";
    totalChar = strLength(args[0]);
    System.out.println(totalChar + " characters");

  }
}