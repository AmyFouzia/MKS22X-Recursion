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
          return
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
        if((Math.pow(guess, 2) - n) / n > tolerance){ //checking percent error of guess squared
          return sqrtHelp(n, tolerance, (n / guess + guess) / 2); //using reccomended method of making a better guess
        }
        else{
          return guess;
        }
    }

    //NUMBER TWO
    /*Recursively find the n'th fibbonaci number in linear time
     *fib(0) = 1; fib(1) = 1; fib(5) = 5
     *precondition: n is non-negative
    */

    public static int fib(int n){

    }

    //NUMBER THREE

    public static ArrayList<Integer> makeAllSums(){
    }

}
