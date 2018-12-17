public class Program {

    public static void main(String[] args){

        Cat cat = new Cat();
        cat.setCatSpeed(20.2f);
        Dog dog =new Dog();
        dog.setDogSpeed(15.6f);

        System.out.println("Are you interested who is faster? Let's check: ");
        try {
            System.out.println("cat speed: " + cat.getCatSpeed() + "\t" + "dog speed: " + dog.getDogSpeed());
            Comparison.compareDogAndCatSpeed(dog, cat);
        }
        catch (CatCannotBeSlowerThanDogExceptions e)
        {
            e.printStackTrace();
            System.out.println(e.getMessage());
            cat.setCatSpeed(dog.getDogSpeed() -1 );
            System.out.println("new cat speed: " + cat.getCatSpeed() + "\t" + "dog speed: " + dog.getDogSpeed());
            System.out.println("Are you interested who is faster? Let's check: " + Comparison.compareDogAndCatSpeed(dog, cat));
        }
        System.out.println("end of code");
    }
}
