package greedy;

import java.util.Comparator;

public class Person implements Comparator<Person> {
    private int weight;
    private int height;

    public Person(int weight, int height) {
        this.weight = weight;
        this.height = height;
    }

    public Person() {

    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public int compare(Person o1, Person o2) {
        int result = 0;
        if (o1.getHeight() > o2.getHeight()) {
            result = -1;
        } else if (o1.getHeight() < o2.getHeight()){
            result = 1;
        }

        return result;
    }

    @Override
    public String toString() {
        return "Person{" +
                "weight=" + weight +
                ", height=" + height +
                '}';
    }
}
