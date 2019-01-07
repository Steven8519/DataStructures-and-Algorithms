import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);

        System.out.print("Enter the amount of numbers you want to sort: ");
        int userNumberOfHowManyNumbersToSort = userInput.nextInt();
        int[] mergeSortArray = new int[userNumberOfHowManyNumbersToSort];

        for (int index = 0; index < userNumberOfHowManyNumbersToSort; index++) {
            mergeSortArray[index] = userInput.nextInt();
        }

        recursiveMethodToCallForMergeSort(mergeSortArray, 0, mergeSortArray.length);

        for (int index = 0; index < userNumberOfHowManyNumbersToSort; index++) {
            System.out.print(mergeSortArray[index] + " ");
        }
    }

    public static void recursiveMethodToCallForMergeSort(int[] array, int start, int end) {
        if (end - start < 2) {
            return;
        }

        int midpoint = (start + end) / 2;
        recursiveMethodToCallForMergeSort(array, start, midpoint);
        recursiveMethodToCallForMergeSort(array, midpoint, end);

        mergeToSortedArrayInAscendingOrder(array, start, midpoint, end);
        // mergeToSortedArrayInDescendingOrder(array, start, midpoint, end);
    }

    public static void mergeToSortedArrayInAscendingOrder(int[] array, int start, int midpoint, int end) {
        if (array[midpoint - 1] <= array[midpoint]) {
            return;
        }

        int index1 = start;
        int index2 = midpoint;
        int temporaryIndex = 0;

        int[] temporaryArray = new int[end - start];

        while (index1 < midpoint && index2 < end) {
            temporaryArray[temporaryIndex++] = array[index1] <= array[index2] ? array[index1++] : array[index2++];
        }

        System.arraycopy(array, index1, array, start + temporaryIndex, midpoint - index1);
        System.arraycopy(temporaryArray, 0, array, start, temporaryIndex);
    }

    public static void mergeToSortedArrayInDescendingOrder(int[] array, int start, int midpoint, int end) {
        if (array[midpoint - 1] >= array[midpoint]) {
            return;
        }

        int index1 = start;
        int index2 = midpoint;
        int temporaryIndex = 0;

        int[] temporaryArray = new int[end - start];

        while (index1 < midpoint && index2 < end) {
            temporaryArray[temporaryIndex++] = array[index1] >= array[index2] ? array[index1++] : array[index2++];
        }

        System.arraycopy(array, index1, array, start + temporaryIndex, midpoint - index1);
        System.arraycopy(temporaryArray, 0, array, start, temporaryIndex);
    }
}
