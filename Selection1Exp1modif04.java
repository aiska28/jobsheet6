import java.util.Scanner;

public class Selection2Exp104 {
    public static void main(String[] args) {
        Scanner input04 = new Scanner(System.in);
        int year;

        System.out.print("Input year = ");
        year = input04.nextInt();

    if(year%4 == 0)
            if(year%1000 != 0)
                System.out.println("Leap year");
    else
        System.out.println("Not a leap year");
    }   
}