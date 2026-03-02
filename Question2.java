/*****************************************************************************************
* - Project: Recursion_Question 2
*
* - Author: Clyde Cartee
*
* - Compiler: javac 25.0.1
*
* - Date 2/06/25
*
* - Purpose: how many times a character appears in a program
*
* - Complexity: same as question 1 and the same substring issue O(n^2)
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
public class Question2{

  public static int strTraversal(String inString, char inChar){
//returns if end of string/ ends recursion
     if(inString == null || inString.isEmpty() || inString.equals("") ){
      return 0;
//checks if first letter in string is == to char then adds to total and continues
    }else if(inString.charAt(0) == inChar){
      return 1 + strTraversal(inString.substring(1), inChar);
    }
    else{
//continues recursion but doesnt add to total
      return strTraversal(inString.substring(1), inChar);
    }

  }

  public static void main(String[] args){

    args = new String[]{"3","4"};
    int totalChar = strTraversal(args[0],args[1].toCharArray()[0]);
    System.out.println(totalChar + " characters " + args[1].toCharArray()[0]);
//counting
    args = new String[]{"12345678910","3"};
    totalChar = strTraversal(args[0],args[1].toCharArray()[0]);
    System.out.println(totalChar + " characters " + args[1].toCharArray()[0]);
//shows multiples     
    args = new String[]{"hhhhhhhhhhhhhhhhhhhh","h"};
    totalChar = strTraversal(args[0],args[1].toCharArray()[0]);
    System.out.println(totalChar + " characters " + args[1].toCharArray()[0]);
//not there
    args = new String[]{"hhhhhhhhhhhhh","b"};
    totalChar = strTraversal(args[0],args[1].toCharArray()[0]);
    System.out.println(totalChar + " characters " + args[1].toCharArray()[0]);
//spaces
    args = new String[]{"       "," "};
    totalChar = strTraversal(args[0],args[1].toCharArray()[0]);
    System.out.println(totalChar + " characters " + args[1].toCharArray()[0]);
  }
}