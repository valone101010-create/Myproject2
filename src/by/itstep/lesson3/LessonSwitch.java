package by.itstep.lesson3;

import java.util.Scanner;

public class LessonSwitch {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("E");
            String input = scanner.next();

            if (input.length() != 1 || !Character.isLetter(input.charAt(0))) {
                System.out.println("error");
                scanner.close();
                return;
            }

            char letter = Character.toLowerCase(input.charAt(0));

            switch (letter) {
                case 'a', 'e', 'i', 'o', 'u' -> System.out.println("Vowels");
                default -> System.out.println("Consonants");
            }

            scanner.close();
        }
    }
