import java.util.Scanner; // For taking input we use Scanner library


public interface L4_TakingInput {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        
        System.out.println("Enter 1st number");
        int i = scan.nextInt();
        System.out.println("\nEnter 2st number");
        int j = scan.nextInt();

        int k = i + j;
        System.out.println("Total sum of i + j is:"+k);


        //  Now see two options for taking string and char in Java

        //  1. By taking through .nextLine()
        //  In nextLine() hole string and spaces are added and shown in output. 
        System.out.println("Enter first string");
        String str = scan.nextLine();
        System.out.println(str);

        
        // 2. By taking through .next()
        // In next() only first string before space is shown.

        System.out.println("Enter second string");
        String st = scan.next();
        System.out.println(st);


  
        // In vscode java it shown error if we not write this scanner variable.close(); 
        // It not show any impact on our program.
        scan.close(); 
    }
}

// Now if you want to take long, float, double then 
//  long l = s.nextLong();
//  double d = s.nextDouble();
//  float f = s.nextFloat();

// For String we use 
// String str = "abcd";
// System.out.println(str);