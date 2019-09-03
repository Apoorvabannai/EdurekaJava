import java.util.Scanner;
public class ConcatinateString {
    // concatinate string without using the library concat
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter the First String");
        String firstString = sc.nextLine(); // we can write sc.next()
        System.out.println("Enter the Second String");
        String secondString = sc.nextLine();
        System.out.println("The String Concatination is "+firstString+" "+ secondString);
       // System.out.println(String.format("The String is %s"+ firstString+ " "+secondString));


    }

}

