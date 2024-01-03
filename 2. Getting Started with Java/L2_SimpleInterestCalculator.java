import java.util.Scanner;

public class L2_SimpleInterestCalculator {
    public static void main(String [] args){
        Scanner s = new Scanner(System.in);


        int p = s.nextInt();
        int r = s.nextInt();
        int t = s.nextInt();
        int si = (p * r * t)/100;
        System.out.println(si);
        

        // In vscode java it shown error if we not write this scanner variable.close(); 
        // It not show any impact on our program.
     s.close();
    }
}



