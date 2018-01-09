package behavioral.strategy;

public class Dog extends Animal {

    public Dog() {

        super();

        setSound("Bark");

        // We set the Flys interface polymorphically
        // This sets the behavior as a non-flying Animal

        flyingType = new CantFly();

    }

    public void digHole() {

        System.out.println("Dug a hole");

    }


}