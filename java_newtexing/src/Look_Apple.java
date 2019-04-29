import java.util.function.Consumer;

public class Look_Apple {
    public static void consumerApple(Apple[] apples, Consumer<Apple> c) {
        for (Apple apple : apples) {
            c.accept(apple);
        }
    }

    public static void main(String[] args) {
        Apple[] apples = {new Apple("red", 10), new Apple("green", 9),new Apple("yellow", 8)};
        consumerApple(apples, (apple) -> System.out.println(apple));//lamda
        consumerApple(apples, new Consumer<Apple>() {//ÄäÃû
            @Override
            public void accept(Apple apple) {
                System.out.println(apple);
            }
        });

    }
}
