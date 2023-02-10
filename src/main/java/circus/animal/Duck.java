<<<<<<<< HEAD:src/main/java/circus/animals/Duck.java
package circus.animals;
========
package circus.animal;
>>>>>>>> improvecode:src/main/java/circus/animal/Duck.java

public class Duck extends Bird {
    @Override
    public String speak() {
        return toString() + "  Quack Quack";
    }

    @Override
    public String toString() {
        return "I'm " + name + ". I am a Duck!";
    }

    public void swim() {
        System.out.println("I'm swimming...");
    }

    @Override
    public int getValue() {
        return 10;
    }

    public Duck(String name) {
        this.name = name;
    }

    @Override
    public int getValue() {
        return 10;
    }

    @Override
    public void fly() {
        System.out.println("Duck goes wheeee");
    }
}
