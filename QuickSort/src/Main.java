import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        System.out.print("Enter the amount of numbers you want to sort: ");
        int numberFromUserInput = userInput.nextInt();
        int[] quickSortArray = new int[numberFromUserInput];

        for (int indexNumber1 = 0; indexNumber1 < numberFromUserInput; indexNumber1++) {
            quickSortArray[indexNumber1] = userInput.nextInt();
        }

        sortingTheArrayWithQuickSort(quickSortArray, 0, quickSortArray.length);

        for (int indexNumber1 = 0; indexNumber1 < numberFromUserInput; indexNumber1++) {
            System.out.print(quickSortArray[indexNumber1] + " ");
        }
    }

    public static void sortingTheArrayWithQuickSort(int[] array, int start, int end) {
        if (end - start < 2) {
            return;
        }

        int pivotIndex = quickSortInDescendingOrder(array, start, end);
        sortingTheArrayWithQuickSort(array, start, pivotIndex);
        sortingTheArrayWithQuickSort(array, pivotIndex + 1, end);

    }

    // Sort user array in ascending order
    public static int quickSortInAscendingOrder(int[] array, int start, int end) {

        int pivot = array[start];
        int index1 = start;
        int index2 = end;

        while (index1 < index2) {
            while (index1 < index2 && array[--index2] >= pivot);
            if (index1 < index2) {
                array[index1] = array[index2];
            }

            while (index1 < index2 && array[++index1] <= pivot);

            if (index1 < index2) {
                array[index2] = array[index1];
            }
        }

        array[index2] = pivot;
        return index2;
    }


    // Sort user array in descending order
    public static int quickSortInDescendingOrder(int[] array, int start, int end) {

        int pivot = array[start];
        int index1 = start;
        int index2 = end;

        while (index1 < index2) {
            while (index1 < index2 && array[--index2] <= pivot);
            if (index1 < index2) {
                array[index1] = array[index2];
            }

            while (index1 < index2 && array[++index1] >= pivot);

            if (index1 < index2) {
                array[index2] = array[index1];
            }
        }

        array[index2] = pivot;
        return index2;
    }
}
