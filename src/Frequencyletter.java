import java.util.Scanner;
public class Frequencyletter {
    // write a program in java to count the frequency of occurance of each letter
    // eg : have a nice day , a= 3, c=1,d=1 e=2 h=1,i =1;n=1,v=1,y=1
    public static void main(String[]args){
        String str;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Statement :");
         str = sc.nextLine();
         int count = 0, length = 0;
         do{
             try {
                 char[] name = str.toCharArray();
                 System.out.println(" The  entered String is " + name);
                 length = name.length;
                 count = 0;
                 for (int i = 0; i < length; i++) {
                     if ((name[0] == name[i]) && ((name[0] >= 65 && name[0] <= 91) || (name[0] >= 97) && (name[0] >= 123))) {
                         ;
                         count++;
                     }
                 }
                 if (count != 0) {
                     System.out.println(name[0] + " " + count + "times");
                 }
                 str = str.replace(" " + name[0], " ");
             }
             catch(Exception e){
                 System.out.println(e);
             }

         }
         while(length!=1);


    }
}
