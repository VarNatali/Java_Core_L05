package ua.lviv.lga.task01;

public class Application {
    public static void main(String[] args) {
      Cow cow=new Cow();
      Dog dog=new Dog();
      Cat cat =new Cat();

      cow.voice();
      cat.voice();
      dog.voice();
    }
}
