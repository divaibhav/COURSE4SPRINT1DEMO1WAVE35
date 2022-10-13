import java.util.InputMismatchException;
import java.util.Scanner;

/*
(InputMismatchException) Write a program that prompts the user to read
two integers and displays their sum. Your program should prompt the user to
read the number again if the input is incorrect.
 */
public class DemoQuestion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number1;
        int number2;
        int sum = 0;
        boolean flag = false ;
       while(!flag) {
           try {
               flag = true;
               System.out.println("enter integer number");
               number1 = scanner.nextInt();
               System.out.println("enter integer number");
               number2 = scanner.nextInt();
               sum = number1 + number2;
           } catch (InputMismatchException e) {
               //System.out.println(e);
               System.out.println("please enter integer value");
               flag = false;
               scanner.nextLine();
           }
       }

        System.out.println("sum = " + sum);
    }
}

/*
do {

}while(true);

 */
