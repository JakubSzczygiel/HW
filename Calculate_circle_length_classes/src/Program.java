

public class Program {

    public static void main(String[] args) {

        Circle circle1=new Circle();
        circle1.setRadius(Reader.readRadiusValue(circle1));
        circle1.calculateCircleLength();
        System.out.println(circle1.getCircleLength());

        Circle circle2=new Circle();
        circle2.setRadius(Reader.readRadiusValue(circle2));
        circle2.calculateCircleLength();
        System.out.println(circle2.getCircleLength());

        Circle circle3=new Circle();
        circle3.setRadius(Reader.readRadiusValue(circle3));
        circle3.calculateCircleLength();
        System.out.println(circle3.getCircleLength());

       // System.out.println("The largest circle Length: " + Comparison.returnCircleWithTheLargestCircleLength(circle1,circle2,circle3));

        Circle[] circleArray=Comparison.returnCircleArray(circle1,circle2,circle3);
        for (int i =0; i<circleArray.length; i++)
        {
            System.out.print(circleArray[i].name + " circle length " + circleArray[i].getCircleLength()+ "\n");
        }
    }

}
