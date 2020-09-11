package B5_AbstractAndInterface.AnimalClass;

//import animal.Animal;
//import animal.Chicken;
//import animal.Tiger;

public class Main {
    public static void main(String[] args) {
        Animal[] animals = new Animal[2];
        animals[0] = new Tiger();
        animals[1] = new Chicken1();
        //for(int i = 0; i < 2; i++)
        for (Animal animal : animals) {
            System.out.println(animal.makeSound());

            //animal co phai chicken ko?
            if (animal instanceof Chicken1) {
                Chicken1 edible = (Chicken1) animal;
                System.out.println(edible.howToEat());
            }
        }
        Fruit fruit = new Orange();
        System.out.println(fruit.howToEat());
    }
}
