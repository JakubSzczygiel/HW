public class Discount {
    public static int calculations(int age, boolean regular){
        int discount=0;
        if(age>65)
            discount = 10;
        else if (age<18)
            discount=25;
        if(regular)
            discount+=5;
        return discount;
    }
}
