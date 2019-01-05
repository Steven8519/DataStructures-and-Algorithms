import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);

        System.out.print("Enter the amount of numbers you wish to sort: ");

        int userInputOfNumbersToSort = userInput.nextInt();
        System.out.print("Here's the number of integers you chose to enter: " + userInputOfNumbersToSort);

        int[] insertionSortArray = new int[userInputOfNumbersToSort];

        for (int index1 = 0; index1 < userInputOfNumbersToSort; index1++) {
            insertionSortArray[index1] = userInput.nextInt();
        }

        System.out.println();


        System.out.println("Please select an order to select the numbers you picked: " +
                "#1 for sorting in Ascending order, #2 for descending order");
        int sortingMethodToSelect = userInput.nextInt();

        switch (sortingMethodToSelect) {
            case 1:
                nubersToSortInAscendingOrder(insertionSortArray);
                break;
            case 2:
                nubersToSortInDescendingOrder(insertionSortArray);
                break;
            default:
                System.out.println("You have made the wrong choice");
        }

        for (int index1 = 1; index1 < userInputOfNumbersToSort; index1++) {
            System.out.print(insertionSortArray[index1] + " ");
        }
    }

    public static void nubersToSortInAscendingOrder(int[] array) {
        for (int index1 = 1; index1 < array.length; index1++) {
            int elementToInsert = array[index1];

            int index2 = 0;

            for (index2 = index1; index2 > 0 && array[index2 - 1] > elementToInsert; index2--) {
                array[index2] = array[index2 - 1];
            }
            array[index2] = elementToInsert;
        }
    }

    public static void nubersToSortInDescendingOrder(int[] array) {
        for (int index1 = 1; index1 < array.length; index1++) {
            int elementToInsert = array[index1];

            int index2 = 0;

            for (index2 = index1; index2 > 0 && array[index2 - 1] < elementToInsert; index2--) {
                array[index2] = array[index2 - 1];
            }
            array[index2] = elementToInsert;
        }
    }
}
