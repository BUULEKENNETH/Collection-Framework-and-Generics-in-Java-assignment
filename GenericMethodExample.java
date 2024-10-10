public class GenericMethodExample {
    // Generic Method that works with any type
    public static <T> void printArray(T[] array) {
        for (T element : array) {
            System.out.print(element + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // Testing with Integer array
        Integer[] intArray = { 1, 2, 3, 4, 5 };
        System.out.print("Integer Array: ");
        printArray(intArray);

        // Testing with String array
        String[] strArray = { "A", "B", "C", "D" };
        System.out.print("String Array: ");
        printArray(strArray);
    }
}
