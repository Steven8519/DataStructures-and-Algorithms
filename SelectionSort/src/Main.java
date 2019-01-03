import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);

        System.out.print("Enter the amount of numbers you want to sort: ");
        int numberFromUserInput = userInput.nextInt();
        int[] selectionSortArray = new int[numberFromUserInput];

        for (int indexNumber1 = 0; indexNumber1 < numberFromUserInput; indexNumber1++) {
            selectionSortArray[indexNumber1] = userInput.nextInt();
        }

        System.out.println("Please select an order to select the numbers you picked: " +
                "#1 for sorting in Ascending order, #2 for descending order");
        int sortingMethodToSelect = userInput.nextInt();

        switch (sortingMethodToSelect) {
            case 1:
                sortArrayInAscendingOrder(selectionSortArray);
                break;
            case 2:
                sortArrayDescendingOrder(selectionSortArray);
                break;
                default:
                    System.out.println("You have made the wrong choice");
        }

       for (int indexNumber1 = 0; indexNumber1 < numberFromUserInput; indexNumber1++) {
           System.out.print(selectionSortArray[indexNumber1] + " ");
       }
    }

    public static void sortArrayInAscendingOrder(int[] array) {
        for (int indexNumber1 = 0; indexNumber1 < array.length - 1; indexNumber1++) {

            int largestNumberInArray = 0;

            for (int indexNumber2 = indexNumber1 + 1; indexNumber2 <= array.length -1; indexNumber2++) {
                if (array[indexNumber1] > array[indexNumber2]) {
                    largestNumberInArray = indexNumber1;
                    int numberToSwapIfLargest = array[largestNumberInArray];
                    array[largestNumberInArray] = array[indexNumber2];
                    array[indexNumber2] = numberToSwapIfLargest;
                }
            }
        }
    }

    public static void sortArrayDescendingOrder(int[] array) {
        for (int indexNumber1 = 0; indexNumber1 < array.length - 1; indexNumber1++) {

            int smallestNumberInArray = 0;

            for (int indexNumber2 = indexNumber1 + 1; indexNumber2 <= array.length - 1; indexNumber2++) {
                if (array[indexNumber1] < array[indexNumber2]) {
                    smallestNumberInArray = indexNumber1;
                    int numberToSwapIfLargest = array[smallestNumberInArray];
                    array[smallestNumberInArray] = array[indexNumber2];
                    array[indexNumber2] = numberToSwapIfLargest;
                }
            }
        }
    }
}
