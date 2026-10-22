import java.util.Scanner;

public class Task3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the array size: ");
        int size = Integer.parseInt(scanner.nextLine());

        int[] array = new int[size];

        System.out.println("Enter " + size + " integers separated by spaces:");
        String[] values = scanner.nextLine().trim().split("\\s+");

        while (values.length != size) {
            System.out.println("Please enter exactly " + size + " integers:");
            values = scanner.nextLine().trim().split("\\s+");
        }

        for (int i = 0; i < size; i++) {
            array[i] = Integer.parseInt(values[i]);
        }

        System.out.print("Multiples of 3: ");
        boolean found = false;

        for (int element : array) {
            if (element % 3 == 0) {
                System.out.print(element + " ");
                found = true;
            }
        }

        if (!found) {
            System.out.print("None");
        }
        System.out.println();
        scanner.close();
    }
}
