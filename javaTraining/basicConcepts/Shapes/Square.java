package javaTraining.basicConcepts.Shapes;

public class Square extends Shape {
  public Square(int width) {
    this.width = width;
  }

  @Override
  public void area() {
    System.out.println(width * width);
  }
}
