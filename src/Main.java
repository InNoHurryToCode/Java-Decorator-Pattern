public class Main {
    public static void main(String[] args) {
        IFruit apple = new ColorFruitDecorator(new CanEatFruitDecorator(new Apple()));

        apple.eat();
    }
}
