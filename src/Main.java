import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Map<String, String> phoneBook = new HashMap<>();
        Scanner sc = new Scanner(System.in);

        phoneBook.put("John", "0729385745");
        phoneBook.put("Doug", "0783957283");
        phoneBook.put("Clair", "0784392345");
        phoneBook.put("Jenny", "0792484883");
        phoneBook.put("Bob", "0784739874");

        System.out.println("Enter the name of the person to look up: ");
        String choice = sc.nextLine();
    }
}