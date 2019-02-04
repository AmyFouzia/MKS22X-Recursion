import java.util.*;

public class recursion{

    //NUMBER ONE
    /*Recursively find the sqrt using Newton's approximation
     *tolerance is the allowed percent error the squared answer is away from n.
     *precondition: n is non-negative
    */

    public static double sqrt(double n, double tolerance){
        //base case
        if (n == 0) {return 0;}
        //requires helper to continue
        else{
          return sqrtHelp(n, tolerance, n/2); //guess a number by n/2
        }
    }

    //( n / guess + guess) / 2 --  to make better guess
    //Math.pow -- squaring guess
    //test accuracy by squaring the guess, NOT by using another sqrt method!!!
    //This can be done with a while loop until your guess squared is close to n by a % difference of some threshhold. (0.001% is not bad which is 0.00001)
    //*@param n any non-negative value you want to take the sqrt of
    //*@return the approximate sqrt of n within a tolerance of 0.001%
    //Write and TEST the method:

    public static double sqrtHelp(double n, double tolerance, double guess){
        if (Math.abs(Math.pow(guess, 2) - n) / n > tolerance) { //checking percent error of guess squared
          return sqrtHelp(n, tolerance, (n / guess + guess) / 2); //using reccomended method of making a better guess
        }
        else{
          return guess;
        }
    }

    //NUMBER TWO
    /*Recursively find the n'th fibbonaci number in linear time
     *fib(0) = 1;
     fib(1) = 1;
     fib(5) = 5
     *precondition: n is non-negative
    */

    public static int fib(int n){
        //helper required to continue
          return fibHelp(n, 0, 1);
          //twhBehind becomes oneBehind
          //oneBehind becomes the sum of last two nums in fib sequence
    }

    //the series of numbers: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34
    //The next number is found by adding up the two numbers before it.

    public static int fibHelp(int n, int twoBehind, int oneBehind){
      //base case
      if (n == 0 || n == 1) {return 1;}
      else{
        return fibHelp(n -1, oneBehind, oneBehind + twoBehind);
      }
    }

    //NUMBER THREE
    //Returns an array list of all subset totals of the numbers 1 to n inclusive.
    //makeAllSums(3) returns an ArrayList [0, 3, 2, 5, 1, 4, 3, 6]
      //(the order isn't important right now)
    //This helps you practice using recursion to test all of a set of possibilities and then backtrack and try others.

    public static ArrayList<Integer> makeAllSums(int n){
      ArrayList<Integer> sums = new ArrayList<>();
        //requires helper to continue
          makeAllSumsHelp(n, 0, sums);
          return sums;
    }

    public static void makeAllSumsHelp(int n, int partial, ArrayList<Integer> sums){
      //base case
      if(n == 0){
        sums.add(partial);
      }
      else{
          //add to partial
          makeAllSumsHelp(n-1, n + partial, sums);
          //just partial
          makeAllSumsHelp(n-1, partial, sums);
      }
    }

    //for testing purposes
    public static void main(String[] args){
      System.out.println(sqrt(2.0, 0.001));
      System.out.println(sqrt(9.0, 0.001));
      System.out.println(fib(0));
      System.out.println(fib(1));
      System.out.println(fib(3));
      System.out.println(fib(4));
      System.out.println(makeAllSums(3));
      System.out.println(makeAllSums(2));
    }

}
