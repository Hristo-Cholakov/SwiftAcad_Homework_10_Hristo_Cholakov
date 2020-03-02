package bg.swift.WordReplacement;

import java.util.Arrays;
import java.util.Scanner;

public class WordReplacement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       String[]txt = scanner.nextLine().split(" ");
        int N = Integer.parseInt(scanner.nextLine());



        for (int i = 0; i < N; i++) {
            String[] replacer = scanner.nextLine().split(" ");
            for (int j = 0; j < txt.length; j++) {
                if (replacer[0].equalsIgnoreCase(txt[j])) {
                    txt[j] = replacer[1];
                   txt[j] += "1";
                }
            }
        }
        String sentenceToPrint = Arrays.toString(txt)
                .replace("1", "")
                .replace("[", "")
                .replace("]", "")
                .replace(",", "");
        System.out.println(sentenceToPrint);



        }

    }


