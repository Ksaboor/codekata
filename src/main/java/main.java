
public class main {

    /**
     *  Check Unique
     *  Reverse A String
     *  Palindrome
     *  Fibonacci
     *  Breadth-First Search
     *  Depth-First Search
     *  Binary Search
     *  Merge Sort
     *  Quick Sort
     */

    public static void main(String[] args) {

        Fibonacci.FibonacciNumbers(9);
        System.out.println("");
        System.out.println(Fibonacci.FibonacciSequence(8));
        System.out.println(Fibonacci.RecursionFibonacci(8));
        UniqueStrings.checkUnique("Boolean");
        UniqueStrings.hasUniqueChars("Fail");

        System.out.println();
        Loops.oneToHundred();

        System.out.println("The sum of numbers from 1 to 1,000 is "+Loops.sumof1000());
    }
}
