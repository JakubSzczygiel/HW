public class Circle {
    private double radius;
    private double circleLength;
    public String name;
    static int numberOfCircles=0;

    {
      ++numberOfCircles;
      this.name="Circle "+ numberOfCircles;
    }

    public void calculateCircleLength(){
        //return ;
        circleLength=2*Math.PI*(this.radius);
    }

    //get-ers and set-ers
    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getCircleLength() {
        return circleLength;
    }


}
