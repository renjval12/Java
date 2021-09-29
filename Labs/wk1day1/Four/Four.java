package Labs.wk1day1.Four;

public class Four {
    public static void main(String args[]) {
        int numOne = 3;
        int numTwo = 2;
        boolean result;
        result = numOne > numTwo;

        if (result) {
            System.out.println("numOne " + numOne + " is greater than " + "numTwo " + numTwo);
        } else {
            System.out.println("numTwo " + numTwo + " is greater than " + "numOne " + numOne);
        }
    }
}
