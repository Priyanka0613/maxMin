import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        System.out.println("Enter float number 1: ");
        String num1=s.nextLine();
        System.out.println("Enter float number 2: ");
        String num2=s.nextLine();
        System.out.println("Enter float number 3: ");
        String num3=s.nextLine();

        //float
        findMax p2=new findMax();
        p2.findMaxNumber(num1,num2,num3);
        s.close();
    }
}
