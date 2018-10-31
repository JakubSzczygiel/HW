public class Comparison {

    static double returnCircleWithTheLargestCircleLength(Circle c1, Circle c2, Circle c3) {

        return Math.max(Math.max(c1.getCircleLength(), c2.getCircleLength()), c3.getCircleLength());

    }

    static Circle[] returnCircleArray(Circle c1, Circle c2, Circle c3) {

        Double[] circleLengthArray = {c1.getCircleLength(), c2.getCircleLength(), c3.getCircleLength()};
        Double circleDoubleTemp;
        Circle[] circleArray = {c1, c2, c3};
        Circle circleTemp=new Circle();


        for (int j=0; j< circleArray.length; j++) {
            for (int i = 0; i < (circleArray.length - 1); i++) {
                if (circleLengthArray[i] < circleLengthArray[i + 1]) {

                    circleDoubleTemp=circleLengthArray[i];
                    circleLengthArray[i] = circleLengthArray[i + 1];
                    circleLengthArray[i + 1] = circleDoubleTemp;

                    circleTemp=circleArray[i];
                    circleArray[i] = circleArray[i + 1];
                    circleArray[i + 1] = circleTemp;
                }

            }
        }
        return circleArray;
    }
}
