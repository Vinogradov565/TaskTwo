import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] array1 = {1, 2};
        System.out.println(isSumInRange(array1[0], array1[1]));

        int number = -7;
        printNumberSign(number);

        int number2 = 5;
        System.out.println(isNegative(number2));

        String message = "Hello";
        int repeatCount = 3;
        printMessageMultipleTimes(message, repeatCount);

        int year = 2024;
        System.out.println(isLeapYear(year));

        int[] binaryArray = {1, 0, 1, 0, 0, 1};
        flipBinaryArray(binaryArray);
        System.out.println(Arrays.toString(binaryArray));

        int[] hundredArray = generateHundredArray();
        System.out.println(Arrays.toString(hundredArray));

        int[] array3 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        multiplyLessThanSix(array3);
        System.out.println(Arrays.toString(array3));

        int size = 5;
        int initialValue = 10;
        int[] newArray = createArray(size, initialValue);
        System.out.println(Arrays.toString(newArray));
    }

    public static boolean isSumInRange(int a, int b) {
        int sum = a + b;
        return sum >= 10 && sum <= 20;
    }

    public static void printNumberSign(int number) {
        if (number >= 0) {
            System.out.println("Положительное число");
        } else {
            System.out.println("Отрицательное число");
        }
    }

    public static boolean isNegative(int number) {
        return number < 0;
    }

    public static void printMessageMultipleTimes(String message, int count) {
        for (int i = 0; i < count; i++) {
            System.out.println(message);
        }
    }

    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    public static void flipBinaryArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0) {
                array[i] = 1;
            } else {
                array[i] = 0;
            }
        }
    }

    public static int[] generateHundredArray() {
        int[] array = new int[100];
        for (int i = 0; i < array.length; i++) {
            array[i] = i + 1;
        }
        return array;
    }

    public static void multiplyLessThanSix(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 6) {
                array[i] *= 2;
            }
        }
    }

    public static int[] createArray(int len, int initialValue) {
        int[] newArray = new int[len];
        Arrays.fill(newArray, initialValue);
        return newArray;
    }
}
