import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        int symbol;
        int x;
        int y;
        int result = 0;

        System.out.println("Choose an operator: 1 - addition \n 2 - subtraction \n 3 - multiplication \n 4 - division");
        
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Choose operator: ");
        symbol = scan.nextInt();

        System.out.print("Enter number 1: ");
        x = scan.nextInt();

        System.out.print("Enter number 2: ");
        y = scan.nextInt();

        switch(symbol) {
            case 1:
                result = x+y;
                break;
            case 2:
                result = x-y;
                break;
            case 3:
                result = x*y;
                break;
            case 4:
                if (y>x) {
                    System.out.print("Does not divide! Enter numbers and operators again.");
                    break;
                } else {
                    result = x/y;
                    break;
                }
            default:
                System.out.print("Not valid operator!");
        }

        System.out.print("Result is: " + result);
    }    
}
