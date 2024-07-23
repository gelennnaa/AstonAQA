package Lesson8Zadanie1;

public class Dog extends Animal {
    public Dog(String name) {
        super(name, 500, 10);
        incrementDogCount();
    }

    public void run(int distance) {
        if (distance <= getMaxRunDistance()) {
            System.out.println(getName() + " пробежал " + distance + " м.");
        } else {
            System.out.println(getName() + " не может пробежать " + distance + " м.");
        }
    }

    public void swim(int distance) {
        if (distance <= getMaxSwimDistance()) {
            System.out.println(getName() + " проплыл " + distance + " м.");
        } else {
            System.out.println(getName() + " не может проплыть " + distance + " м.");
        }
    }
}