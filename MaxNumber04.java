import java.util.Scanner;

public class MaxNumber04 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1, num2, num3;

        System.out.print("input number 1 = ");
        num1 = sc.nextInt();
        System.out.print("Input number 2 = ");
        num2 = sc.nextInt();
        System.out.print("Input number 3 = ");
        num3 = sc.nextInt();

        if (num1 > num2) {
            if (num1 > num3) {
                System.out.println("Max number is: " + num1);
            }else {
                System.out.println("Max number is: " + num3);
            }
        } else {
            if (num2 > num3) {
                System.out.println("Max number is: " + num2);
            }else {
                System.out.println("Max number is: " + num3);
            }
        }
    }
}