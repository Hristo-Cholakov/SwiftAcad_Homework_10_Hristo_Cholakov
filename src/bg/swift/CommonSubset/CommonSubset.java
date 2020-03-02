package bg.swift.CommonSubset;

import java.util.*;

public class CommonSubset {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int counter = 0;
        int N = scanner.nextInt();
        int M = scanner.nextInt();

        int[] arr1 = new int[N];
        int[] arr2 = new int[M];


        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = scanner.nextInt();

        }
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = scanner.nextInt();

        }


        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if (arr1[i] == arr2[j]) {
                    System.out.printf("%d ", arr1[i]);
                    counter++;
                }
            }
        }
        if (counter == 0) {
            System.out.println("NO");
        }

    }
}
