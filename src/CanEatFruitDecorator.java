public class CanEatFruitDecorator extends FruitDecorator {
    private boolean canBeEaten = true;

    public CanEatFruitDecorator(IFruit fruit) {
        super(fruit);
    }

    @Override
    public void eat() {
        this.canBeEaten();
        fruit.eat();
    }

    public void canBeEaten() {
        System.out.println("Can the fruit be eaten? : " + this.canBeEaten);
    }
}
