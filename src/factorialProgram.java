import java.util.Scanner;
public class factorialProgram {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println( "Enter the  number:");
        int number = sc.nextInt();
        System.out.println(" The  factorial of the number is "+ factorial(number));

    }
      static int factorial(int num){
        if( num ==1){
            return 1;
        }
        else {
             int output = factorial(num-1)*num;
             return output;
        }

     }

}
