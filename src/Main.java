import java.io.PrintStream;
import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }

    public static void main(String[] args) {
        Task1();
        Task2();
        Task3();
        Task4();
        Task5();
        Task6();
        Task7();
        Task8();
    }

    public static void Task1() {
        int age = 17;
        if (age >= 18) {
            System.out.println("Если возраст человека равен " + age + " он совершеннолетний");
        } else {
            System.out.println("Если возраст человека равен " + age + " он не достиг совершеннолетия, нужно немного подождать");
        }
    }

    public static void Task2() {
        int age = 19;
        boolean comparison = age >= 18 && age < 21;
        if (comparison) {
            System.out.println("Ты не можешь бухнуть, но тачку покатать можешь!");
        }
    }

    public static void Task3() {
        for (int i = 1; i <= 512; i += i) {
            System.out.println(i);
        }
    }

    public static void Task4() {
        int salary = 29000;
        double total = 0.00;
        for (int i = 1; i <= 12; i++) {
            total += total * 0.01;
            total += salary;
            System.out.println("Месяц " + i + " - накоплено " + total);
        }
    }

    public static void Task5() {
        int a = 1;
        while (a < 11) {
            System.out.print(a + " ");
            a++;
        }
        System.out.println();
        for (int i = 10; i >= 0; i--) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void Task6() {
        float salary = 15000L;
        float total = 0f;
        int mouthCount = 0;
        while (mouthCount <= 9 * 12) {
            total += salary + total * 0.07;
            mouthCount++;
            if (mouthCount % 6 == 0) {
                System.out.println("Накоплено " + total + " рублей в " + mouthCount + " месяц!");
            }
        }
    }

    public static void Task7() {
        float[] wights = new float[3];
        wights[0] = 1.57F;
        wights[1] = 7.654F;
        wights[2] = 9.986F;
        float[] wights1 = wights;
        wights1[0] = 1;
        for (float element : wights) {
            System.out.println(element);
        }
    }

    public static void Task8() {
        int arr[] = generateRandomArray();
        int sum = 0;
        int min = 300000;
        int max = 0;
        for (int element : arr) {
            sum = sum + element;
            if (element > max) {
                max = element;
            } else if (element < min) {
                min = element;
            }
        }
        System.out.println("Сумма трат за месяц составила " + sum + " рублей. Минимальная трата за день составила " + min
                + " рублей. Максимальная сумма трат за день составила " + max + " рублей. Средняя сумма трат за месяц составила " + (float)sum/ arr.length + " рублей.");
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length-1; i >=0; i--) {
            System.out.print(reverseFullName[i]);
        }

    }

}