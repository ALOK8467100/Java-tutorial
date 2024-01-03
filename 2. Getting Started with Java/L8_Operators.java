import java.util.Scanner;

public class L8_Operators {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter your temeprature in fehrenheit");
        int f = s.nextInt();
        int cel = (5 *(f-32))/ 9;
        System.out.println(cel + "C");




        s.close();
    }
}
