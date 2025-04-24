package Step_1_Learn_the_basics.Lec_1_Things_to_Know;
/*
Input:-
10
32000
100000
999999999999
12.34
12345.678
A
true
Hello World

Output:-
--- Entered Values ---
Byte: 10
Short: 32000
Int: 100000
Long: 999999999999
Float: 12.34
Double: 12345.678
Char: A
Boolean: true
String: Hello World
 */
import java.util.Scanner;

public class dataType {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        byte a=sc.nextByte();
        short s=sc.nextShort();
        int b =sc.nextInt();
        long c=sc.nextLong();
        float d=sc.nextFloat();
        double e=sc.nextDouble();
        char f=sc.next().charAt(0);
        boolean g=sc.nextBoolean();
        sc.nextLine();
        String h=sc.nextLine();
        System.out.println("\n--- Entered Values ---");
        System.out.println("Byte: " + a);
        System.out.println("Short: " + s);
        System.out.println("Int: " + b);
        System.out.println("Long: " + c);
        System.out.println("Float: " + d);
        System.out.println("Double: " + e);
        System.out.println("Char: " + f);
        System.out.println("Boolean: " + g);
        System.out.println("String: " + h);


    }
}
