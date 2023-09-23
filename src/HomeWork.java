
public class HomeWork {
    public static int calculateAbsoluteDifference(int a, int b) {
        return a - b;
    }

    public static char getFirstCharacter(String str) {
        return str.charAt(0);
    }

    public static char getLastCharacter(String str) {
        return str.charAt(str.length() - 1);
    }

    public static String swapFirstAndLastCharacters(String str) {
        return str.charAt(str.length() - 1) + str.substring(1, str.length() - 1) + str.charAt(0);
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
        char result1 = getFirstCharacter(string1);
        System.out.println("string1 = \"" + string1 + "\"");
        System.out.println("result1 = '" + result1 + "'");
        System.out.println(" ");

        // Задача 3
        String string2 = "Python";
        char result2 = getLastCharacter(string2);
        System.out.println("string2 = \"" + string2 + "\"");
        System.out.println("result2 = '" + result2 + "'");
        System.out.println(" ");

        // Задача 4
        String string3 = "Python";
        String result3 = swapFirstAndLastCharacters(string3);
        System.out.println("string3 = \"" + string3 + "\"");
        System.out.println("result3 = \"" + result3 + "\"");
    }
}