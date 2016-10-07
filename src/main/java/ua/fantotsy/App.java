package ua.fantotsy;

public class App {
    public static void main(String[] args) {
        StringBuilder output = new StringBuilder();
        for (String arg : args) {
            output.append(arg);
        }
        System.out.println(output.toString());
    }
}
