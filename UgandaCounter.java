/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package adrian.ugandacounter;

/**
 *
 * @author ADRIAN M
 */
import java.util.Scanner;

public class UgandaCounter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter book description: ");
        String description = input.nextLine();

        String[] words = description.split("\\s+");
        int count = 0;
        for (String word : words) {
            if (word.equalsIgnoreCase("Uganda")) {
                count++;
            }
        }

        System.out.println("Occurrences of 'Uganda': " + count);
    }
}
