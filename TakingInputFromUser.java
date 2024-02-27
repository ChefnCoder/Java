import java.util.Scanner;
class TakingInputFromUser {
     public static void main(String argo[]) {
 
            // Creating an object of Scanner class
            Scanner sc = new Scanner(System.in);
 
            // Read integer value from the user
            System.out.println("Enter first number :");
            int a = sc.nextInt();
 
            System.out.println("Enter second number :");
            int b = sc.nextInt();
 
          // Adding two values
          int c = a + b;
 
         // Printing the sum
         System.out.println("Sum is :" +c);
    }
}