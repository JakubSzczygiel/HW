public class Comparison {

public static String  compareDogAndCatSpeed(Dog dog, Cat cat)
{
    if(dog.getDogSpeed()>cat.getCatSpeed())
    {
        return "Dog";
    }
    else if(dog.getDogSpeed()==cat.getCatSpeed())
    {
        return "speed of Dog and Cat is equal";
    }
    else
    {
        return "Cat";
    }
}
}
