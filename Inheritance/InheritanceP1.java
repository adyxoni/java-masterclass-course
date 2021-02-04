package Inheritance;

public class InheritanceP1 {
    public static void main(String[] args){
        Animal animal = new Animal("Animal", 1, 1, 5,5);

        DOg dog = new DOg("Yorkie", 8, 20, 2, 4, 1, 20, "long silky");
        dog.eat();
        dog.walk();
        dog.run();
    }
}
