/*****************************************************************************************
* - Project: Recursion_Question 5
*
* - Author: Clyde Cartee
*
* - Compiler: javac 25.0.1
*
* - Date 2/06/25
*
* - Purpose: Reverses strings given to it

* - Complexity: this suffers from the same substring issue as previously mentioned in question 1. It has one recursion call
*but copies it again with substring so O(n^2)
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
  //any string 
    String S = "hello there";
    String Sreverse = reversalRecursive(S);
    System.out.println( S + " Reversed is "+ Sreverse);
//backwards originally
    S = "ereht olleh";
    Sreverse = reversalRecursive(S);
    System.out.println( S + " Reversed is "+ Sreverse);
//numbers
    S = "1234567890";
    Sreverse = reversalRecursive(S);
    System.out.println( S + " Reversed is "+ Sreverse);

  }
}