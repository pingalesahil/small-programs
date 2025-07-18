import java.util.*;
public class MINICALCULATOR {
    public static void main(String[]args){
           Scanner sc = new Scanner(System.in);
        System.out.println("enter number one :");
        double a=sc.nextDouble();
        System.out.println("enter number two :");
        double b=sc.nextDouble();
        while(true){
            System.out.println("enter number of operation you want :");
        System.out.println("1.addition\n2.subtraction\n3.multiplication\n4.division\n5.greatest_number\n6.exit");
        int button=sc.nextInt();
        switch(button) {
            case 1:
                double sum = a + b;
                System.out.println("addition of numbers is :" + sum);
                break;
            case 2:
                double sub = a - b;
                System.out.println("subtrction of numbers is :" + sub);
                break;
            case 3:
                double mul = a * b;
                System.out.println("multiplation of number is :" + mul);
                break;
            case 4:
                double div = a / b;
                System.out.println("division of number is :" + div);
                break;
            case 5:
                if (a < b) {
                    System.out.println("the number two is greater");
                } else {
                    System.out.println("number one is greater");
                }
                break;
            case 6:
                System.exit(0);

        }
        }
    }
}
