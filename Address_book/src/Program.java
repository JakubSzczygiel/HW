public class Program {

    public static void main(String[] args) {
        AddressBook addressBook = new AddressBook(5);

        User kasia = new User("Kasia", "Szczygiel", 27);
        addressBook.addUserToArray(kasia);

        addressBook.printUsers();

    }
}
