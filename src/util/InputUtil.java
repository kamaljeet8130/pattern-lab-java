package util;

import java.util.Scanner;

public class InputUtil {
    static final Scanner scanner = new Scanner(System.in);

    public static String nextLine(){
        System.out.println("Enter::");
        return scanner.nextLine();
    }
    public static int nextInt(){
        System.out.println("Enter::");
        return scanner.nextInt();
    }
    public static double nextDouble(){
        System.out.println("Enter::");
        return scanner.nextDouble();
    }
}
