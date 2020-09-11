package B5_AbstractAndInterface.AnimalClass;

public class Chicken1 extends Animal implements Edible {
    @Override
    public String howToEat(){
        return "Could be fried";
    }

    @Override
    public String makeSound() {
        return "Chicken: cluck - cluck";
    }
}
