import java.io.IOException;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) throws IOException {

         boolean continueRunning = true;

        ContactsApp.mainMenu();

        do {
            int userSelection = ContactsApp.mainMenu();
            if (userSelection == 1)
                ContactsApp.showAllContacts();
            else if (userSelection == 2) {
                ContactsApp.addContact();
            } else if (userSelection == 3) {
                ContactsApp.searchAllContacts();
            } else if (userSelection == 4) {
                ContactsApp.deleteContact();
            } else if (userSelection == 5) {
                continueRunning = false;
            }
        } while (continueRunning);



    }



//        ContactsApp.mainMenu();
//
//        ContactsApp.deleteContact();
//
//        ContactsApp.showAllContacts();
//        ContactsApp.addContact();
//
//        ContactsApp.searchAllContacts();


    }

