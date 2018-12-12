public class Program{
    public static void main(String[] args) {
        Trio<Integer> trio1= new Trio("trio1",1,2,3);
        Trio<String> trio2=new Trio("trio2","kuba","kasia","staszek");
        Trio<Integer> trio3=new Trio("trio3",3,2,1);
        Trio<Integer> trio4=new Trio("trio4",1,2,3);
        Trio<String> trio5=new Trio("trio5","Gosia","kasia","staszek");
        Trio<String> trio6=new Trio("trio6","kasia","kuba","staszek");

        EqualityChecker equalityChecker=new EqualityChecker();
        equalityChecker.checkEquality(trio1,trio2,trio3,trio4,trio5,trio6);
        equalityChecker.checkEquality(trio2,trio1,trio3,trio4,trio5,trio6);



    }
}
