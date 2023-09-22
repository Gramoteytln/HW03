
public class HomeWork {
    public static int calculateAbsoluteDifference(int a, int b) {
        return a - b;
    }

    public static void main(String[] args) {
        // Задача 1
        int a = 5;
        int b = 9;
        int result = calculateAbsoluteDifference(a, b);
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("result = " + result);
        System.out.println(" ");

        a = -8;
        b = 7;
        result = calculateAbsoluteDifference(a, b);

        System.out.println("a = " + a);
        System.out.println("a = " + b);
        System.out.println("result = " + result);
        System.out.println(" ");

        // Задача 2
        String string1 = "Python";
        char result1 = string1.charAt(0);
        System.out.println("string1 = \"" + string1 + "\"");
        System.out.println("result1 = '" + result1 + "'");
        System.out.println(" ");

        // Задача 3
        String string2 = "Python";
        char result2 = string2.charAt(string2.length() - 1);
        System.out.println("string2 = \"" + string2 + "\"");
        System.out.println("result2 = '" + result2 + "'");
        System.out.println(" ");

        // Задача 4
        String string3 = "Python";
        String result3 = string3.charAt(string3.length() - 1) +
                string3.substring(1, string3.length() - 1) +
                string3.charAt(0);
        System.out.println("string3 = \"" + string3 + "\"");
        System.out.println("result3 = \"" + result3 + "\"");
    }
}