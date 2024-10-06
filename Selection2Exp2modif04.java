import java.util.Scanner;

public class Selection2Exp2modif04 {
    
    public static void main(String[] args) {
        Scanner input04 = new Scanner(System.in);
        int angle1, angle2, angle3, totalAngle;

        System.out.print("Input angle 1 = ");
        angle1 = input04.nextInt();
        System.out.print("Input angle 2 = ");
        angle2 = input04.nextInt();
        System.out.print("Input angle 3 = ");
        angle3 = input04.nextInt();

        if (angle1 <= 0 || angle2 <= 0 || angle3 <= 0) {
            System.out.println("All angle must be positive ");
        }else if (angle1 + angle2 <= angle3 || angle1 + angle3 <= angle2 || angle2 + angle3 <= angle1) {
            System.out.println("Invalid triangle ");
        }else if (angle1 == angle2 && angle2 == angle3) {
            System.out.println("Equiternal triangle ");
        }else if (angle1 == angle2 || angle1 == angle3 || angle2 == angle3) {
            System.out.println("Isosceles triangle ");
        }else{
            System.out.println("Scalene triangle");
        }
    }
}