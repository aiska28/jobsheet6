import java.util.Scanner;

public class BuyBookDiscount04 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String day, bookCategory;
        int number, totalAmount;
        String anotherString;

        System.out.println("Enter day : ");
        day = sc.nextLine();
        System.out.println("Book category is : ");
        bookCategory = sc.nextLine();
        System.out.println("Enter the number of book : ");
        number = sc.nextInt();

        double discount = 0;

         if (day.equalsIgnoreCase("Wednesday") || day.equalsIgnoreCase("anotherday"))
             if (day.equalsIgnoreCase("wednesday ")) {
                if(bookCategory.equalsIgnoreCase("dictionary")){
                 discount =0.10;
             } else if (bookCategory.equalsIgnoreCase("novel")){
                 discount = 0.7;
             }else {
                if (number >= 3) {
                    discount =0.5;   
        }else {
             if (bookCategory.equalsIgnoreCase("book")) {
                 if (number >= 3) {
                     discount =0.1;
                 }
             } else {
                 if (number >= 2) {
                     discount = 0.2;
                }
            }
         }
         
         System.out.print("Discount: " + discount * 100 + "%");
         discount = sc.nextDouble();
         }
        }
    }
}