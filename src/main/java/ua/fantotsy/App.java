package ua.fantotsy;

import java.util.Arrays;

public class App {
    public static void main(String[] args) {
        if (containsArguments(args)) {
            System.out.print("There are some arguments:");
            System.out.println(Arrays.toString(args));
        } else {
            System.out.println("There are no arguments!");
        }
    }

    public static boolean containsArguments(String[] args) {
        return (args.length > 0);
    }
}
