import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] arts) {
        int[] binarySearch = {7, 20, 1, 3, 42, 60, 11};

        Arrays.sort(binarySearch);

        System.out.print("Sorted array: ");
        
        for (int index = 0; index < binarySearch.length; index++) {
            System.out.print(binarySearch[index] + " ");
        }

        System.out.println();

        Scanner userInput = new Scanner(System.in);
        System.out.print("Please enter the value you are searching for the array: ");
        int valueFromUser = userInput.nextInt();

        System.out.println(binarySerarhAlgorithm(binarySearch, 0, binarySearch.length, valueFromUser));
    }

    public static int binarySerarhAlgorithm(int[] array, int start, int end, int valueSearchingFor) {
        if (start >= end) {
            return -1;
        }

        int midpoint = (start + end) / 2;

        if (array[midpoint] == valueSearchingFor) {
            return midpoint;
        } else if (array[midpoint] < valueSearchingFor) {
            return binarySerarhAlgorithm(array, midpoint + 1 , end, valueSearchingFor);
        } else {
            return binarySerarhAlgorithm(array, start, midpoint, valueSearchingFor);
        }
    }
}
