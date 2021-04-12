package Animal_InterfaceEdible;

public class Chicken extends Animal implements Edible{

    @Override
    public String makeSound() {
        return "chik chik .....";
    }

    @Override
    public String howToEat() {
        return "Chicken eating...";
    }
}
