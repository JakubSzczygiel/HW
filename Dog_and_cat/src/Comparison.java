public class Comparison {

    public static String compareDogAndCatSpeed(Dog dog, Cat cat) throws CatCannotBeSlowerThanDogExceptions {

        {
            if (dog.getDogSpeed() > cat.getCatSpeed()) {
                return "Dog";
            } else if (dog.getDogSpeed() == cat.getCatSpeed()) {
                return "speed of Dog and Cat is equal";
            } else {
                throw new CatCannotBeSlowerThanDogExceptions("Cat can't be slower than dog");
            }
        }
    }
}
