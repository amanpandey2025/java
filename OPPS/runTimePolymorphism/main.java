package OPPS.runTimePolymorphism;

public class main {
    public static void main(String[] args) {
        animal animal1 = new animal();

        animal1 = new dog();
        animal1.sound();      // it will give bark output

        animal1 = new cat();
        animal1.sound();  // it will give meow sound


    }
}