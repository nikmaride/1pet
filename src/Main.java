import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int i;
        Scanner input = new Scanner(System.in);
        int [] array = new int[10];
        System.out.println("Insert array [10] elements: ");
            for (i = 0; i < array.length; i++) {
            array[i] = input.nextInt();
            }
        System.out.println("Your array: ");
        for (i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
        System.out.println("Choose the sort: 1 - Bubble; 2 - Quick");

        int ans = input.nextInt();
        if (ans==1) {
            Bubble sort = new Bubble();
            System.out.println(Arrays.toString(sort.swap(array)));
            }
        }
    }

