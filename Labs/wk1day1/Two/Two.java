package Labs.wk1day1.Two;

public class Two {
    public static void main(String args[]) {
        int numOne = 1;
        int numTwo = 2;
        int container = 0;
        container = numOne;
        numOne = numTwo;
        numTwo = container;

        System.out.println(numOne);
        System.out.println(numTwo);

    }
}


