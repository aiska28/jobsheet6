import java.util.Scanner;

public class BuyShoes04 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String brand, category;
        int size;

        System.out.print("Enter brand : ");
        brand = sc.nextLine();
        System.out.print("Enter category : ");
        category = sc.nextLine();
        System.out.print("Enter size : ");
        size = sc.nextInt();

        if (brand.equalsIgnoreCase("Converse")) {
          if (category.equalsIgnoreCase("Slip on")) {
             if (size >= 36) {
                if (size <=40) {
                    System.out.println("Price is Rp 800.000");
                }else{
                    System.out.println("Data in valid");
                }
             }else if (category.equalsIgnoreCase("high top")) {
                if (size >=40) {
                    if (size <=44) {
                        System.out.println("Price is 1.200.000");
                    }
                }else{
                    System.out.println("Data in valid");
                }
            }
        }else if (brand.equalsIgnoreCase("Sketcher")) {
            if (category.equalsIgnoreCase("Woman")) {
                if (size >=36) {
                    if (size <=41) {
                        System.out.println("Price is Rp 1.000.000");
                    }
                }else if (category.equalsIgnoreCase("Man")) {
                    if (size >=41) {
                        if (size <=44) {
                            System.out.println("Price is Rp 1.800.000");
                        }
                    }else {
                        System.out.println("Data in valid");
                    }    
                }
            }
         }else if (brand.equalsIgnoreCase("Nike")) {
            if (category.equalsIgnoreCase("Kids")) {
                if (size >= 36) {
                    if (size <=40) {
                        System.out.println("Price is Rp 750.000");
                    }
                }
            }else if (category.equalsIgnoreCase("Adult")) {
                if (size >=40) {
                    if (size <=44) {
                        System.out.println("Price is Rp 1.500.000");
                    }
                }else{
                    System.out.println("Data in valid");
                }
            }
        }else{
            System.out.println("Data in valid");
        }
        }
    }
}