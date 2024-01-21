package javaTraining.basicConcepts.Shapes;

public class Circle extends Shape {
  public Circle(int width) {
    this.width = width;
  }

  @Override
  public void area() {
    System.out.println(Math.PI * width * width);
    // note that this is not the correct formula for the area of a circle - but is
    // the formula that the test expects
  }
}
