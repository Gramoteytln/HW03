
public class HomeWork {
    public int calculateAbsoluteValue(int a, int b) {
        return Math.abs(a - b);
    }

    public char getFirstCharacter(String str) {
        return str.charAt(0);
    }

    public char getLastCharacter(String str) {
        return str.charAt(str.length() - 1);
    }

    public String swapFirstAndLastCharacters(String str) {
        return str.charAt(str.length() - 1) + str.substring(1, str.length() - 1) + str.charAt(0);
    }

    public static void main(String[] args) {
            HomeWork homework = new HomeWork();

        // Задача 1
        int a = 5;
        int b = 9;
        int result = homework.calculateAbsoluteValue(a, b);
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("result = " + result);
        System.out.println(" ");

        a = -8;
        b = 7;
        result = homework.calculateAbsoluteValue(a, b);
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("result = " + result);
        System.out.println(" ");

        // Задача 2
        String string1 = "Python";
        char result1 = homework.getFirstCharacter(string1);
        System.out.println("string1 = \"" + string1 + "\"");
        System.out.println("result1 = '" + result1 + "'");
        System.out.println(" ");

        // Задача 3
        String string2 = "Python";
        char result2 = homework.getLastCharacter(string2);
        System.out.println("string2 = \"" + string2 + "\"");
        System.out.println("result2 = '" + result2 + "'");
        System.out.println(" ");

        // Задача 4
        String string3 = "Python";
        String result3 = homework.swapFirstAndLastCharacters(string3);
        System.out.println("string3 = \"" + string3 + "\"");
        System.out.println("result3 = \"" + result3 + "\"");
    }
}