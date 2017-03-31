package otus.ak.fruits;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;

/**
 * Created by Alexey on 31.03.2017.
 */
public class FruitFactory {

    private Random rand = null;

    FruitFactory(int seed) {
        rand = new Random(seed);
    }

    public List<Fruit> createFruits(int count) {
        List<Fruit> fruitList = new LinkedList<>();
        for (int i = 0; i < count; ++i)
        {
            int value = rand.nextInt(3);
            switch (value)
            {
                case 0:
                    fruitList.add(new Apple());
                    break;

                case 1:
                    fruitList.add(new Orange());
                    break;

                case 2:
                    fruitList.add(new Banana());
                    break;

                default:
                    throw new RuntimeException("Error! Unreachable code");
            }
        }

        return fruitList;
    }
}
