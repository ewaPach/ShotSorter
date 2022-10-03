import java.util.Scanner;

public class ShotsSorter {
    public static void main(String[] args) {
        int[] shots = {1, 4, 7, 8, 9, 2, 6, 5, 3, 10};
        int temp;
        boolean swapped;
        int j = 0;

        System.out.println("Please, write 'yes' if you want to drink propely!");
        Scanner scanner = new Scanner(System.in);
        String answer = scanner.nextLine();
        do {
            swapped = false;
            for (int i = 0; i<shots.length - 1 - j; i++) {
                if (shots[i] > shots[i + 1]) {
                    temp = shots[i];
                    shots[i] = shots[i + 1];
                    shots[i + 1] = temp;
                    swapped = true;
                }
            }
            j++;

            }while (swapped);

            System.out.println("Drink your shots in following order:");
            for (int number : shots)
                System.out.print(number + " ");
        }
    }