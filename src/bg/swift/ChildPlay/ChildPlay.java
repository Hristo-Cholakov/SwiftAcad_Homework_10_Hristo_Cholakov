package bg.swift.ChildPlay;

import java.util.Scanner;

public class ChildPlay {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = Integer.parseInt(scanner.nextLine());
        int counter = 0;
        int[] children = new int[N];
        for (int i = 0; i < children.length; i++) {
            children[i] = scanner.nextInt();

        }
        for (int i = 0, j = 1; j <children.length ; i+=2, j+=2) {
            if (children[j] > children[i]) {
                counter++;
            }
        }
        System.out.println(counter);
    }
}
