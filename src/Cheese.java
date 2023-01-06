
import java.util.Scanner;
public class Cheese {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("First String: ");
        String str1 = scan.nextLine();

        int length1 = str1.length();
        System.out.println("String Length: " + length1);
        String uno = str1.substring(0,length1/2);
        String dos = str1.substring(length1/2,length1);
        System.out.println("First Half: " + uno );
        System.out.println("Second Half: " + dos);

        System.out.print("Second String: ");
        String str2 = scan.nextLine();
        int length2 = str1.length();
        System.out.println("String Length: " + length1);

        //if's for lengths"
        if(length1 == length2){
            System.out.println("Both strings have the same length");
        }
        if(length1 > length2){
            System.out.println(str1 + " is longer");
        }
        if(length1 < length2){
            System.out.println(str2 + " is longer");
        }
        //alphabet length
        if( str1.compareTo(str2) == 0){
            System.out.println("Both str");
        }
        if(str1.compareTo(str2) < 0){
            System.out.println(str1 + " is first alphabetically");
        }
        if(str1.compareTo(str2) > 0){
            System.out.println(str2 + " is first alphabetically");
        }
        if(str1.indexOf(str2) == -1){
            System.out.println(str2 + " is NOT found in " + str1);
        }if(str1.indexOf(str2) != -1 ){
            System.out.println(str2 + " is found at index " + str1.indexOf(str2));
        }



    }
}
