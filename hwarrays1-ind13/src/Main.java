import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
        task9();
        task10();


    }

    public static void task1() {
        int[] box = new int[]{1, 2, 3};
        System.out.println(box[0]);
        System.out.println(box[1]);
        System.out.println(box[2]);
    }

    public static void task2() {
        double[] grams = {1.57, 7.654, 9.986};
        System.out.println(grams[0]);
        System.out.println(grams[1]);
        System.out.println(grams[2]);
    }

    public static void task3() {
        int[] cats = new int[]{2, 3, 5};
        System.out.println(cats[0]);
        System.out.println(cats[1]);
        System.out.println(cats[2]);
    }

    public static void task4() {
        int[] box = new int[]{1, 2, 3};
        System.out.println(Arrays.toString(box));
    }

    public static void task5() {
        double[] grams = {1.57, 7.654, 9.986};
        System.out.println(Arrays.toString(grams));
    }

    public static void task6() {
        int[] cats = new int[]{2, 3, 5};
        System.out.println(Arrays.toString(cats));
    }

    public static void task7() {
        int[] box = {3, 2, 1};
        System.out.println(Arrays.toString(box));
    }

    public static void task8() {
        double[] grams = {9.986, 7.654, 1.57};
        System.out.println(Arrays.toString(grams));
    }

    public static void task9() {
        int[] cats = new int[]{5, 3, 2};
        System.out.println(Arrays.toString(cats));
    }

    public static void task10() {
        int[] box = new int[]{1, 2, 3};
        for (int i = 0; i <= 2; i++) {
            if (i % 2 == 0) {
                box[i]++;
                System.out.println(box[i]);
            }
        }
    }
}




