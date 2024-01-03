public class L3_Variables {
    public static void main(String[] args){
        // INT store integer value having 4 bytes.                                                                                     
        // Short store integer value having 2 bytes.
        // Long store integer value having 8 bytes.
        // Float store decimal value having 4 bytes.
        
        // Double store decimal value having 8 bytes.
        // Char stores characters value having 2 bytes.
        // Boolean stores only store True/False 2 bytes.
        int a =10; 
        short s = 34;
        long l = 45645;
        double d = 2.4545;
        float f = 3.4f; 
        boolean b = true;

        System.out.println(a);
        System.out.println(s);
        System.out.println(l);
        System.out.println(d);
        System.out.println(f);
        System.out.println(b);
        

        //  Now Add two number
        int k = a + s;
        System.out.println("Sum of a + s is: " + k);
    }
}
