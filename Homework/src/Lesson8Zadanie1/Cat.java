package Lesson8Zadanie1;

public class Cat extends Animal {
    private boolean isFull;

    public Cat(String name) {
        super(name, 200, 0);
        this.isFull = false;
        incrementCatCount();
    }

    public void run(int distance) {
        if (distance <= getMaxRunDistance()) {
            System.out.println(getName() + " пробежал " + distance + " м.");
        } else {
            System.out.println(getName() + " не может пробежать " + distance + " м.");
        }
    }

    public void swim(int distance) {
        System.out.println(getName() + " не умеет плавать.");
    }

    public void eat(Bowl bowl, int amount) {
        if (bowl.getFood() >= amount) {
            bowl.decreaseFood(amount);
            this.isFull = true;
            System.out.println(getName() + " сытый.");
        } else {
            System.out.println(getName() + " мало еды в миске.");
        }
    }

    public boolean isFull() {
        return isFull;
    }
}