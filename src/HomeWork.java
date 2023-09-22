
public class HomeWork {
    public static int calculateAbsoluteDifference(int a, int b) {
        return Math.abs(a - b);
    }

    public static void main(String[] args) {
        int a = 5;
        int b = 9;
        int result = calculateAbsoluteDifference(a, b);

        System.out.println("a = " + a);
        System.out.println("a = " + b);
        System.out.println("result = " + result);

        a = -8;
        b = 7;
        result = calculateAbsoluteDifference(a, b);

        System.out.println("a = " + a);
        System.out.println("a = " + b);
        System.out.println("result = " + result);

    }
}

class FirstChar {
    public static char getFirstCharacter(String inputString) {
        if (inputString != null && !inputString.isEmpty()) {
            char[] charArray = inputString.toCharArray();
            return charArray[0];
        } else {
            throw new IllegalArgumentException(" ");
        }
    }

    public static void main(String[] args) {
        String string = "Python";
        char result = getFirstCharacter(string);
        System.out.println("string = \"" + string + "\"");
        System.out.println("result = '" + result + "'");
    }
}

class LastChar {
    public static char getLastCharacter(String inputString) {
        if (inputString != null && !inputString.isEmpty()) {
            int lastIndex = inputString.length() - 1;
            return inputString.charAt(lastIndex);
        } else {
            throw new IllegalArgumentException(" ");
        }
    }

    public static void main(String[] args) {
        String string = "Python";
        char result = getLastCharacter(string);
        System.out.println("string = \"" + string + "\"");
        System.out.println("result = '" + result + "'");
    }
}

class StringUtils {
    public static String swapFirstAndLastCharacter(String inputString) {
        if (inputString != null && !inputString.isEmpty() && inputString.length() > 1) {
            char firstChar = inputString.charAt(0);
            char lastChar = getLastCharacter(inputString);

            String swappedString = lastChar + inputString.substring(1, inputString.length() - 1) + firstChar;
            return swappedString;
        } else {
            return inputString;
        }
    }

    public static char getLastCharacter(String inputString) {
        if (inputString != null && !inputString.isEmpty()) {
            int lastIndex = inputString.length() - 1;
            return inputString.charAt(lastIndex);
        } else {
            throw new IllegalArgumentException(" ");
        }
    }

    public static void main(String[] args) {
        String string = "Python";
        String result = swapFirstAndLastCharacter(string);
        System.out.println("string = \"" + string + "\"");
        System.out.println("result = \"" + result + "\"");
    }
}
