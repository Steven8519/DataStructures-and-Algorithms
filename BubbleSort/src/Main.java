import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number integers you want to sort: ");
        int numberOfIntToSort = input.nextInt();
        int[] bubbleSort = new int[numberOfIntToSort];


        for (int index1 = 0; index1 < numberOfIntToSort; index1++) {
            bubbleSort[index1] = input.nextInt();
        }

        System.out.println("Select the method to sort the numbers you picked #1 for ascending order" +
                " #2 for descending order: ");

        int methodSelectionForSorting = input.nextInt();
        switch (methodSelectionForSorting) {
            case 1:
                sortUnsortedArrayInAscendingOrder(bubbleSort);
                break;
            case 2:
                sortUnsortedArrayInDescendingOrder(bubbleSort);
                break;
                default: System.out.println("You did not pick the right choice. ");
        }


        System.out.println();
        for (int index1 = 0; index1 < numberOfIntToSort; index1++) {
            System.out.print(bubbleSort[index1] + " ");
        }
    }

    public static void sortUnsortedArrayInAscendingOrder(int[] array) {
        for (int index1 = 0; index1 <  array.length - 1; index1++) {
            for (int index2 = index1 + 1; index2 < array.length; index2++) {
                if (array[index1] > array[index2]) {
                    int variableToHoldFirstIndexValue = array[index1];
                    array[index1] = array[index2];
                    array[index2] = variableToHoldFirstIndexValue;
                }
            }
        }
    }

    public static void sortUnsortedArrayInDescendingOrder(int[] array) {
        for (int index1 = 0; index1 < array.length - 1; index1++) {
            for (int index2 = index1 + 1; index2 < array.length; index2++) {
                if (array[index1] < array[index2]) {
                    int variableToHoldFirstIndexValue = array[index1];
                    array[index1] = array[index2];
                    array[index2] = variableToHoldFirstIndexValue;
                }
            }
        }
    }
}
