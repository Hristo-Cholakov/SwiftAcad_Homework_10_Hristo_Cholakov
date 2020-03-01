package bg.swift.UniqueMembers;

import java.util.Arrays;
import java.util.Scanner;

public class Task1_UniqueNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = Integer.parseInt(scanner.nextLine());
        int[] array = new int[N];

        for (int i = 0; i < N; i++) {
            array[i] = scanner.nextInt();

        }
        int[] sorted = Arrays.stream(array).sorted().distinct().toArray();
        for (int element : sorted) {
            System.out.printf("%d ", element);
        }


    }
}
