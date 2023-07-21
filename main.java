import sortingMethods.sorting;

public class main {

    public static void main(String[] args) {
//        int[] arr = {44, 55, 12, 42, 94, 11, 18,06,67};
        int[] arr = {1,2,3,4,5,6,7,8,9};

        System.out.println("Original array:");
        printArray(arr);

//        sorting.insertionSort(arr);

        System.out.println("\nSorted array:");
        printArray(arr);

        sorting.bubbleSort(arr);
    }


    public static void printArray(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
