/*****************************************************************************************
* - Project: Recursion_Question 4
*
* - Author: Clyde Cartee
*
* - Compiler: javac 25.0.1
*
* - Date 2/06/25
*
* - Purpose: tells how many times a int is in a number

* - Complexity: is n becuase it is based on the direct number of characters in the integer. 1 recursion call = n
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
    //all are number
    args[0] = "5555555555555555";
    args[1] = "5";
    int numOccurance = numTraversal(Long.parseLong(args[0]),Integer.parseInt(args[1]));
    System.out.println( args[1] + " occurs "+ numOccurance +" Times in " + args[0]);
//happens once
    args[0] = "12345";
    args[1] = "5";
    numOccurance = numTraversal(Long.parseLong(args[0]),Integer.parseInt(args[1]));
    System.out.println( args[1] + " occurs "+ numOccurance +" Times in " + args[0]);
//of on number
    args[0] = "565656565656565656";
    args[1] = "5";
    numOccurance = numTraversal(Long.parseLong(args[0]),Integer.parseInt(args[1]));
    System.out.println( args[1] + " occurs "+ numOccurance +" Times in " + args[0]);

  }
}
