import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Map<String, String> phoneBook = new HashMap<>();
        Scanner sc = new Scanner(System.in);
        while(true) {
            phoneBook.put("John", "0729385745");
            phoneBook.put("Doug", "0783957283");
            phoneBook.put("Clair", "0784392345");
            phoneBook.put("Jenny", "0792484883");
            phoneBook.put("Bob", "0784739874");

            System.out.println("(Enter 'quit' if you wish to quit)");
            System.out.println("Enter the name of the person to look up: ");
            String choice = sc.nextLine();
            if (phoneBook.containsKey(choice)) {
                System.out.println(choice + " has the phone number: " + phoneBook.get(choice));
            } else if(choice.equals("quit")){
                System.out.println("Quitting.");
                break;
            } else {
                System.out.println(choice + " isn't in the phone book.");
            }
        }
    }
}