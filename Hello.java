public class Hello {
    public static void main(String agrs[]) {

        // final COMPANY_NAME;
        int iNum = 10;
        float fNum = 10.34f;
        double dNum = 6323782.67;
        char oneChar = 'A';
        boolean choice = true;
        // String[] days = new Array[7];
        String[] days = { "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday" };
        for (int i = 0; i < days.length; i++)
            System.out.println(days[i]);
        for (int i = 1; i <= 5; i++)
            System.out.println(i);
        System.out.println("Hello World!!!!!");
        System.out.println(iNum);
        System.out.println(fNum);
        System.out.println(dNum);
        System.out.println(oneChar);
        System.out.println(choice);
    }
}