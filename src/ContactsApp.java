import java.sql.SQLOutput;
import java.util.*;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

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

    public static void addContact() throws IOException {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Enter first and last name: ");
        String contactName = myScanner.nextLine();
        System.out.println("Enter the phone number: ");
        String phoneNumber = myScanner.nextLine();
        Files.write(
                Paths.get("data", "contacts.txt"),
                Arrays.asList(contactName + phoneNumber),
                StandardOpenOption.APPEND
        );
    }

    public static void deleteContact() throws IOException {
        Scanner myScanner = new Scanner(System.in);
        Path filepath = Paths.get("data", "contacts.txt");
        List<String> readingContact = Files.readAllLines(filepath);
        int index = 0;
        for (String contact: readingContact) {
            System.out.println(index + ": " + contact);
            index++;
        }
        System.out.println("Enter the number of the contact you want deleted: ");
        int contactToDelete = myScanner.nextInt();
        readingContact.remove(contactToDelete);
        System.out.println(readingContact);
        Files.write(
                filepath,
                readingContact
        );
        System.out.println("It has been successfully deleted.");
    }



}
