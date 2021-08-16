import java.util.Scanner;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class ContactsApp {

    public static int mainMenu() throws IOException {
        Path filepath = Paths.get("data", "contacts.txt");
        List<String> contactList = Files.readAllLines(filepath);
        System.out.println(contactList);

        System.out.println("Please make a selection:");
        System.out.println(" 1.View contacts");
        System.out.println(" 2. Add new contact");
        System.out.println(" 3. Search contact by name or number");
        System.out.println(" 4. Delete a contact");
        System.out.println(" 5. Exit application");

        Scanner myScanner = new Scanner(System.in);
        int userSelection = myScanner.nextInt();
        return userSelection;
    }
}
