//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

      Car car = new Car(6);
      car.start();
      car.stop();
      System.out.println("Number of seats in this car: " + car.getNumberOfSeats());

      System.out.println();
      System.out.println("Sound of animals :");

      Lion lion = new Lion();
      Cat cat = new Cat();
      Wolf wolf = new Wolf();
      Dog dog = new Dog();
      lion.makeNoise();
      cat.makeNoise();
      wolf.makeNoise();
      dog.makeNoise();

    }


}