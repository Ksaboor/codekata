public class Loops {

    public static void oneToHundred(){
        System.out.println("Here are numbers printed from 1 - 100 ");
        for (int i = 1; i <= 100 ; i++) {
            System.out.print(i + "\n");
        }
    }

    public static int sumof1000(){
        int total = 0;
        for (int i = 1; i <= 1000; i++)
            total += sumofDigits(i);

        return total;
    }

    public static int sumOfAllOdd(){
            return 0;
    }


    public static int sumOfAllEven(){
        return 0;
    }

    /**
     * Utility method to compute sum
     *  of digits in a given number i
     * @param i
     * @return
     */
    public static int sumofDigits(int i) {
        int sum = 0;
        while (i != 0)
        {
            sum += i % 10;
            i = i / 10;

        }
        return sum;
    }
}
