public class Program {

    public static void main(String[] args){

        Cat cat = new Cat();
        cat.setCatSpeed(12.2f);
        Dog dog =new Dog();
        dog.setDogSpeed(15.6f);

        System.out.println("Are you interested who is faster? Let's check: " +Comparison.compareDogAndCatSpeed(dog, cat));
    }
}
