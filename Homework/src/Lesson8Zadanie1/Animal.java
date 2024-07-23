package Lesson8Zadanie1;

public abstract class Animal {
    private String name;
    private int maxRunDistance;
    private int maxSwimDistance;
    private static int animalCount = 0;
    private static int catCount = 0;
    private static int dogCount = 0;

    public Animal(String name, int maxRunDistance, int maxSwimDistance) {
        this.name = name;
        this.maxRunDistance = maxRunDistance;
        this.maxSwimDistance = maxSwimDistance;
        animalCount++;
    }

    public abstract void run(int distance);
    public abstract void swim(int distance);

    public String getName() {
        return name;
    }

    public int getMaxRunDistance() {
        return maxRunDistance;
    }

    public int getMaxSwimDistance() {
        return maxSwimDistance;
    }

    public static int getAnimalCount() {
        return animalCount;
    }

    public static int getCatCount() {
        return catCount;
    }

    public static int getDogCount() {
        return dogCount;
    }

    public static void incrementCatCount() {
        catCount++;
    }

    public static void incrementDogCount() {
        dogCount++;
    }
}