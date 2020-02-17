import java.util.Scanner;

public class Wrapper
{
    public static void main(String[] args) {
        boolean end = false;
        Scanner kb = new Scanner(System.in);
        double num = 0.0;
        System.out.print("Enter a number: ");
        try {
            num = kb.nextDouble();
        } catch (Exception e){
            System.out.println("Not a number.");
            end = true;
        }
        if (!end) {
            if ((num <= Byte.MAX_VALUE) && (num >= Byte.MIN_VALUE))
                System.out.println("Byte");
            else if ((num <= Short.MAX_VALUE) && (num >= Short.MIN_VALUE))
                System.out.println("Short");
            else if ((num <= Integer.MAX_VALUE) && (num >= Integer.MIN_VALUE))
                System.out.println("Integer");
            else if ((num <= Long.MAX_VALUE) && (num >= Long.MIN_VALUE))
                System.out.println("Long");
            else if ((num <= Float.MAX_VALUE) && (num >= Float.MIN_VALUE))
                System.out.println("Float");
            else System.out.println("Double");
        }
    }
}
