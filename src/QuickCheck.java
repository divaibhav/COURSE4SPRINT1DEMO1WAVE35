public class QuickCheck {
    public static void main(String[] args) {
        int num1 = 0;
        try {


            int num2 = 20 / num1;
        }catch (NullPointerException e){
            System.out.println("Divide by zero");
        }finally {
            System.out.println("inside finally block");
        }
        System.out.println("this line will be printed");
    }
}
