package otus.ak.fruits;


import java.util.LinkedList;
import java.util.List;

/**
 * Created by Alexey on 31.03.2017.
 */
public class Main {

    public static void main(String[] args) {
        new Main().process();
    }

    private void process() {
        List<Fruit> fruitList = new LinkedList<>();
        FruitFactory fruitFactory = new FruitFactory(56);
        fruitList.addAll(fruitFactory.createFruits(22));
        System.out.println(fruitList);
    }
}
