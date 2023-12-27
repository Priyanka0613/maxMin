import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        System.out.println("Enter float number 1: ");
        float num1=s.nextInt();
        System.out.println("Enter float number 2: ");
        float num2=s.nextInt();
        System.out.println("Enter float number 3: ");
        float num3=s.nextInt();

        //double
        findMax p2=new findMax();
        p2.findMaxNumber(num1,num2,num3);
        s.close();
    }
}
