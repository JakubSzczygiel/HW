public class EqualityChecker {
    public void checkEquality(Trio baseObject, Trio...objects){
        System.out.println("Your base object: " + baseObject.getName() + " | " + baseObject.hashCode());
        for (Trio object : objects) {
            if(baseObject.equals(object))
                System.out.print("is equal to " + object.getName() + " | " + object.hashCode() + "\n");
            else
            {
                System.out.print("is NOT equal to " + object.getName() + " | " + object.hashCode() +"\n");
            }
        }
    }
}
