public abstract class FruitDecorator implements IFruit {
    IFruit fruit;

    public FruitDecorator(IFruit fruit) {
        this.fruit = fruit;
    }

    @Override
    public void eat() {
        // code here;
    }
}
