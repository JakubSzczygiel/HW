import java.util.Random;

public class AddressBook {

    static private User[] allUserArray = new User[10];
    static int numberOfAddressBooks;
    private User[] userArray;
    private int[] intArray = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};


    public AddressBook(int i) {
        this.userArray = new User[i];
        {
            numberOfAddressBooks++;
            if (numberOfAddressBooks == 1)
                fillAllUserArray();
        }
        fillUserArrayRandomly(i);
    }

    public void printUsers() {
        for (int i = 0; i < userArray.length; i++) {
            System.out.println(userArray[i]);
        }
        System.out.print("\n");
    }

    public void addUserToArray(User user) {
        User[] newUserArray = new User[this.userArray.length + 1];
        for (int i = 0; i < this.userArray.length; i++) {
            newUserArray[i] = userArray[i];
        }
        newUserArray[newUserArray.length - 1] = user;
        this.userArray = newUserArray;
    }

    static void fillAllUserArray() {
        allUserArray[0] = new User("Kuba", "Szczygiel", 27);
        allUserArray[1] = new User("Piotr", "Kowalski", 44);
        allUserArray[2] = new User("Michal", "Nowak", 45);
        allUserArray[3] = new User("Alina", "Waziel", 35);
        allUserArray[4] = new User("Kasia", "Dabek", 78);
        allUserArray[5] = new User("Boleslaw", "Chrobry", 15);
        allUserArray[6] = new User("Paulina", "Posobiec", 56);
        allUserArray[7] = new User("Weronika", "Przysadzista", 23);
        allUserArray[8] = new User("Aleksandra", "Kunowska", 20);
        allUserArray[9] = new User("Milosz", "Smidowicz", 31);
    }

    public void fillUserArrayRandomly(int numberOfElements) {
        shuffleArray(intArray);
        for (int i = 0; i < numberOfElements; i++) {
            //System.out.println(intArray[i]);
            userArray[i] = allUserArray[intArray[i]];
        }
    }

    private void shuffleArray(int[] array) {
        int index, temp;
        Random random = new Random();
        for (int i = array.length - 1; i > 0; i--) {
            index = random.nextInt(i + 1);
            temp = array[index];
            array[index] = array[i];
            array[i] = temp;
        }
    }


}
