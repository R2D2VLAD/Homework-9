package lesson9;

import org.w3c.dom.ls.LSOutput;

public class lesson9 {
    public static void main(String[] args) {
        //Домашняя работа
        System.out.println("Домашняя работа");
        //Задание 1,2 и 3
        System.out.println("Задание 1,2 и 3");
        int[] arr1 = new int[3];
        arr1[0] = 1;
        arr1[1] = 2;
        arr1[2] = 3;
        double[] arr2 = {1.57, 7.654, 9.986};
        String[] arr3 = {"a", "b", "c", "d", "e"};

        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i]);
            if (i != arr1.length - 1);
            System.out.print(", ");
        }
        System.out.println();

        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i]);
        if (i != arr2.length - 1);
        System.out.print(", ");
    }
        System.out.println();

            for (int i = 0; i < arr3.length; i++) {
                System.out.print(arr3[i]);
                if (i != arr3.length - 1);
                System.out.print(", ");
            }
        System.out.println();


        for (int i = arr1.length - 1; i >= 1; i--) {
            System.out.print(arr1[i]);
            if (i != 0);
            System.out.print(", ");
        }
        System.out.println();

        for (int i = arr2.length - 1; i >= 1; i--) {
            System.out.print(arr2[i]);
            if (i != 0);
            System.out.print(", ");
        }
        System.out.println();

        for (int i = arr3.length - 1; i >= 1; i--) {
            System.out.print(arr3[i]);
            if (i != 0) {
                System.out.print(", ");
            }
        }
        System.out.println();



        }
    }
