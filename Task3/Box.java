package Task3;

import java.util.ArrayList;
import java.util.List;

public class Box<T extends Fruit> implements Comparable<Box<? extends Fruit>> {
    private List<T> fruits;

    public Box() {
        this.fruits = new ArrayList<>();
    }

    public List<T> getFruits() {
        return fruits;
    }

    public float getWeight() {
        if (fruits.isEmpty()) {
            return 0.0f;
        }
        return fruits.get(0).getWeight() * fruits.size();
    }

    //   public boolean compare(Box<? extends Fruit> that) {
    //      return getWeight() == that.getWeight();
    //  }

    @Override
    public int compareTo(Box<? extends Fruit> that) {
        return Float.compare(getWeight(), that.getWeight());
    }

    public void move(Box<T> that) {
        fruits.addAll(that.getFruits());
    }

    public void add(T Fruit){
        fruits.add(Fruit);
    }

}


