<<<<<<<< HEAD:src/main/java/circus/animals/Parrot.java
package circus.animals;
========
package circus.animal;
>>>>>>>> improvecode:src/main/java/circus/animal/Parrot.java

public class Parrot extends Bird {
    @Override
    public String speak() {
        return name + " wants a cracker";
    }

    @Override
    public String toString() {
        return "My name is " + name + ". I am a Parrot!";
    }

    @Override
    public int getValue() {
        return 20;
    }

    public Parrot(String name) {
        this.name = name;
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
