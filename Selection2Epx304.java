import java.util.Scanner;

public class Selection2Epx304 {

    public static void main(String[] args) {
        Scanner input04 = new Scanner(System.in);
        String category;
        int income, netSalary;
        double tax = 0;
        String anotherString;

        System.out.print("Input category = ");
        category = input04.nextLine();
        System.out.print("Input income = ");
        income = input04.nextInt();

        if (category.equals("worker")){
            if (income <= 2000000) 
                tax = 0.1;
            else if (income <= 3000000)
                tax = 0.15;
            else 
                tax = 0.2;
            netSalary = (int) (income - (tax*income));
            System.out.println("Nett salary = "+netSalary);
        }else if (category.equals("Businessman")){
            if (income <= 2500000)
                tax = 0.15;
            else if (income <= 3500000)
                tax = 0.2;
            else 
                tax = 0.25;
            netSalary = (int) (income - (tax*income));
            System.out.println("Nett salary = "+netSalary);
        }else 
            System.out.println("Invalid category!");
            
    }
}