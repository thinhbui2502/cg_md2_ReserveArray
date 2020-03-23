import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size;
        do {
            System.out.println("Enter the size:");
            size = sc.nextInt();
            if (size > 20) {
                System.out.println("Size does not exceed 20! Please correct it!");
            }
        } while (size > 20);

        int[] array;
        array = new int[size];
        for (int i = 0; i < array.length; i++) {
            System.out.println("Enter the element " + (i + 1) + ": ");
            array[i] = sc.nextInt();
        }

        System.out.printf("%-20s%s", "Elements in array:", "");
        for (int j : array) {
            System.out.print(j + "\t");
        }

        for (int k = 0, l = array.length - 1; k < l; k++, l--) {
            int temp = array[k];
            array[k] = array[l];
            array[l] = temp;
        }
        System.out.printf("%-20s%s", "Reverse array:", "");
        for (int value : array) {
            System.out.print(value + "\t");
        }
    }
}
