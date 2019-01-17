import com.sun.prism.paint.Color;

public class ColorFruitDecorator extends FruitDecorator {
    public Color color = Color.RED;

    public ColorFruitDecorator(IFruit fruit) {
        super(fruit);
    }

    @Override
    public void eat() {
        this.printColor();
        fruit.eat();
    }

    public void printColor() {
        System.out.println("The fruit's color is " + color);
    }
}
