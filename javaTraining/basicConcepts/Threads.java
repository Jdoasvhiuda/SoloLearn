package javaTraining.basicConcepts;

public class Threads {

  public static void main(String[] args) {
    Name name = new Name();
    // set priority
    name.setPriority(10);
    Welcome welcome = new Welcome();
    // set priority
    welcome.setPriority(1);

    // reordering the start() method calls was needed, as the processing of the
    // methods provided did not guarantee the order of execution of the threads when
    // using priorities;
    welcome.start();
    name.start();
  }
}

// extend the Thread class
class Welcome extends Thread {
  public void run() {
    System.out.println("Welcome!");
  }
}

// extend the Thread class
class Name extends Thread {
  public void run() {
    System.out.println("Please enter your name");

  }
}
