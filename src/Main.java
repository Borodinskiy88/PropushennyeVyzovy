public class Main {

    public static void main(String[] args) {

        PhoneBook phoneBook = new PhoneBook();
        MissedCalls missedCalls = new MissedCalls();


        createContacts(phoneBook);
//todo В реплите выдает корректно
        missedCalls.addMissedCall("11-11-11");
        missedCalls.addMissedCall("12-34-56");
        missedCalls.addMissedCall("22-22-22");
        missedCalls.addMissedCall("34-56-78");
        missedCalls.addMissedCall("33-33-33");
        missedCalls.addMissedCall("66-66-66");


        missedCalls.loseCalls(phoneBook);
        System.out.println();
        System.out.println(phoneBook.searchContactNumber("11-11-11"));
        System.out.println(phoneBook.searchContactNumber("22-22-22"));
        System.out.println(phoneBook.searchContactNumber("33-33-33"));
        System.out.println(phoneBook.searchContactNumber("66-66-66"));
        System.out.println(phoneBook.searchContactNumber("12-34-56"));

        System.out.println();
    }

    public static void createContacts(PhoneBook phoneBook) {
        phoneBook.addContact(PhoneBook.madeContact("Толстой", "11-11-11"));
        phoneBook.addContact(PhoneBook.madeContact("Достоевский", "22-22-22"));
        phoneBook.addContact(PhoneBook.madeContact("Лермонтов", "33-33-33"));
        phoneBook.addContact(PhoneBook.madeContact("Солженицын", "44-44-44"));
        phoneBook.addContact(PhoneBook.madeContact("Булгаков", "55-55-55"));
        phoneBook.addContact(PhoneBook.madeContact("Пушкин", "66-66-66"));

    }
}
