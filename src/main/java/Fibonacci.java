public class Fibonacci {


    public static void FibonacciNumbers(int numbers) {
        int PPN = 0,PN = 1,C,j;

        System.out.print(PPN + " ");
        System.out.print(PN + " ");
        for (j = 1; j <= numbers ; j++) {

            C = PPN + PN;
            PPN = PN;
            PN = C;
            System.out.print(PN + " ");
        }
    }

    /**
     *
     * @param sequence
     *  0 1 1 2 3 5 8 13 [21]
     * @return Fibonacci sequence 8 --> 21
     */
    public static int FibonacciSequence(int sequence)
    {
        int f0 = 0,f1 = 1,fib;

        if (sequence == 0) {
            return f0;
        } else {
            for (int i = 2; i <= sequence; i++)
            {
                fib = f0 + f1;
                f0 = f1;
                f1 = fib;
            }
        }
        return f1;
    }
}
