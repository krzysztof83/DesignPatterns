/**
 * Created by Professional on 2018-01-17.
 */
public class Cow implements Comparable{
    public String getName() {
        return name;
    }

    public Cow setName(String name) {
        this.name = name;
        return this;
    }

    public int getWeight() {
        return weight;
    }

    public Cow setWeight(int weight) {
        this.weight = weight;
        return this;
    }

    private String name;
    private int weight;

    public Cow(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return name + " weighs " + weight;
    }


    @Override
    public int compareTo(Object o) {

        Cow otherCow = (Cow)o;

        if (this.weight < otherCow.getWeight()) {
            return -1;
        } else if (this.weight == otherCow.getWeight()) {
            return 0;
        } else {
            return 1;
        }
    }
}
