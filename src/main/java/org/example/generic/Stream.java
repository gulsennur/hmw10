package org.example.generic;
import java.util.Arrays;
import java.util.OptionalInt;
import java.util.Scanner;
public class Stream {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // get length of array
        System.out.print("Dizinin uzunluğunu girin: ");
        int length = scanner.nextInt();

        // create array
        int[] array = new int[length];

        // get element of array
        System.out.println("Dizinin elemanlarını girin:");
        for (int i = 0; i < length; i++) {
            array[i] = scanner.nextInt();
        }

        // enter searching of array
        System.out.print("Aranacak öğeyi girin: ");
        int target = scanner.nextInt();

        // searching element and print the result
        int result = searchElementWithStream(array, target);
        if (result == -1) {
            System.out.println("Öğe dizide bulunamadı.");
        } else {
            System.out.println("Öğe bulundu: " + result);
        }

        scanner.close();
    }

    //  Method that searches for the item in the array.
    public static int searchElementWithStream(int[] array, int target) {
        //Search for the item using the Stream API
        OptionalInt foundElement = Arrays.stream(array)
                .filter(x -> x == target)
                .findFirst();

        // Return the result, depending on whether the item was found
        return foundElement.orElse(-1);
    }
}

