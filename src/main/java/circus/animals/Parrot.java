package circus.animals;

public class Parrot extends Bird {
    @Override
    public String speak() {
        return "Polly wants a cracker";
    }

    @Override
    public String toString() {
        return "I'm a parrot";
    }

    @Override
    public int getValue() {
        return 20;
    }

    @Override
    public void fly() {
        System.out.println("SQWAKWAKWKAWKWKWAK");
    }
}