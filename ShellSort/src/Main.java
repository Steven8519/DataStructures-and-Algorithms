import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);

        System.out.print("Enter the amount of numbers you want to sort: ");
        int userNumber = userInput.nextInt();
        int[] shellShortArray = new int[userNumber];


        for (int index1 = 0; index1 < userNumber; index1++) {
            shellShortArray[index1] = userInput.nextInt();
        }

        System.out.println("Please select an order to select the numbers you picked: " +
                "#1 for sorting in Ascending order, #2 for descending order");
        int methodToChoseForInsertionOrder = userInput.nextInt();

        switch (methodToChoseForInsertionOrder) {
            case 1:
                sortArrayInAscendingOrder(shellShortArray);
                break;
            case 2:
                sortArrayInDescendingOrder(shellShortArray);
                break;
                default: System.out.println("You choose the wrong selection");
        }

        for (int index1 = 0; index1 < userNumber; index1++) {
            System.out.print(shellShortArray[index1] + " ");
        }
    }


    public static void sortArrayInAscendingOrder(int[] array) {
        for (int gap = array.length/2; gap > 0; gap /=2) {
            for (int index1 = gap; index1 < array.length; index1++) {
                int numberToInsert = array[index1];

                int index2 = index1;

                while (index2 >= gap && array[index2 - gap] > numberToInsert) {
                    array[index2] = array[index2 - gap];
                    index2-= gap;
                }

                array[index2] = numberToInsert;
            }
        }
    }

    public static void sortArrayInDescendingOrder(int[] array) {
        for (int gap = array.length/2; gap > 0; gap /=2) {
            for (int index1 = gap; index1 < array.length; index1++) {
                int numberToInsert = array[index1];

                int index2 = index1;

                while (index2 >= gap && array[index2 - gap] < numberToInsert) {
                    array[index2] = array[index2 - gap];
                    index2-= gap;
                }
                array[index2] = numberToInsert;
            }
        }
    }
}
